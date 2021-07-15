package miniprojet;

import java.util.Vector;

public class Classe {
	String nom;
	Vector<String> listeelève = new Vector<>();
	Vector<String> listeactivité = new Vector<>();
	String animateurresp;
	

	public Classe(String nom, String animateurresp, Vector<String> listeactivité, Vector<String> listeelève) {
		super();
		this.nom = nom;
		this.animateurresp = animateurresp;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Vector<String> getListeelève() {
		return listeelève;
	}


	public void setListeelève(Vector<String> listeelève) {
		this.listeelève = listeelève;
	}


	public Vector<String> getListeactivité() {
		return listeactivité;
	}


	public void setListeactivité(Vector<String> listeactivité) {
		this.listeactivité = listeactivité;
	}


	public String getAnimateurresp() {
		return animateurresp;
	}


	public void setAnimateurresp(String animateurresp) {
		this.animateurresp = animateurresp;
	}


	@Override
	public String toString() {
		return "Classe [nom = " + nom + ", animateurresp = " + animateurresp + "]";
	}
	
	
	

}
