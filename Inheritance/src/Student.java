public class Student extends Teacher {

    private String studentClass;

    public Student() {
    }

    public Student(int id, String firstName, String surname, String city, int nationalInsuranceNumber, String studentClass) {
        super(id, firstName, surname, city, nationalInsuranceNumber);
        this.studentClass = studentClass;
    }


    public String getStudentClass() {
        return studentClass;
    }

    @Override
    public String toString() {
        return "Student:" + "\n" +
                "-Id: " + getId() + "\n" +
                "-First Name: " + getFirstName() + "\n" +
                "-Surname: " + getSurname() + "\n" +
                "-City: " + getCity() + "\n" +
                "-National Insurance Number: " + getNationalInsuranceNumber() + "\n" +
                "-Student Class: " + studentClass;
    }
}
