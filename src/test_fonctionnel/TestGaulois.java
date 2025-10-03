package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("astérix", 8);
		asterix.parler("Bonjour Obélix");

		Gaulois obelix = new Gaulois("obelix", 16);
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");

		asterix.parler("Oui très bonne idée");

		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus");

		Romain minus = new Romain("Minus", 6);

		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
