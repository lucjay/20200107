package co.jooyoung.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.jooyoung.scope.Student;

public class StudentServiceImpl implements Service {
	private ArrayList<Student> stuList;
	Student stu = new Student();

	@Override
	public void insert() {

		stuList = new ArrayList<Student>();
		stu = new Student();

		boolean b = true; // do while 문의 조건
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("학생을 추가하겠습니까? Y/N   >>");
			String yesOrNo = sc.nextLine();
			if (yesOrNo.equals("N")|| yesOrNo.equals("n")) {
				b = false;
				break;
			}
			stu = new Student();
			System.out.println("학생 id 입력하세요-----------");
			stu.setStuId(sc.nextLine());
			System.out.println("학생이름 입력하쇼...");
			stu.setStuName(sc.nextLine());
			System.out.println("뭐 공부하는 학생인가요?");
			stu.setMajor(sc.nextLine());
			System.out.println("전화번호 뭐에요? ====");
			stu.setTel(sc.nextLine());
			stuList.add(stu);
			// 리스트에 추가한단 말..

		} while (b);
		sc.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for (Student stu : stuList) {
			System.out.println(
					stu.getStuId() + "  " + stu.getStuName() + "  " + stu.getMajor() + "  " + stu.getTel() + "  ");

		}

	}
}
