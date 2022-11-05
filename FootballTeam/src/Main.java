import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Adam", "Kulinski", 1245);
        Psychology psychology = new Psychology("Krystian", "Sadowski", 2234, "Glupota");
        Doctor doctor = new Doctor("Marian", "Opania", 23, "Pluca");
        Team team = new Team("Kolo", "Elblag", players(), coach, doctor, psychology);
        Match match = new Match(LocalDateTime.now(), "Berlin", "Good", "1", "2 Green", 2);
        Season season = new Season(12, 1, 2, 10, team, match);
        System.out.println(coach);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(psychology);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(doctor);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(team);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(match);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(season);
        System.out.println("----------------------------------------------------------------------------");

    }

    public static List<Player> players(){
        List<Player> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        Position position;
        for (int i = 0; i < 14; i++){
            System.out.println("Podaj imie: ");
            name = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            surname = scanner.nextLine();
            System.out.println("Dostepne pozycje:\n" +
                    "    DEFENDER,\n" +
                    "    ASSISTANT,\n" +
                    "    ATTACKER,\n" +
                    "    GOALKEEPER\n" + "Podaj pozycje:");
            position = Position.valueOf(scanner.next().toLowerCase(Locale.ROOT));
            list.add(new Player(name, surname, position));
        }
        return list;
    }
}