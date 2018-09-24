package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzSolutionTest {
	

	private FizzBuzzSolution testSubject;

	private int parameter;
	private String expectedValue;

	@Parameters(name = "{index}: {0} should return {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { //
				{ 3, "fizz" }, //
				{ 10, "buzz" }, //
				{ 15, "fizz buzz" }, //
				{ 17, "17" }, //
				{ 13, "fizz" }, //
				{ 151, "buzz" }, //
				{ 157, "buzz" }, //
				{ 577, "buzz" }, //
				{ 577, "buzz" }, //
		});
	}

	public FizzBuzzSolutionTest(final int parameter, final String expectedValue) {
		this.parameter = parameter;
		this.expectedValue = expectedValue;
	}

	@Before
	public void setUp() {
		testSubject = new FizzBuzzSolution();
	}

	@Test
	public void compute_sum() {
		
		assertThat(testSubject.fizzBuzz(this.parameter), equalTo(this.expectedValue));
	}


}
