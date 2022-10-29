public class School extends Teacher {

    private String name;
    private String description;

    public School() {
    }

    public School(int id, String city, String name, String description) {
        super(id, city);
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
        return "School:" + "\n" +
                "-Id: " + getId() + "\n" +
                "-Name: " + name + "\n" +
                "-City='" + getCity() + "\n" +
                "-Description='" + description;
    }
}
