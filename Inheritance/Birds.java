package Inheritance;

class bird{
	void fly() {
		System.out.println("Birds can fly");
	}
}

class greenbirds extends bird{
	void flying(){
		System.out.println("Green birds are flying");
	}
}

class redbirds extends bird{
	void flying(){
		System.out.println("Green birds are flying");
	}
}
public class Birds {
	public static void main(String[] args) {
		
		greenbirds g=new greenbirds();
		g.fly();
		g.flying();
		
		redbirds r=new redbirds();
		r.fly();
		r.flying();
	}
	
	

}
