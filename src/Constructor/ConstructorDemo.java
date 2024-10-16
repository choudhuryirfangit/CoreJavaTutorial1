package Constructor;

public class ConstructorDemo {
	//Default constructor
	public ConstructorDemo() {
		System.out.println("I am the default constructor");
	}
	//Parameterized constructor
	public ConstructorDemo(int a,int b) {
		int c=a+b;
		System.out.println("I am the parameterized constructor"+"  "+ c);
	}
	
	public ConstructorDemo(String str) {
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("I am the method");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Whenever object is created the constructor is called automatically
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd2=new ConstructorDemo(4,5);
		ConstructorDemo cd3=new ConstructorDemo("Hello");
		

	}

}
