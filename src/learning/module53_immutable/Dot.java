package learning.module53_immutable;

public class Dot {

    private volatile int x; // кешируем значение в оперативной памяти, пожэтому второй потом может никогда не увидеть второй поток и изменения из оперативной памяти
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Dot d = new Dot(0,0);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (d.getX() != d.getY()) {
                        System.out.printf("X %d, Y %d \n", d.getX(), d.getY());
                    }
                }
            }
        }).start();

        for (int i = 0; i < 1_000_000; i++) {
            for (int i2 = 0; i2 < 100; i2++) {
                d.setX(i);
                d.setY(i);
            }
        }
    }

}
