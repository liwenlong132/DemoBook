package com.oracle.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;



public class DDUtil {
private static Properties per = null;
static {
	per = new Properties();
	try {
		per.load(DDUtil.class.getResourceAsStream("per.properties"));
	} catch (IOException e) {
		e.printStackTrace();
	}
}
static {
	try {
		Class.forName(per.getProperty("jdb"));
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Connection Con() {
	try {
		return DriverManager.getConnection(per.getProperty("dao"),per.getProperty("acc"),per.getProperty("pwd"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
public static void clos(Connection c,PreparedStatement ps,ResultSet r) {
	if(c!=null) {
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(ps!=null) {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(r!=null) {
		try {
			r.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void clos(Connection c,PreparedStatement ps) {
	if(c!=null) {
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(ps!=null) {
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
}
