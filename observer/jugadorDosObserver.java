package observer;

public class jugadorDosOBserver extends observador {
	
	public jugadorDosOBserver(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("Numero Dos multiplos: " + (sujeto.getEstado()));
	}
}