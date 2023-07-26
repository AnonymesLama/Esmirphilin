
/**
 * Klasse Administrator
 * Zweck: Realisiert einen Administrator, der von der Klasse Konto erbt.
 * @author Phillip Willi Mächold, Linnart Krumbholz
 * @version 1
 * Historie:
 */

public class Administrator extends Person {

    
    /**
     * Bewerber Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines Administrators.
     *
     * @param nutzername
     * @param passwort
     * @param email
     */

    public Administrator(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
    }

    /**
     * Effekt: Gibt ein normales Konto als Vermieter frei.
     *
     * @param vermieter 
     */
    public void freigeben(Vermieter vermieter) {
        vermieter.freigeben();
    }

    /**
     * Effekt: Sperrt einen Konto.
     *
     * @param vermieter
     */
    public void sperren(Vermieter vermieter) {
        vermieter.sperren();
    }

    public void setNachname(Person p, String nachname) {
        p.setNachname(nachname);
    }
}
