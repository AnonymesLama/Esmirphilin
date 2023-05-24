import java.util.Date;

/**
 * Testklasse
 * Zweck: Erstellt alle Klassen und testet alle dazugehörigen Methoden.
 * @author Miriam Duscha, Esma Ersan
 * @version 1
 * Historie:
 */

public class EigentlichBrauchenWirKeinenTestAberHierIstEr {

    public static void main(String[] args) {
        Vermieter vermieter = vermieterTest();
        System.out.println("\n");
        Vermieter vermieter2 = weitererVermieter(vermieter);
        System.out.println("\n");
        Administrator admin = adminTest(vermieter);
        System.out.println("\n");
        mietobjektTest(vermieter, vermieter2);
    }

    public static String standard = "Konstruktor + ToString()";

    public static Vermieter vermieterTest(){
        String klasse = "Vermieter";
        System.out.println("Klasse: " + klasse + "\nMethoden: " + standard);
        Vermieter vermieter = new Vermieter("vamieter", "passw0rd", "nochnemail@mail.de", "Valerie", "Vermieter", "Frau", "02855782987", "Einweg 5, 10420 Berlin");
        System.out.println(vermieter.toString());
        return vermieter;
    }


    public static Vermieter weitererVermieter(Vermieter v2){
        Vermieter v = new Vermieter("vermieter", "passw0rd", "nemail@mail.de", "Valentin", "Vermieter", "Herr", "09727859344", "Einweg 5, 10420 Berlin");
        System.out.println("Erstellen des neuen Vermieters: " + v.toString());
        System.out.println("Vergleich der beiden Vermieter: " + v.compareTo(v2));
        return v;
    }

    public static Administrator adminTest(Vermieter vermieter){
        String klasse = "Administrator";
        System.out.println("Klasse: " + klasse + "\nMethoden: " + standard);
        Administrator admin = new Administrator("admin1", "pw123", "mail@mail.de");
        System.out.println(admin.toString());
        System.out.println("Klasse: " + klasse + "\nMethode: freigeben");
        freigabeTest(admin, vermieter);
        System.out.println("Klasse: " + klasse + "\nMethode: sperren");
        sperrTest(admin, vermieter);
        return admin;
    }

    public static void freigabeTest(Administrator a, Vermieter v){
        a.freigeben(v);
        if (v.isFreigegeben()) {
            System.out.println("Freigabe hat funktioniert.");
        }
        else {
            System.out.println("Freigabe hat nicht funktioniert.");
        }
    }

    public static void sperrTest(Administrator a, Vermieter v){
        a.sperren(v);
        if (!v.isFreigegeben()) {
            System.out.println("Sperren hat funktioniert.");
        }
        else {
            System.out.println("Sperren hat nicht funktioniert.");
        }
    }

    public static void mietobjektTest(Vermieter v, Vermieter v2){
        String klasse = "Mietobjekt";
        System.out.println("Klasse: " + klasse + "\nMethoden: " + standard);
        Mietobjekt mo = new Mietobjekt(620, 810.50, 1.5, 41.85, 2, false, new Date(2024, 01, 01), false, false, true, false, true, false, false, true, false, v);
        System.out.println(mo.toString());
        System.out.println("Klasse: " + klasse + "\nMethoden: Testen der automatisch generierten Attribute durch Getter");
        System.out.println("Nebenkosten: " + mo.getNebenkosten());
        System.out.println("Quadratmeterpreis: " + mo.getPreisProQuadratmeter());

        System.out.println("Methode: Ändern des Vermieters");
        System.out.println("Vorher: " + mo.getVerm());
        mo.setVerm(v2);
        System.out.println("Nachher: " + mo.getVerm());

        System.out.println("Methode: Ändern des Status möbeliert");
        System.out.println("Vorher: " + mo.toString());
        mo.setMoebeliert(true);
        System.out.println("Auf Wahr gesetzt: " + mo.toString());
        mo.setMoebeliert(false);
        System.out.println("Auf Falsch gesetzt: " + mo.toString());
    }

    // public static Bewerber bewerberTest(){

    //}
}
