import java.util.Date;

public class Bewerbung {
    private int anzahlPersonen;
    private Date einzugszeitpunkt;
    private int haustiere;
    private boolean raucher;
    private boolean vorstrafen;
    private String referenzen;
    private boolean zustimmung;

    public Bewerbung(int anzahlPersonen, Date einzugszeitpunkt, int haustiere, boolean raucher, boolean vorstrafen, String referenzen, boolean zustimmung) {
        this.anzahlPersonen = anzahlPersonen;
        this.einzugszeitpunkt = einzugszeitpunkt;
        this.haustiere = haustiere;
        this.raucher = raucher;
        this.vorstrafen = vorstrafen;
        this.referenzen = referenzen;
        this.zustimmung = zustimmung;
    }

    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    public Date getEinzugszeitpunkt() {
        return einzugszeitpunkt;
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

    public String getReferenzen() {
        return referenzen;
    }

    public boolean hasZustimmung() {
        return zustimmung;
    }
}
