public class Menuisier extends Ouvrier {

    private String typeBois;
    private String outilsPrincipaux;
    private int experience;
    private double tauxHoraire;
    private int heuresTravaillees;

    public Menuisier(String nom, String matricule, double salaire, int dureeContrat,
                     String typeBois, String outilsPrincipaux, int experience,
                     double tauxHoraire, int heuresTravaillees) {

        super(nom, matricule, "Menuisier", salaire, dureeContrat);
        this.typeBois = typeBois;
        this.outilsPrincipaux = outilsPrincipaux;
        this.experience = experience;
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
