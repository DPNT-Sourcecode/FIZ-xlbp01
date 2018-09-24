package befaster.solutions.FIZ;

import java.util.StringJoiner;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringJoiner joiner = new StringJoiner(" ");
    	if(number % 3 == 0) {
    		joiner.add("fizz");
    	}
    	
    	if(number % 5 == 0) {
    		joiner.add("buzz");
    	}
    	
    	if(joiner.length() == 0) {
    		joiner.add(String.valueOf(number));
    	}
    	return joiner.toString();
    }

}
