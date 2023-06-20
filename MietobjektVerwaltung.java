import java.util.Date;
import java.util.List;

/**
 * Klasse Mietobjektverwaltung
 * Zweck: Verwaltung der erstellten Mietobjekte.
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */
public class MietobjektVerwaltung {
    private static List<Mietobjekt> mietobjekte;

    /**
     * Getter und Setter für die Mietobjekt-Collection (hier sind ALLE verfügbaren Mietobjekte enthalten)
     */
    public static List<Mietobjekt> getMietobjekte() {
        return mietobjekte;
    }

    public static void setMietobjekte(List<Mietobjekt> mietobjekte) {
        MietobjektVerwaltung.mietobjekte = mietobjekte;
    }

    /**
     * Mietobjekt Erstellung
     * Vorbedingung: Konstruktor der Klasse Mietobjekt wird aufgerufen und muss ein Mietobjekt erstellen. Ein Vermieterobjekt muss vorhanden sein.
     * Effekt: Instanziierung eines Mietobjekts und Hinzufügen in die Verwaltungs-Collection.
     * @param kaltmiete
     * @param warmmiete
     * @param raeume
     * @param wohnflaeche
     * @param stockwerke
     * @param wgEignung
     * @param fruehestesEinzugsdatum
     * @param keller
     * @param balkon
     * @param badfenster
     * @param kuechenfenster
     * @param aufzug
     * @param rollstuhleignung
     * @param einbaukueche
     * @param badewanne
     * @param moebeliert
     * @param verm
     */

    public static void einstellen(double kaltmiete, double warmmiete, double raeume, double wohnflaeche, double stockwerke, boolean wgEignung,
                                            Date fruehestesEinzugsdatum, boolean keller, boolean balkon, boolean badfenster, boolean kuechenfenster,
                                            boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, boolean moebeliert, Vermieter verm){
        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete,  raeume, wohnflaeche, stockwerke, wgEignung, fruehestesEinzugsdatum, keller,  balkon,  badfenster, kuechenfenster,
        aufzug, rollstuhleignung, einbaukueche, badewanne, moebeliert, verm);
        mietobjekte.add(mietobjekt);
    }

    /**
     * Methode zur endgültigen Löschung eines Mietobjektes bei fehlerhafter Anlage.
     * @param mo -> Zu entfernendes Mietobjekt
     */
    public static void entfernen (Mietobjekt mo){
        mietobjekte.remove(mo);
    }
}
