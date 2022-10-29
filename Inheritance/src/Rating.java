public class Rating extends Teacher {
    private int rating;
    private  String comment;

    public Rating() {
    }

    public Rating(int id, int rating, String comment) {
        super(id);
        this.rating = rating;
        this.comment = comment;
    }


    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Rating:" + "\n" +
                "-Id: " + getId() + "\n" +
                "-Rating: " + rating + "\n" +
                "-Comment: " + comment + "\n";
    }
}
