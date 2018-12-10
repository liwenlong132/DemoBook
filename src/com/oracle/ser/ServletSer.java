package com.oracle.ser;

import java.util.List;

import com.oracle.dao.UserDao;
import com.oracle.user.User;

public class ServletSer {
	//添加
public boolean add(User user) {
	UserDao ud = new UserDao();
	boolean b=ud.add(user);
    return b;
}
//查看全部图书
public List<User> look() {
UserDao ud = new UserDao();
return ud.look();
}
//查找图书
public User All(User user) {
	UserDao ud = new UserDao();
	return ud.allLook(user);
}
//修改图书
public boolean gai(User user) {
	UserDao ud = new UserDao();
	User u = ud.allLook(user);
	if(user.getBian()==u.getBian()) {
		return ud.xiugai(user);
	}
	return false;
}
//删除
public boolean shan(User user) {
	UserDao ud = new UserDao();
	boolean b=ud.dele(user);
	if(b) {
		return true;
	}
	return false;
}

}
