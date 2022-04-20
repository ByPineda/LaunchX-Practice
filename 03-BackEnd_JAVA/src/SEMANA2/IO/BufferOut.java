package SEMANA2.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOut {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Magia.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String s = "Hola viajerxs de LaunchX";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fos.close();
            System.out.println("Ready");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
