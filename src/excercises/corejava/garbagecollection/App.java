package excercises.corejava.garbagecollection;

class A{
    int i = 50;

    public A(int i){
        this.i = i;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("From finalize method");

        // Calling super class finalize() method explicitly
        super.finalize();
    }
}

public class App{

    public static void main(String[] args){
        // Creating two instances of class App
        A app1 = new A(10);
        A app2 = new A(20);

        // Assigning app2 to app1
        app1 = app2;


        try{
            app1.finalize();

        }catch (Throwable e){

            e.printStackTrace();
        }
        // Making finalize() method to execute forcefully
        // Runtime.getRuntime().runFinalization();

        // Calling garbage collector thread explicitly
        System.gc();


        // Now both app1 and app2 will be pointing to same object
        // An object earlier referred by app1 will become abandoned

        System.out.println("Done!!!");

    }
}