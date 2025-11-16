public class Macon extends Ouvrier {

    private String niveauQualification;
    private String zoneIntervention;
    private double tauxHoraire;
    private int heuresTravaillees;
    private String typeConstruction;

    public Macon(String nom, String matricule, double salaire, int dureeContrat,
                 String niveauQualification, String zoneIntervention,
                 double tauxHoraire, int heuresTravaillees, String typeConstruction) {

        super(nom, matricule, "Macon", salaire, dureeContrat);
        this.niveauQualification = niveauQualification;
        this.zoneIntervention = zoneIntervention;
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
        this.typeConstruction = typeConstruction;
    }

    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
