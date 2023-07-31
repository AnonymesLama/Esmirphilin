import java.util.Date;

public class Test {

    public static void main(String[] args) {
        testMietobjekt();
        testMieter();
        testPerson();
        testVermieter();
    }

    private static void testMietobjekt() {
        Vermieter verm = new Vermieter("vermieter1", "pass123", "vermieter@example.com", "Max", "Mustermann", "Herr",
                "0123456789", "Musterstraße 1");

        Mietobjekt mietobjekt = new Mietobjekt(800.00, 950.00, 3.5, 80.0, 2.0, false, new Date(), true, true, false,
                true, false, false, true, false, false, verm);

        Mieter mieter = new Mieter("mieter1", "pass456", "mieter@example.com", "Anna", "Schmidt", "Frau", "9876543210",
                "Beispielweg 2", 1, true, false, 2500.00);

        Bewerbung bewerbung = new Bewerbung(2, new Date(), true, false, "Referenzen vorhanden", true, mietobjekt, mieter);

        // Test der Getter-Methoden
        assert (bewerbung.getAnzahlPersonen() == 2);
        assert (bewerbung.getEinzugszeitpunkt().equals(new Date()));
        assert (bewerbung.isRaucher());
        assert (!bewerbung.hasVorstrafen());
        assert (bewerbung.getReferenzen().equals("Referenzen vorhanden"));
        assert (bewerbung.isZustimmung());
        assert (bewerbung.getMietobjekt().equals(mietobjekt));
        assert (bewerbung.getMieter().equals(mieter));

        System.out.println("Test für Bewerbung erfolgreich abgeschlossen!");
    }

    private static void testMieter() {
        Mieter mieter = new Mieter("mieter1", "pass456", "mieter@example.com", "Anna", "Schmidt", "Frau", "9876543210",
                "Beispielweg 2", 1, true, false, 2500.00);

        // Test der Getter-Methoden
        assert (mieter.getNutzername().equals("mieter1"));
        assert (mieter.getPasswort().equals("pass456"));
        assert (mieter.getEmail().equals("mieter@example.com"));
        assert (mieter.getVorname().equals("Anna"));
        assert (mieter.getNachname().equals("Schmidt"));
        assert (mieter.getAnrede().equals("Frau"));
        assert (mieter.getTelefonnummer().equals("9876543210"));
        assert (mieter.getAdresse().equals("Beispielweg 2"));
        assert (mieter.getHaustiere() == 1);
        assert (mieter.isRaucher());
        assert (!mieter.hasVorstrafen());
        assert (mieter.getNettoeinkommen() == 2500.00);

        System.out.println("Test für Mieter erfolgreich abgeschlossen!");
    }

    private static void testPerson() {
        Person person = new Person("user123", "pass789", "user@example.com", "John", "Doe", "Mr.", "1234567890",
                "Sample Street 42");

        // Test der Getter-Methoden
        assert (person.getNutzername().equals("user123"));
        assert (person.getPasswort().equals("pass789"));
        assert (person.getEmail().equals("user@example.com"));
        assert (person.getVorname().equals("John"));
        assert (person.getNachname().equals("Doe"));
        assert (person.getAnrede().equals("Mr."));
        assert (person.getTelefonnummer().equals("1234567890"));
        assert (person.getAdresse().equals("Sample Street 42"));

        System.out.println("Test für Person erfolgreich abgeschlossen!");
    }

    private static void testVermieter() {
        Vermieter verm = new Vermieter("vermieter1", "pass123", "vermieter@example.com", "Max", "Mustermann", "Herr",
                "0123456789", "Musterstraße 1");

        // Test der Getter-Methoden
        assert (verm.getNutzername().equals("vermieter1"));
        assert (verm.getPasswort().equals("pass123"));
        assert (verm.getEmail().equals("vermieter@example.com"));
        assert (verm.getVorname().equals("Max"));
        assert (verm.getNachname().equals("Mustermann"));
        assert (verm.getAnrede().equals("Herr"));
        assert (verm.getTelefonnummer().equals("0123456789"));
        assert (verm.getAdresse().equals("Musterstraße 1"));

        System.out.println("Test für Vermieter erfolgreich abgeschlossen!");
    }
}
