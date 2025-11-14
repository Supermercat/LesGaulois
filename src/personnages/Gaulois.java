package personnages;

import java.util.logging.Logger;

public class Gaulois {
	private String nom;
//	private int force;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

//	public void parler(String texte) {
//		System.out.println(prendreParole() + "\"" + texte + "\"");
//	}
//	
//	
	private static final Logger logger = Logger.getLogger(Gaulois.class.getName());

	public void parler(String texte) {
		logger.info(prendreParole() + "\"" + texte + "\"");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
//		dude i did the right thing
	}

	@Override
	public String toString() {
		return "jesuis " + nom + " et ma force vaut " + force; // personalisation
	}

//	public void frapper(Romain romain) {
//		String nomRomain = romain.getNom();
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
//		int forceCoup = force / 3;
//		romain.recevoirCoup(forceCoup);
//
//	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		Equipement[] receivedTrophies = romain.recevoirCoup((force / 3) * effetPotion);

		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}

	}

	public void setVillage(Village village) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 9);
		System.out.println(asterix);

	}

}
