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

    //AUCH nach Excepions suchen, die technisch korrekt sind, aber logisch sinnlos sind (Startdatum muss vor Enddatum liegen bspw.)
    public static void setMietobjekte(List<Mietobjekt> mietobjekte) throws IllegalArgumentException, IndexOutOfBoundsException {
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
                                            boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, boolean moebeliert, Vermieter verm) throws IllegalArgumentException {
        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete,  raeume, wohnflaeche, stockwerke, wgEignung, fruehestesEinzugsdatum, keller,  balkon,  badfenster, kuechenfenster,
        aufzug, rollstuhleignung, einbaukueche, badewanne, moebeliert, verm);
        mietobjekte.add(mietobjekt);
    }

    /**
     * Methode zur endgültigen Löschung eines Mietobjektes bei fehlerhafter Anlage.
     * @param mo -> Zu entfernendes Mietobjekt
     */

    public static void entfernen (Mietobjekt mo){
        if(mietobjekte.contains(mo)){
            mietobjekte.remove(mo);
        }
    }

    public static List<Mietobjekt> filtern() {
        Filter filter = new Filter();
        //Wie will ich hier filtern???????????????
        return mietobjekte; //absolut unnötig, hier würde gefilterte Liste zurückgegeben werden wenn möglich
    }

    /**
     * ToString Fachmethode
     * Effekt: gibt eine String-Repräsentation der Klasse zurück
     *
     * @return String (siehe Effekt)
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mietobjekte:\n");

        for (Mietobjekt mietobjekt : mietobjekte) {
            sb.append("Mietobjekt\n");
            sb.append("Kaltmiete: ").append(mietobjekt.getKaltmiete()).append("\n");
            sb.append("Warmmiete: ").append(mietobjekt.getWarmmiete()).append("\n");
            sb.append("Räume: ").append(mietobjekt.getRaeume()).append("\n");
            sb.append("Wohnfläche: ").append(mietobjekt.getWohnflaeche()).append("\n");
            sb.append("Stockwerke: ").append(mietobjekt.getStockwerke()).append("\n");
            sb.append("WG-Eignung: ").append(mietobjekt.isWgEignung()).append("\n");
            sb.append("Frühestes Einzugsdatum: ").append(mietobjekt.getFruehestesEinzugsdatum()).append("\n");
            sb.append("Keller: ").append(mietobjekt.hasKeller()).append("\n");
            sb.append("Balkon: ").append(mietobjekt.hasBalkon()).append("\n");
            sb.append("Badfenster: ").append(mietobjekt.hasBadfenster()).append("\n");
            sb.append("Küchenfenster: ").append(mietobjekt.hasKuechenfenster()).append("\n");
            sb.append("Aufzug: ").append(mietobjekt.hasAufzug()).append("\n");
            sb.append("Rollstuhleignung: ").append(mietobjekt.isRollstuhleignung()).append("\n");
            sb.append("Einbauküche: ").append(mietobjekt.hasEinbaukueche()).append("\n");
            sb.append("Badewanne: ").append(mietobjekt.hasBadewanne()).append("\n");
            sb.append("Möbliert: ").append(mietobjekt.isMoebeliert()).append("\n");
            sb.append("Vermieter: ").append(mietobjekt.getVerm()).append("\n");
            sb.append("\n");
        }

        return sb.toString();
    }

}
