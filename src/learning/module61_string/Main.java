package learning.module61_string;

public class Main {

    public static void main(String[] args) {

    }

    private void printString(final int year, final String month, final int day) {
        final String message = "Year: " + year + " Month: " + month + "Day: " + day;
        System.out.println(message);
    }

    private void printStringBuilder(final int year, final String month, final int day){
        // final StringBuilder messageBuilder = new StringBuilder(30);
        final StringBuilder messageBuilder = new StringBuilder("Today is: ");
        messageBuilder.append(year);
        messageBuilder.append(" ");
        messageBuilder.append(month);
        messageBuilder.append(" ");
        messageBuilder.append(day);
        System.out.println(messageBuilder);
    }

    // printStringBuffer - используем в многопоточной среде
    // билдер и баффер наследуются от абстракт стринг билдер который в свою очередь наседуюется от обджект

}
