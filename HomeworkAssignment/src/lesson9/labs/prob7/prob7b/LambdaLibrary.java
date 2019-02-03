package lesson9.labs.prob7.prob7b;

import java.util.List;
import java.util.stream.Collectors;

/*
 * b. Turn your lambda/stream pipeline from part (a) into a Lambda Library element,
	following the steps in the slides. First, create a class LambdaLibrary; this class will
	contain only public static final lambda expressions. Then, identify the parameters that
	need to be passed in so that your lambda/stream pipeline can operate properly. Finally,
	think of a function-style interface (Function, BiFunction, TriFunction, etc) that can be
	used to accommodate your parameters and then name your pipeline, with the functiontype 
	interface as its type (as in the slide example). Call your Library element in the main
	method instead of creating the pipeline there, as you did in part (a).
 */
public class LambdaLibrary {
	
	public static TriFunction<List<Employee>,Integer,Character, String> lambdaExpressions =
			(list,minSalary,startLetter) -> 
			(list.stream()
			.filter(x->x.getSalary()>minSalary && x.getLastName().charAt(0)>startLetter)
			.map(x->x.getFirstName()+" "+x.getLastName())
			.sorted()
			.collect(Collectors.joining(", ")));
			

}
