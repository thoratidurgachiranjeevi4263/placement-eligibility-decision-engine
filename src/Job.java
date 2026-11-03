public class Job {
  private String company;
  private String role;
  private double minimunPercentage;
  private int maximumBacklogs;
  private int requiredGraduationYear;
  private String[] requiredSkills;
  public Job(String company, String role, double minimunPercentage, int maximumBacklogs, int requiredGraduationYear, String[] requiredSkills) {
    this.company = company;
    this.role = role;
    this.minimunPercentage = minimunPercentage;
    this.maximumBacklogs = maximumBacklogs;
    this.requiredGraduationYear = requiredGraduationYear;
    this.requiredSkills = requiredSkills;
  }
  public String getCompany() {
    return company;
  }
  public String getRole() {
    return role;
  }
  public double getMinimumPercentage() {
    return minimunPercentage;
  }
  public int getMaximumBacklogs() {
    return maximumBacklogs;
  }
  public int getRequiredGraduationYear() {
    return requiredGraduationYear;
  }
  public String[] getRequiredSkills() {
    return requiredSkills;
  }
}
