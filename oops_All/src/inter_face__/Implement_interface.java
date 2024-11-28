package inter_face__;

public class Implement_interface  implements Inter_face_1,inter_face_2{

	@Override
	public void salary() {
		System.out.println("this is the ");
	}
	

}
//ithu ipo run panna mudiyathu because ithu thainya file la irukanum
class For_run{
	public static void main(String[] args) {
		Implement_interface  implecalss= new Implement_interface();
		implecalss.salary();
	}
}
