package module31_make;

public class Car {

    int maxSpeed;
    int speed;

    public void startEngine() {
        System.out.println("Engine started!\n");
    }

    public void setSpeed(int newSpeed) {
        System.out.println("speed " + speed);
        System.out.println("maxSpeed " + maxSpeed);
        this.speed = newSpeed;
        System.out.println("newSpeed " + newSpeed);
        System.out.println("this.speed " + speed + "\n");
    }

    public void showSpeed() {
        System.out.println("show this.speed " + this.speed);
    }

}
