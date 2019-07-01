package stuReg.persistant.dao;

import java.sql.Date;

public class StudentInfoDao {
	private String stu_id;
	private String stu_name;
	private String class_name;
	private Date register_date;
	private String status;
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public Date getRegister_date() {
		return register_date;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
