import javax.swing.JOptionPane;

public class Zadatak5 {

	public static void main(String[] args) {
		//kreirati program koji ispisuje cijelu matricu-unos dva cijela broja
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		int[][] matrica = new int [a][b];
		
		int broj = 1;
		int minj = 0;
		int maxj = b-1;
		int mini = 0;
		int maxi = a-1;
		
		while ( broj <= a*b)
		{
			for (int i = maxi; i >= mini; i--) 
			{
				matrica[maxi][i] = broj;
				
				
				
			}
				
			
		}
		

	}

}
