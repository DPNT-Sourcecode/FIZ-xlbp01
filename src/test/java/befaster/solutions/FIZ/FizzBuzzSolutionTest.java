package befaster.solutions.FIZ;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class FizzBuzzSolutionTest {
	

	private FizzBuzzSolution testSubject;

	private int parameter;
	private int expectedValue;

	@Parameters(name = "{index}: {0} should return {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { //
				{ 10, 11 }, //
		});
	}

	public FizzBuzzSolutionTest(final int parameter, final int expectedValue) {
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
