import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Klasse Mietobjektverwaltung
 * Zweck: Verwaltung der erstellten Mietobjekte.
 * @author Miriam Duscha, Esma Ersan
 * @labels Strings, durch die Filterparameter in den verschiedenen KlassenMethoden abgefragt werden. Nur für den klasseninternen Gebrauch.
 * @version 1
 * Historie:
 */
public class MietobjektVerwaltung {
    private static List<Mietobjekt> mietobjekte;
    //Labels
    private static String stockwerk = "Stockwerke";
    private static String raum = "Raeume";
    private static String flaeche = "Wohnfläche";
    private static String qm = "Quadratmeterpreis";
    private static String warm = "Warmmiete";
    private static String kalt = "Kaltmiete";
    private static String nebenkosten = "Nebenkosten";
    private static String einzug = "Einzugsdatum";

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

    /**
     * Fachmethode: Sortieren der Wohnungen nach Attributen
     * @kriterium: Hier wird als String angegeben, nach welchem Kriterium gefiltert wird (stockwerke, raeume, wohnflaeche, qmpreis, warmmiete, kaltmiete, nebenkosten, einzugsdatum)
     * HINWEIS FÜR ENTWICKLER: Wer hier eine schlauere Lösung hat, gerne ergänzen. 
     */
    public static List<Mietobjekt> sortieren(String kriterium) {
        List<Mietobjekt> sortiert = mietobjekte;
        if(kriterium.equalsIgnoreCase(stockwerk)){
            sortiert.sort(Mietobjekt::compareStockwerke);
        }
        if(kriterium.equalsIgnoreCase(raum)){
            sortiert.sort(Mietobjekt::compareRaeume);
        }
        else if(kriterium.equalsIgnoreCase(flaeche)){
            sortiert.sort(Mietobjekt::compareTo);
        }
        else if(kriterium.equalsIgnoreCase(qm)){
            sortiert.sort(Mietobjekt::compareQMPreis);
        }
        else if(kriterium.equalsIgnoreCase(warm)){
            sortiert.sort(Mietobjekt::compareWarmmiete);
        }
        else if(kriterium.equalsIgnoreCase(kalt)){
            sortiert.sort(Mietobjekt::compareKaltmiete);
        }
        else if(kriterium.equalsIgnoreCase(nebenkosten)){
            sortiert.sort(Mietobjekt::compareNebenkosten);
        }
        else if(kriterium.equalsIgnoreCase(einzug)){
            sortiert.sort(Mietobjekt::compareEinzugsdatum);
        }

        return sortiert;
    }

    /**
     * Fachmethode: <Attributname>Filter: filtert die vorhandenen Mietobjekte nach Objekten, die im Rahmen der angegebenen Range liegen
     * @param min - Mindestzahl
     * @param max - Maximale Anzahl
     * @return gefilterte Liste an Mietobjekten, die innerhalb der gegebenen Grenzen liegen
     * ENTWICKLERHINWEIS: Methode ist noch nicht optimal, bei Aufruf von <min UND >max bei jedem Objekt zu hohe Rechenleistung. Durch Aufteilen der Vergleiche auf vor dem Erreichen der Range und danach lässt sich Methode effektiver schreiben. Allerdings gerade kein Weg gefunden, dies zu realisieren.
     */
    public static List<Mietobjekt> stockwerkFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(stockwerk);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getStockwerke()<min | mo.getStockwerke() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> raumFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(raum);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getRaeume()<min | mo.getRaeume() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> flaechenFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(flaeche);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getWohnflaeche()<min | mo.getWohnflaeche() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> qmPreisFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(qm);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getPreisProQuadratmeter()<min | mo.getPreisProQuadratmeter() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> warmmieteFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(warm);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getWarmmiete()<min | mo.getWarmmiete() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> kaltmieteFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(kalt);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getKaltmiete()<min | mo.getKaltmiete() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> nebenkostenFilter(double min, double max){
        List<Mietobjekt> gefiltert = sortieren(nebenkosten);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getNebenkosten()<min | mo.getNebenkosten() > max){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
    }

    public static List<Mietobjekt> einzugsdatumFilter(Date start, Date end){
        List<Mietobjekt> gefiltert = sortieren(einzug);
        for(Mietobjekt mo : gefiltert) {
            if(mo.getFruehestesEinzugsdatum().before(start) | mo.getFruehestesEinzugsdatum().after(end)){
                gefiltert.remove(mo);
            }
        }
        return gefiltert;
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
