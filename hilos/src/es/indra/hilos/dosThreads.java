package es.indra.hilos;

public class dosThreads {
	public static void main(String[] args) {
		Contenedor contendor = new Contenedor();
		SimpleThread miPrimerT = (SimpleThread) new SimpleThread("Celta de Vigo");
		miPrimerT.setContendor(contendor);
		miPrimerT.start();
		
		new SimpleThread("Almeria UD").start();
	}
  
}
