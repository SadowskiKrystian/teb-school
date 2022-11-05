public class Player extends Person{
    private Position position;
    public Player(String name, String surname, Position position) {
        super(name, surname);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Surname: " + getSurname() + " Pozycja: " + position;
    }
}
