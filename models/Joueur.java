package fr.mds.java.tp14.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Joueur {

	private List<Navire> arrNavires = new ArrayList<Navire>();
	private static int id;
	private final int NBR_CORVETTE = 1;
	private final int NBR_CROISEUR = 2;
	private final int NBR_DESTROYER = 2;
	private final int NBR_PORTE_AVION = 1;
	
	public Joueur () {
		
		
		for (int i = 0; i < NBR_CORVETTE; i++) {
			Corvette corvette = new Corvette();
			Case posCorvette = new Case(5,2);
			corvette.setPosNavire(posCorvette);
			this.arrNavires.add(corvette);
		}
		for (int i = 0; i < NBR_CROISEUR; i++) {
			Croiseur croiseur = new Croiseur();
			this.arrNavires.add(croiseur);
		}
		for (int i = 0; i < NBR_DESTROYER; i++) {
			Destroyer destroyeur = new Destroyer();
			this.arrNavires.add(destroyeur);
		}
		for (int i = 0; i < NBR_PORTE_AVION; i++) {
			PorteAvion PorteAvion = new PorteAvion();
			this.arrNavires.add(PorteAvion);
		}

		
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
