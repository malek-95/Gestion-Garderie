package miniprojet;


public class Activit� {
	int code;
	String designation;
	String animateurresp;
		
	public Activit�(int code, String designation, String animateurresp) {
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
		return "Activit� [code = " + code + ", designation = " + designation + ", animateurresp = " + animateurresp + "]";
	}
	

	
}

