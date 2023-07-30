import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Klasse Bewerbung
 * Zweck: Realisiert eine neue Bewerbung
 *
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

@Entity
public class Bewerbung implements Comparable<Bewerbung>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int anzahlPersonen;
    private Date einzugszeitpunkt;
    private String referenzen;
    private Mietobjekt mietobjekt;
    private Mieter mieter;
    private static String anzahlMieter = "Anzahl Personen";
    private static String fruehesterEinzug = "Frühester Einzug";
    private static String nettoEinkommen = "Haushaltsnettoeinkommen";

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

    public Bewerbung(int anzahlPersonen, Date einzugszeitpunkt, boolean raucher, boolean vorstrafen, String referenzen, boolean zustimmung, Mietobjekt mietobjekt, Mieter mieter) {
        if(mieter.getNettoeinkommen()*3>=mietobjekt.getWarmmiete()){
            this.anzahlPersonen = anzahlPersonen;
            this.einzugszeitpunkt = einzugszeitpunkt;
            this.referenzen = referenzen;
            this.mietobjekt = mietobjekt;
            this.mieter = mieter;
        }
        else { throw new IllegalArgumentException("Mieter hat nicht das notwendige Gehalt, um die Wohnung zu bezahlen."); }
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

    public Mieter getMieter() { return mieter; }

    /**
     * Fachmethode: Sortieren der Bewerbung nach Attributen
     * @kriterium: Hier wird als String angegeben, nach welchem Kriterium gefiltert wird (anzahlMieter fruehesterEinzug, nettoEinkommen). Strings sind statische Attribute der Klasse.
     * HINWEIS SCHNITTSTELLE: Parameter als static Strings in Klasse Bewerbung ablesbar.
     */
    public static List<Bewerbung> sortieren(List<Bewerbung> bewerbungen, String kriterium) {
        List<Bewerbung> sortiert = bewerbungen;
        if(kriterium.equalsIgnoreCase(anzahlMieter)){
            sortiert.sort(Bewerbung::compareAnzahlMieter);
        }
        else if(kriterium.equalsIgnoreCase(fruehesterEinzug)){
            sortiert.sort(Bewerbung::compareFruehesterEinzug);
        }
        else if(kriterium.equalsIgnoreCase(nettoEinkommen)){
            sortiert.sort(Bewerbung::compareNettoEinkommen);
        }
        return sortiert;
    }

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

    public int compareAnzahlMieter(Bewerbung other) {
        int anzahlPersonenComparison = Double.compare(this.anzahlPersonen, other.anzahlPersonen);
        if (anzahlPersonenComparison != 0) {
            return anzahlPersonenComparison;
        }
        return 0;
    }

    public int compareFruehesterEinzug(Bewerbung other) {
        int einzugsDatumComparison = this.einzugszeitpunkt.compareTo(other.einzugszeitpunkt);
        if (einzugsDatumComparison != 0) {
            return einzugsDatumComparison;
        }
        return 0;
    }

    public int compareNettoEinkommen(Bewerbung other) {
        int nettoEinkommenComparison = Double.compare(this.mieter.getNettoeinkommen(), other.mieter.getNettoeinkommen());
        if (nettoEinkommenComparison != 0) {
            return nettoEinkommenComparison;
        }
        return 0;
    }
}
