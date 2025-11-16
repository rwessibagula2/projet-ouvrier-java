public class Main {
    public static void main(String[] args) {

        // Création des objets
        Macon m1 = new Macon(
                "Jean K", "M001", 0, 12,
                "Expert", "Lubumbashi",
                5000, 40, "Fondation"
        );

        Menuisier me1 = new Menuisier(
                "Patrick L", "MN020", 0, 8,
                "Teck", "Scie, marteau", 5,
                4500, 35
        );

        Electricien e1 = new Electricien(
                "Alain B", "E125", 0, 10,
                "Haute tension", true,
                42, 6000, "Kamalondo"
        );

        Plombier p1 = new Plombier(
                "David M", "P500", 0, 6,
                true, 5500, 30,
                "Clé à molette", "Canalisation"
        );

        // Affichage des salaires calculés
        System.out.println("===== TEST DU SYSTEME =====");

        System.out.println("\n--- Maçon ---");
        System.out.println("Nom : " + m1.getNom());
        System.out.println("Salaire : " + m1.calculerSalaire());

        System.out.println("\n--- Menuisier ---");
        System.out.println("Nom : " + me1.getNom());
        System.out.println("Salaire : " + me1.calculerSalaire());

        System.out.println("\n--- Electricien ---");
        System.out.println("Nom : " + e1.getNom());
        System.out.println("Salaire : " + e1.calculerSalaire());

        System.out.println("\n--- Plombier ---");
        System.out.println("Nom : " + p1.getNom());
        System.out.println("Salaire : " + p1.calculerSalaire());
    }
}
