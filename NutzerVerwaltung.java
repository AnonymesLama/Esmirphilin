import java.util.ArrayList;
import java.util.List;
/**
 * Klasse Nutzerverwaltung
 * Zweck: Verwaltung der erstellten Personen-Objekte aller Vererbungsebenen
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

public class NutzerVerwaltung{
    private List<Mieter> mieterList;
    private List<Vermieter> vermieterList;
    private List<Administrator> administratorenList;


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

    public void erstelleVermieter(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        Vermieter vermieter= new Vermieter(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        vermieterList.add(vermieter);
    }

    /**
     * Mieter Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines Mieters.
     *
     * @param nutzername
     * @param passwort
     * @param email
     * @param vorname
     * @param nachname
     * @param anrede
     * @param telefonnummer
     * @param adresse
     * @param haustiere
     * @param raucher
     * @param vorstrafen
     * @param nettoeinkommen
     */

    public void erstelleMieter(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse, int haustiere, boolean raucher, boolean vorstrafen, double nettoeinkommen) {
        Mieter mieter= new Mieter(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse, haustiere, raucher, vorstrafen, nettoeinkommen);
        mieterList.add(mieter);
    }

    /**
     * Administrator Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines Administrators.
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

    public void erstelleAdministrator(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        Administrator admin= new Administrator(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        administratorenList.add(admin);
    }

    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */

    public List<Mieter> getMieterList() {
        return mieterList;
    }

    public List<Vermieter> getVermieterList() {
        return vermieterList;
    }

    public List<Administrator> getAdministratorenList() {
        return administratorenList;
    }

    /**
     * Erstelle Vermieter
     * Effekt: Fügt Vermieter der Vermieter-Collection hinzu.
     *
     * @param vermieter
     */

    public void vermieterEinfuegen(Vermieter vermieter) {
        vermieterList.add(vermieter);
    }

    /**
     * Erstelle Mieter
     * Effekt: Fügt Mieter der Mieter-Collection hinzu.
     *
     * @param mieter
     */

    public void mieterEinfuegen(Mieter mieter) {
        mieterList.add(mieter);
    }

    /**
     * Erstelle Administrator
     * Effekt: Fügt Administrator der Administrator-Collection hinzu.
     *
     * @param administrator
     */

    public void administratorEinfuegen(Administrator administrator) {
        administratorenList.add(administrator);
    }

    /**
     * Entferne Vermieter
     * Effekt: Entfernt Vermieter aus der Vermieter-Collection.
     *
     * @param vermieter
     */

    public void vermieterLoeschen(Vermieter vermieter) {
        vermieterList.remove(vermieter);
    }

    /**
     * Erstelle Mieter
     * Effekt: Entfernt Mieter aus der Mieter-Collection.
     *
     * @param mieter
     */

    public void mieterLoeschen(Mieter mieter) {
        mieterList.remove(mieter);
    }

    /**
     * Erstelle Administrator
     * Effekt: Entfernt Administrator aus der Administrator-Collection.
     *
     * @param administrator
     */

    public void administratorLoeschen(Administrator administrator) {
        administratorenList.remove(administrator);
    }
}