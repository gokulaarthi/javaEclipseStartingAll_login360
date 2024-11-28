package arrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Work_Array {
	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(88);
		numberList.add(99);
		numberList.add(111);
		numberList.add(222);
		numberList.add(1);
		numberList.add(22);
		List<Integer> numberList2 = new ArrayList<>();
		numberList.add(8);
		numberList.add(9);
		numberList.add(11);
		numberList.add(22);
		numberList.addAll(numberList2);
		System.out.println(numberList);
		List<Integer> total = numberList.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		total.forEach(ss->System.out.println(ss));

	}
}

