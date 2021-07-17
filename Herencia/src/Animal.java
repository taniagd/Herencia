
public abstract class Animal {
	String name = "";
	int age = 0;
	
	/*public String comer() { //Método
		//return "comiendo";
	}*/
	
	/*public String dormir() {
		return "durmiendo";
	}
	*/
	
	public Animal (String name, int age) {//Constructor. Se utilizan para inicializar los objetos. Se introduce nombre y edad para realizar la asignación de datos
		this.name = name;
		this.age = age;
	} //¿Cómo pasar este constructor a los hijos? Se hace a través de otro constructor, propio de la clase (Ver clase Gato línea 7)
	
	public abstract String comer(); //Método abstracto
	
	public String dormir() { //Método no abstracto.
		return "ZzzZzzZ";
	}
	
	/*Como la clase es abstracta ya no se pone lo que va a regresar, no retorna ningún objeto.
	Solo defino que va a existir un método para comer y dormir, pero no se dice que va a hacer
	Cuando es abstracto debo implementar los métodos.
	Cuando es clase abstracta obliga a sus hijos a implementar ese método.
	Clases abstractas donde solo se hereda, no se crean objetos
	*/
}
