package fr.mds.java.tp14.manager;coucou

import java.util.ArrayList;
import java.util.List;

import fr.mds.java.tp14.models.Case;
import fr.mds.java.tp14.models.Joueur;
import fr.mds.java.tp14.models.Navire;

public class Jeu {
	private  int map_x;
	private  int map_y;
	private  int joueurs;
	private List<Joueur> arrJoueur = new ArrayList<Joueur>();
	
	public Jeu(int map_x, int map_y, int joueurs) {
		this.map_x = map_x;
		this.map_y = map_y;
		this.joueurs = joueurs;
		for (int i = 0; i < this.joueurs; i++) {
			Joueur monjoueur = new Joueur();
			monjoueur.setId(i);
			System.out.println("Navires du joueur: " + monjoueur.getId() + " -> ");
			for (Navire object : monjoueur.getArrNavires()) {
				System.out.println("taille: " + object.getTaille());
				for (Case navire : object.getPosNavire()) {
					System.out.println("PositionX: " + navire.getPositionX());
					System.out.println("PositionY: " + navire.getPositionY());
				}
			}
			this.arrJoueur.add(monjoueur);
		}
	}
	
	public  void afficheMap() {
		for (int i = 0; i < this.map_x; i++) {
			for (int j = 0; j < this.map_y; j++) {
				System.out.print(0);
			}
			
			System.out.println();
		}
	}
	
	
	
	public int getMap_x() {
		return map_x;
	}
	public void setMap_x(int map_x) {
		this.map_x = map_x;
	}
	public int getMap_y() {
		return map_y;
	}
	public void setMap_y(int map_y) {
		this.map_y = map_y;
	}
	public int getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(int joueurs) {
		this.joueurs = joueurs;
	}
	
	
	
}
