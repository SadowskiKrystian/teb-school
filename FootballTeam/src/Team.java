import java.util.List;

public class Team {
    private String name;
    private String stadium;
    private List<Player> player;

    private Coach coach;
    private Doctor doctor;
    private Psychology psychology;

    public Team() {
    }

    public Team(String name, String stadium, List<Player> player, Coach coach, Doctor doctor, Psychology psychology) {
        this.name = name;
        this.stadium = stadium;
        this.player = player;
        this.coach = coach;
        this.doctor = doctor;
        this.psychology = psychology;
    }

    public String getName() {
        return name;
    }

    public String getStadium() {
        return stadium;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public Coach getCoach() {
        return coach;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Psychology getPsychology() {
        return psychology;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", stadium='" + stadium + '\'' +
                ", player=" + player +
                ", coach=" + coach +
                ", doctor=" + doctor +
                ", psychology=" + psychology +
                '}';
    }
}
