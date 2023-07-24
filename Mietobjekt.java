import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * Klasse Mietobjekt
 * Zweck: Realisiert ein mögliches Mietobj
 * ekt
 *
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

public class Mietobjekt implements Comparable<Mietobjekt> {
	private boolean deaktiviert = false;
    private double kaltmiete;
    private double warmmiete;
    private double raeume;
    private double wohnflaeche;
    private double stockwerke;
    private Date fruehestesEinzugsdatum;
    //Wohnungsausstattung
    private HashMap<String, Boolean> ausstattung = new HashMap<String, Boolean>();
	//berechneten Werte
    private double preisProQuadratmeter;
    private double nebenkosten;
    private Vermieter verm;
    private List<Bewerbung> bewerbungen;

    /**
     * Mietobjekt Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines Mietobjekts und die Berechnung des Preises pro Quadratmeter und der Nebenkosten.
     *
     * @param kaltmiete
     * @param warmmiete
     * @param raeume
     * @param wohnflaeche
     * @param stockwerke
     * @param wgEignung
     * @param fruehestesEinzugsdatum
     * @param keller
     * @param balkon
     * @param badfenster
     * @param kuechenfenster
     * @param aufzug
     * @param rollstuhleignung
     * @param einbaukueche
     * @param badewanne
     * @param moebeliert
     * @param verm
     */
    public Mietobjekt(double kaltmiete, double warmmiete, double raeume, double wohnflaeche, double stockwerke, boolean wgEignung,
            Date fruehestesEinzugsdatum, boolean keller, boolean balkon, boolean badfenster, boolean kuechenfenster,
            boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, boolean moebeliert, Vermieter verm) {
        this.kaltmiete = kaltmiete;
        this.warmmiete = warmmiete;
        this.raeume = raeume;
        this.wohnflaeche = wohnflaeche;
        this.stockwerke = stockwerke;
        this.fruehestesEinzugsdatum = fruehestesEinzugsdatum;
        ausstattung.put("wgEignung", wgEignung);
        ausstattung.put("aufzug", aufzug);
        ausstattung.put("keller", keller);
        ausstattung.put("balkon", balkon);
        ausstattung.put("badfenster", badfenster);
        ausstattung.put("kuechenfenster", kuechenfenster);
        ausstattung.put("rollstuhleignung", rollstuhleignung);
        ausstattung.put("einbaukueche", einbaukueche);
        ausstattung.put("badewanne", badewanne);
        ausstattung.put("moebeliert", moebeliert);
        this.verm = verm;
        
        // Berechnung des Preises pro Quadratmeter und der Nebenkosten
        double qmPreis = (double) warmmiete / wohnflaeche;
        this.preisProQuadratmeter = qmPreis;
        this.nebenkosten = warmmiete - kaltmiete - (wohnflaeche * qmPreis);
    }

    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */

    public boolean isDeaktiviert() { return deaktiviert; }

	public double getKaltmiete() {
        return kaltmiete;
    }

    public double getWarmmiete() {
        return warmmiete;
    }

    public double getRaeume() {
        return raeume;
    }

    public double getWohnflaeche() {
        return wohnflaeche;
    }

    public double getStockwerke() {
        return stockwerke;
    }

    public Date getFruehestesEinzugsdatum() {
        return fruehestesEinzugsdatum;
    }

    public HashMap<String, Boolean> getAusstattung() {
        return ausstattung;
    }

    public double getPreisProQuadratmeter() {
		return preisProQuadratmeter;
	}

    public double getNebenkosten() {
		return nebenkosten;
	}

    public Vermieter getVerm() {
		return verm;
	}

    public List<Bewerbung> getBewerbungen() {
        return bewerbungen;
    }

    /**
     * Alle folgenden Methoden sind Setter-Methoden
     *
     * @key String zur Beschreibung eines Ausstattungsmerkmals der Wohnung
     * @value zum key zugehöriger Wert (true oder false), ob Ausstattung vorhanden ist
     * @verm Vermieter, der in die Wohnung eingetragen werden soll
     */

    public void setAusstattung(String key, Boolean value ) {
        ausstattung.replace(key, value);
    }

    public void setVerm(Vermieter verm) {
			this.verm = verm;
    }

    /**
     * Fachmethode zur endgültigen Deaktivierung von Fachobjekten
     * Effekt: setzt das Attribut deactivated auf wahr und löscht alle zugeordneten Bewerbungen
     */
    public void deactivate(){
        this.deaktiviert = true;
        for (Bewerbung bewerbung : bewerbungen) {
            bewerbungen.remove(bewerbung);
        }
    }

