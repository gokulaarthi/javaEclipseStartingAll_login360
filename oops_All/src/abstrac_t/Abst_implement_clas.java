package abstrac_t;

public class Abst_implement_clas extends Abst_ract {

	@Override
	void method() {
		System.out.println("this is impemented here ");		
	}

}

class Abst_ain{
	public static void main(String[] args) {
		Abst_implement_clas abstra=new  Abst_implement_clas();
		abstra.method();
		abstra.method2();
	}
}
