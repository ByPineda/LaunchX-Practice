package SEMANA2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Magia.txt");
            String S = "MAGIA";
            byte b[]= S.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
