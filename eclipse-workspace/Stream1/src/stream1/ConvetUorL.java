package stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConvetUorL {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("swati");
		li.add("Ritika");
		li.add("Vindjya");
		li.add("Priyanka");
		Stream<String> st= li.stream();
		st.map(e->e.toUpperCase()).sorted().forEach(i->System.out.println(i));

	}

}
