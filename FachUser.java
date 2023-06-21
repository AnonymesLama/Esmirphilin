
/**
 * Klasse User
 * Zweck: Abstrakte Klasse, die einen Nutzernamen, ein Passwort und eine E-Mail-Adresse hat.
 * 
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

public abstract class User {

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

    public User(String nutzername, String passwort, String email) {
        this.nutzername = nutzername;
        this.passwort = passwort;
        this.email = email;
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
        User user = (User) obj;
        return nutzername.equals(user.nutzername);
    }
}
