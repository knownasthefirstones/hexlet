package learning.module54_builder;

public class Main {

    public static void main(String[] args) {
        final Contact contact = new ContactBuilder()
                .name("A")
                .surname("B")
                .email("C")
                .adress("D")
                .build(); // последним вызываем билд
    }

}
