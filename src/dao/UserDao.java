package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDao {
	public User login(Connection con,User user) throws Exception {
		User resultUser=null;
		String sql="select * from 用户信息表 where 登录名称=? and 密码=?";
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			resultUser=new User();
			resultUser.setId(rs.getInt("用户编号"));
			resultUser.setUserName(rs.getString("登录名称"));
			resultUser.setPassword(rs.getString("密码"));
		}
		return resultUser;
	}

}
