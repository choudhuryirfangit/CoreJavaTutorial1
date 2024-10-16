package TryCatch;

public class multipleCatchBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=7;
//		int b=0;
		int[] arr=new int[5];
		try {
			
			System.out.println(arr[7]);
		}
		catch(ArithmeticException ae) {
			System.out.println("i caught the Arithmetic exception");
		}
		catch(IndexOutOfBoundsException be) {
			System.out.println("i caught the Index exception");
		}
		catch(Exception e) {
			System.out.println("i caught the exception");
		}


	}

}
