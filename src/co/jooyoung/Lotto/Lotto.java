package co.jooyoung.Lotto;

public class Lotto {
	private int money;

	Lotto() {
	}

	private void stratGame() {
		int n = money / 1000;
		int balls[] = new int[6];
		for (int i = 0; i < n; i++) {

			for (int x = 0; x < 6; x++) {
				balls[x] = (int) (Math.random() * 45) + 1;
				for (int k = 0; k < x; k++) {
					if (balls[x] == balls[k]) {
						x++;
					}
				}
				System.out.print(balls);
			}
		}
	}
}