import java.util.ArrayList;
import java.util.List;


/**
 * Klasse Filter
 * Zweck: Eine eingehende Liste von Mietobjekten wird nach angegebenen Kriterien gefiltert und mit den gewünschten Ergebnissen zurückgegeben
 *
 * @author Linnart Krumbholz, Phillip Willi Mächold
 * @version 1
 * Historie:
 */

public class Filter {

    /**
     * Parameterloser Konstruktor
     */
    public Filter() { }

    /**
     * Filtern der Mietobjekte
     * Vorbedingung: Eine Liste an Mietobjekten muss gegeben werden mit den passenden Filterattributen
     * Effekt: Die bestehende Liste wird nach den Kriterien abgesucht, sind die Kriterien erfüllt, werden Mietobjekte in einer neuen Liste gespeichert. Diese wird zurückgegeben.
     * @param mietobjekte
     * @param minWarmmiete
     * @param maxWarmmiete
     * @param minKaltmiete
     * @param maxKaltmiete
     * @param minRaeume
     * @param maxRaeume
     * @param minStockwerke
     * @param maxStockwerke
     * @param wgEignung
     * @param keller
     * @param balkon
     * @param badfenster
     * @param kuechenfenster
     * @param aufzug
     * @param rollstuhleingang
     * @param einbaukueche
     * @param badewanne
     * @param moebelliert
     * @param minPreisProQuadratmeter
     * @param maxPreisProQuadratmeter
     * @param minNebenkosten
     * @param maxNebenkosten
     * @return Rückgabe der gefilterten Liste.
     */

    //AUSSERHALB DIESER METHODE NOCH: Sortierung bspw. nach niedrigstem Preis
    //Sortierung nach Mietpreis und nach Einstellungsdatum? -> Ergänzen
    public List<Mietobjekt> filterList(List<Mietobjekt> mietobjekte,
                                       double minWarmmiete, double maxWarmmiete,
                                       double minKaltmiete, double maxKaltmiete,
                                       double minRaeume, double maxRaeume,
                                       double minStockwerke, double maxStockwerke,
                                       boolean wgEignung, boolean keller,
                                       boolean balkon, boolean badfenster,
                                       boolean kuechenfenster, boolean aufzug,
                                       boolean rollstuhleingang, boolean einbaukueche,
                                       boolean badewanne, boolean moebelliert,
                                       double minPreisProQuadratmeter, double maxPreisProQuadratmeter,
                                       double minNebenkosten, double maxNebenkosten) throws IllegalArgumentException {
        
        List<Mietobjekt> filteredList = new ArrayList<>();

        //HIER NACHFRAGEN: WIE WIRD DER FILTER SMARTER?
        //Idee: Attribute einzeln abfragen ob not null, nur dann wird Wert verglichen
        //Aber: wird sehr lang, ist das die eleganteste Methode?

        //Codieren: Attribute mit Werten belegen, Muss und Kannkriterien abfragen? Zahl als Bewertung wie gut Attribute passen, Matches mit hoher Wertung anzeigen
        for (Mietobjekt mietobjekt : mietobjekte) {
            if (mietobjekt.getWarmmiete() >= minWarmmiete && mietobjekt.getWarmmiete() <= maxWarmmiete
                    && mietobjekt.getKaltmiete() >= minKaltmiete && mietobjekt.getKaltmiete() <= maxKaltmiete
                    && mietobjekt.getRaeume() >= minRaeume && mietobjekt.getRaeume() <= maxRaeume
                    && mietobjekt.getStockwerke() >= minStockwerke && mietobjekt.getStockwerke() <= maxStockwerke
                    && mietobjekt.isWgEignung() == wgEignung
                    && mietobjekt.hasKeller() == keller
                    && mietobjekt.hasBalkon() == balkon
                    && mietobjekt.hasBadfenster() == badfenster
                    && mietobjekt.hasKuechenfenster() == kuechenfenster
                    && mietobjekt.hasAufzug() == aufzug
                    && mietobjekt.isRollstuhleignung() == rollstuhleingang
                    && mietobjekt.hasEinbaukueche() == einbaukueche
                    && mietobjekt.hasBadewanne() == badewanne
                    && mietobjekt.isMoebeliert() == moebelliert
                    && mietobjekt.getPreisProQuadratmeter() >= minPreisProQuadratmeter
                    && mietobjekt.getPreisProQuadratmeter() <= maxPreisProQuadratmeter
                    && mietobjekt.getNebenkosten() >= minNebenkosten
                    && mietobjekt.getNebenkosten() <= maxNebenkosten) {
                
                filteredList.add(mietobjekt);
            }
        }
        
        return filteredList;
    }

    //TO DO: ToString
    //TO DO: compareTo
}

