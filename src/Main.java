import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Placement Eligibility Decision Engine");
    String name = sc.next();
    double percentage = sc.nextDouble();
    int backlogs = sc.nextInt();
    int graduationYear = sc.nextInt();
    System.out.println("Name: " + name);
    System.out.println("Percentage: " + percentage);
    System.out.println("Backlogs: " + backlogs);
    System.out.println("Graduation Year: " + graduationYear); 
  }
}
