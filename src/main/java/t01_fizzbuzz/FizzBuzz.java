package t01_fizzbuzz;

/**
 * @author : houqian
 * @version : 1.0
 * @since : 2019-08-11
 */
public class FizzBuzz {
  private int rawNumber;

  public FizzBuzz(int rawNumber) {
    this.rawNumber = rawNumber;
  }

  public String show() {
    if (isRalated(3) && isRalated(5)) {
      return "fizzbuzz";
    }
    if (isRalated(3)) {
      return "fizz";
    }
    if (isRalated(5)) {
      return "buzz";
    }
    return String.valueOf(rawNumber);
  }

  private boolean isRalated(int number) {
    return rawNumber % number == 0 || String.valueOf(rawNumber).contains(String.valueOf(number));
  }
}
