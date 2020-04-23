package learning.module71_interface;

import learning.module71_interface.printers.AdvConsolePrinter;
import learning.module71_interface.printers.ConsolePrinter;
import learning.module71_interface.printers.IPrinter;
import learning.module71_interface.reader.IReader;
import learning.module71_interface.reader.PreReader;

public class Replacer {

    private final IPrinter printer;
    private final IReader reader;

    public Replacer(final IPrinter printer, final IReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public void replace() {
        final String text = reader.read();
        final String replaceText = text.replace(" ", "");
        printer.print(replaceText);
    }

    public static void main(String[] args) {
        final IReader reader = new PreReader("Hello World");
        final IPrinter printer = new ConsolePrinter();
        final Replacer replacer = new Replacer(printer, reader);
        replacer.replace();
        final IPrinter printer1 = new AdvConsolePrinter();
        final Replacer replacer1 = new Replacer(printer1, reader);
        replacer1.replace();
    }

}
