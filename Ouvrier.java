public abstract class Ouvrier {

    protected String nom;
    protected String matricule;
    protected String specialite;
    protected double salaire;
    protected int dureeContrat;

    public Ouvrier(String nom, String matricule, String specialite, double salaire, int dureeContrat) {
        this.nom = nom;
        this.matricule = matricule;
        this.specialite = specialite;
        this.salaire = salaire;
        this.dureeContrat = dureeContrat;
    }

    public abstract double calculerSalaire();

    // Getters et setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }

    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }

    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }

    public int getDureeContrat() { return dureeContrat; }
    public void setDureeContrat(int dureeContrat) { this.dureeContrat = dureeContrat; }
}


