public class School {
    private int id;
    private String name;
    private String city;
    private String description;

    public School() {
    }

    public School(int id, String name, String city, String description) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  "id: " + id +
                " name: " + name +
                " city: " + city +
                " description: "  + description;
    }
}
