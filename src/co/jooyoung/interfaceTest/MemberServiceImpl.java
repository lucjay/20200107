package co.jooyoung.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.jooyoung.scope.Member;

public class MemberServiceImpl implements Service {
	// private Member mem; // Member클래스를 사용하기 위해 Import하고 mem 이란 인스턴스 정의
	private ArrayList<Member> list; // 리스트 구조를 사용하기 위한 타입

	@Override
	public void insert() {
		Member mem;
		list = new ArrayList<Member>(); // 리스트 초기화
		mem = new Member();
		boolean b = true; // do while 문의 조건
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("멤버를 추가하겠습니까? Y/N   >>");
			String yesOrNo = sc.nextLine();
			if (yesOrNo.equals("N")) {
				b = false;
				break;
			}
			mem = new Member();
			System.out.println("id 입력하세요-----------");
			mem.setId(sc.nextLine());
			System.out.println("pw 입력하쇼...");
			mem.setPw(sc.nextLine());
			System.out.println("이름입력하쇼==========");
			mem.setName(sc.nextLine());

			System.out.println("주소?");
			mem.setAddr(sc.nextLine());

			System.out.println("전화번호 뭐에요? ====");
			mem.setTel(sc.nextLine());

			System.out.println("당신의...등급은................");
			mem.setGrade(sc.nextInt());
			sc.nextLine();

			list.add(mem);
			// 리스트에 추가한단 말..

		} while (b);
		sc.close();
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

	@Override
	public void display() {
		for (Member mem : list) {
			System.out.println(mem.getId() + "  " + mem.getPw() + "  " + mem.getName() + "  " + mem.getAddr() + "  "
					+ mem.getTel() + "  " + mem.getGrade());
		}
	}

}
