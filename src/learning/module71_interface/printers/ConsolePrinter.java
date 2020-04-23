package learning.module71_interface.printers;

public class ConsolePrinter implements IPrinter {

    @Override
    public void print(final String text) {
        System.out.println(text);
    }
}
