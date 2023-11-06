package homework.day11.thread;

public class Thread5 {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(20);
        for (int i = 0; i < 5; i++) {
            new Thread(() -> mouse.peep());
        }
    }

}
