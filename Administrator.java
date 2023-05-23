public class Administrator extends Konto {

    // Konstruktor

    public Administrator(String nutzername, String passwort, String email) {
        super(nutzername, passwort, email);
    }

    // Fachmethoden

    public void freigeben(Vermieter vermieter) {
        vermieter.freigeben();
    }

    public void sperren(Vermieter vermieter) {
        vermieter.sperren();
    }
}