package dibuhito;
public class Codigo2 {
	public static void main(String[] args) {
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j % 2 == 0) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		for (int i = 21; i > -1; i--) {
			for (int j = 0; j < i + 1; j++) {
				if (j % 2 == 0) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
}
}