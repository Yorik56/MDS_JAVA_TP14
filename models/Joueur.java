package fr.mds.java.tp14.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Joueur {

	private List<Navire> arrNavires = new ArrayList<Navire>();
	private static int id;
	private final int NBR_CORVETTE = 1;
	private final int NBR_CROISEUR = 2;
	private final int NBR_DESTROYER = 2;
	private final int NBR_PORTE_AVION = 1;
	
	public Joueur (int map_x,int map_y) {
//		Création du corvette
		for (int i = 0; i < NBR_CORVETTE; i++) {
			Corvette corvette = new Corvette();
			// Création d'un objet pour faire de l'aléatoire.
		    Random rand = new Random();
		    int x;
		    int y;
		    
			do {
				// Tirage aléatoire de x et y;
				 x = rand.nextInt(map_x) % map_x;
			     y = rand.nextInt(map_y) % map_y;
			}while(!checkExist(this.arrNavires, x, y));

			Case posCorvette = new Case(x,y);
			corvette.setPosNavire(posCorvette);
			this.arrNavires.add(corvette);
		}
//		Création du croiseur
		for (int i = 0; i < NBR_CROISEUR; i++) {
			Croiseur croiseur = new Croiseur();
			// Création d'un objet pour faire de l'aléatoire.
		    Random rand = new Random();
		    int x;
		    int y;
		    
			do {
				// Tirage aléatoire de x et y;
				 x = rand.nextInt(map_x) % map_x;
			     y = rand.nextInt(map_y) % map_y;
			}while(!checkExist(this.arrNavires, x, y));

			Case posCroiseur = new Case(x,y);
			croiseur.setPosNavire(posCroiseur);
			this.arrNavires.add(croiseur);
		}
//		Création du destroyeur
		for (int i = 0; i < NBR_DESTROYER; i++) {
			Destroyer destroyeur = new Destroyer();
			// Création d'un objet pour faire de l'aléatoire.
		    Random rand = new Random();
		    int x;
		    int y;
		    
			do {
				// Tirage aléatoire de x et y;
				 x = rand.nextInt(map_x) % map_x;
			     y = rand.nextInt(map_y) % map_y;
			}while(!checkExist(this.arrNavires, x, y));

			Case posDestroyeur= new Case(x,y);
			destroyeur.setPosNavire(posDestroyeur);
			this.arrNavires.add(destroyeur);
		}
//		Création du porte avion 
		for (int i = 0; i < NBR_PORTE_AVION; i++) {
			PorteAvion PorteAvion = new PorteAvion();
			// Création d'un objet pour faire de l'aléatoire.
		    Random rand = new Random();
		    int x;
		    int y;
		    
			do {
				// Tirage aléatoire de x et y;
				 x = rand.nextInt(map_x) % map_x;
			     y = rand.nextInt(map_y) % map_y;
			}while(!checkExist(this.arrNavires, x, y));

			Case posPorteAvion = new Case(x,y);
			PorteAvion.setPosNavire(posPorteAvion);
			this.arrNavires.add(PorteAvion);
		}

		
	}
	
	public boolean checkExist(List<Navire> arrNavires,int x,int y) {
		boolean notExist = true;
		for (Navire verifCase :  arrNavires) {
			for (Case posNavire : verifCase.getPosNavire()) {
				System.out.println("checkExistX" + posNavire.getPositionX());
				System.out.println("checkExistY" + posNavire.getPositionY());
				if(x == posNavire.getPositionX() && y == posNavire.getPositionY()) {
					System.out.println("case déjà existante");
					notExist = false;
				}
			}
			
		}
		return notExist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		Joueur.id = id;
	}

	public List<Navire> getArrNavires() {
		return arrNavires;
	}

	public void setArrNavires(List<Navire> arrNavires) {
		this.arrNavires = arrNavires;
	}
	
	
	
	
}
