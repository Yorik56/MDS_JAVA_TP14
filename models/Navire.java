package fr.mds.java.tp14.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Navire {
	protected int identifiant;
	protected int taille;
	protected boolean direction;
	private List<Case> posNavire = new ArrayList<Case>();

	public Navire(int identifiant, int taille) {
		this.identifiant = identifiant;
		this.taille = taille;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public boolean isDirection() {
		return direction;
	}

	public void setDirection(boolean direction) {
		this.direction = direction;
	}

	public List<Case> getPosNavire() {
		return posNavire;
	}

	public void setPosNavire(Case posNavire) {
//		System.out.println("param" + posNavire.getPositionX());
//		System.out.println("param" + posNavire.getPositionY());
		this.posNavire.add(posNavire);

	}
	
	
	
	

}
