import java.util.Date;

public class Bewerbung implements Comparable<Bewerbung>{
    private int anzahlPersonen;
    private Date einzugszeitpunkt;
    private String referenzen;
    private Mietobjekt mietobjekt;
    private Bewerber mieter;

    // Konstruktoren

    public Bewerbung(int anzahlPersonen, Date einzugszeitpunkt, boolean raucher, boolean vorstrafen, String referenzen, boolean zustimmung, Mietobjekt mietobjekt, Bewerber mieter) {
        this.anzahlPersonen = anzahlPersonen;
        this.einzugszeitpunkt = einzugszeitpunkt;
        this.referenzen = referenzen;
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

    public String getReferenzen() {
        return referenzen;
    }

    public Mietobjekt getMietobjekt() { return mietobjekt; }

    public Bewerber getMieter() { return mieter; }

    @Override
    public String toString() {
        return "Bewerbung{" +
                "anzahlPersonen=" + anzahlPersonen +
                ", einzugszeitpunkt=" + einzugszeitpunkt +
                ", referenzen='" + referenzen + '\'' +
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

        int referenzenComparison = this.referenzen.compareTo(other.referenzen);
        if (referenzenComparison != 0) {
            return referenzenComparison;
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
