import javax.swing.JOptionPane;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite cijeli broj:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Upi�ite drugi cijeli broj:"));
		
		int min = x <= y ? x : y;
		int max = y > x ? y : x;

		for (int i = min; i <= max; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;

				}

			}
			if (count == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.print("su primarni brojevi izme�u brojeva " + min + " i " + max + ".");
	}

}

	


