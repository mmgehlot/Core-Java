package excercises.corejava.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
//            String cwd = System.getProperty("user.dir");
            in = new FileInputStream("./datasource/cat.jpg");
            out = new FileOutputStream("./datasource/new-cat.jpg");

            int c;

            while((c = in.read()) != -1){
                out.write(c);
            }

        } catch (IOException e){

            System.out.println("Error : " + e.getMessage());

        }finally {
            if (in!=null){
                in.close();
            }

            if(out!=null){
                out.close();
            }
        }
    }
}
