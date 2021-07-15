package miniprojet;

public abstract class Personne {
	private String nom;
	private String prenom;
	private String perePrenom;
	private String ville;
	private int codePostale;
	private String gouvernorat;
	private String adresse;
	private String dateNaissance;
	
	public abstract void choix();
	
	public Personne(String nom, String prenom, String adresse, String dateNaissance,String perePrenom,
			String ville,int codePostale,String gouvernorat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.perePrenom = perePrenom;
		this.ville = ville;
		this.codePostale = codePostale;
		this.gouvernorat = gouvernorat;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getPerePrenom() {
		return perePrenom;
	}



	public void setPerePrenom(String perePrenom) {
		this.perePrenom = perePrenom;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public int getCodePostale() {
		return codePostale;
	}



	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}



	public String getGouvernorat() {
		return gouvernorat;
	}



	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


    


}
