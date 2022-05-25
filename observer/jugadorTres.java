package observer;

public class jugadorTres {
    public jugadorTresOBserver(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    
    @Override
    public void actualizar() {		
        System.out.println("Numero Tres multipos: " + (sujeto.getEstado()));
    }
}
