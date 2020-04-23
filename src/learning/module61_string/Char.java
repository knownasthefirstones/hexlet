package learning.module61_string;

public class Char {

    // serializable - объекты могут быть записаны-считаны с любого инпут-оутпут устройства, переданы по сети, конвертированы
    // comparable - могут быть сравнены
    // charSequence - методы с символами
    public static void main(String[] args) {

        final String target = " Windows win ";
        target.trim(); // "Windowswin"
        target.lastIndexOf('w'); // 9
        target.lastIndexOf('W'); // 1
        target.indexOf('w');    // 6
        target.indexOf('w', 8); // 9
        target.indexOf("win"); //9
        target.toLowerCase().trim().indexOf("win");
        // " windows win "
        // "windows win"
        // 0

        float a = Float.parseFloat("12."); // возвращаем флоат - примитив

        Float b = Float.valueOf("12."); // возвращаем тип - объект
        float c = b.floatValue(); // после надо достать из тип значение примитива

        double d = 88.8;
        String d1 = Double.toString(d); // преобразуем в стрингу

        // если программа содержит 2 аргуметра в командной строке
        if (args.length == 2) {
            // преобразует в флоат
            float a1 = (Float.parseFloat(args[0]));
            float a2 = (Float.valueOf(args[1]).floatValue());
            // выводит на экран
            System.out.println("a1 + a2" + (a1 + a2));
        }

    }

}
