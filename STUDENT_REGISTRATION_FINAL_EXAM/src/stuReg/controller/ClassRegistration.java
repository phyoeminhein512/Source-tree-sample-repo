package stuReg.controller;

import com.opensymphony.xwork2.ActionSupport;
import stuReg.bean.StuInfoBean;
import stuReg.persistant.da.RegisterDBDao;
import stuReg.persistant.dao.ClassInfoDao;
import stuReg.persistant.dao.StudentInfoDao;

public class ClassRegistration extends ActionSupport {
	private static final long serialVersionUID = 1L;
	StuInfoBean info;
	private ClassInfoDao classdao = new ClassInfoDao();
	
	public String exectue() {
		if (info.getClass_id() == null || info.getClass_id().trim().equals("")) {
			addFieldError("info.class_id", "ID must not be null.");
			return INPUT;
		}
		
		if (info.getClass_name() == null || info.getClass_name().trim().equals("")) {
			addFieldError("info.class_name", "Name must not be null.");
			return INPUT;
		}else {
			classdao.setId(info.getClass_id());
			classdao.setName(info.getClass_name());
			return SUCCESS;
		}
		}
		
		
}
	