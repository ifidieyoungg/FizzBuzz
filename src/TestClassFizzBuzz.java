import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	int input = fizzbuzz.getInt(14);
	
	@Test
	void input_14_expence_output_is_14() {
		assertEquals(14,input);
	}

}
