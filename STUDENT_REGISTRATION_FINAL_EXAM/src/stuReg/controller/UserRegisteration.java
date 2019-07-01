package stuReg.controller;

import com.opensymphony.xwork2.ActionSupport;
import stuReg.bean.StuInfoBean;
import stuReg.persistant.da.RegisterDBDao;
import stuReg.persistant.dao.StudentInfoDao;
import stuReg.persistant.dao.UserInfoDao;

public class UserRegisteration extends ActionSupport{
	private static final long serialVersionUID = 1L;
	StuInfoBean info;
	private UserInfoDao userdao = new UserInfoDao();
	public String execute() {
		
		if (info.getUser_name() == null || info.getUser_name().trim().equals("")) {
			addFieldError("info.user_id", "ID must not be null.");
			return INPUT;
		}
		
		if (info.getUser_id() == null || info.getUser_id().trim().equals("")) {
			addFieldError("info.user_id", "ID must not be null.");
			return INPUT;
		}else {
			
			userdao.setUser_id(info.getUser_id());
			userdao.setUser_name(info.getUser_name());
			return SUCCESS;
		}
	}
	
	
	
}