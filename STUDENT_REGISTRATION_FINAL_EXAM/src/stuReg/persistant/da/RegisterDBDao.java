package stuReg.persistant.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import stuReg.persistant.da.ConnectionProvider;
import stuReg.bean.StuInfoBean;
import stuReg.persistant.dao.UserInfoDao;
import stuReg.persistant.dao.ClassInfoDao;
import stuReg.persistant.dao.StudentInfoDao;

public class RegisterDBDao {
	private static Connection con = null;
	private String userinsert = "INSERT into Ace.User(ID,Name) VALUES(?,?);";
	private String stuinsert = "INSERT into Ace.Student(STUDETNT_ID,STUDENT_NAME,CLASS_NAME,REGISTER_DATE,STATUS) VALUES(?,?,?,?,?);";
	private String classinsert  = "INSERT into Ace.Class(ID,NAME) VALUES(?,?)";
	
	static {
		con = ConnectionProvider.getConnection();
	}
	
	public void insertUserInfo(UserInfoDao uinfo, ClassInfoDao cinfo, StudentInfoDao sinfo) {
		try {
			PreparedStatement ps = con.prepareStatement(userinsert);
			ps.setString(1, uinfo.getUser_id());
			ps.setString(2, uinfo.getUser_name());
	

			System.out.println(userinsert);

			// execute select SQL statement
			ps.executeUpdate();
			System.out.println("Record is inserted into USER table!");

			ps = con.prepareStatement(classinsert);

			ps.setString(1, cinfo.getId());
			ps.setString(2, cinfo.getName());
			

			System.out.println(classinsert);

			// execute select SQL statement
			ps.executeUpdate();
			System.out.println("Record is inserted into Class table!");
			
			ps = con.prepareStatement(stuinsert);
			
			ps.setString(1, sinfo.getStu_id());
			ps.setString(2, sinfo.getStu_name());
			ps.setString(3, sinfo.getClass_name());
			ps.setDate(4, sinfo.getRegister_date());
			ps.setString(5, sinfo.getStatus());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
