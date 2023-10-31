package java1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = {9,8,6,4};
		Stream<int[]> st = Stream.of(nums);
		//int min=IntStream.of(nums).min().getAsInt();
		IntStream.of(nums).min().ifPresent(System.out::println);
		System.out.println(IntStream.of(nums).distinct().count());
		int newArray[] =IntStream.of(nums).toArray();
		for(int i :newArray) {
			System.out.println(i);
		}
		
	}

}
