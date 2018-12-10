package com.oracle.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.oracle.user.User;
import com.oracle.util.DDUtil;


public class UserDao {
	private Connection conn=null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	//添加图书
	public boolean add(User u) {
		String sql="insert into book(bian,name,title,jiaqian,chu) values(?,?,?,?,?)";
		conn=DDUtil.Con();
		try {
			ps= conn.prepareStatement(sql);
			ps.setInt(1, u.getBian());
			ps.setString(2, u.getName());
			ps.setString(3, u.getTitle());
			ps.setDouble(4, u.getJiaqian());
			ps.setString(5, u.getChu());
			int s=ps.executeUpdate();
			if(s>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DDUtil.clos(conn, ps);
		}
	 return false;
	}
 //查看全部图书
public List<User> look() {
	List<User> list = new ArrayList<>();
	String sql="select*from book";
 conn=DDUtil.Con();
 try {
	ps= conn.prepareStatement(sql);
	rs = ps.executeQuery();
	User user;
	  while(rs.next()) {
		  user = new User();
		  user.setBian(rs.getInt("bian"));
		 user.setName(rs.getString("name"));
		 user.setTitle(rs.getString("title"));
		 user.setJiaqian(rs.getDouble("jiaqian"));
		 user.setChu(rs.getString("chu"));
		 list.add(user);
	  }
} catch (Exception e) {
	e.printStackTrace();
}finally {
	DDUtil.clos(conn, ps, rs);
}
return list;
}
//查看单个图书
public User allLook(User user) {
	String sql="select*from book where bian=?";
	 conn=DDUtil.Con();
	 User u = null;
	 try {
		ps= conn.prepareStatement(sql);
		ps.setInt(1, user.getBian());
		rs=ps.executeQuery();
		u = new User();
		if(rs.next()) {
			u.setBian(rs.getInt("bian"));
			u.setName(rs.getString("name"));
			 u.setTitle(rs.getString("title"));
			 u.setJiaqian(rs.getDouble("jiaqian"));
			 u.setChu(rs.getString("chu"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DDUtil.clos(conn, ps, rs);
	}
	 return u;
}
//修改图书
public boolean xiugai(User user) {
    String sql="update book set name=?,title=?,jiaqian=?,chu=? where bian='"+user.getBian()+"'";
    conn=DDUtil.Con();
    try {
		ps= conn.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getTitle());
		ps.setDouble(3, user.getJiaqian());
		ps.setString(4, user.getChu());
		int a=ps.executeUpdate();
		if(a>0) {
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DDUtil.clos(conn, ps);
	}
    return false;
}
//删除图书    DELETE FROM biao1 WHERE
public boolean dele(User user) {
	String sql="delete from book where bian=?";
	   conn=DDUtil.Con();
		try {
			ps= conn.prepareStatement(sql);
			ps.setInt(1, user.getBian());
			int a=ps.executeUpdate();
			if(a>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return false;
}
}
