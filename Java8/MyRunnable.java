package Java8;
//without lambda
public class MyRunnable{
	
//	@Override
//	public void run() {
//		
//		try {
//			for(int i=0;i<10;i++) {
//				System.out.println("Sai thread");
//				Thread.sleep(3000);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

	public static void main(String[] args) {
		
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Sai thread");
			};
		};
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Sivani thread");
		}
	}
}