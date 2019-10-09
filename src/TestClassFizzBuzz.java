import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	int input = fizzbuzz.getInt(8);
	
	@Test
	void input_8_expence_output_is_8() {
		assertEquals(8,input);
	}


}
