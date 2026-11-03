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
    System.out.println("Enter number of companies  :");
    int jobCount = sc.nextInt();
    Job[] jobs = new Job[jobCount];
    for(int i = 0; i < jobCount; i++) {
      System.out.println("Enter job details for job " + (i + 1) + ":");
      System.out.print("Company: ");
      String company = sc.next();
      System.out.print("Role: ");
      String role = sc.next();
      System.out.print("Minimum Percentage: ");
      double minimumPercentage = sc.nextDouble();
      System.out.print("Maximum Backlogs: ");
      int maximumBacklogs = sc.nextInt();
      System.out.print("Required Graduation Year: ");
      int requiredGraduationYear = sc.nextInt();
      System.out.print("Number of required skills: ");
      int requiredSkillCount = sc.nextInt();
      String[] requiredSkills = new String[requiredSkillCount];
      System.out.println("Enter required skills (one per line):");
      for (int j = 0; j < requiredSkillCount; j++) {
        requiredSkills[j] = sc.next();
      }
      jobs[i] = new Job(company, role, minimumPercentage, maximumBacklogs, requiredGraduationYear, requiredSkills);
    } 
    
    System.out.println();
    System.out.println("Available Jobs:");
    for (int i = 0; i < jobs.length; i++) {
      System.out.println((i + 1) + ". " + jobs[i].getCompany() + " - " + jobs[i].getRole());
    }
    System.out.print("Select a job by entering the corresponding number: ");
    int selectedJobIndex = sc.nextInt();
    Job selectedJob = jobs[selectedJobIndex - 1];

    System.out.println("----------------------------------------------------");
    System.out.println("Job Details:");
    System.out.println("Company: " + selectedJob.getCompany());
    System.out.println("Role: " + selectedJob.getRole());
    System.out.println("Minimum Percentage: " + selectedJob.getMinimumPercentage());
    System.out.println("Maximum Backlogs: " + selectedJob.getMaximumBacklogs());
    System.out.println("Required Graduation Year: " + selectedJob.getRequiredGraduationYear());
    System.out.print("Required Skills: ");
    for (String skill : selectedJob.getRequiredSkills()) {
      System.out.print(skill + " ");
    }
    System.out.println();

   EligibilityChecker checker = new EligibilityChecker();
    System.out.println("=====================================================");
    System.out.println("Placement Eligibility Result:");
    System.out.println("======================================================");
    System.out.println("Name: " + candidate.getName());
    System.out.println("Company: " + selectedJob.getCompany());
    System.out.println("Role: " + selectedJob.getRole());
    System.out.println();
    boolean eligible = checker.evaluate(candidate, selectedJob);
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
