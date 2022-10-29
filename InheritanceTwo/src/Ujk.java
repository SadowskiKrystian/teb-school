public class Ujk extends School {
    private String dean;

    public Ujk() {
    }

    public Ujk(int id, String name, String city, String description, String dean) {
        super(id, name, city, description);
        this.dean = dean;
    }

    public String getDean() {
        return dean;
    }

    public String getInfo(){
        return super.toString() + " dean: " + getDean();
    }

}
