package personnages;

public class Chef extends Gaulois {

	private Village village;

	public Chef(String nom, int force, Village village) {
		super(nom, force);
		this.village = village;
	}

	public Village getVillage() {
		return village;
	}

	@Override
	public String toString() {
		return "Chef " + getNom();
	}
}
