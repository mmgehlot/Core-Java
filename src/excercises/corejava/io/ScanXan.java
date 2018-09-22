package excercises.corejava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {

    public static void main(String[] args) throws IOException {
        Scanner in = null;

        try {

            in = new Scanner(new BufferedReader(new FileReader("./datasource/request.txt")));

            while(in.hasNext()){
                System.out.println(in.next());
            }

        }catch (IOException e){

            System.out.println("Error : " + e.getMessage());

        }finally {

            if(in!=null){
                in.close();
            }

        }
    }
}
