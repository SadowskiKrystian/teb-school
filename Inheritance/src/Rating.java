public class Rating {
    private int id;
    private int rating;
    private  String comment;

    public Rating() {
    }

    public Rating(int id, int rating, String comment) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
