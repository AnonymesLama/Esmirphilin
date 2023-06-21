
/**
 * Klasse Nutzer
 * Zweck: Abstrakte Klasse, die von User erbt
          und zusätzlich die Attribute Vorname, Nachname, Anrede, Telefonnummer und Adresse hat.
 * @author Phillip Willi Mächold, Linnart Krumbholz
 * @version 1
 * Historie:
 */

abstract class SystemFachUser extends FachUser {
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
     * @param nutzername
     * @param passwort
     * @param email
     * @param vorname
     * @param nachname
     * @param anrede
     * @param telefonnummer
     * @param adresse
     */

    public SystemFachUser(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email);

        //Exception Handling: keine leeren Attribute
        if (nutzername == null || nutzername.isEmpty()) {
            throw new IllegalArgumentException("Nutzername darf nicht null oder leer sein.");
        }
        if (passwort == null || passwort.isEmpty()) {
            throw new IllegalArgumentException("Passwort darf nicht null oder leer sein.");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("E-Mail darf nicht null oder leer sein.");
        }
        if (vorname == null || vorname.isEmpty()) {
            throw new IllegalArgumentException("Vorname darf nicht null oder leer sein.");
        }
        if (nachname == null || nachname.isEmpty()) {
            throw new IllegalArgumentException("Nachname darf nicht null oder leer sein.");
        }
        if (anrede == null || anrede.isEmpty()) {
            throw new IllegalArgumentException("Anrede darf nicht null oder leer sein.");
        }
        if (telefonnummer == null || telefonnummer.isEmpty()) {
            throw new IllegalArgumentException("Telefonnummer darf nicht null oder leer sein.");
        }
        if (adresse == null || adresse.isEmpty()) {
            throw new IllegalArgumentException("Adresse darf nicht null oder leer sein.");
        }

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
