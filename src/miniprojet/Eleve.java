package miniprojet;

public class Eleve extends Personne {
	
	private String prenomGrandPere;
	private String nomMere;
	private String prenomMere;
	private int cinPere;
	private int telPere;
	private int niveauScolaire;
	
	public Eleve(String nom, String prenom, String adresse, String dateNaissance, String perePrenom,
			String ville, int codePostale, String gouvernorat,String prenomGrandPere,String nomMere,String prenomMere,
			int cinPere,int telPere,int niveauScolaire) {
		super(nom, prenom, adresse, dateNaissance, perePrenom, ville, codePostale, gouvernorat);
	
		// TODO Auto-generated constructor stub
		this.prenomGrandPere = prenomGrandPere;
		this.nomMere = nomMere;
		this.prenomMere = prenomMere;
		this.cinPere = cinPere;
		this.telPere = telPere;
		this.niveauScolaire = niveauScolaire;

	}

	
	public String getPrenomGrandPere() {
		return prenomGrandPere;
	}


	public void setPrenomGrandPere(String prenomGrandPere) {
		this.prenomGrandPere = prenomGrandPere;
	}


	public String getNomMere() {
		return nomMere;
	}


	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}


	public String getPrenomMere() {
		return prenomMere;
	}


	public void setPrenomMere(String prenomMere) {
		this.prenomMere = prenomMere;
	}


	public int getCINPere() {
		return cinPere;
	}


	public void setCINPere(int cINPere) {
		this.cinPere = cINPere;
	}


	public int getTelPere() {
		return telPere;
	}


	public void setTelPere(int telPere) {
		this.telPere = telPere;
	}


	public int getNiveauScolaire() {
		return niveauScolaire;
	}


	public void setNiveauScolaire(int niveauScolaire) {
		this.niveauScolaire = niveauScolaire;
	}
	


	@Override
	public String toString() {
		return "Eleve [Nom = " + getNom() + ", Prenom = " + getPrenom() + ", NomMere = "
				+ nomMere + ", PrenomMere = " + prenomMere	+ ", CINPere = " + cinPere 
				+ ", TelPere = " + telPere + ", NiveauScolaire = Niveau " + niveauScolaire
				+ ", PrenomGrandPere = "+ prenomGrandPere +  ", PerePrenom = " + getPerePrenom() + ", Ville = "
				+ getVille() + ", CodePostale = " + getCodePostale() + ", Gouvernorat = " + getGouvernorat()
				+ ", Adresse = " + getAdresse() + ", DateNaissance = " + getDateNaissance() + "]";
	}
	
	public void choix() {
		System.out.print("\nVoulez-vous ajouter un nouveau eleve?(Y/N)");
	}


}
