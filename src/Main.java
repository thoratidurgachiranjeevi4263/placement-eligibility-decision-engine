import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Placement Eligibility Decision Engine");
    System.out.println("Enter candidate details");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Percentage: ");
    double percentage = sc.nextDouble();
    System.out.print("Backlogs: ");
    int backlogs = sc.nextInt();
    System.out.print("Graduation Year: ");
    int graduationYear = sc.nextInt();
    System.out.print("Number of skills: ");
    int skillCount = sc.nextInt();
    String[] skills = new String[skillCount];
    System.out.println("Enter skills (one per line):");
    for (int i = 0; i < skillCount; i++) {
      skills[i] = sc.next();
    }

    Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear, skills);
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

   EligibilityChecker checker = new EligibilityChecker();
    System.out.println("=====================================================");
    System.out.println("Placement Eligibility Result:");
    System.out.println("======================================================");
    System.out.println("Name: " + candidate.getName());
    System.out.println("Company: " + job.getCompany());
    System.out.println("Role: " + job.getRole());
    System.out.println();
    boolean eligible = checker.evaluate(candidate, job);
    System.out.println();
    if(eligible) {
      System.out.println("Final Result: ELIGIBLE");
    } else {
      System.out.println("Final Result: NOT ELIGIBLE");
    }
    System.out.println("======================================================");
    sc.close();
  }
}
