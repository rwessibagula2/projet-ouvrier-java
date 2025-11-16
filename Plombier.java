public class Plombier extends Ouvrier {

    private boolean urgence;
    private double tauxHoraire;
    private int heuresTravaillees;
    private String outilPrincipal;
    private String typeIntervention;

    public Plombier(String nom, String matricule, double salaire, int dureeContrat,
                    boolean urgence, double tauxHoraire, int heuresTravaillees,
                    String outilPrincipal, String typeIntervention) {

        super(nom, matricule, "Plombier", salaire, dureeContrat);
        this.urgence = urgence;
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
        this.outilPrincipal = outilPrincipal;
        this.typeIntervention = typeIntervention;
    }

    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees + (urgence ? 5000 : 0);
    }
}
