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

    public static void setMietobjekte(List<Mietobjekt> mietobjekte) throws IllegalArgumentException, IndexOutOfBoundsException {
        MietobjektVerwaltung.mietobjekte = mietobjekte;
    }

    public static void newMietobjekt(Mietobjekt mo){
        mietobjekte.add(mo);
    }

    /**
     * Mietobjekt Erstellung
     * Vorbedingung: Konstruktor der Klasse Mietobjekt wird aufgerufen und muss ein Mietobjekt erstellen. Ein Vermieterobjekt muss vorhanden sein.
     * Effekt: Instanziierung eines Mietobjekts und Hinzufügen in die Verwaltungs-Collection.
     * @param kaltmiete - Preis als Kommazahl
     * @param warmmiete - Preis als Kommazahl
     * @param raeume - Anzahl als Kommazahl
     * @param wohnflaeche - Fläche als Kommazahl
     * @param stockwerke - Anzahl als Kommazahl
     * @param wgEignung - wahr oder falsch
     * @param fruehestesEinzugsdatum - Datum
     * @param keller - wahr oder falsch
     * @param balkon - wahr oder falsch
     * @param badfenster - wahr oder falsch
     * @param kuechenfenster - wahr oder falsch
     * @param aufzug - wahr oder falsch
     * @param rollstuhleignung - wahr oder falsch
     * @param einbaukueche - wahr oder falsch
     * @param badewanne - wahr oder falsch
     * @param moebeliert - wahr oder falsch
     * @param verm - Vermieter-Objekt, das der Wohnung zugeordnet werden soll
     */

    public static void einstellen(double kaltmiete, double warmmiete, double raeume, double wohnflaeche, double stockwerke, boolean wgEignung,
                                            Date fruehestesEinzugsdatum, boolean keller, boolean balkon, boolean badfenster, boolean kuechenfenster,
                                            boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, boolean moebeliert, Vermieter verm) throws IllegalArgumentException {
        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete,  raeume, wohnflaeche, stockwerke, wgEignung, fruehestesEinzugsdatum, keller,  balkon,  badfenster, kuechenfenster,
        aufzug, rollstuhleignung, einbaukueche, badewanne, moebeliert, verm);
        mietobjekte.add(mietobjekt);
        verm.erstelleMietobjekt(mietobjekt);
    }

    /**
     * Fachmethode zur Reaktivierung eines Mietobjektes, nachdem es bereits erstellt wird.
     * Wird der Liste mietobjekte <Mietobjekt> hinzugefügt
     * @param mietobjekt - das zu aktivierende Mietobjekt
     */
    public static void aktivieren(Mietobjekt mietobjekt){
        mietobjekt.activate();
        mietobjekte.add(mietobjekt);
    }

    /**
     * Methode zur endgültigen Löschung eines Mietobjektes bei fehlerhafter Anlage.
     * @param mo -> Zu entfernendes Mietobjekt
     */

    public static void loeschen(Mietobjekt mo) {
        mo.deactivate();
        mietobjekte.remove(mo);
    }

    public static List<Mietobjekt> filtern(String kriterium) {

        //Wie will ich hier filtern???????????????
        return mietobjekte; //absolut unnötig, hier würde gefilterte Liste zurückgegeben werden wenn möglich
    }

    /**
     * ToString Fachmethode
     * Effekt: gibt eine String-Repräsentation der Collection aus ALLEN Mietobjekten zurück (auch die deaktivierten)
     *
     * @return String (siehe Effekt)
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mietobjekte:\n");

        for (Mietobjekt mietobjekt : mietobjekte) {
           sb.append(mietobjekt.toString() + "\n");
        }

        return sb.toString();
    }
}
