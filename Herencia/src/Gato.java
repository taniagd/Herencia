
public class Gato extends Animal {
	int num_bigotes;
	String color;
	int vidas_disponibles= 9;
	
	public Gato (String name, int age, String color) {
		super(name, age); //Al usar palabra super se está haciendo referencia al constructor del padre (Ver Animal línea 15)
		this.color = color;
	}
	
	
	@Override
	public String comer() {
		return "Comiendo atún";
	}
	
	public String trucos() {
		return "Caer de pie";
	}
	
	public String premios() {
		return "";
	}
	
	public String jugar() {
		return "";
	}
	
}