public class Teacher {
    private int id;
    private String firstName;
    private String surname;
    private String city;
    private int nationalInsuranceNumber;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String surname, String city, int nationalInsuranceNumber) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public int getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", nationalInsuranceNumber=" + nationalInsuranceNumber +
                '}';
    }
    Object object = new Object();
}
