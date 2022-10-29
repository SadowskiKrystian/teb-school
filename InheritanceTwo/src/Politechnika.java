public class Politechnika extends School{
    private String direction;

    public Politechnika() {
    }

    public Politechnika(int id, String name, String city, String description, String direction) {
        super(id, name, city, description);
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public String getInfo(){
        return super.toString() + " direction: " + getDirection();
    }
}
