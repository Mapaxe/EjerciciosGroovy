def numerosPrimos = []
100.times{numero ->
	if(numero > 2){
		def resultado = true
		(2..numero-1).each{ divisor ->
			if(numero%divisor == 0){
				resultado = false
			}
		}
		!resultado ?: numerosPrimos.add(numero)
	}else{
		if(numero == 2){
			numerosPrimos.add(numero)
		}
	}
}
println numerosPrimos
assert numerosPrimos == [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97]