package befaster.solutions.HLO;

import java.util.Objects;

public class HelloSolution {
	
	static final String MESSAGE_TEMPLATE = "Hello, World!";
	
    public String hello(String friendName) {
    	
    	Objects.requireNonNull(friendName, "The name cannot be null");
    	
    	return String.format(MESSAGE_TEMPLATE, friendName);
    }
}
