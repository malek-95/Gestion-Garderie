package miniprojet;



public class Animateur extends Personne {
	private int cin;
	private int telephone;
	

	public Animateur(String nom, String prenom, String adresse, String dateNaissance, String perePrenom, String ville,
			int codePostale, String gouvernorat,int telephone,int cin) {
		super(nom, prenom, adresse, dateNaissance, perePrenom, ville, codePostale, gouvernorat);
		// TODO Auto-generated constructor stub
		this.cin = cin;
		this.telephone = telephone;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "Animateur [Nom = " + getNom() +", Prenom = " + getPrenom() 
		        + ", Telephone = " + telephone + ", Cin = " + cin
				+  ", PerePrenom = " + getPerePrenom() + ", Ville = " + getVille()
				+ ", CodePostale = " + getCodePostale() + ", Gouvernorat = " + getGouvernorat()
				+ ", Adresse = " + getAdresse() + ", DateNaissance = " + getDateNaissance() + "]";
	}
	
	
	
	public void choix() {
		System.out.print("\nVoulez-vous ajouter un nouveau animateur?(Y/N)");
	}

	

	

	
	

}
