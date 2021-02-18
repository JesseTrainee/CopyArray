import java.util.Random;

public class CopiarFor {

	public static void main(String[] args) {
	
		int[] a = new int[5];
		Random numeros = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = numeros.nextInt();
			System.out.println("a[" + i + "]=" + a[i]);
			
		}
		System.out.println();
		
		int [] b = new int[a.length];
		for(int i = 0 ; i < a.length ; i++) {
			b[i] = a[i];
			}
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}

	}

}
