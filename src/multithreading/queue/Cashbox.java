package multithreading.queue;

public class Cashbox {

    private static int generator = 1;
    private final int  id;

    public Cashbox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }
}
