package don.geronimo.testeGradle;

public class Greeting {
	private int id;
	private String conteudo;
	
	public Greeting(int id, String conteudo) {
		this.id = id;
		this.conteudo = conteudo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getConteudo() {
		return conteudo;
	}
}
