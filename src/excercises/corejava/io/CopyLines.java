package excercises.corejava.io;

import java.io.*;

public class CopyLines {

    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        PrintWriter writer = null;
        String line = null;

        try{

            in = new BufferedReader(new FileReader("./datasource/request.txt"));
            writer = new PrintWriter(new FileWriter("./datasource/request-out.txt"));

            while((line = in.readLine()) != null){
                writer.println(line);
            }

        }catch (IOException e){

            System.out.println("Error : " + e.getMessage());

        } finally {

            if(in!=null){
                in.close();
            }

            if(writer!=null){
                writer.close();
            }

        }
    }
}
