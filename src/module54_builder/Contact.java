package module54_builder;

public class Contact {

    private final String name;
    private final String surname;
    private final String email;
    private final String adress;

    // если у конструктора есть билдер, то он должен быть закрыт на доступ от всего мира (можем оставить пакедж-локал)
//    public Contact(final String name,
//                   final String surname,
//                   final String email,
//                   final String adress) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.adress = adress;
//    }

    // должен принимать свой конструктор
    Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.email = contactBuilder.getEmail();
        this.adress = contactBuilder.getAdress();
    }

    //public static void main(String[] args) {
        // new Contact(null, null, null, null);
        // не всегда понятно в каком порядке заполнять конструктор значениями, поэтому используем билдер
    //}

}
