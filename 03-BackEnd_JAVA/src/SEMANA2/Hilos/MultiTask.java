package SEMANA2.Hilos;
/*
public class MultiTask extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea 1");
    }

    public static void main(String[] args) {
        MultiTask t1 = new MultiTask(),
                  t2 = new MultiTask(),
                  t3 = new MultiTask();
        t1.start();
        t2.start();
        t3.start();
    }
}
*/
class MultiTasking implements Runnable{
    @Override
    public void run() {
        System.out.println("Tarea 1 Runnable");
    }

    public static void main(String[] args) {
        Thread t1= new Thread( new MultiTasking());
        Thread t2= new Thread( new MultiTasking());
        t1.start();
        t2.start();

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        task1.start();
        task2.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A Runnable");
    }
}
class Task2 extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B Runnable");
    }
}