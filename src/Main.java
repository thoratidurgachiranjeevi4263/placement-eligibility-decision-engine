import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Placement Eligibility Decision Engine");
    System.out.println("Enter candidate details:");
    System.out.print("Name: ");
    String name = sc.next();
    System.out.print("Percentage: ");
    double percentage = sc.nextDouble();
    System.out.print("Backlogs: ");
    int backlogs = sc.nextInt();
    System.out.print("Graduation Year: ");
    int graduationYear = sc.nextInt();
    Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);
    System.out.println("----------------------------------------------------");
    System.out.println("Candidate Details:");
    System.out.println("Name: " + candidate.getName());
    System.out.println("Percentage: " + candidate.getPercentage());
    System.out.println("Backlogs: " + candidate.getBacklogs());
    System.out.println("Graduation Year: " + candidate.getGraduationYear());


    Job job = new Job("Infosys", "Software Engineer", 70.0, 0, 2026);
    System.out.println("----------------------------------------------------");
    System.out.println("Job Details:");
    System.out.println("Company: " + job.getCompany());
    System.out.println("Role: " + job.getRole());
    System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
    System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
    System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());

    boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();
    boolean backlogsPass = candidate.getBacklogs() <= job.getMaximumBacklogs();
    boolean graduationYearPass = candidate.getGraduationYear() == job.getRequiredGraduationYear();
    boolean isEligible = percentagePass && backlogsPass && graduationYearPass;
    System.out.println("=====================================================");
    System.out.println("Eligibility Result:");
    System.out.println("======================================================");
    System.out.println("Name: " + candidate.getName());
    System.out.println("Company: " + job.getCompany());
    System.out.println("Role: " + job.getRole());
    System.out.println();
    if(percentagePass) {
      System.out.println("Percentage: PASS");
    } else {
      System.out.println("Percentage: FAIL");
    }
    if(backlogsPass) {
      System.out.println("Backlogs: PASS");
    } else {
      System.out.println("Backlogs: FAIL");
    }
    if(graduationYearPass) {
      System.out.println("Graduation Year: PASS");
    } else {
      System.out.println("Graduation Year: FAIL");
    }
    System.out.println();
    if(isEligible) {
      System.out.println("Final Result: ELIGIBLE");
    } else {
      System.out.println("Final Result: NOT ELIGIBLE");
    }
    System.out.println("======================================================");
  }
}
