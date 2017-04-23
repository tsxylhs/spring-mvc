package cn.edu.lhs.entity;

public class user {
	
private String username;
private String userpassword;

public user(){
	
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
public user(String username, String userpassword) {
	super();
	this.username = username;
	this.userpassword = userpassword;
}


}
