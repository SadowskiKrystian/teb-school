public class Teacher {
    private int id = 0;
    private String firstName;
    private String surname;
    private String city;
    private int nationalInsuranceNumber;

    public Teacher() {
    }

    public Teacher(int id) {
        this.id = id;
    }

    public Teacher(int id, String city) {
        this.id = id;
        this.city = city;
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
        return "Teacher: " + "\n" +
                "-Id: " + id + "\n" +
                "-First Name: " + firstName + "\n" +
                "-Surname: " + surname + "\n" +
                "-City:" + city + "\n" +
                "-National Insurance Number: " + nationalInsuranceNumber;
    }
}
