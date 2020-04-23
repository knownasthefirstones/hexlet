package learning.module71_interface.printers;

public class AdvConsolePrinter implements IPrinter {

    @Override
    public void print(final String text) {
        System.out.println(text);
        System.out.printf("text length: %s", text.length());
    }
}
