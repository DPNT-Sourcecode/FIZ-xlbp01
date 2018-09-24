package befaster.solutions.FIZ;

import java.util.StringJoiner;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringJoiner joiner = new StringJoiner(" ");
        String numberToString = String.valueOf(number);
    	if(number % 3 == 0 || numberToString.contains("3")) {
    		joiner.add("fizz");
    	}
    	
    	if(number % 5 == 0 || numberToString.contains("5")) {
    		joiner.add("buzz");
    	}
    	
    	if(number > 10 && hasAllIdentical(numberToString)) {
    		joiner.add("deluxe");
    	}
    	
    	if(joiner.length() == 0) {
    		joiner.add(String.valueOf(number));
    	}
    	return joiner.toString();
    }
    
    private boolean hasAllIdentical(String value) {
    	return value.chars().allMatch(c -> c == value.charAt(0));
    }

}
