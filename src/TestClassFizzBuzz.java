import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	int input = fizzbuzz.getInt(2);
	
	@Test
	void input_2_expence_output_is_2() {
		assertEquals(2,input);
	}

}
