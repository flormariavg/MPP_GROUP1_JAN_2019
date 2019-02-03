package lesson9.labs.prob8;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		
		System.out.println("****************************************************");
		System.out.println("Query 1: Find all transactions from year 2011 and sort them by value (small to high):\n");
		Stream<Transaction> s= transactions.stream().filter(x->x.getYear()>=2011)
		.sorted((x,y)->{
			if(x.getValue()>y.getValue()) return 1;
			else if (x.getValue()<y.getValue()) return -1;
			else return 0;
		});

		s.forEach(x->System.out.println(x));

		System.out.println("\n****************************************************");
        
        // Query 2: What are all the unique cities where the traders work?
		
		System.out.println("Query 2: What are all the unique cities where the traders work?\n");
		
		Stream<String> s2 = transactions.stream()
		.map(x->x.getTrader().getCity())
		.distinct();
		
		s2.forEach(x->System.out.println(x));
		
		System.out.println("\n****************************************************");

        // Query 3: Find all traders from Cambridge and sort them by name.
        
		System.out.println("Query 3: Find all traders from Cambridge and sort them by name.\n");
		Stream<Trader> s3= transactions.stream()
		.filter(x->x.getTrader().getCity().equals("Cambridge"))
		.map(x->x.getTrader())
		.sorted((x,y)->x.getName().compareTo(y.getName()))
		.distinct();
		
		s3.forEach(x->System.out.println(x));
   
		System.out.println("\n****************************************************");
		
        // Query 4: Return a string of all traders names sorted alphabetically.
		
		System.out.println("Query 4: Return a string of all traders names sorted alphabetically.\n");
		String s4= transactions.stream()
		.map(x->x.getTrader().getName())
		.distinct()
		.sorted()
		.collect(Collectors.joining(", "));
        
		System.out.println(s4);
		
		System.out.println("\n****************************************************");

        // Query 5: Are there any trader based in Milan?
		
		System.out.println("Query 5: Are there any trader based in Milan?/\n");
		
		Stream<Trader> s5 =transactions.stream()
		.filter(x->x.getTrader().getCity().equals("Milan"))
		.map(x->x.getTrader())
		.distinct();
		
		s5.forEach(x->System.out.println(x));
   
		System.out.println("\n****************************************************");
		
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		
		System.out.println("Query 6: Update all transactions so that the traders from Milan are set to Cambridge.\n");
		
		transactions.stream()
		.forEach(x->{
			if(x.getTrader().getCity().equals("Milan"))
				x.getTrader().setCity("Cambridge");
		});
		
		transactions.stream()
		.forEach(x->System.out.println(x));
        
		System.out.println("\n****************************************************");
		
        // Query 7: What's the highest value in all the transactions?
		
		System.out.println("Query 7: What's the highest value in all the transactions?\n");
		IntSummaryStatistics s7=transactions.stream()
		.collect(Collectors.summarizingInt(x->x.getValue()));
		
		System.out.println(s7.getMax());
    }
    
    /*
     * OUTPUT SOLUTION:

		****************************************************
		Query 1: Find all transactions from year 2011 and sort them by value (small to high):
		
		{Trader:Brian in Cambridge, year: 2011, value:300}
		{Trader:Raoul in Cambridge, year: 2011, value:400}
		{Trader:Mario in Milan, year: 2012, value:700}
		{Trader:Mario in Milan, year: 2012, value:710}
		{Trader:Alan in Cambridge, year: 2012, value:950}
		{Trader:Raoul in Cambridge, year: 2012, value:1000}
		
		****************************************************
		Query 2: What are all the unique cities where the traders work?
		
		Cambridge
		Milan
		
		****************************************************
		Query 3: Find all traders from Cambridge and sort them by name.
		
		Trader:Alan in Cambridge
		Trader:Brian in Cambridge
		Trader:Raoul in Cambridge
		
		****************************************************
		Query 4: Return a string of all traders names sorted alphabetically.
		
		Alan, Brian, Mario, Raoul
		
		****************************************************
		Query 5: Are there any trader based in Milan?/
		
		Trader:Mario in Milan
		
		****************************************************
		Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		
		{Trader:Brian in Cambridge, year: 2011, value:300}
		{Trader:Raoul in Cambridge, year: 2012, value:1000}
		{Trader:Raoul in Cambridge, year: 2011, value:400}
		{Trader:Mario in Cambridge, year: 2012, value:710}
		{Trader:Mario in Cambridge, year: 2012, value:700}
		{Trader:Alan in Cambridge, year: 2012, value:950}
		
		****************************************************
		Query 7: What's the highest value in all the transactions?
		
		1000
		

     */
}
