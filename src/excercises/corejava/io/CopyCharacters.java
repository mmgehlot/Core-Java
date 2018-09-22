package excercises.corejava.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        int ch;

        try{

            in = new FileReader("./datasource/request.txt");
            out = new FileWriter("./datasource/request-out.txt");

            while((ch = in.read()) != -1){
                out.write(ch);
            }

        }catch (IOException e){

            System.out.println("Error : " + e.getMessage());

        }finally {

            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }

        }
    }
}
