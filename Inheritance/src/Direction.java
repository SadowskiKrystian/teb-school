public class Direction extends Teacher{
    private String name;
    private String description;

    public Direction() {
    }

    public Direction(int id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Direction: \n" +
                "-Id: " + getId() + "\n" +
                "-Name: " + name + "\n" +
                "-Description: " + description;
    }
}
