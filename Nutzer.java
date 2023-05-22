// Klasse Nutzer: Abstrakte Klasse, die von Konto erbt und zusätzlich die Attribute Vorname, Nachname, Anrede, Telefonnummer und Adresse hat.
abstract class Nutzer extends Konto {
    private String vorname;
    private String nachname;
    private String anrede;
    private String telefonnummer;
    private String adresse;

    // Konstruktor
    public Nutzer(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email);
        this.vorname = vorname;
        this.nachname = nachname;
        this.anrede = anrede;
        this.telefonnummer = telefonnummer;
        this.adresse = adresse;
    }

    // Getter-Methoden
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

    // Setter-Methoden
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