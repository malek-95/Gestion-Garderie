package miniprojet;


public class Activité {
	int code;
	String designation;
	String animateurresp;
		
	public Activité(int code, String designation, String animateurresp) {
		super();
		this.code = code;
		this.designation = designation;
		this.animateurresp = animateurresp;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAnimateurresp() {
		return animateurresp;
	}
	public void setAnimateurresp(String animateurresp) {
		this.animateurresp = animateurresp;
	}
	@Override
	public String toString() {
		return "Activité [code = " + code + ", designation = " + designation + ", animateurresp = " + animateurresp + "]";
	}
	

	
}

