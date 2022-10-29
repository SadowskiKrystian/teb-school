public class Main {
    public static void main(String[] args) {
        TheWorst theWorst = new TheWorst("Niedopuszczajaca");
        Worse worse = new Worse("Dopuszczajaca");
        Bad bad = new Bad("Dostateczny");
        Good good = new Good("Dobry");
        VeryGood veryGood = new VeryGood("Bardzo dobry");

        Rating[] rating = {theWorst, worse, bad, good, veryGood};
        for (Rating rating1 : rating) {
            System.out.println(rating1.getName());
        }


    }
}