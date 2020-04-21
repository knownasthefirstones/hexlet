package module33_static;

public class Game {

    int level = 3;

    // Static - class level method - указывает на то что при сощдании фрейма в него не будет положен рееренс this
    // класс-левел не может иметь доступ к полям инстанса
    // Соответственно его можно вызвать из под имени класса без создания объекта Game....
    public static void printGameName() {
        System.out.println("GameName");
    }

    // Instance level method - имеет доступ к полям инстанса
    public void printLevelsCount() {
        System.out.printf("%d\n", this.level);
    }

}
