package miniprojet;

import java.util.Vector;

public class Classe {
	String nom;
	Vector<String> listeel�ve = new Vector<>();
	Vector<String> listeactivit� = new Vector<>();
	String animateurresp;
	

	public Classe(String nom, String animateurresp, Vector<String> listeactivit�, Vector<String> listeel�ve) {
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


	public Vector<String> getListeel�ve() {
		return listeel�ve;
	}


	public void setListeel�ve(Vector<String> listeel�ve) {
		this.listeel�ve = listeel�ve;
	}


	public Vector<String> getListeactivit�() {
		return listeactivit�;
	}


	public void setListeactivit�(Vector<String> listeactivit�) {
		this.listeactivit� = listeactivit�;
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
