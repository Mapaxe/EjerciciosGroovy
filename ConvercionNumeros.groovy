def conversionNumeros(String input){
	def numerosRomanos = ["I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000]
	def result = 0
	def anterior = 0
	input.each{ literalRomana ->
		def arabigo = numerosRomanos.get(literalRomana)
		if(anterior){
			result = result + ((arabigo > anterior) ? (arabigo - anterior*2) : arabigo)
			anterior = arabigo
		}else{
			result = result + numerosRomanos.get(literalRomana)
			anterior = arabigo
		}
	}
	return result
}

def conversionNumeros(Integer input){
	if(input < 1 || input > 3888){
		return 0
	}else{
		def result = ""
		def numerosRomanos = [1:"I", 5:"V", 10:"X", 50:"L", 100:"C", 500:"D", 1000:"M"]
		def restante = input
		[1000,100,10,1].each{ divisor ->
			def division = restante.intdiv(divisor)
			def medio =  division <=> 5
			if(medio == -1){
				result = result + ((division > 3)? numerosRomanos.get(divisor) + numerosRomanos.get(divisor*5) : numerosRomanos.get(divisor).multiply(division))
			}
			if(medio == 0){
				result = result + numerosRomanos.get(divisor*5)
			}
			if(medio == 1){
				result = result + ((division > 8)? numerosRomanos.get(divisor) + numerosRomanos.get(divisor*10) : numerosRomanos.get(divisor*5) + numerosRomanos.get(divisor).multiply(division-5))
			}
			restante = restante % divisor
		}
		return result
	}
}

println conversionNumeros("MMMDCCCLXXXVIII")
println conversionNumeros(3888)
println conversionNumeros("DCCCXCVIII")
println conversionNumeros(898)
println conversionNumeros("DLXXXVIII")
println conversionNumeros(588)
println conversionNumeros("CDLXXXVIII")
println conversionNumeros(488)
println conversionNumeros("CCCLXXXVIII")
println conversionNumeros(388)
println conversionNumeros(-1)

