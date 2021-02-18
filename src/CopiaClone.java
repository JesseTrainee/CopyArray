import java.util.Random;

public class CopiaClone {

	public static void main(String[] args) {
		int[] a = new int[5];
		Random numeros = new Random();
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = numeros.nextInt();
			System.out.println("a[" + i + "]=" + a[i]);
		}
		System.out.println();
		
		int [] b = a.clone();
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("b[" +i+ "]=" + b[i]);
		}
	}
	
	

}
