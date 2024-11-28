package mult_Threading;
class Music extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=3;i++) {
		System.out.println("music "+i+" "+Thread.currentThread().getId());
		}
	}
	 
}
class Music1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=3;i++) {
		System.out.println("music1 "+i+" "+Thread.currentThread().getId());
		}
	}
	
}

class Cke extends Thread  {
	@Override
	
	public void run() {
		System.out.println("mixing "+Thread.currentThread().getId());
//		System.out.println("flavour "+Thread.currentThread().getId());
//		System.out.println("shape "+Thread.currentThread().getId());
//		System.out.println("decoration "+Thread.currentThread().getId());
		System.out.println("========================");
	}
	
}

public class Cake {
	
	public static void main(String[] args) {
		int totalcakes=4;
		for(int i=1;i<totalcakes;i++) {
			Cke cake=new Cke();
			cake.start();
		}
		
		Music music=new Music();
		music.start();
		Music1 music1=new Music1();
		music1.start();
	}
}
