package observer;

public class jugadorParObserver {
    public jugadorParOBserver(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void actualizar() {		
        System.out.println("Numero par: " + (sujeto.getEstado()));
    } 
}
