import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vermieter extends Nutzer {
    private List<Mietobjekt> mietobjekte;

    public Vermieter(String nutzername, String passwort, String email, String vorname, String nachname, String anrede, String telefonnummer, String adresse) {
        super(nutzername, passwort, email, vorname, nachname, anrede, telefonnummer, adresse);
        mietobjekte = new ArrayList<>();
    }

    public void erstelleMietobjekt(double kaltmiete, double warmmiete, int raeume, double wohnflaeche, int stockwerke, boolean wgeignung, LocalDate fruehestesEinzugsdatum, boolean hasKeller, boolean hasBalkon, boolean hasBadfenster, boolean hasKuechenfenster, boolean hasAufzug, boolean isRollstuhleignung, boolean hasEinbaukueche, boolean hasBadewanne) {
        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete, raeume, wohnflaeche, stockwerke, wgeignung, fruehestesEinzugsdatum, hasKeller, hasBalkon, hasBadfenster, hasKuechenfenster, hasAufzug, isRollstuhleignung, hasEinbaukueche, hasBadewanne);
        mietobjekte.add(mietobjekt);
    }

    public void loescheMietobjekt(Mietobjekt mietobjekt) {
        mietobjekt.remove(); 
        mietobjekte.remove(mietobjekt); // Entferne das Mietobjekt aus der Liste der Vermieter-Mietobjekte
    }
    
    public void deaktiviereMietobjekt(Mietobjekt mietobjekt) {
    	
    }
    
    public List<Mietobjekt> getMietobjekte() {
        return mietobjekte;
    }
}
