package enrollmentinquery.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import enrollmentinquery.constant.Constant;

public class Model {
	
	private int id;
	@NotNull
	private String F_NAME;
	@NotNull
	private String L_NAME;
	@NotNull
	private java.util.Date DOB;
	@Email()
	@NotNull
	private String EMAIL;
	@Size(max = Constant.MOBILENUMBERLENGTH)
	@NotNull
	private String MOB;
	@NotNull
	private String GRADE;
	@NotNull
	private String BRANCH_ID;
	private String STATUS;
	@NotNull
	private String LOGIN_USER;
	
	
	public String getF_NAME() {
		return F_NAME;
	}
	public void setF_NAME(String f_NAME) {
		F_NAME = f_NAME;
	}
	public String getL_NAME() {
		return L_NAME;
	}
	public void setL_NAME(String l_NAME) {
		L_NAME = l_NAME;
	}
	public java.util.Date getDOB() {
		return DOB;
	}
	public void setDOB(java.util.Date dOB) {
		DOB = dOB;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getMOB() {
		return MOB;
	}
	public void setMOB(String mOB) {
		MOB = mOB;
	}
	public String getGRADE() {
		return GRADE;
	}
	public void setGRADE(String gRADE) {
		GRADE = gRADE;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getBRANCH_ID() {
		return BRANCH_ID;
	}
	public void setBRANCH_ID(String bRANCH_ID) {
		BRANCH_ID = bRANCH_ID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLOGIN_USER() {
		return LOGIN_USER;
	}
	public void setLOGIN_USER(String lOGIN_USER) {
		LOGIN_USER = lOGIN_USER;
	}
	
}
