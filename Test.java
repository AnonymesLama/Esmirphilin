import java.util.Date;

public class MietobjektTest {

    public static void main(String[] args) {
        testMietobjektErstellung();
    }

    private static void testMietobjektErstellung() {
        double kaltmiete = 800.00;
        double warmmiete = 950.00;
        double raeume = 3.5;
        double wohnflaeche = 80.0;
        double stockwerke = 2.0;
        boolean wgEignung = false;
        Date fruehestesEinzugsdatum = new Date();
        boolean keller = true;
        boolean balkon = true;
        boolean badfenster = false;
        boolean kuechenfenster = true;
        boolean aufzug = false;
        boolean rollstuhleignung = false;
        boolean einbaukueche = true;
        boolean badewanne = false;
        boolean moebeliert = false;
        Vermieter verm = new Vermieter("Max Mustermann", "max.mustermann@example.com");

        Mietobjekt mietobjekt = new Mietobjekt(kaltmiete, warmmiete, raeume, wohnflaeche, stockwerke, wgEignung,
                fruehestesEinzugsdatum, keller, balkon, badfenster, kuechenfenster, aufzug, rollstuhleignung, einbaukueche,
                badewanne, moebeliert, verm);

        // Test der Getter-Methoden
        assert (mietobjekt.getKaltmiete() == kaltmiete);
        assert (mietobjekt.getWarmmiete() == warmmiete);
        assert (mietobjekt.getRaeume() == raeume);
        assert (mietobjekt.getWohnflaeche() == wohnflaeche);
        assert (mietobjekt.getStockwerke() == stockwerke);
        assert (mietobjekt.isWgEignung() == wgEignung);
        assert (mietobjekt.getFruehestesEinzugsdatum().equals(fruehestesEinzugsdatum));
        assert (mietobjekt.hasKeller() == keller);
        assert (mietobjekt.hasBalkon() == balkon);
        assert (mietobjekt.hasBadfenster() == badfenster);
        assert (mietobjekt.hasKuechenfenster() == kuechenfenster);
        assert (mietobjekt.hasAufzug() == aufzug);
        assert (mietobjekt.isRollstuhleignung() == rollstuhleignung);
        assert (mietobjekt.hasEinbaukueche() == einbaukueche);
        assert (mietobjekt.hasBadewanne() == badewanne);
        assert (mietobjekt.isMoebeliert() == moebeliert);
        assert (mietobjekt.getVermieter().equals(verm));

        System.out.println("Test für Mietobjekt-Erstellung erfolgreich abgeschlossen!");
    }
}

class Vermieter {
    private String name;
    private String email;

    public Vermieter(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
