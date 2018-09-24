package befaster.solutions.SUM;

import befaster.runner.BadParametersException;

public class SumSolution {

    public int compute(int x, int y) {
    	if(!isValid(x)) {
    		throw new BadParametersException("Parameters must be between 0 and 100.");
    	}
        return x + y;
    }
    
    private boolean isValid(int value) {
    	return value > -1 && value < 101;
    }

}
