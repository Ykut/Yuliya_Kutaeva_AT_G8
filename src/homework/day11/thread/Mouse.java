package homework.day11.thread;

public class Mouse {
    private String pattern = "Mouse <n>";
    private String name;

    public Mouse(int number) {
        this.name = name;
    }

    public void peep(){
        System.out.println("Mouse <n> PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
