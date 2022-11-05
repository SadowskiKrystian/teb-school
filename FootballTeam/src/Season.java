public class Season{
    private int amountTeam;
    private int amountPlayedMatch;
    private int lost;
    private int point;
    private Team team;
    private Match match;

    public Season() {
    }

    public Season(int amountTeam, int amountPlayedMatch, int lost, int point, Team team, Match match) {
        this.amountTeam = amountTeam;
        this.amountPlayedMatch = amountPlayedMatch;
        this.lost = lost;
        this.point = point;
        this.team = team;
        this.match = match;
    }

    public int getAmountTeam() {
        return amountTeam;
    }

    public int getAmountPlayedMatch() {
        return amountPlayedMatch;
    }

    public int getLost() {
        return lost;
    }

    public int getPoint() {
        return point;
    }

    public Team getTeam() {
        return team;
    }

    public Match getMatch() {
        return match;
    }

    @Override
    public String toString() {
        return "Season{" +
                "amountTeam=" + amountTeam +
                ", amountPlayedMatch=" + amountPlayedMatch +
                ", lost=" + lost +
                ", point=" + point +
                ", team=" + team +
                ", match=" + match +
                '}';
    }
}
