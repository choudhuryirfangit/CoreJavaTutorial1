package Static_Non_Static;

public class StaticVar {
	
	
	String name;  //Instance variables
	String address;
	static String city="Bangalore";//class variables
	static int i=0;
	int j=0;
	
	//Static block to declare bulk static variables
	static {
		city="Manali";
		i=9;
	}
	
	StaticVar(String name,String address) {
		this.name=name;
		this.address=address;     //Local vairaibles
//		this.city=city;
		i++;
		System.out.println(i);
		
		j++;
		System.out.println(j);
	}
	
	public void getData() {
		System.out.println(address+"  "+city);
	}
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv=new StaticVar("Ram","Itanagar");
		StaticVar sv1=new StaticVar("Rahim","Kolapur");
		StaticVar sv2=new StaticVar("Rahima","Sydney");
		sv.getData();
		sv1.getData();
		sv2.getData();
		StaticVar.getCity();
		sv.address="Runtime address";
		StaticVar.i=4;
		

	}

}
