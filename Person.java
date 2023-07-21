
/**
 * Klasse User
 * Zweck: Abstrakte Klasse, die Nutzerdaten speichert.
 * 
 * @author Phillip Willi Mächold, Linnart Krumbholz
 * @version 1
 * Historie:
 */

public abstract class Person {

    private String nutzername;
    private String passwort;
    private String email;
    private String vorname;
    private String nachname;
    private String anrede;
    private String telefonnummer;
    private String adresse;

    /**
     * Konto Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines neuen Kontos (Users).
     * 
     * @param nutzername
     * @param passwort  
     * @param email     
     */

    public Person(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
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

        this.nutzername = nutzername;
        this.passwort = passwort;
        this.email = email;
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
    
    public String getNutzername() { return nutzername; }
    
    
    public String getPasswort() {
        return passwort;
    }

    
    public String getEmail() {
        return email;
    }


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
     * Die folgende Methode ist eine Setter-Methode. Wird kein Passwort eingegeben, wird eine IllegalArgumentException zurückgegeben.
     *
     * @return weißen den Wert des Parameters einer Variable zu
     */

    public void setPasswort(String passwort) {
        if (passwort == null || passwort.isEmpty()) {
            throw new IllegalArgumentException("Passwort darf nicht null oder leer sein.");
        }
        this.passwort = passwort;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    // NUR DEN ADMINISTRATOR NACHNAMEN ÄNDERN LASSEN


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
        return "Konto{" +
                "nutzername='" + nutzername + '\'' +
                ", passwort='" + passwort + '\'' +
                ", email='" + email + '\'' +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", anrede='" + anrede + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    /**
     * equals Fachmethode
     * Effekt: vergleicht zwei Objekte miteinander
     *
     * @return String (siehe Effekt)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person user = (Person) obj;
        return nutzername.equals(user.nutzername);
    }
}