    /**
     * Fachmethode zur Wohnungsaktivierung:
     * Attribut deaktiviert wird gleich false gesetzt
     * */
    public void activate() {
        this.deaktiviert = false;
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
        sb.append("Mietobjekt\n");
        sb.append("Kaltmiete: ").append(kaltmiete).append(" €\n");
        sb.append("Warmmiete: ").append(warmmiete).append(" €\n");
        sb.append("Räume: ").append(raeume).append("\n");
        sb.append("Wohnfläche: ").append(wohnflaeche).append(" m²\n");
        sb.append("Stockwerke: ").append(stockwerke).append("\n");
        sb.append("Frühestes Einzugsdatum: ").append(fruehestesEinzugsdatum).append("\n");
        sb.append("WG-Eignung: ").append(ausstattung.getOrDefault("wgEignung", false)).append("\n");
        sb.append("Keller: ").append(ausstattung.getOrDefault("keller", false)).append("\n");
        sb.append("Balkon: ").append(ausstattung.getOrDefault("balkon", false)).append("\n");
        sb.append("Badfenster: ").append(ausstattung.getOrDefault("badfenster", false)).append("\n");
        sb.append("Küchenfenster: ").append(ausstattung.getOrDefault("kuechenfenster", false)).append("\n");
        sb.append("Aufzug: ").append(ausstattung.getOrDefault("aufzug", false)).append("\n");
        sb.append("Rollstuhleignung: ").append(ausstattung.getOrDefault("rollstuhleignung", false)).append("\n");
        sb.append("Einbauküche: ").append(ausstattung.getOrDefault("einbaukueche", false)).append("\n");
        sb.append("Badewanne: ").append(ausstattung.getOrDefault("badewanne", false)).append("\n");
        sb.append("Möbliert: ").append(ausstattung.getOrDefault("moebeliert", false)).append("\n");
        sb.append("Vermieter: ").append(verm.getVorname()).append(" ").append(verm.getNachname()).append("\n");
        sb.append("\n");

        return sb.toString();
    }

    /**
     * Compare Methoden
     * Effekt: Ermöglicht den Vergleich zwischen einem Attribut verschiedener Objekte der Klasse; ermöglicht eine Sortierung anhand dieser Attribute
     * CompareTo: Standard-Vergleich anhand der Wohnfläche
     * compare<Attribut>: Vergleich anhang des Attributs
     *
     * @param other
     * @return liefert den Vergleichswert zurück
     */

    @Override
    public int compareTo(Mietobjekt other) {
        int wohnflaecheComparison = Double.compare(this.wohnflaeche, other.wohnflaeche);
        if (wohnflaecheComparison != 0) {
            return wohnflaecheComparison;
        }
        return 0;
    }

    public int compareKaltmiete(Mietobjekt other) {
        int kaltmieteComparison = Double.compare(this.kaltmiete, other.kaltmiete);
        if (kaltmieteComparison != 0) {
            return kaltmieteComparison;
        }
        return 0;
    }

    public int compareWarmmiete(Mietobjekt other) {
        int warmmieteComparison = Double.compare(this.warmmiete, other.warmmiete);
        if (warmmieteComparison != 0) {
            return warmmieteComparison;
        }
        return 0;
    }

    public int compareRaeume(Mietobjekt other) {
        int raeumeComparison = Double.compare(this.raeume, other.raeume);
        if (raeumeComparison != 0) {
            return raeumeComparison;
        }
        return 0;
    }

    public int compareStockwerke(Mietobjekt other) {
        int stockwerkeComparison = Double.compare(this.stockwerke, other.stockwerke);
        if (stockwerkeComparison != 0) {
            return stockwerkeComparison;
        }
        return 0;
    }

    public int compareEinzugsdatum(Mietobjekt other) {
        int dateComparison = this.fruehestesEinzugsdatum.compareTo(other.fruehestesEinzugsdatum);
        if (dateComparison != 0) {
            return dateComparison;
        }
        return 0;
    }

    public int compareQMPreis(Mietobjekt other) {
        int preisProQuadratmeterComparison = Double.compare(this.preisProQuadratmeter, other.preisProQuadratmeter);
        if (preisProQuadratmeterComparison != 0) {
            return preisProQuadratmeterComparison;
        }
        return 0;
    }

    public int compareNebenkosten(Mietobjekt other) {
        int nebenkostenComparison = Double.compare(this.nebenkosten, other.nebenkosten);
        if (nebenkostenComparison != 0) {
            return nebenkostenComparison;
        }
        return 0;
    }
}
