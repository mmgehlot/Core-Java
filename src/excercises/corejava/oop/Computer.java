package excercises.corejava.oop;

public class Computer {

    public static void main(String[] args){
        Computer comp = new Computer();
        Mouse mouse = new Mouse();
        comp.connect(mouse);
    }

    public void connect(USB usb){
        usb.send(new byte[]{1});
        byte[] data = usb.receive();
    }
}
