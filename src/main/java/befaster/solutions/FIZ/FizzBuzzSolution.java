package befaster.solutions.FIZ;

import java.util.StringJoiner;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        StringJoiner joiner = new StringJoiner(" ");
        String numberToString = String.valueOf(number);
        boolean isDeluxe = false;
    	if(number % 3 == 0 || numberToString.contains("3")) {
    		joiner.add("fizz");
    		isDeluxe = number % 3 == 0 && numberToString.contains("3");
    	}
    	
    	if(number % 5 == 0 || numberToString.contains("5")) {
    		joiner.add("buzz");
    		isDeluxe = isDeluxe || (number % 5 == 0 && numberToString.contains("5"));
    	}
    	
    	if(isDeluxe) {
    		
    		if(number % 2 != 0) {
    			joiner.add("fake");
    		}
    		joiner.add("deluxe");
    	}
    	
    	if(joiner.length() == 0) {
    		joiner.add(String.valueOf(number));
    	}
    	return joiner.toString();
    }

}
