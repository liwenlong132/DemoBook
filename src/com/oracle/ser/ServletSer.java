package com.oracle.ser;

import java.util.List;

import com.oracle.dao.UserDao;
import com.oracle.user.User;

public class ServletSer {
	//���
public boolean add(User user) {
	UserDao ud = new UserDao();
	boolean b=ud.add(user);
    return b;
}
//�鿴ȫ��ͼ��
public List<User> look() {
UserDao ud = new UserDao();
return ud.look();
}
//����ͼ��
public User All(User user) {
	UserDao ud = new UserDao();
	return ud.allLook(user);
}
//�޸�ͼ��
public boolean gai(User user) {
	UserDao ud = new UserDao();
	User u = ud.allLook(user);
	if(user.getBian()==u.getBian()) {
		return ud.xiugai(user);
	}
	return false;
}
//ɾ��
public boolean shan(User user) {
	UserDao ud = new UserDao();
	boolean b=ud.dele(user);
	if(b) {
		return true;
	}
	return false;
}

}
