package map_list;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {

			ArrayList<Object> list = new ArrayList<>();
			list.add(10);
			list.add(15);
			list.add(20);
			list.add("null");
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
	}

}
