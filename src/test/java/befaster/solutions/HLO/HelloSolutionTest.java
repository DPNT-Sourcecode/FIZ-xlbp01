package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HelloSolutionTest {
	
	private static final String NAME = "Tom";
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private HelloSolution testSubject = new HelloSolution();
	
	@Test
	public void hello_ShouldReturnTheMessageHelloTom() {
		assertThat(testSubject.hello(NAME), equalTo(String.format(HelloSolution.MESSAGE_TEMPLATE, NAME)));
	}
	
	@Test
	public void hello_ShouldThrowNPEIfFriendNameIsNull() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("The name cannot be null");
		testSubject.hello(null);
	}

}
