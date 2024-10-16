package AccessModifiers;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	//public, private, protected, default-- Type of access modifiers
	
	//default:- This class can be accessed anywhere in the package. But out of the package it cannot be accessed
	void getData() {
		System.out.println("I am default access modifier");
	}
	
	//public:- we can access it across all the packages
	public void getNum() {
		
	}
	
	//private:- we cannot access it outside the class itself.
	private void getChar() {
		
	}
	//protected:- we can access those in sub classes i.e. the class which extends/inherits the current class which is having protected method
	protected void getInt() {
		
	}

}
