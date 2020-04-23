package learning.module72_abstract;

// требует чтобы в наследнике реализовали один из методов для создания инстанса
public class PreProcessor extends AbstractProcessor {

    @Override
    public String readString() {
        return "Hello World";
    }

    public static void main(String[] args) {
        final PreProcessor preProcessor = new PreProcessor();
        preProcessor.process();
        // метод процесс вызовет метод readString, который у нашего наследника заоверрайдит метод
        // ретернит Hello World в метод процесс и далее заменит " "
    }
}
