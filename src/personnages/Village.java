package personnages;

public class Village {

	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;
	private int nbvillageois = 0;

	public Village(String nom, int nbVilageois, Gaulois chef) {
		this.nom = nom;
		this.nbvillageois = nbVilageois;
		this.chef = chef;
		chef.setVillage(this);
	}

	public String getnom() {
		return nom;

	}

	public Gaulois getchef() {
		return chef;

	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbvillageois < villageois.length) {
			villageois[nbvillageois] = gaulois;
			nbvillageois++;

		} else {
			System.out.println("c deja complet");
		}

	}

	public static void main(String[] args) {

	}
}
