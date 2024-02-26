import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pasazer> pasazerowie = new ArrayList<>();
        Pasazer pasazer = new Pasazer("Adam", "Piechoczewski", 25);
        Pasazer pasazer2 = new Pasazer("Adrian", "Piechoczewski", 16);
        Pasazer pasazer3 = new Pasazer("Monika", "Piechoczewski", 15);
        pasazerowie.add(pasazer);
        pasazerowie.add(pasazer2);
        pasazerowie.add(pasazer3);
        for (Pasazer p: pasazerowie){
            System.out.println(p);
        }

    }
}