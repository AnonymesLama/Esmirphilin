
/**
 * Klasse Nutzer
 * Zweck: Abstrakte Klasse, die von Konto erbt
          und zusätzlich die Attribute Vorname, Nachname, Anrede, Telefonnummer und Adresse hat.
 * @author
 * @version 1
 * Historie:
 */

abstract class Nutzer extends Konto {
    private String vorname;
    private String nachname;
    private String anrede;
    private String telefonnummer;
    private String adresse;

    /**
     * Nutzer Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines neuen Nutzers.
     *
     * @param nutzername    the nutzername
     * @param passwort      the passwort
     * @param email         the email
     * @param vorname       the vorname
     * @param nachname      the nachname
     * @param anrede        the anrede
     * @param telefonnummer the telefonnummer
     * @param adresse       the adresse
     */

    public Nutzer(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email);
        this.vorname = vorname;
        this.nachname = nachname;
        this.anrede = anrede;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
    }


    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */

    public String getVorname() {
        return vorname;
    }


    public String getNachname() {
        return nachname;
    }


    public String getAnrede() {
        return anrede;
    }


    public String getTelefonnummer() {
        return telefonnummer;
    }


    public String getAdresse() {
        return adresse;
    }

    /**
     * Alle folgenden Methoden sind Setter-Methoden
     *
     * @return weißen den Wert des Parameters einer Variable zu
     */

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }


    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * ToString Fachmethode
     * Effekt: gibt eine String-Repräsentation der Klasse zurück
     *
     * @return String (siehe Effekt)
     */

    @Override
    public String toString() {
        return "Nutzer{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", anrede='" + anrede + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
