package stuReg.controller;


import com.opensymphony.xwork2.ActionSupport;
import stuReg.bean.StuInfoBean;
import stuReg.persistant.da.RegisterDBDao;
import stuReg.persistant.dao.StudentInfoDao;

public class StudentRegistration extends ActionSupport{
	private static final long serialVersionUID = 1L;
	StuInfoBean info;
	private StudentInfoDao studao = new StudentInfoDao();

	
	public String execute() {
		if (info.getStu_id() == null || info.getStu_id().trim().equals("")) {
			addFieldError("info.stu_id", "ID must not be null.");
			return INPUT;
		}
		
		if (info.getStu_name() == null || info.getStu_name().trim().equals("")) {
			addFieldError("info.stu_name", "Name must not be null.");
			return INPUT;
		}
		
		if (info.getClass_name() == null || info.getClass_name().trim().equals("")) {
			addFieldError("info.class_name", "Class name must not be null.");
			return INPUT;
		}
		if (info.getRegister_date() == null || ( info.getRegister_date()).equals("")) {
			addFieldError("info.register_date", "Register date must not be null.");
			return INPUT;
		}
		if (info.getStatus() == null || info.getStatus().trim().equals("")) {
			addFieldError("info.status", "Status must not be null.");
			return INPUT;
		}else {
			studao.setStu_id(info.getStu_id());
			studao.setStu_name(info.getStu_name());
			studao.setClass_name(info.getClass_name());
			studao.setRegister_date(info.getRegister_date());
			studao.setStatus(info.getStatus());
			return SUCCESS;
		}
		
		
		
	}
}
