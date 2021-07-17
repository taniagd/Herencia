
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal animal = new Animal();
		//System.out.println(animal.comer());
		
		Perro canelo = new Perro("Canelo", 3); //Entre paréntesis se agregaron los atributos que se solicitan en el constructor.
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.name);
		System.out.println(canelo.age);
		
		Gato pulgas = new Gato("Bigotes", 2, "naranja"); //Datos que solicita el constructor.
		System.out.println(pulgas.comer());
		
	}
	
		
}
