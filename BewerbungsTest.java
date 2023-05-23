import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BewerbungsTest extends Mietobjekt {

    public static void main(String[] args) {
        //Vermieter erstellen
        Vermieter v = new Vermieter("name", "123", "mail@mail.de", "Matthias", "Mustermännchen", "Herr", "015112345678", "Einweg 3, 10420 Berlin");
        System.out.println("Klasse: Vermieter\nMethode: Konstruktor + toString()");
        System.out.println(v.toString());
        Mietobjekt mo = new Mietobjekt(800, 1040.50, 1.5, 46, 3, false, 2024-01-01, false, false, false, true, true, false, true, true, false, v);
        System.out.println("Klasse: Mietobjekt\nMethode: Konstruktor + toString()");
        System.out.println(mo.toString());
        Mietobjekt mo2 = new Mietobjekt(800, 1040.50, 1.5, 46, 3, false, 2024-01-01, false, false, false, true, true, false, true, true, false, v);
        System.out.println("Klasse: Mietobjekt\nMethode: compareTo()");
        System.out.println(mo.compareTo(mo2));
    }

    public BewerbungsTest(double kaltmiete, double warmmiete, double raeume, double wohnflaeche, double stockwerke, boolean wgEignung, Date fruehestesEinzugsdatum, boolean keller, boolean balkon, boolean badfenster, boolean kuechenfenster, boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, boolean moebeliert, Vermieter verm) {
        super(kaltmiete, warmmiete, raeume, wohnflaeche, stockwerke, wgEignung, fruehestesEinzugsdatum, keller, balkon, badfenster, kuechenfenster, aufzug, rollstuhleignung, einbaukueche, badewanne, moebeliert, verm);
    }

    @org.junit.jupiter.api.Test
    void getAnzahlPersonen() {
    }

    @org.junit.jupiter.api.Test
    void getEinzugszeitpunkt() {
    }

    @org.junit.jupiter.api.Test
    void getReferenzen() {
    }

    @org.junit.jupiter.api.Test
    void getMietobjekt() {
    }

    @org.junit.jupiter.api.Test
    void getMieter() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void testCompareTo() {
    }
}