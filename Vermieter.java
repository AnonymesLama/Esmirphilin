import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Klasse Vermieter
 * Zweck: Realisiert einen möglichen Vermieter, der von der Klasse Nutzer erbt.
 * @author Phillip Willi Mächold, Linnart Krumbholz
 * @version 1
 * Historie:
 */

public class Vermieter extends SystemFachUser implements Comparable<Vermieter>{
    private List<Mietobjekt> mietobjekte;
    private boolean freigegeben = false;


    /**
     * Vermieter Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines Vermieters.
     *
     * @param nutzername
     * @param passwort
     * @param email
     * @param vorname
     * @param nachname
     * @param anrede
     * @param telefonnummer
     * @param adresse
     */

    public Vermieter(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        mietobjekte = new ArrayList<>();
    }

    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */

    public List<Mietobjekt> getMietobjekte() {
        return mietobjekte;
    }

    public boolean isFreigegeben() { return freigegeben; }

    /**
     * Alle folgenden Methoden sind Setter-Methoden
     *
     * @return weißen den Wert des Parameters einer Variable zu
     */
    public void freigeben() { this.freigegeben = true; }

    public void sperren() { this.freigegeben = false; }

    /**
     * Mietobjekt Konstruktor
     * Effekt: Erstellung eines neuen Mietobjekts
     *
     * @param kaltmiete
     * @param warmmiete
     * @param raeume
     * @param wohnflaeche
     * @param stockwerke
     * @param wgEignung
     * @param fruehestesEinzugsdatum
     * @param hasKeller
     * @param hasBalkon
     * @param hasBadfenster
     * @param hasKuechenfenster
     * @param hasAufzug
     * @param isRollstuhleignung
     * @param hasEinbaukueche
     * @param hasBadewanne
     * @param isMoebeliert
     * @param verm
     */

    public void erstelleMietobjekt(double kaltmiete, double warmmiete, int raeume, double wohnflaeche, int stockwerke, boolean wgEignung, Date fruehestesEinzugsdatum, boolean hasKeller, boolean hasBalkon, boolean hasBadfenster, boolean hasKuechenfenster, boolean hasAufzug, boolean isRollstuhleignung, boolean hasEinbaukueche, boolean hasBadewanne, boolean isMoebeliert, Vermieter verm) {
        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete, raeume, wohnflaeche, stockwerke, wgEignung, fruehestesEinzugsdatum, hasKeller, hasBalkon, hasBadfenster, hasKuechenfenster, hasAufzug, isRollstuhleignung, hasEinbaukueche, hasBadewanne, isMoebeliert, verm);
        mietobjekte.add(mietobjekt);
    }

    /**
     * DeaktiviereMietobjekt Konstruktor
     * Effekt: Deaktiviert einen Mietobjekt.
     *
     * @param mietobjekt
     */

    public void deaktiviereMietobjekt(Mietobjekt mietobjekt) {
        mietobjekt.deactivate();
        mietobjekte.remove(mietobjekt); // Entferne das Mietobjekt aus der Liste der Vermieter-Mietobjekte
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
        sb.append("Vermieter:\n");
        sb.append("Mietobjekte: ").append(mietobjekte).append("\n");
        sb.append("Freigegeben: ").append(freigegeben).append("\n");
        return sb.toString();
    }

    /**
     * CompareTo Methode
     * Effekt: Ermöglicht den Vergleich der Vermieter
     *
     * @param verm
     * @param verm1
     * @return liefert den Vergleichswert zurück
     */

    public static int compare(Vermieter verm, Vermieter verm1) {
        return verm1.compareTo(verm);
    }

    /**
     * CompareTo Methode
     * Effekt: Ermöglicht den Vergleich aller Variablen
     *
     * @param other
     * @return liefert den Vergleichswert zurück
     */

    @Override
    public int compareTo(Vermieter other) {
        int nutzernameComparison = this.getNutzername().compareTo(other.getNutzername());
        if (nutzernameComparison != 0) {
            return nutzernameComparison;
        }

        int passwortComparison = this.getPasswort().compareTo(other.getPasswort());
        if (passwortComparison != 0) {
            return passwortComparison;
        }

        int emailComparison = this.getEmail().compareTo(other.getEmail());
        if (emailComparison != 0) {
            return emailComparison;
        }

        int vornameComparison = this.getVorname().compareTo(other.getVorname());
        if (vornameComparison != 0) {
            return vornameComparison;
        }

        int nachnameComparison = this.getNachname().compareTo(other.getNachname());
        if (nachnameComparison != 0) {
            return nachnameComparison;
        }

        int anredeComparison = this.getAnrede().compareTo(other.getAnrede());
        if (anredeComparison != 0) {
            return anredeComparison;
        }

        int telefonnummerComparison = this.getTelefonnummer().compareTo(other.getTelefonnummer());
        if (telefonnummerComparison != 0) {
            return telefonnummerComparison;
        }

        int adresseComparison = this.getAdresse().compareTo(other.getAdresse());
        if (adresseComparison != 0) {
            return adresseComparison;
        }

        int freigegebenComparison = Boolean.compare(this.freigegeben, other.isFreigegeben());
        if (freigegebenComparison != 0) {
            return freigegebenComparison;
        }

        // Falls die Listen unterschiedlich lang sind, vergleiche die Längen
        int mietobjekteSizeComparison = Integer.compare(this.mietobjekte.size(), other.mietobjekte.size());
        if (mietobjekteSizeComparison != 0) {
            return mietobjekteSizeComparison;
        }
        return 0;
    }
}
