import java.util.Date;
import java.util.List;

public class Wohnungswuensche {

    private double kaltmieteMaximum;
    private double kaltmieteMinimum = 0;
    private double warmmieteMaximum;
    private double warmmieteMinimum = 0;
    private double raeumeMaximum;
    private double raeumeMinimum = 0;
    private double wohnflaecheMaximum;
    private double wohnflaecheMinimum = 0;
    private double stockwerkeMaximum;
    private double stockwerkeMinimum = 0;
    private Date fruehestesEinzugsdatum;

    // WUnscheintrag nach Genossenschaft, Unternehmen, etc.????

    private List<String> ausstattung;

    /* Erlaubte Werte für die Liste:
       private boolean wgEignung;
       private boolean keller;
       private boolean balkon;
       private boolean badfenster;
       private boolean kuechenfenster;
       private boolean aufzug;
       private boolean rollstuhleignung;
       private boolean einbaukueche;
       private boolean badewanne;
       private boolean moebeliert;
       */

    public Wohnungswuensche(double kaltmieteMaximum, double kaltmieteMinimum, double warmmieteMaximum, double warmmieteMinimum, double raeumeMaximum, double raeumeMinimum, double wohnflaecheMaximum, double wohnflaecheMinimum, double stockwerkeMaximum, double stockwerkeMinimum, Date fruehestesEinzugsdatum, List<String> ausstattung) {
        this.kaltmieteMaximum = kaltmieteMaximum;
        this.kaltmieteMinimum = kaltmieteMinimum;
        this.warmmieteMaximum = warmmieteMaximum;
        this.warmmieteMinimum = warmmieteMinimum;
        this.raeumeMaximum = raeumeMaximum;
        this.raeumeMinimum = raeumeMinimum;
        this.wohnflaecheMaximum = wohnflaecheMaximum;
        this.wohnflaecheMinimum = wohnflaecheMinimum;
        this.stockwerkeMaximum = stockwerkeMaximum;
        this.stockwerkeMinimum = stockwerkeMinimum;
        this.fruehestesEinzugsdatum = fruehestesEinzugsdatum;
        this.ausstattung = ausstattung;
    }

    public double getKaltmieteMaximum() {
        return kaltmieteMaximum;
    }

    public void setKaltmieteMaximum(double kaltmieteMaximum) {
        this.kaltmieteMaximum = kaltmieteMaximum;
    }

    public double getKaltmieteMinimum() {
        return kaltmieteMinimum;
    }

    public void setKaltmieteMinimum(double kaltmieteMinimum) {
        this.kaltmieteMinimum = kaltmieteMinimum;
    }

    public double getWarmmieteMaximum() {
        return warmmieteMaximum;
    }

    public void setWarmmieteMaximum(double warmmieteMaximum) {
        this.warmmieteMaximum = warmmieteMaximum;
    }

    public double getWarmmieteMinimum() {
        return warmmieteMinimum;
    }

    public void setWarmmieteMinimum(double warmmieteMinimum) {
        this.warmmieteMinimum = warmmieteMinimum;
    }

    public double getRaeumeMaximum() {
        return raeumeMaximum;
    }

    public void setRaeumeMaximum(double raeumeMaximum) {
        this.raeumeMaximum = raeumeMaximum;
    }

    public double getRaeumeMinimum() {
        return raeumeMinimum;
    }

    public void setRaeumeMinimum(double raeumeMinimum) {
        this.raeumeMinimum = raeumeMinimum;
    }

    public double getWohnflaecheMaximum() {
        return wohnflaecheMaximum;
    }

    public void setWohnflaecheMaximum(double wohnflaecheMaximum) {
        this.wohnflaecheMaximum = wohnflaecheMaximum;
    }

    public double getWohnflaecheMinimum() {
        return wohnflaecheMinimum;
    }

    public void setWohnflaecheMinimum(double wohnflaecheMinimum) {
        this.wohnflaecheMinimum = wohnflaecheMinimum;
    }

    public double getStockwerkeMaximum() {
        return stockwerkeMaximum;
    }

    public void setStockwerkeMaximum(double stockwerkeMaximum) {
        this.stockwerkeMaximum = stockwerkeMaximum;
    }

    public double getStockwerkeMinimum() {
        return stockwerkeMinimum;
    }

    public void setStockwerkeMinimum(double stockwerkeMinimum) {
        this.stockwerkeMinimum = stockwerkeMinimum;
    }

    public Date getFruehestesEinzugsdatum() {
        return fruehestesEinzugsdatum;
    }

    public void setFruehestesEinzugsdatum(Date fruehestesEinzugsdatum) {
        this.fruehestesEinzugsdatum = fruehestesEinzugsdatum;
    }

    public List<String> getAusstattung() {
        return ausstattung;
    }

    public void setAusstattung(List<String> ausstattung) {
        this.ausstattung = ausstattung;
    }
}