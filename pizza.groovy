import groovy.transform.ToString

@ToString
class Pizza {
	String nombre
	List<Ingrediente> ingredientes
	BigDecimal precio

	Pizza plus(Ingrediente ingrediente){
		new Pizza(
			nombre: nombre,
			ingredientes: ingredientes << ingrediente,
			precio: precio + ingrediente.precio
		)
	}

	Pizza minus(Ingrediente ingrediente){
		new Pizza(
			nombre: nombre,
			precio: contieneIngrediente(ingrediente) ? precio - ingrediente.precio : precio,
			ingredientes: (contieneIngrediente(ingrediente) ? (ingredientes.remove(ingrediente) ? ingredientes : ingredientes) : ingredientes)

		)
	}

	def contieneIngrediente(Ingrediente ingrediente){
			ingredientes.contains(ingrediente)
		}
}

@ToString
class Ingrediente {
	String nombre
	BigDecimal precio
}

def extraQueso = new Ingrediente(nombre: 'Extra Queso', precio:20)
def pepperoni = new Ingrediente(nombre: 'Pepperoni', precio:30)
def champinion = new Ingrediente(nombre: 'Champiniones', precio:20)
def jalapeno = new Ingrediente(nombre: 'Jalapenios', precio:20)
def aceituna = new Ingrediente(nombre: 'Aceitunas', precio:20)

def pizzaPepperoniEspecial = new Pizza(nombre: 'Pepperoni Especial', ingredientes:[], precio:180.00)
println pizzaPepperoniEspecial = pizzaPepperoniEspecial + pepperoni + champinion + extraQueso
println pizzaPepperoniEspecial = pizzaPepperoniEspecial - jalapeno