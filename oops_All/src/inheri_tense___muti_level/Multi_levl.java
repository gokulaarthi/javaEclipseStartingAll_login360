package inheri_tense___muti_level;

class Grandfather{
	public String name;
	public int age;
	public void sports() {
		System.out.println("Football player");
	}
	public void behaviour() {
		System.out.println("good man n society");
	}
	
}

class Father extends Grandfather{
	@Override
	
	public void sports() {
		System.out.println("crickert");
	}
	@Override
	public void behaviour() {
		System.out.println("little rude");
	}
	public void mobileNumber() {
		System.out.println("90429576795");
	}
}

class Son extends Father{
@Override
	
	public void sports() {
		System.out.println("Gammer");
	}
@Override
public void behaviour() {
	System.out.println("Jolly type");
}
@Override
public void mobileNumber() {
	System.out.println("123456890");
}
public void education() {
	System.out.println("Bsc");
}
	
}

public class Multi_levl {
	public static void main(String[] args) {
		Grandfather grandfater=new Grandfather();
		grandfater.name="Tonny";
		grandfater.age=90;
		grandfater.behaviour();
		grandfater.sports();
		
		
		Grandfather father=new Father();
		father.name="Stark";
		father.age=22;
		father.behaviour();
		father.sports();
		Father fath_er=new Father();
		fath_er.mobileNumber();
		
		
		Grandfather son=new Son();
		son.name="Tonny";
		son.age=90;
		son.behaviour();
		son.sports();
 
		Son so_n=new Son();
		so_n.mobileNumber();
		so_n.education();
	}

}
