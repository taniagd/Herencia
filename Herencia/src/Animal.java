
public abstract class Animal {
	String name = "";
	int age = 0;
	
	/*public String comer() { //M�todo
		//return "comiendo";
	}*/
	
	/*public String dormir() {
		return "durmiendo";
	}
	*/
	
	public Animal (String name, int age) {//Constructor. Se utilizan para inicializar los objetos. Se introduce nombre y edad para realizar la asignaci�n de datos
		this.name = name;
		this.age = age;
	} //�C�mo pasar este constructor a los hijos? Se hace a trav�s de otro constructor, propio de la clase (Ver clase Gato l�nea 7)
	
	public abstract String comer(); //M�todo abstracto
	
	public String dormir() { //M�todo no abstracto.
		return "ZzzZzzZ";
	}
	
	/*Como la clase es abstracta ya no se pone lo que va a regresar, no retorna ning�n objeto.
	Solo defino que va a existir un m�todo para comer y dormir, pero no se dice que va a hacer
	Cuando es abstracto debo implementar los m�todos.
	Cuando es clase abstracta obliga a sus hijos a implementar ese m�todo.
	Clases abstractas donde solo se hereda, no se crean objetos
	*/
}
