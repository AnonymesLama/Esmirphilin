
/**
 * Klasse Konto
 * Zweck: Abstrakte Klasse, die einen Nutzernamen, ein Passwort und eine E-Mail-Adresse hat.
 * 
 * @author
 * @version 1
 * Historie:
 */

public abstract class Konto {
	
    private String nutzername;
    private String passwort;
    private String email;

    /**
     * Konto Konstruktor
     * Vorbedingung: Es darf vorausgesetzt werden, dass alle nötigen Attribute deklariert sind.
     * Effekt: Instanziierung eines neuen Kontos (Users).
     * 
     * @param nutzername
     * @param passwort  
     * @param email     
     */

    public Konto(String nutzername, String passwort, String email) {
        this.nutzername = nutzername;
        this.passwort = passwort;
        this.email = email;
    }

    /**
     * Alle folgenden Methoden sind Getter-Methoden
     *
     * @return geben jeweils den Wert der Variable zurück
     */
    
    public String getNutzername() {
        return nutzername;
    }
    
    
    public String getPasswort() {
        return passwort;
    }

    
    public String getEmail() {
        return email;
    }

    /**
     * Die folgende Methode ist eine Setter-Methode
     *
     * @return weißen den Wert des Parameters einer Variable zu
     */
    
    public void setPasswort(String passwort) {
        this.passwort = passwort;
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
                '}';
    }
}
