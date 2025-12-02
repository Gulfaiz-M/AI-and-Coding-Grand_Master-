class Main {
  public static void main(String[] args) {
    String first = "Cod";
    String second = "ingal";
    String codingal = first + second;

    String codingalTrick = "Welcome" + " " + "to" + " " + "Codingal";
    String codingalCapital = codingal.toUpperCase();
    String codingalSmall = codingalCapital.toLowerCase();

    int lengthOfCodingal = codingal.length();
    int lengthOfCodingalTrick = codingalTrick.length();
    int sum = lengthOfCodingal + lengthOfCodingalTrick;

    System.out.println("Word formed: " + codingal);
    System.out.println("Trick string: " + codingalTrick);
    System.out.println("In CAPITALS: " + codingalCapital);
    System.out.println("In small letters: " + codingalSmall);
    System.out.println("Total length sum: " + sum);
  }
}
