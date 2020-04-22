package module72_abstract;

// если класс абстракный то и все методы абстрактные
// абстрктный класс не может быть использован для создания объекта
public abstract class AbstractProcessor {

    public void process() {
        final String text = this.readString();
        final String result = text.replace(" ", "");
        System.out.println(result);
    }

    public abstract String readString();

//    public static void main(String[] args) {
//        final AbstractSmileProcessor abstractSmileProcessor = new AbstractSmileProcessor() {
//            @Override
//            public String readString() {
//                return null;
//            }
//        }
//    }

}
