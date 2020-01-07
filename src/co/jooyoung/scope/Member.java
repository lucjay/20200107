package co.jooyoung.scope;

public class Member {
private String id;
private String pw;
private String name;
private String addr;
private String tel;
private int grade;

public Member() {
	
}

/**public Member(String id, String pw, String name, String addr, String tel, int grade) {
	this.id = id;
	this.pw = pw;
	this.addr = addr;
	this.grade =grade;
	this.name = name;
	this.tel=tel;
}**/

public String getId() {
	return id;
}

public String getPw() {
	return pw;
}

public String getName() {
	return name;
}

public String getAddr() {
	return addr;
}

public String getTel() {
	return tel;
}

public int getGrade() {
	return grade;
}


public void setId(String id) {
	this.id = id;
}

public void setPw(String pw) {
	this.pw = pw;
}

public void setName(String name) {
	this.name = name;
}
public void setAddr(String addr) {
	this.addr = addr;
}

public void setTel(String tel) {
	this.tel = tel;
}

public void setGrade(int grade) {
	this.grade = grade;
}


/*public void insert(String id, String pw, String name, String addr, String tel, int grade) {
	this.id = id;
	this.pw = pw;
	this.addr = addr;
	this.grade =grade;
	this.name = name;
	this.tel=tel;
}*/

public String toString() {
	System.out.println(id+"  "+pw+"  "+name+"  "+addr+"  "+tel+"  "+grade);
	return null;
}
}
