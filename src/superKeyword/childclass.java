package superKeyword;

public class childclass extends parentclass{
	
	String name="SeleniumTraining";
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();//this must be the first line 
		System.out.println("I am on child class");
	}
	
	public childclass() {
		super();
		System.out.println("I am child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass cs=new childclass();
		cs.getName();
		cs.getData();

	}

}
