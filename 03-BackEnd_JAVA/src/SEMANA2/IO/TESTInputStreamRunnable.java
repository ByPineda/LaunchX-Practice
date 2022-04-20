package SEMANA2.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class TESTInputStreamRunnable {
    public static void main(String[] args) {
        Runnable ioTEST = new Runnable() {
            @Override
            public void run() {
                try {
                    FileInputStream fis = new FileInputStream("C:\\hola.txt");
                    int i = fis.read();
                    System.out.println((char)i);
                    fis.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread RM = new Thread(ioTEST);
        RM.start();
    }
}
