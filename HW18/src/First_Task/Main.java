package First_Task;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		LinkedList <Integer> list = new LinkedList<>();
		
		String line = "abc";
		//Додавати правильним способом String в List Integer не можна
		list.add(line);
		
		System.out.println(list.toString());
		
	}

}
