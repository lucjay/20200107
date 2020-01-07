package co.jooyoung.scope;

import co.jooyoung.interfaceTest.MemberServiceImpl;
import co.jooyoung.interfaceTest.Service;
import co.jooyoung.interfaceTest.StudentServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
	/**Member mem = new Member();
	mem.setId("Dooli");
	mem.setPw("hoihoi");
	mem.setName("kimdool-li");
	mem.setAddr("한강 빙하");
	mem.setTel("010-1111-1111");
	mem.setGrade(1);
	mem.toString();
	
	mem.insert("ko", "1234", "고길동", "서울특별시", "010-2222-2222", 2);
	mem.toString();
	System.out.println(mem.getId() + "  " +mem.getPw());

	**/
	/*Service ser = new MemberServiceImpl();
	ser.insert();
	ser.display();
	*/
	Service ser2 = new StudentServiceImpl();
	ser2.insert();
	ser2.display();
	}

}
