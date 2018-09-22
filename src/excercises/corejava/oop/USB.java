package excercises.corejava.oop;

public interface USB {
    void send(byte[] data);
    byte[] receive();
}
