package SEMANA2.Hilos;

public class HilosT extends Thread {
    @Override   //EL THREAD ENTRA AL STADO RUNNABLE
    public void run() {
        System.out.println("El hilo se está ejecutando");
    }
    /*
    @Override
    public synchronized void start() {
        //INICIAR EJECUCION DE UN HILO
        //LA JVM LLAMA AL METODO RUN() DEL HILO
        super.start();
    }
    */
    // .sleep() - detiene de manera temporal
    // .join() - Espera a que el hilo se muera
    // .getPriority() - Regresa la prioridad del hilo
    // .setPrority() - Establecer la prioridad del hilo
    // .getName - Nombre del hilo
    //.currentThread() - Referencía al hilo en ejecucion
    //.getId() -  Regresa ID del hilo
    // Thread.State getSteate - regresa el estado del hilo
    //isAlive - si el hilo está vivo

    public static void main(String[] args) {
        HilosT hilo = new HilosT(); //ENTRA AL STATE NEW
        hilo.start();               //
    }


}
class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("El hilo de runnable está corriendo.");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}
