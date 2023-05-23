import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vermieter extends Nutzer implements Comparable<Vermieter>{
    private List<Mietobjekt> mietobjekte;
    private boolean freigegeben = false;

    //Konstruktor

    public Vermieter(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        mietobjekte = new ArrayList<>();
    }

    // Getter und Setter

    public List<Mietobjekt> getMietobjekte() {
        return mietobjekte;
    }

    public boolean isFreigegeben() { return freigegeben; }

    public void freigeben() { this.freigegeben = true; }

    public void sperren() { this.freigegeben = false; }

    // Fachmethoden

    public static int compare(Vermieter verm, Vermieter verm1) {
        return verm1.compareTo(verm);
    }

    public void erstelleMietobjekt(double kaltmiete, double warmmiete, int raeume, double wohnflaeche, int stockwerke, boolean wgEignung, LocalDate fruehestesEinzugsdatum, boolean hasKeller, boolean hasBalkon, boolean hasBadfenster, boolean hasKuechenfenster, boolean hasAufzug, boolean isRollstuhleignung, boolean hasEinbaukueche, boolean hasBadewanne, boolean isMoebeliert, Vermieter verm) {
        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete, raeume, wohnflaeche, stockwerke, wgEignung, fruehestesEinzugsdatum, hasKeller, hasBalkon, hasBadfenster, hasKuechenfenster, hasAufzug, isRollstuhleignung, hasEinbaukueche, hasBadewanne, isMoebeliert, verm);
        mietobjekte.add(mietobjekt);
    }
    
    public void deaktiviereMietobjekt(Mietobjekt mietobjekt) {
        mietobjekt.deactivate();
        mietobjekte.remove(mietobjekt); // Entferne das Mietobjekt aus der Liste der Vermieter-Mietobjekte
    }

    @Override
    public String toString() {
        return super.toString() + "Vermieter{" +
                "mietobjekte=" + mietobjekte +
                "freigegeben=" + freigegeben +
                '}';
    }

    @Override
    public int compareTo(Vermieter other) {
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

        int freigegebenComparison = Boolean.compare(this.freigegeben, other.isFreigegeben());
        if (freigegebenComparison != 0) {
            return freigegebenComparison;
        }

        // Falls die Listen unterschiedlich lang sind, vergleiche die Längen
        int mietobjekteSizeComparison = Integer.compare(this.mietobjekte.size(), other.mietobjekte.size());
        if (mietobjekteSizeComparison != 0) {
            return mietobjekteSizeComparison;
        }
        return 0;
    }
}
