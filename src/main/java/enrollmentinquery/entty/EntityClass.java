package enrollmentinquery.entty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import enrollmentinquery.constant.Constant;

@Entity
@Table(name=Constant.ENROLMENTINQUERY)
public class EntityClass {

	@Id
	@Column(name = Constant.ID)
	private Long ID;
	private String F_NAME;
	private String L_NAME;
	private java.util.Date DOB;
	private String EMAIL;
	private String MOB;
	private String GRADE;
	private String STATUS;
	private String BRANCH_ID;

	private String created_by;
	private java.util.Date created;
	private String updated_by;
	private java.util.Date updated;
	
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
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
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public java.util.Date getCreated() {
		return created;
	}
	public void setCreated(java.util.Date created) {
		this.created = created;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public java.util.Date getUpdated() {
		return updated;
	}
	public void setUpdated(java.util.Date updated) {
		this.updated = updated;
	}
	
}
