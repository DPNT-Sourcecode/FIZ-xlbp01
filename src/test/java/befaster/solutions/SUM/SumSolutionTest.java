package befaster.solutions.SUM;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SumSolutionTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private SumSolution testSubject;

	private int firstParameter;
	private int secondParameter;
	private int expectedValue;
	private Matcher<Throwable> expectedError;
	private Matcher<String> expectedErrorMessage;

	@Parameters(name = "{index}: sum {0} + {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 10, 11, 21, null, null } //
		});
	}

	public SumSolutionTest(final int firstParameter, final int secondParameter, final int expected,
			final Matcher<Throwable> epxectedError, Matcher<String> expectedErrorMessage) {
		this.firstParameter = firstParameter;
		this.secondParameter = secondParameter;
		this.expectedValue = expected;
		this.expectedError = epxectedError;
		this.expectedErrorMessage = expectedErrorMessage;
	}

	@Before
	public void setUp() {
		testSubject = new SumSolution();
	}

	@Test
	public void compute_sum() {
		assertThat(testSubject.compute(this.firstParameter, this.secondParameter), equalTo(this.expectedValue));
	}

}
