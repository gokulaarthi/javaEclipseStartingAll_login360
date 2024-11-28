package maaap_Framework;

import java.util.*;
import java.util.stream.Collectors;


public class Maaap {
	public static void main(String[] args) {
		
//		Map<String, Object> maplist=new HashMap<>();
//		maplist.put("name", "gokul");
//		maplist.put("age", 21);
//		
//		Map<String, Object> maplist2=new HashMap<>();
//		maplist2.put("name", "renger");
//		maplist2.put("age", 22);
//		
//		List<Map<String, Object>> araylist=new ArrayList<>();
//		araylist.add(maplist);
//		araylist.add(maplist2);
//		
//		araylist.stream().forEach(s->System.out.println(s));
		
		
		List<Integer> araylist=new ArrayList<>();
		araylist.add(20);
		araylist.add(21);
		araylist.add(23);
		araylist.add(5);
		araylist.add(8);
		
//		List<Integer> list=araylist.stream().filter(a->a>12).collect(Collectors.toList());//here .collect is a inbuild method
//		System.out.println(list);
		
		
		List<String> araylist1=new LinkedList<>();
		araylist1.add("gokul");
		araylist1.add("renger");
		araylist1.add("lenin");
		araylist1.add("gokuL");
		araylist1.add("ram");
		
//		araylist1.stream().forEach(s->System.out.println(s));;
//		System.out.println("\n"+"end"+"\n");
		List<String> araylist2=new ArrayList<>();
		araylist2.add("gokul");
		araylist2.add("renger");
		araylist2.add("lenin");
		araylist2.add("gokuL");
		araylist2.add("ram");
		araylist2.remove("lenin");
		System.out.println(araylist2+"\n");
//		araylist2.remove(araylist2.size()-1);
//		System.out.println(araylist2);
		
//		araylist2.stream().forEach(s->System.out.println(s));;
		
		Stack<Object> vectorlist=new Stack<>();
		vectorlist.push("gokul");
		vectorlist.push(11);
		vectorlist.push("lenin");
		vectorlist.push(21);
		vectorlist.push("last");
		 
		Object var =vectorlist.pop();
		vectorlist.pop();
		vectorlist.push("renger");
		System.out.println(var+"\n");
//		vectorlist.forEach(s->System.out.println(vectorlist));
		
		vectorlist.stream().forEach(s->System.out.println(s));
//		vectorlist.add(34);
//		System.out.println(vectorlist);
//		vectorlist.remove(5);
//		System.out.println(vectorlist);
		
//		Map<String, Object> maplist=new HashMap<>();
		
		
		
		
		
		
		
		
	}
}
//Map<String, Integer> map=new HashMap<>();
//map.put("age1 ", 3);
//map.put(null, null);
//map.put("age3",343);
//Map<String, String> li=new Hashtable<>();
//li.put("name10 ","gokul");
//li.put("name 1 ","siva");
//li.put("name3 ","ll");
//li.put("name4 ","emptyy");
//
//map.forEach((t, u) ->System.out.println(t+u) );
//System.out.println("\n");
//
//li.forEach((t, u) ->System.out.println(t+u));