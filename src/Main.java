import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Placement Eligibility Decision Engine");
    System.out.println("Enter candidate details:");
    String name = sc.next();
    double percentage = sc.nextDouble();
    int backlogs = sc.nextInt();
    int graduationYear = sc.nextInt();
    Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);
    System.out.println("Name: " + candidate.getName());
    System.out.println("Percentage: " + candidate.getPercentage());
    System.out.println("Backlogs: " + candidate.getBacklogs());
    System.out.println("Graduation Year: " + candidate.getGraduationYear());
  }
}
