package sir_emplyoee_example;
public class Employee_main_ {
	//rootpackage la irukura first class
	
	public static void main(String[] args) {//inga private kudutha jvm la run panna mudiyathu
		//ststic oru time avuthu riun aganum so we need to store    
		
		Employee employee = new Employee();
		employee.setEmployeeId("001");
		employee.setAge(24);
		employee.setEmployeeName("gokul");
		
		System.out.println(employee.toString());
		
//		System.out.println(employee.getEmployeeName());
		
//		Employee employee2 = new Employee();
//		employee.setEmployeeId("001");
//		employee.setAge(24);
//		employee.setEmployeeName("gokul");
//		
//		
//		Employee employee3 = new Employee();
//		employee.setEmployeeId("001");
//		employee.setAge(24);
//		employee.setEmployeeName("gokul");
//		
//		
//		Employee employee4 = new Employee();
//		employee.setEmployeeId("001");
//		employee.setAge(24);
//		employee.setEmployeeName("gokul");
//		
//		
//		Employee employee5 = new Employee();
//		employee.setEmployeeId("001");
//		employee.setAge(24);
//		employee.setEmployeeName("gokul");
//		
//		
//		Employee employee6 = new Employee();
//		employee.setEmployeeId("001");
//		employee.setAge(24);
//		employee.setEmployeeName("gokul");
//		
//		for(int i=0; i<=6;i++) {
//			System.out.println(employee  .getEmployeeName());
//		}
	}
}
