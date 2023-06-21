import java.util.ArrayList;
import java.util.List;

public class MietobjektFilter {

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
                                       double minNebenkosten, double maxNebenkosten) {
        
        List<Mietobjekt> filteredList = new ArrayList<>();
        
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
                    && mietobjekt.hasRollstuhleingang() == rollstuhleingang
                    && mietobjekt.hasEinbaukueche() == einbaukueche
                    && mietobjekt.hasBadewanne() == badewanne
                    && mietobjekt.isMoebelliert() == moebelliert
                    && mietobjekt.getPreisProQuadratmeter() >= minPreisProQuadratmeter
                    && mietobjekt.getPreisProQuadratmeter() <= maxPreisProQuadratmeter
                    && mietobjekt.getNebenkosten() >= minNebenkosten
                    && mietobjekt.getNebenkosten() <= maxNebenkosten) {
                
                filteredList.add(mietobjekt);
            }
        }
        
        return filteredList;
    }
}

