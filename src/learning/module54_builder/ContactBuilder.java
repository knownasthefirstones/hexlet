package learning.module54_builder;

public class ContactBuilder {

    private String name;
    private String surname;
    private String email;
    private String adress;

    // создадим билдер для мутирования поля name
    public ContactBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder surname(final String surname) {
        this.surname = surname;
        return this;
    }

    public ContactBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder adress(final String adress) {
        this.adress = adress;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    // создаем метод которые будет билдить, ретернит новый Контакт и передает в нем себя
    public Contact build() {
        return new Contact(this);
    }
}
