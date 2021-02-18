
public class CopiaParte {

	public static void main(String[] args) {
		char[] a = {'u','t','o','p','i','a'};
		char[] b = new char[3];
		
		System.arraycopy(a,1,b,0,3);
		
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println("b[" +i+ "]=" + b[i]);
		}

	}

}
