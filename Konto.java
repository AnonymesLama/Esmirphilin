
public abstract class Konto {
	// Klasse Konto: Abstrakte Klasse, die einen Nutzernamen, ein Passwort und eine E-Mail-Adresse hat.
    private String nutzername;
    private String passwort;
    private String email;

    // Konstruktor
    public Konto(String nutzername, String passwort, String email) {
        this.nutzername = nutzername;
        this.passwort = passwort;
        this.email = email;
    }

    // Getter-Methoden
    public String getNutzername() {
        return nutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public String getEmail() {
        return email;
    }
}