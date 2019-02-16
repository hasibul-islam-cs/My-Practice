package JavaMapInterface;

/*
import java.util.List;​

import java.util.ArrayList;​

​

public class MapLearning{​

public static void main(String[] args){​

List<Integer> list = new ArrayList<>();​

ArrayList<Integer> arrayList = new ArrayList<>();​

​

list.add(1102);​

List.add(2205);​

list.add(3,400);​

​

for (List data: arrayList){​

    list.add(data);​

}​

}​

}​
​*/

import java.util.List;
import java.util.ArrayList;

public class MapLearning{
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(1101);
		array.add(100);
		array.add(300);
		
		for (Integer list: array) {
			integerList.add(list);
		}
		
		Integer result = 0;
		for (Integer list: array) {
			result += list;
		}
		
		System.out.println(result);
	}
}