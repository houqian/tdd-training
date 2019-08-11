package t01_fizzbuzz;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


/**
 * @author : houqian
 * @version : 1.0
 * @since : 2019-08-11
 */
public class TestFizzBuzz {

  @Test
  public void should_show_fizz_if_raw_number_is_divisiable_by_3() {
    // 写法 1
    assertTrue(checkGuessNumber(3).equals("fizz"));
    // 写法 2
    assertThat(checkGuessNumber(3), is("fizz"));
  }

  @Test
  public void should_show_buzz_if_raw_number_is_divisiable_by_5() {
    assertThat(checkGuessNumber(5), is("buzz"));
  }

  @Test
  public void show_show_fizz_buzz_if_raw_number_is_divisiable_by_3_and_5() {
    assertThat(checkGuessNumber(15), is("fizzbuzz"));
  }

  @Test
  public void should_show_fizz_buzz_if_raw_number_contains_3_or_5() {
    assertThat(checkGuessNumber(13), is("fizz"));
    assertThat(checkGuessNumber(52), is("buzz"));
    assertThat(checkGuessNumber(54), is("fizzbuzz"));
  }

  private String checkGuessNumber(int i) {
    return new FizzBuzz(i).show();
  }

}
