package polymor_phisam__runtime;

// we can achieve the runtime polymorpisam by useing the extends keyword and ovveride anotations 
//which helps the code reuseability
class A{
	public void method() {
		System.out.println("A parent class method");
	}
	
}

class B extends A{
	@Override
	public void method() {
		System.out.println("this was override mthod");
	}
	
}

public class Run_time {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.method();
		b.method();
	}

}
