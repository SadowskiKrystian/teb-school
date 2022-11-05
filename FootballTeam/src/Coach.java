public class Coach extends Person{
    public Coach(String name, String surname, int licence) {
        super(name, surname, licence);
    }

    @Override
    public String toString() {
        return "Trener: \n" + "Name: " + getName() + " Nazwisko: " + getSurname() + " Nr licencji: " + getLicence();
    }
}
