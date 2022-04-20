package SEMANA2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2Run {
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run() {
                try{
                    FileOutputStream fos = new FileOutputStream("C:\\Magia.txt");
                    String S = "MAGIA con runnable";
                    byte b[]= S.getBytes();
                    fos.write(b);
                    fos.close();
                } catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        };
        Thread MAGIC =  new Thread(rm);
        MAGIC.start();
    }
}
