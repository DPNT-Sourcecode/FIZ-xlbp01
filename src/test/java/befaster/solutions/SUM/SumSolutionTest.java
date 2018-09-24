package befaster.solutions.SUM;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import befaster.runner.BadParametersException;

@RunWith(Parameterized.class)
public class SumSolutionTest {

	private static final String BAD_PARAMETER_MESSAGE = "Parameters must be between 0 and 100.";

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private SumSolution testSubject;

	private int firstParameter;
	private int secondParameter;
	private int expectedValue;
	private Class<Throwable> expectedExceptionClass;
	private String expectedErrorMessage;

	@Parameters(name = "{index}: {0}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { //
				{ "Compute sum should return the correct value", 10, 11, 21, null, null }, //
				{ "The method throws a BadParametersException with the correct error message", -1, 11, -1,
						BadParametersException.class, BAD_PARAMETER_MESSAGE } //
		});
	}

	public SumSolutionTest(final String title, final int firstParameter, final int secondParameter, final int expected,
			final Class<Throwable> expectedExceptionClass, String expectedErrorMessage) {
		this.firstParameter = firstParameter;
		this.secondParameter = secondParameter;
		this.expectedValue = expected;
		this.expectedExceptionClass = expectedExceptionClass;
		this.expectedErrorMessage = expectedErrorMessage;
	}

	@Before
	public void setUp() {
		testSubject = new SumSolution();
	}

	@Test
	public void compute_sum() {
		int result = testSubject.compute(this.firstParameter, this.secondParameter);
		if (expectedExceptionClass == null) {
			assertThat(result, equalTo(this.expectedValue));
		} else {
			thrown.expect(expectedExceptionClass);
			thrown.expectMessage(expectedErrorMessage);
		}
	}

}
