
public class Bewerbung {
    private int anzahlPersonen;
    private int haustiere;
    private boolean raucher;
    private boolean vorstrafen;

    public Bewerbung(int anzahlPersonen, int haustiere, boolean raucher, boolean vorstrafen) {
        this.anzahlPersonen = anzahlPersonen;
        this.haustiere = haustiere;
        this.raucher = raucher;
        this.vorstrafen = vorstrafen;
    }

    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    public int getHaustiere() {
        return haustiere;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public boolean hasVorstrafen() {
        return vorstrafen;
    }
}
