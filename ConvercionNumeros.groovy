def conversionNumeros(input){
	def numerosRomanos = ["I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000]
	def result = 0
	def anterior = 0
	input.each{ literalRomana ->
		
		if(anterior){
			def arabico = numerosRomanos.get(literalRomana)
			 result = result + (arabico > anterior ? arabico - anterior : arabico + anterior)
		}else{
			result = result + numerosRomanos.get(literalRomana)
		}
	}
	return result
}

println conversionNumeros("MMMDCCCLXXXVIII")

