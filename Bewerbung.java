import java.util.Date;


/**
 * Klasse Bewerbung
 * Zweck: Realisiert eine neue Bewerbung
 *
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

public class Bewerbung implements Comparable<Bewerbung>{
    private int anzahlPersonen;
    private Date einzugszeitpunkt;
    private String referenzen;
    private Mietobjekt mietobjekt;
    private Bewerber mieter;


    /**
     * Bewerbung Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung einer Bewerbung.
     *
     * @param anzahlPersonen   the anzahl personen
     * @param einzugszeitpunkt the einzugszeitpunkt
     * @param raucher          the raucher
     * @param vorstrafen       the vorstrafen
     * @param referenzen       the referenzen
     * @param zustimmung       the zustimmung
     * @param mietobjekt       the mietobjekt
     * @param mieter           the mieter
     */

    public Bewerbung(int anzahlPersonen, Date einzugszeitpunkt, boolean raucher, boolean vorstrafen, String referenzen, boolean zustimmung, Mietobjekt mietobjekt, Bewerber mieter) {
        this.anzahlPersonen = anzahlPersonen;
        this.einzugszeitpunkt = einzugszeitpunkt;
        this.referenzen = referenzen;
        this.mietobjekt = mietobjekt;
        this.mieter = mieter;
    }

    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */

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

    /**
     * ToString Fachmethode
     * Effekt: gibt eine String-Repräsentation der Klasse zurück
     *
     * @return String (siehe Effekt)
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bewerbung:\n");
        sb.append("Anzahl Personen: ").append(anzahlPersonen).append("\n");
        sb.append("Einzugszeitpunkt: ").append(einzugszeitpunkt).append("\n");
        sb.append("Referenzen: ").append(referenzen).append("\n");
        return sb.toString();
    }

    /**
     * CompareTo Methode
     * Effekt: Ermöglicht den Vergleich aller Variablen
     * 
     * @param other
     * @return liefert den Vergleichswert zurück
     */
    
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
