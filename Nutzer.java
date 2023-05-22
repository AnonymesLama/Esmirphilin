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
}