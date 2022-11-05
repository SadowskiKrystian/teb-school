public class Person {
    private String name;
    private String surname;
    private int licence;
    private String specialisation;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int licence) {
        this.name = name;
        this.surname = surname;
        this.licence = licence;
    }

    public Person(String name, String surname, int licence, String specialisation) {
        this.name = name;
        this.surname = surname;
        this.licence = licence;
        this.specialisation = specialisation;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getLicence() {
        return licence;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", licence=" + licence +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }
}
