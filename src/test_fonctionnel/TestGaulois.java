package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("ast�rix", 8);
		asterix.parler("Bonjour Ob�lix");

		Gaulois obelix = new Gaulois("obelix", 16);
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?");

		asterix.parler("Oui tr�s bonne id�e");

		System.out.println("Dans la for�t Ast�rix et Ob�lix tombent nez � nez sur le romain Minus");

		Romain minus = new Romain("Minus", 6);

		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

	}

}
