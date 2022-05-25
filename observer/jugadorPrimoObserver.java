package observer;

public class jugadorPrimoObserver {
    public jugadorPrimoOBserver(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void actualizar() {		
        System.out.println("Numero impar: " + (sujeto.getEstado()));
    }
}
