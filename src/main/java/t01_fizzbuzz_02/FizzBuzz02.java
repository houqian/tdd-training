package t01_fizzbuzz_02;

import static java.lang.String.valueOf;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2019-08-12
 */
public class FizzBuzz02 {
  private int rawNumber;

  public FizzBuzz02(int rawNumber) {

    this.rawNumber = rawNumber;
  }

  public String show() {
    if (isDivisiable(3) && isDivisiable(5)) {
      return "fizzbuzz";
    }
    if (isDivisiable(3)) {
      return "fizz";
    }
    if (isDivisiable(5)) {
      return "buzz";
    }

    return valueOf(rawNumber);
  }

  private boolean isDivisiable(int i) {
    return rawNumber % i == 0 || valueOf(rawNumber).contains(valueOf(i));
  }
}
