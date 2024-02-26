import java.util.ArrayList;

public class Wagon {
    public int maxMiejsc;
    public ArrayList<Pasazer> listaPasazerow = new ArrayList<>();

    public Wagon(int maxMiejsc, ArrayList<Pasazer> listaPasazerow) {
        this.maxMiejsc = maxMiejsc;
        this.listaPasazerow = listaPasazerow;
    }

    public int getMaxMiejsc() {
        return maxMiejsc;
    }

    public void setListaPasazerow(ArrayList<Pasazer> listaPasazerow) {
        this.listaPasazerow = listaPasazerow;
    }

    public void WyswietlPasazerow(){
        for(Pasazer p: listaPasazerow){
            System.out.printf("%s %s", p.getImie(), p.getNazwisko());
        }
    }

    public void WyswietlInfoPasazerow(){
        int wolne = maxMiejsc - listaPasazerow.size();
        for (Pasazer p: listaPasazerow){
            System.out.println(p.wyswietl());
        }
    }
    public int IleZeZnizkaSeniora(){
        int ile  = 0;
        for (Pasazer p: listaPasazerow){
            if (p.getWiek() >=  65){
                ile++;
            }
        }
        return ile;
    }
}
