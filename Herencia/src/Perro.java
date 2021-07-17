
public class Perro extends Animal implements Mascota, Cuidados { //Clase perro hereda de clase Animal//Se implementa la interface Mascota y para a�adir otra interface se coloca una coma y el nombre de la interface
 
	String raza="";
	String color="";
	float peso = 0;
	
	public Perro (String name, int age) { //Se crea el constructor.
		super(name, age);
	}
	
	public String ladrar() {
		return "Guaf";
	}
	
	@Override //Esta notaci�n indica que se est� aplicando polimorfismo sobre este m�todo. Es opcional colocarla o no. Pero es buena pr�ctica. 
	public String comer() { //Ejemplo de polimorfismo. El m�todo comer existe, pero retorna algo diferente.
		return "Comiendo croquetas"; //Polimorfismo se aplica en la clase que estamos creando, se aplica en hijos, pero no en padre.
	}
	
	public String trucos() { //Aqu� se implementan los m�todos de la interface de Mascota.
		return "Dar la patita";
	}
	
	public String premios() {
		return "Recibir galletita";
	}
	public String jugar() {
		return "Jugando a la pelota";
	}
	
	public String irAlVeterinario() { //Aqu� se implementan los m�todos de la interface Cuidados.
		return "Perrini saludable";
	}
	
	public String paseo() {
		return "salir al parque";
	}
	
	public String banio() {
		return "ba�o y corte de pelo";
	}
}
