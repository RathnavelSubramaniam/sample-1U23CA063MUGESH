import java.util.Scanner;

class sample {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

    System.out.println("Enter the integer value:");
    System.out.println("Enter the double value:");
    System.out.println("Enter the string value:");

    String name = Sc.nextLine();
    int age = Sc.nextInt();
    double salary = Sc.nextDouble();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}