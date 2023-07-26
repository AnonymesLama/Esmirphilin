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

public class Vermieter extends Person implements Comparable<Vermieter>{
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
     * Erstelle Mietobjekt
     * Effekt: Fügt Mietobjekt der Vermieter-Mietobjektcollection hinzu.
     *
     * @param mietobjekt
     */

    public void erstelleMietobjekt(Mietobjekt mietobjekt) {
        if(this.freigegeben){
            mietobjekte.add(mietobjekt);
        }
    }

    /**
     * Deaktiviere Mietobjekt
     * Effekt: Entfernt Mietobjekt aus Vermieter-Mietobjektcollection.
     *
     * @param mietobjekt
     */

    public void deaktiviereMietobjekt(Mietobjekt mietobjekt) {
        mietobjekte.remove(mietobjekt);
    }

    /**
     * Akzeptiere Bewerbung, geplantes Schnittstellenattribut für Bestätigungs-Knopf an Bewerbungen
     * Effekt: Überprüft, ob die Bewerbung an einem Mietobjekt des Vermieters hängt. Wenn ja, wird das Mietobjekt deaktiviert.
     *
     * @param bewerbung
     */
    public void akzeptiereBewerbung(Bewerbung bewerbung){
        for(Mietobjekt mo : mietobjekte){
            for(Bewerbung bw : mo.getBewerbungen()){
                if(bewerbung.equals(bw)){
                    //SEND NOTIFICATION
                    deaktiviereMietobjekt(mo);
                }
            }
        }
    }

    /**
     * ToString Fachmethode
     * Effekt: gibt eine String-Repräsentation der Klasse zurück
     *
     * @return String (siehe Effekt)
     */

    @Override
    public String toString() {
        String fullName = this.getAnrede() + " " + this.getVorname() + " " + this.getNachname();
        String contactInfo = "E-Mail: " + this.getEmail() + ", Telefonnummer: " + this.getTelefonnummer() + ", Adresse: " + this.getAdresse();

        StringBuilder sb = new StringBuilder();
        sb.append("Nutzername: ").append(this.getNutzername()).append("\n")
                .append("Vollständiger Name: ").append(fullName).append("\n")
                .append("Kontaktdaten: ").append(contactInfo)
                .append("Mietobjekte: ").append(mietobjekte).append("\n")
                .append("Freigegeben: ").append(freigegeben).append("\n");

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
     * Effekt: Ermöglicht die Sortierung von Vermietern
     *
     * @param other
     * @return liefert den Vergleichswert der Vermieter zurück
     */

    @Override
    public int compareTo(Vermieter other) {
        int moComparison = compare(this, other);
        return moComparison;
    }

    /**
     * Compare-Methode
     * Effekt: Ermöglicht die alphabetische Einordnung von Vermietern anhand der Nachnamen
     *
     * @param other
     * @return liefert den Vergleichswert (welcher Nachname alphabetisch zuerst kommt) zurück
     */

    public int compareNachname(Vermieter other) {
        int nachnameComparison = this.getNachname().compareTo(other.getNachname());
        if (nachnameComparison != 0) {
            return nachnameComparison;
        }
        return 0;
    }

}
