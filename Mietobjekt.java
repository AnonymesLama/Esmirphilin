import java.time.LocalDate;
import java.util.Date;
import java.util.List;


/**
 * Klasse Mietobjekt
 * Zweck: Realisiert ein mögliches Mietobjekt
 *
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

public class Mietobjekt implements Comparable<Mietobjekt> {
	private boolean deactivated = false;
    private double kaltmiete;
    private double warmmiete;
    private double raeume;
    private double wohnflaeche;
    private double stockwerke;
    private boolean wgEignung;
    private Date fruehestesEinzugsdatum;
    //Wohnungsausstattung
    private boolean keller;
    private boolean balkon;
    private boolean badfenster;
    private boolean kuechenfenster;
    private boolean aufzug;
    private boolean rollstuhleignung;
	private boolean einbaukueche;
	private boolean badewanne;
	private boolean moebeliert;
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
        this.wgEignung = wgEignung;
        this.fruehestesEinzugsdatum = fruehestesEinzugsdatum;
        this.keller = keller;
        this.balkon = balkon;
        this.badfenster = badfenster;
        this.kuechenfenster = kuechenfenster;
        this.aufzug = aufzug;
        this.rollstuhleignung = rollstuhleignung;
        this.einbaukueche = einbaukueche;
        this.badewanne = badewanne;
        this.moebeliert = moebeliert;
        this.verm = verm;
        
        // Berechnung des Preises pro Quadratmeter und der Nebenkosten
        double qmPreis = (double) warmmiete / wohnflaeche;
        this.preisProQuadratmeter = qmPreis;
        this.nebenkosten = warmmiete - kaltmiete - (wohnflaeche * qmPreis);
    }

    public Mietobjekt(boolean wgEignung, Date fruehestesEinzugsdatum, boolean keller, boolean balkon, boolean badfenster, boolean kuechenfenster, boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, boolean moebeliert) {
        this.wgEignung = wgEignung;
        this.fruehestesEinzugsdatum = fruehestesEinzugsdatum;
        this.keller = keller;
        this.balkon = balkon;
        this.badfenster = badfenster;
        this.kuechenfenster = kuechenfenster;
        this.aufzug = aufzug;
        this.rollstuhleignung = rollstuhleignung;
        this.einbaukueche = einbaukueche;
        this.badewanne = badewanne;
        this.moebeliert = moebeliert;
    }
    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */

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


    public boolean isWgEignung() {
        return wgEignung;
    }


    public Date getFruehestesEinzugsdatum() {
        return fruehestesEinzugsdatum;
    }


    public boolean isKeller() {
        return keller;
    }


    public boolean isBalkon() {
        return balkon;
    }


    public boolean isBadfenster() {
        return badfenster;
    }


    public boolean isKuechenfenster() {
        return kuechenfenster;
    }


    public boolean isAufzug() {
        return aufzug;
    }


    public boolean isRollstuhleignung() {
		return rollstuhleignung;
	}


    public boolean isEinbaukueche() {
		return einbaukueche;
	}


    public boolean isBadewanne() {
		return badewanne;
	}


    public boolean isMoebeliert() {return moebeliert; }


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
     * @return weißen den Wert des Parameters einer Variable zu
     */

    public void setMoebeliert(boolean moebeliert) {
        this.moebeliert = moebeliert;
    }


    public void setVerm(Vermieter verm) {
			this.verm = verm;
		}


    /**
     * ToString Fachmethode
     * Effekt: gibt eine String-Repräsentation der Klasse zurück
     *
     * @return String (siehe Effekt)
     */

    @Override
    public String toString() {
        return "Mietobjekt{" +
                "deactivated=" + deactivated +
                ", kaltmiete=" + kaltmiete +
                ", warmmiete=" + warmmiete +
                ", raeume=" + raeume +
                ", wohnflaeche=" + wohnflaeche +
                ", stockwerke=" + stockwerke +
                ", wgEignung=" + wgEignung +
                ", fruehestesEinzugsdatum=" + fruehestesEinzugsdatum +
                ", keller=" + keller +
                ", balkon=" + balkon +
                ", badfenster=" + badfenster +
                ", kuechenfenster=" + kuechenfenster +
                ", aufzug=" + aufzug +
                ", rollstuhleignung=" + rollstuhleignung +
                ", einbaukueche=" + einbaukueche +
                ", badewanne=" + badewanne +
                ", moebeliert=" + moebeliert +
                ", preisProQuadratmeter=" + preisProQuadratmeter +
                ", nebenkosten=" + nebenkosten +
                ", verm=" + verm +
                ", bewerbungen=" + bewerbungen +
                '}';
    }


    /**
     * Vorbedingung: Es darf vorausgesetzt werden, dass die Variable "deactivated" auf false gesetzt ist.
     * Effekt: Setzt die Variable auf true, sodass das Mietobjekt deaktiviert wird.
               Außerdem werden alle dazugehörigen Bewerbungen entfernt.
     */

    public void deactivate() {
        // Setze das Attribut "deactivated" auf true, um das Mietobjekt als deaktiviert zu markieren
	    deactivated = true;

        // Entferne alle Bewerbungen für dieses Mietobjekt
		    for (Bewerbung bewerbung : bewerbungen) {
		        bewerbungen.remove(bewerbung);
		    }
	}


    /**
     * CompareTo Methode
     * Effekt: Ermöglicht den Vergleich aller Variablen
     *
     * @param other
     * @return liefert den Vergleichswert zurück
     */

    @Override
    public int compareTo(Mietobjekt other) {
        int deactivatedComparison = Boolean.compare(this.deactivated, other.deactivated);
        if (deactivatedComparison != 0) {
            return deactivatedComparison;
        }

        int kaltmieteComparison = Double.compare(this.kaltmiete, other.kaltmiete);
        if (kaltmieteComparison != 0) {
            return kaltmieteComparison;
        }

        int warmmieteComparison = Double.compare(this.warmmiete, other.warmmiete);
        if (warmmieteComparison != 0) {
            return warmmieteComparison;
        }

        int raeumeComparison = Double.compare(this.raeume, other.raeume);
        if (raeumeComparison != 0) {
            return raeumeComparison;
        }

        int wohnflaecheComparison = Double.compare(this.wohnflaeche, other.wohnflaeche);
        if (wohnflaecheComparison != 0) {
            return wohnflaecheComparison;
        }

        int stockwerkeComparison = Double.compare(this.stockwerke, other.stockwerke);
        if (stockwerkeComparison != 0) {
            return stockwerkeComparison;
        }

        int wgEignungComparison = Boolean.compare(this.wgEignung, other.wgEignung);
        if (wgEignungComparison != 0) {
            return wgEignungComparison;
        }

        int dateComparison = this.fruehestesEinzugsdatum.compareTo(other.fruehestesEinzugsdatum);
        if (dateComparison != 0) {
            return dateComparison;
        }

        int kellerComparison = Boolean.compare(this.keller, other.keller);
        if (kellerComparison != 0) {
            return kellerComparison;
        }

        int balkonComparison = Boolean.compare(this.balkon, other.balkon);
        if (balkonComparison != 0) {
            return balkonComparison;
        }

        int badfensterComparison = Boolean.compare(this.badfenster, other.badfenster);
        if (badfensterComparison != 0) {
            return badfensterComparison;
        }

        int kuechenfensterComparison = Boolean.compare(this.kuechenfenster, other.kuechenfenster);
        if (kuechenfensterComparison != 0) {
            return kuechenfensterComparison;
        }

        int aufzugComparison = Boolean.compare(this.aufzug, other.aufzug);
        if (aufzugComparison != 0) {
            return aufzugComparison;
        }

        int rollstuhleignungComparison = Boolean.compare(this.rollstuhleignung, other.rollstuhleignung);
        if (rollstuhleignungComparison != 0) {
            return rollstuhleignungComparison;
        }

        int einbaukuecheComparison = Boolean.compare(this.einbaukueche, other.einbaukueche);
        if (einbaukuecheComparison != 0) {
            return einbaukuecheComparison;
        }

        int badewanneComparison = Boolean.compare(this.badewanne, other.badewanne);
        if (badewanneComparison != 0) {
            return badewanneComparison;
        }

        int preisProQuadratmeterComparison = Double.compare(this.preisProQuadratmeter, other.preisProQuadratmeter);
        if (preisProQuadratmeterComparison != 0) {
            return preisProQuadratmeterComparison;
        }

        int nebenkostenComparison = Double.compare(this.nebenkosten, other.nebenkosten);
        if (nebenkostenComparison != 0) {
            return nebenkostenComparison;
        }

        int vermComparison = Vermieter.compare(this.verm, other.verm);
        if (vermComparison != 0) {
            return vermComparison;
        }

        return 0;
    }
}
