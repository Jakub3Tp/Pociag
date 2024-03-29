public class Pasazer {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Pasazer(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Pasazer{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public String wyswietl(){
        return String.format("%s %s %o", imie, nazwisko, wiek);
    }
}
