package stuReg.persistant.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import stuReg.bean.StuInfoBean;
import stuReg.persistant.dao.UserInfoDao;

public class SelectDBDao {
	
	private static Connection con = null;
	private String selectUser = "SELECT u.ID, u.PASSWORD FROM Ace.User u WHERE u.ID=?;";
	private String selectStu = "SELECT s.STUDENT_ID,s.STUDENT_NAME,s.REGISTER_DATE,s.STATUS,c.CLASS_NAME FROM Ace.User u, Ace.Class c WHERE u.ID=ID ";
	
	
	static {
		con = ConnectionProvider.getConnection();
	}
	
	public StuInfoBean selectUserInfo(UserInfoDao info) {
		StuInfoBean userinfo =  new StuInfoBean();
		try {
			PreparedStatement ps = con.prepareStatement(selectUser);
			ps.setString(1, info.getUser_id());

			System.out.println(selectUser);

			// execute select SQL statement
			ResultSet rs = ps.executeQuery();
			System.out.println("Record is selected from USER table!");
			while (rs.next()) {
				userinfo.setUser_id(rs.getString("u.ID"));;
				userinfo.setPassword(rs.getString("u.password"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userinfo;
		
	}
	
	public List<StuInfoBean> SelectStu(){
		List<StuInfoBean> stulst =  new ArrayList<StuInfoBean>();
		try {
			PreparedStatement ps = con.prepareStatement(selectStu);

			System.out.println(selectStu);

			// execute select SQL statement
			ResultSet rs = ps.executeQuery();
			System.out.println("Record is selected from USER table!");
			while (rs.next()) {
				StuInfoBean infoBean = new StuInfoBean();
				infoBean.setStu_id(rs.getString("s.STUDENT_ID"));
				infoBean.setStu_name(rs.getString("s.STUDENT_NAME"));
				infoBean.setClass_name(rs.getString("c.CLASS_NAME"));
				infoBean.setRegister_date(rs.getString("s.REGISTER_DATE"));
				infoBean.setStatus(rs.getString("s.STATUS"));
				stulst.add(infoBean);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stulst;
		
	}

}
