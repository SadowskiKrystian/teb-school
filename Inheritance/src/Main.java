public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Adam", "Kulinski", "Linki", 122312);
        Student student = new Student(2, "Krystian", "Sadowski", "Aughnacloy", 45637, "5A");
        School school = new School(3, "Belfast", "King", "School for special people");
        Direction direction = new Direction(4, "IT", "Profile main IT");
        Rating rating = new Rating(5, 20, "The best school");

        System.out.println(teacher);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(student);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(school);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(direction);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(rating);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}