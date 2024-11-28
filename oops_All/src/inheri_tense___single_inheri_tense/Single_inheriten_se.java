package inheri_tense___single_inheri_tense;

class Grandfather{
	public void sport() {
		System.out.println(" grandpa is a footballer");
	}
}

class Father extends Grandfather{
	@Override
	
	public void sport() {
		System.out.println(" son is a Cricketer");
	}
}

public class Single_inheriten_se {
	
	public static void main(String[] args) {
		Grandfather grandfather=new Grandfather();
		grandfather.sport();

		
		Grandfather father=new Father();
		father.sport();
//		run the program this is single inheritence
	}
}
