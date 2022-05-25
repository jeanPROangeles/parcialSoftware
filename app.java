import observer.jugadorPrimoObserver;
import observer.jugadorIMparObserver;
import observer.jugadorParObserver;
import observer.jugadorTresObserver;
import observer.jugadorDosObserver;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new jugadorPrimoObserver(subject);
		new jugadorParObserver(subject);
		
		System.out.println("Los numeros aletorios son:");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("El ganador del juego es : ");
		subject.setEstado(100);
	}
}