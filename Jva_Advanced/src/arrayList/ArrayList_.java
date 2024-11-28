package arrayList;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class ArrayList_ {
	
public static void main(String[] args) {
		
		List<String> listArray=new ArrayList<>();
		
		listArray.add("Gokul");
		listArray.add("Aarthi");
		listArray.add("saravanan");
		listArray.add("hullk");
		listArray.add("Sivam");
		listArray.add("zebra");
//		System.out.println(listArray);
//		listArray.forEach(System.out::println);//print pannalam for each loop
//		listArray.forEach(s->System.out.println(s));
		listArray.get(3);  
	
		/// making the araylist values to accending to decending
	 
	List<String> sortedlist	=listArray.stream().sorted((variable1,variable2)->variable1.compareTo(variable2)).collect(Collectors.toList());
		System.out.println(sortedlist);
//		System.out.println(listArray.get(0));
		//.stream()
		//itteration pannum
		//.sorted
		//ithuku kandippa rendu value vennum edhukuna values compare panni sorted panna .sortede use pannuvom
		//.compare
		///ithu 2 variable la irukura valuesaa compare panni sotre pannum intha linelaa
		//.collect
		//intha edathula sorted panatha athuva collect paanum
		//collectors.tolist
		//collect pannathu ellam intha edathula sortedlist irukura araylist ku send panni store pannum
//		List<String> sortedlist
		//ithu edhukuna athuva store panurathuku arraylist
	}

}
