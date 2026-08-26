package DefaultMethods;

interface Dad{
	default void sleep() {
		System.out.println("Sleep dads side");
	}
}

interface Mom{
	default void sleep() {
		System.out.println("Sleep Moms Side");
	}
}

public class Baby implements Dad,Mom{
	
	@Override
	public void sleep() {
		System.out.println("I will sleep on my own");
		Mom.super.sleep();
		Dad.super.sleep();
	}
	
	public static void main(String[] args) {
		Baby b=new Baby();
		b.sleep();
	}

}
