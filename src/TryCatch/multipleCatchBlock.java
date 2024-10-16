package TryCatch;

public class multipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=0;
		try {
			int k=a/b;
			System.out.println(k);
		}
		catch(ArithmeticException ae) {
			System.out.println("i caught the Arithmetic exception");
		}
		catch(Exception e) {
			System.out.println("i caught the exception");
		}


	}

}
