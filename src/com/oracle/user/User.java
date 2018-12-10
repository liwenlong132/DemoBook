package com.oracle.user;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
private int bian;//编号
private String name;//书名
private String title;//作者
private double jiaqian;//价钱
private String chu;//出版社
public int getBian() {
	return bian;
}
public void setBian(int bian) {
	this.bian = bian;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getJiaqian() {
	return jiaqian;
}
public void setJiaqian(double jiaqian) {
	this.jiaqian = jiaqian;
}
public String getChu() {
	return chu;
}
public void setChu(String chu) {
	this.chu = chu;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public String toString() {
	return "User [bian=" + bian + ", name=" + name + ", title=" + title + ", jiaqian=" + jiaqian + ", chu=" + chu + "]";
}



}
