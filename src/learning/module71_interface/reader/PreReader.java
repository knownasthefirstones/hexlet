package learning.module71_interface.reader;

public class PreReader implements IReader {

    private final String str;

    public PreReader(final String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str; // передаем в конструктор входные данные
    }
}
