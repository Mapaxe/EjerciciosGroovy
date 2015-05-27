def sustituirLetra(String texto, String letra, String sustitucion = "x"){
	String resultado = ""
	def count = 1
	texto.each{
		if(it.equals(letra)){
			resultado +=  it.replace(letra,sustitucion.multiply(count++))
		}else{
			resultado += it
		}
	}
	return resultado
}

println sustituirLetra("Hola Mundo", "o")
assert sustituirLetra("Hola Mundo", "o") == "Hxla Mundxx"
println sustituirLetra("oboe, obra, obuè, obùs, ocal, ocho, ocio, ocle, ocre, odio, odre, ogro, oìda, oìdo, ojal, ojar, ojèn, ojeo, òleo, oler, olio, olla, olma, olmo, olor, ombù, once, onda, onde, ònix, onza, opio, oque, oral, orar, orbe, orbi, orca, orco, orea, oreo, orfo, orìn, orla, orlo, oròn, orto, orza, osar, osca, osco, òsea, òseo, osta, oste, otar, otor, otra, otre, otri, otro, oval, ovar, ovas, ovia, ovil, ovio, oxte,", "o")