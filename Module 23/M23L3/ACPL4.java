class Main {
  public static void main(String[] args) {
    int number = 98765;
    int reverse = 0;

    while (number > 0) {
      int lastDigit = number % 10;
      reverse = (reverse * 10) + lastDigit;
      number = number / 10;
    }

    System.out.println("The reversed value is: " + reverse);
  }
}
