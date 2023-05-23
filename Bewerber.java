import java.util.ArrayList;

public class Bewerber extends Nutzer implements Comparable<Bewerber> {
    private int haustiere;
    private boolean raucher;
    private boolean vorstrafen;

    public Bewerber(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse, int haustiere, boolean raucher, boolean vorstrafen) {
        super(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        this.haustiere = haustiere;
        this.raucher = raucher;
        this.vorstrafen = vorstrafen;
    }
    
    public int getHaustiere() {
        return haustiere;
    }

    public boolean isRaucher() {
        return raucher;
    }

    public boolean hasVorstrafen() {
        return vorstrafen;
    }

    @Override
    public String toString() {
        return super.toString() + "Bewerber{" +
                "haustiere=" + haustiere +
                ", raucher=" + raucher +
                ", vorstrafen=" + vorstrafen +
                '}';
    }

    @Override
    public int compareTo(Bewerber other) {
        int nutzernameComparison = this.getNutzername().compareTo(other.getNutzername());
        if (nutzernameComparison != 0) {
            return nutzernameComparison;
        }

        int passwortComparison = this.getPasswort().compareTo(other.getPasswort());
        if (passwortComparison != 0) {
            return passwortComparison;
        }

        int emailComparison = this.getEmail().compareTo(other.getEmail());
        if (emailComparison != 0) {
            return emailComparison;
        }

        int vornameComparison = this.getVorname().compareTo(other.getVorname());
        if (vornameComparison != 0) {
            return vornameComparison;
        }

        int nachnameComparison = this.getNachname().compareTo(other.getNachname());
        if (nachnameComparison != 0) {
            return nachnameComparison;
        }

        int anredeComparison = this.getAnrede().compareTo(other.getAnrede());
        if (anredeComparison != 0) {
            return anredeComparison;
        }

        int telefonnummerComparison = this.getTelefonnummer().compareTo(other.getTelefonnummer());
        if (telefonnummerComparison != 0) {
            return telefonnummerComparison;
        }

        int adresseComparison = this.getAdresse().compareTo(other.getAdresse());
        if (adresseComparison != 0) {
            return adresseComparison;
        }

        int haustiereComparison = Integer.compare(this.haustiere, other.haustiere);
        if (haustiereComparison != 0) {
            return haustiereComparison;
        }

        int raucherComparison = Boolean.compare(this.raucher, other.raucher);
        if (raucherComparison != 0) {
            return raucherComparison;
        }

        int vorstrafenComparison = Boolean.compare(this.vorstrafen, other.vorstrafen);
        if (vorstrafenComparison != 0) {
            return vorstrafenComparison;
        }

        return 0;
    }
}

