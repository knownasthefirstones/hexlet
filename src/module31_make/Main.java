package module31_make;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.showSpeed();

        int speed = 13; // присваиваем значение переменной в stack
        System.out.println("main " + speed);
        car.maxSpeed = 12;
        car.startEngine();
        car.setSpeed(15);
        car.setSpeed(speed);

        car.speed = 1; // присваиваем значение переменной в heap
        car.showSpeed();
        car.setSpeed(12);
        car.showSpeed();

        System.out.println("main " + speed);
    }

}
