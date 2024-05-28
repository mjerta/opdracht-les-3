package nl.novi;

public class Main {
  static int[] numbers = {12, 2, 3, 5, 8, 9};

  public static void main(String[] args) {

//    Person person = new Person();
    printNumbers();
    biggestValue();

    evenNumbers();
    evenNumbers2();
    printOutAllValuesOfArray();
    Person person = new Person(33, "Maarten");
    System.out.println(person.toString());

  }

  public static void printNumbers() {
    int sum = 0;
    for (int index = 0; index < numbers.length; index++) {
      sum += numbers[index];
    }
    System.out.println("Sum: " + sum);
  }

  public static void biggestValue() {
    int biggest = numbers[0];
    int j = 1;
    while (j < numbers.length) {
      if (numbers[j] > biggest) {
        biggest = numbers[j];
      }
      j++;
    }
    System.out.println("Biggest number: " + biggest);
//    end while loop
  }

  public static void evenNumbers() {
    int evenCount = 0;
    int k = 0;
    do {
      if (numbers[k] % 2 == 0) {
        evenCount++;
      }
      k++;
    } while (k < numbers.length);
    System.out.println("Aantal even getallen: " + evenCount);
  }

  public static void evenNumbers2() {
    int evenCount = 0;
    int k = 0;
    while (k < numbers.length) {
      if (numbers[k] % 2 == 0) {
        evenCount++;
      }
      k++;
    }
    System.out.println("Aantal even getallen: " + evenCount);
  }

  public static void printOutAllValuesOfArray() {
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}