import javax.swing.JOptionPane;

public class Zadatak1 {

	public static void main(String[] args) {
		
		
		int [] niz= new int [24];
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<=23;i++) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			sum+=x;
			niz[i]=x;
			if(x<min) min=x;
			if(x>max) max=x;
		}
		System.out.println(sum);
		System.out.println(min);
		System.out.println(max);

	}

}
