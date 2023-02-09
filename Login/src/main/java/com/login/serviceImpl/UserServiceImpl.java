package com.login.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.login.dbutil.DBUtil;
import com.login.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	Connection connection;
	int flag = 0;
	
	public UserServiceImpl() throws SQLException {
		connection = DBUtil.getConnection();
	}
	
	
	public int loginValidation(String username, String password) {
		
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = '"+username+"'");
			ResultSet rs = statement.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString(2).equals(username) && rs.getString(3).equals(password)) {
					flag=1;
				}else{
					System.out.println("Invalid Username/password");
					flag = 0;
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}

	
	
	
}
