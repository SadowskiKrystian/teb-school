import java.time.LocalDateTime;

public class Match {
    private LocalDateTime localDateTime;
    private String place;
    private String result;
    private String fouls;
    private String card;
    private int goals;

    public Match() {
    }

    public Match(LocalDateTime localDateTime, String place, String result, String fouls, String card, int goals) {
        this.localDateTime = localDateTime;
        this.place = place;
        this.result = result;
        this.fouls = fouls;
        this.card = card;
        this.goals = goals;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getPlace() {
        return place;
    }

    public String getResult() {
        return result;
    }

    public String getFouls() {
        return fouls;
    }

    public String getCard() {
        return card;
    }

    public int getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return "Match{" +
                "localDateTime=" + localDateTime +
                ", place='" + place + '\'' +
                ", result='" + result + '\'' +
                ", fouls='" + fouls + '\'' +
                ", card='" + card + '\'' +
                ", goals=" + goals +
                '}';
    }
}
