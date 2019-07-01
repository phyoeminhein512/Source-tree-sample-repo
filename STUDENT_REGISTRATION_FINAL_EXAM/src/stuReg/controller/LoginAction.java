package stuReg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

import stuReg.bean.StuInfoBean;
import stuReg.persistant.da.SelectDBDao;
import stuReg.persistant.dao.UserInfoDao;
import stuReg.bean.StuInfoBean;
import stuReg.persistant.da.SelectDBDao;
import stuReg.persistant.dao.UserInfoDao;

public class LoginAction extends ActionSupport implements ServletRequestAware{
	
	private static final long serialVersionUID = 1L;
	private  StuInfoBean user;
	private HttpServletRequest request;
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	public StuInfoBean getMyBean() {
		return user;
	}
	public void setMyBean(StuInfoBean user) {
		this.user = user;
	}
	SelectDBDao dbSelect = new SelectDBDao();
	UserInfoDao info = new UserInfoDao();
	
	public String execute() {
		info.setUser_id(user.getUser_id());
		info.setPassword(user.getPassword());
		
		user = dbSelect.selectUserInfo(info);
		if (user.getUser_id().isEmpty() && user.getPassword().isEmpty()) {
			addFieldError("user.password", "Username and password is not null.");
			return INPUT;
		}if (user != null) {
			if (user.getPassword() != null
					&& user.getPassword().equals(info.getPassword())) {
				HttpSession session = request.getSession();
				session.setAttribute("sesUser", user);
				return SUCCESS;

			} else {
				addFieldError("user.password", "Username and password is incorrect.");
				return INPUT;
			}
		} else {
			request.setAttribute("err", "Plase register one user first.");
			return INPUT;
		}
			
	}
	
	public String logout() {
		request.getSession().invalidate();
		return SUCCESS;
	}
}
