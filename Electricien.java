public class Electricien extends Ouvrier {

    private String niveauTension;
    private boolean certifie;
    private int heuresTravaillees;
    private double tauxHoraire;
    private String zoneIntervention;

    public Electricien(String nom, String matricule, double salaire, int dureeContrat,
                       String niveauTension, boolean certifie, int heuresTravaillees,
                       double tauxHoraire, String zoneIntervention) {

        super(nom, matricule, "Electricien", salaire, dureeContrat);
        this.niveauTension = niveauTension;
        this.certifie = certifie;
        this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
        this.zoneIntervention = zoneIntervention;
    }

    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
