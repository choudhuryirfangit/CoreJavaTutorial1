package TryCatch;

public class finallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		finally {
			System.out.println("i am the finally block");
		}


	}

}
