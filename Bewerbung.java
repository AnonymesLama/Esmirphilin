import java.util.Date;

public class Bewerbung implements Comparable<Bewerbung>{
    private int anzahlPersonen;
    private Date einzugszeitpunkt;
    private int haustiere;
    private boolean raucher;
    private boolean vorstrafen;
    private String referenzen;
    private boolean zustimmung;
    private Mietobjekt mietobjekt;
    private Mieter mieter;

    // Konstruktoren

    public Bewerbung(int anzahlPersonen, Date einzugszeitpunkt, int haustiere, boolean raucher, boolean vorstrafen, String referenzen, boolean zustimmung, Mietobjekt mietobjekt, Mieter mieter) {
        this.anzahlPersonen = anzahlPersonen;
        this.einzugszeitpunkt = einzugszeitpunkt;
        this.haustiere = haustiere;
        this.raucher = raucher;
        this.vorstrafen = vorstrafen;
        this.referenzen = referenzen;
        this.zustimmung = zustimmung;
        this.mietobjekt = mietobjekt;
        this.mieter = mieter;
    }

    // Getter-Methoden

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

    public Mietobjekt getMietobjekt() { return mietobjekt; }

    public Mieter getMieter() { return mieter; }

    @Override
    public String toString() {
        return "Bewerbung{" +
                "anzahlPersonen=" + anzahlPersonen +
                ", einzugszeitpunkt=" + einzugszeitpunkt +
                ", haustiere=" + haustiere +
                ", raucher=" + raucher +
                ", vorstrafen=" + vorstrafen +
                ", referenzen='" + referenzen + '\'' +
                ", zustimmung=" + zustimmung +
                '}';
    }

    @Override
    public int compareTo(Bewerbung other) {
        int anzahlPersonenComparison = Integer.compare(this.anzahlPersonen, other.anzahlPersonen);
        if (anzahlPersonenComparison != 0) {
            return anzahlPersonenComparison;
        }

        int einzugszeitpunktComparison = this.einzugszeitpunkt.compareTo(other.einzugszeitpunkt);
        if (einzugszeitpunktComparison != 0) {
            return einzugszeitpunktComparison;
        }

        int haustiereComparison = Integer.compare(this.haustiere, other.haustiere);
        if (haustiereComparison != 0) {
            return haustiereComparison;
        }

        int raucherComparison = Boolean.compare(this.raucher, other.raucher);
        if (raucherComparison != 0) {
            return raucherComparison;
        }

        int vorstrafenComparison = Boolean.compare(this.vorstrafen, other.vorstrafen);
        if (vorstrafenComparison != 0) {
            return vorstrafenComparison;
        }

        int referenzenComparison = this.referenzen.compareTo(other.referenzen);
        if (referenzenComparison != 0) {
            return referenzenComparison;
        }

        int zustimmungComparison = Boolean.compare(this.zustimmung, other.zustimmung);
        if (zustimmungComparison != 0) {
            return zustimmungComparison;
        }

        int mietobjektComparison = this.mietobjekt.compareTo(other.mietobjekt);
        if (mietobjektComparison != 0) {
            return mietobjektComparison;
        }

        int mieterComparison = this.mieter.compareTo(other.mieter);
        if (mieterComparison != 0) {
            return mieterComparison;
        }

        return 0;
    }

}
