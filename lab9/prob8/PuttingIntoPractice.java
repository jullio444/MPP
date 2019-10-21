package lab9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

		List<Transaction> trans = transactions.stream().filter(t->t.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))				
				.collect(Collectors.toList());
		System.out.println(trans);
		
        // Query 2: What are all the unique cities where the traders work?
		
		String cities = transactions.stream().map(m-> m.getTrader().getCity())
									   .distinct().collect(Collectors.joining(", "));
		
		System.out.println("Unique cities-> "+cities);

        // Query 3: Find all traders from Cambridge and sort them by name.

        List<Trader> traders = transactions.stream().filter(t->t.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getTrader).distinct()
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList()); 					 
        System.out.println(traders);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        
        String tradersNames = transactions.stream().map(t->t.getTrader().getName()).distinct()
        					 .sorted().collect(Collectors.joining(", "));
        System.out.println("ALL TRADERS ARE: "+tradersNames);
       
        // Query 5: Are there any trader based in Milan?
   
        boolean bool = transactions.stream().anyMatch(t->t.getTrader().getCity().equals("Milan"));
        System.out.println("Are there any traders based in Milan? "+bool);
       
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
       transactions.stream().map(Transaction::getTrader)
       						.filter(t->t.getCity().equals("Milan"))
       						.forEach(t->t.setCity("Cambridge"));
        System.out.println(transactions);
        // Query 7: What's the highest value in all the transactions?
        int highestValue = transactions.stream().map(Transaction::getValue)
        							   .reduce(0, Integer::max);
        System.out.println("What's the highest value in all the transactions? "+highestValue);
    }
}
