package module55_enum;

public class Main {

    public static void main(String[] args) {

        final Figure figureX = Figure.X;
        final Figure figureO = Figure.O;

        // выводим все возможные значения энама
        for (Figure f : Figure.values()) {
            System.out.println(f);
        }
    }
}
