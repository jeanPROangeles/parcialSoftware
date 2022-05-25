package observer;

public class jugadorImparObserver {
        public jugadorImparOBserver(Subject sujeto) {
            this.sujeto = sujeto;
            this.sujeto.agregar(this);
        }
        
        @Override
        public void actualizar() {		
            System.out.println("Numero impar: " + (sujeto.getEstado()));
        }
}
