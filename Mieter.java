/**
 * Klasse Bewerber
 * Zweck: Realisiert eine neue Bewerbung, der von der Klasse Nutzer erbt.
 *
 * @author Phillip Willi Mächold, Linnart Krumbholz
 * @version 1
 * Historie:
 */

public class Mieter extends Person implements Comparable<Mieter> {
    private int haustiere;
    private boolean raucher;
    private boolean vorstrafen;

    /**
     * Bewerber Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines neuen Bewerbers.
     *
     * @param nutzername    the nutzername
     * @param passwort      the passwort
     * @param email         the email
     * @param vorname       the vorname
     * @param nachname      the nachname
     * @param anrede        the anrede
     * @param telefonnummer the telefonnummer
     * @param adresse       the adresse
     * @param haustiere     the haustiere
     * @param raucher       the raucher
     * @param vorstrafen    the vorstrafen
     */
    
    public Mieter(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse, int haustiere, boolean raucher, boolean vorstrafen) {
        super(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        this.haustiere = haustiere;
        this.raucher = raucher;
        this.vorstrafen = vorstrafen;
    }

    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */
    
    public int getHaustiere() {
        return haustiere;
    }

    
    public boolean isRaucher() {
        return raucher;
    }

    
    public boolean hasVorstrafen() {
        return vorstrafen;
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
        sb.append(super.toString()).append("\n");
        sb.append("Bewerber: \n");
        sb.append("  Haustiere: ").append(haustiere).append("\n");
        sb.append("  Raucher: ").append(raucher).append("\n");
        sb.append("  Vorstrafen: ").append(vorstrafen).append("\n");
        sb.append(super.toString());
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
    public int compareTo(Mieter other) {
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

        return 0;
    }
}

