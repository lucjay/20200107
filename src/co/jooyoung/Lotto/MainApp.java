package co.jooyoung.Lotto;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("금액을 입력하세요 : ");
		int a = 0;
		a = scanner.nextInt();
		scanner.nextLine();

		Lotto.setMoney(a);

	}

}
