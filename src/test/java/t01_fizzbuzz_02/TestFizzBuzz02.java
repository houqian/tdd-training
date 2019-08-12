package t01_fizzbuzz_02;

import org.hamcrest.core.IsNot;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2019-08-12
 */
public class TestFizzBuzz02 {

  @Test
  public void should_show_fizz_if_rawnumber_is_divisiable_by_3() {
    assertThat(checkFizzBuzz(3), is("fizz"));
    assertThat(checkFizzBuzz(6), is("fizz"));
    assertThat(checkFizzBuzz(2), not("fizz" ));
  }

  private String checkFizzBuzz(int i) {
    return new FizzBuzz02(i).show();
  }

  @Test
  public void should_show_buzz_if_rawnumber_is_divisiable_by_5() {
    assertThat(checkFizzBuzz(5), is("buzz"));
  }

  @Test
  public void should_show_fizzbuzz_if_rawnumber_is_divisiable_by_3_and_5() {
    assertThat(checkFizzBuzz(15), is("fizzbuzz"));
  }

  @Test
  public void should_show_fizzbuzz_if_rawnumber_contains_3_or_5() {
    assertThat(checkFizzBuzz(13), is("fizz"));
    assertThat(checkFizzBuzz(33), is("fizz"));
  }
}
