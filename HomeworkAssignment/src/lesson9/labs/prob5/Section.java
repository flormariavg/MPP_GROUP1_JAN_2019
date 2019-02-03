package lesson9.labs.prob5;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 5. Create a method
 	Stream<String> streamSection(Stream<String> stream, int m, int n) which
	extracts a substream from the input stream stream consisting of all elements from position m to
	position n, inclusive; you must use only Stream operations to do this. You can assume 0 <= m <= n. 

 */
public class Section {

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		// Implement the code
		System.out.println("Substream form position "+m+" to position "+n+" :");
		Stream<String> subStream= stream.skip(m).limit(n);
		
		return subStream;
	}

	public static void main(String[] args) {
		// Make three calls for the streamSection() method with different inputs
		// use nextStream() method to supply the Stream input as a first argument in
		
		System.out.println(Section.streamSection(Section.nextStream(),1,4).collect(Collectors.joining(", ")));
		// streamSection() method
		
		/*
		 * OUTPUT SOLUTION:

			Substream form position 1 to position 4 :
			bbb, ccc, ddd, eee
		 */
	}

	// support method for the main method -- for testing
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}

}
