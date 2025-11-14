package personnages;

public class Druide {

    private String nom;
    private int effetPotionMin;
    private int effetPotionMax;
    private int forcePotion;

    public Druide(String nom, int effetPotionMin, int effetPotionMax) {
        this.nom = nom;
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
    }

    public void preparerPotion() {
        forcePotion = (int) (Math.random() * (effetPotionMax - effetPotionMin + 1))
                + effetPotionMin;

        System.out.println("Le druide " + nom
                + " prépare une potion de force " + forcePotion + ".");
    }

    public int donnerPotion() {
        System.out.println("Le druide " + nom + " donne une potion de force "
                + forcePotion + ".");
        return forcePotion;
    }

    @Override
    public String toString() {
        return "Druide " + nom;
    }
}
