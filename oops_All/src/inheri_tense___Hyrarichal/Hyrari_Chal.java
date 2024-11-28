package inheri_tense___Hyrarichal;

class Father{
	public void gender() {
		System.out.println("male");
	}
	public void education() {
		System.out.println("teacher");
	}
}

class Son extends Father{
	@Override
	public void gender() {
		System.out.println("male");
	}
	@Override
	public void education() {
		System.out.println("Doctor");
	}
}
class Daughter extends Father{
	@Override
	public void gender() {
		System.out.println("female");
	}
	@Override
	public void education() {
		System.out.println("engineer");
	}
	
}

public class Hyrari_Chal {
	public static void main(String[] args) {
		
		
		Father father =new Father();
		father.education();
		father.gender();
		
		Father son = new Son();
		son.education();
		son.gender();
		
		Father daughter=new Daughter();
		daughter.education();
		daughter.gender();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
