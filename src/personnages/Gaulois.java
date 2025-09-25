package personnages;





public class Gaulois {
	private String nom;
	private int taille;
	
	
	public Gaulois(String nom, int taille) {
		super();
		this.nom = nom;
		this.taille = taille;
	}
	
	
	public String getNom() {
		return nom;
		}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		}
		private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
}

