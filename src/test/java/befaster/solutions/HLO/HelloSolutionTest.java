package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class HelloSolutionTest {
	
	private static final String NAME = "Tom";
	
	private HelloSolution testSubject = new HelloSolution();
	
	@Test
	public void hello_ShouldReturnTheMessageHelloTom() {
		assertThat(testSubject.hello(NAME), equalTo(String.format(HelloSolution.MESSAGE_TEMPLATE, NAME)));
	}

}
