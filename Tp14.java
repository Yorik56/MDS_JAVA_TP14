package fr.mds.java.tp14;

import fr.mds.java.tp14.manager.Jeu;
import fr.mds.java.tp14.models.Joueur;

public class Tp14 {
	public static void main(String[] args) {
		Jeu monJeu = new Jeu(15,10,2);
		System.out.println(monJeu.getMap_x());
		
		
		monJeu.afficheMap();
	}
}
