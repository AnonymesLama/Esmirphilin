import java.time.LocalDate;

public class Mietobjekt {
	private boolean deleted = false;
	private boolean deactivated = false;
    private int kaltmiete;
    private int warmmiete;
    private int raeume;
    private int wohnflaeche;
    private int stockwerke;
    private boolean wgEignung;
    private LocalDate fruehestesEinzugsdatum;
    private boolean keller;
    private boolean balkon;
    private boolean badfenster;
    private boolean kuechenfenster;
    private boolean aufzug;
    private boolean rollstuhleignung;
	private boolean einbaukueche;
	private boolean badewanne;
    private double preisProQuadratmeter;
    private double nebenkosten;
    private Vermieter verm;
    
	public Mietobjekt(int kaltmiete, int warmmiete, int raeume, int wohnflaeche, int stockwerke, boolean wgEignung,
            LocalDate fruehestesEinzugsdatum, boolean keller, boolean balkon, boolean badfenster, boolean kuechenfenster,
            boolean aufzug, boolean rollstuhleignung, boolean einbaukueche, boolean badewanne, Vermieter verm) {
        this.kaltmiete = kaltmiete;
        this.warmmiete = warmmiete;
        this.raeume = raeume;
        this.wohnflaeche = wohnflaeche;
        this.stockwerke = stockwerke;
        this.wgEignung = wgEignung;
        this.fruehestesEinzugsdatum = fruehestesEinzugsdatum;
        this.keller = keller;
        this.balkon = balkon;
        this.badfenster = badfenster;
        this.kuechenfenster = kuechenfenster;
        this.aufzug = aufzug;
        this.rollstuhleignung = rollstuhleignung;
        this.einbaukueche = einbaukueche;
        this.badewanne = badewanne;
        this.verm = verm;
        
        // Berechnung des Preises pro Quadratmeter und der Nebenkosten
        double qmPreis = (double) warmmiete / wohnflaeche;
        this.preisProQuadratmeter = qmPreis;
        this.nebenkosten = warmmiete - kaltmiete - (wohnflaeche * qmPreis);
    }
    
    public Mietobjekt(double kaltmiete2, double warmmiete2, int raeume2, double wohnflaeche2, int stockwerke2,
			boolean wgeignung2, LocalDate fruehestesEinzugsdatum2, boolean hasKeller, boolean hasBalkon,
			boolean hasBadfenster, boolean hasKuechenfenster, boolean hasAufzug, boolean isRollstuhleignung,
			boolean hasEinbaukueche, boolean hasBadewanne) {
		// TODO Auto-generated constructor stub
	}

	public int getKaltmiete() {
        return kaltmiete;
    }

    public int getWarmmiete() {
        return warmmiete;
    }

    public int getRaeume() {
        return raeume;
    }

    public int getWohnflaeche() {
        return wohnflaeche;
    }

    public int getStockwerke() {
        return stockwerke;
    }

    public boolean isWgEignung() {
        return wgEignung;
    }

    public LocalDate getFruehestesEinzugsdatum() {
        return fruehestesEinzugsdatum;
    }

    public boolean isKeller() {
        return keller;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public boolean isBadfenster() {
        return badfenster;
    }

    public boolean isKuechenfenster() {
        return kuechenfenster;
    }

    public boolean isAufzug() {
        return aufzug;
    }
   
    public boolean isRollstuhleignung() {
		return rollstuhleignung;
	}
    
    public boolean isEinbaukueche() {
		return einbaukueche;
	}

	public boolean isBadewanne() {
		return badewanne;
	}

	public double getPreisProQuadratmeter() {
		return preisProQuadratmeter;
	}

	public double getNebenkosten() {
		return nebenkosten;
	}

	public Vermieter getVerm() {
		return verm;
	}

	 public void setVerm(Vermieter verm) {
			this.verm = verm;
		}
	 
	 public void remove() {
	    // Setze das Attribut "deleted" auf true, um das Mietobjekt als gelöscht zu markieren
	    deleted = true;
	    
	    // Entferne alle Bewerbungen für dieses Mietobjekt 
//		    for (Bewerbung bewerbung : bewerbungen) {
//		        bewerbung.remove();
//		    }
	}
	 
	public void deactivate() {
		deactivated = true;
	}
}