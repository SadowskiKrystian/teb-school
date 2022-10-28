public class Student {
    private int id;
    private String firstName;
    private String surname;
    private String city;
    private int nationalInsuranceNumber;
    private String studentClass;

    public Student() {
    }

    public Student(int id, String firstName, String surname, String city, int nationalInsuranceNumber, String studentClass) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.studentClass = studentClass;
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

    public String getStudentClass() {
        return studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", nationalInsuranceNumber=" + nationalInsuranceNumber +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
