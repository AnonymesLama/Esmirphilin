
public class Bewerber {
    private int haustiere;
    private boolean raucher;
    private boolean vorstrafen;

    public Bewerbung(int haustiere, boolean raucher, boolean vorstrafen) {
        this.anzahlPersonen = anzahlPersonen;
        this.haustiere = haustiere;
        this.raucher = raucher;
        this.vorstrafen = vorstrafen;
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
