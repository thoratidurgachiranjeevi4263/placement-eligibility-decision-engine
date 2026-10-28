public class Job {
  private String company;
  private String role;
  private double minimunPercentage;
  private int maximumBacklogs;
  private int requiredGraduationYear;
  public Job(String company, String role, double minimunPercentage, int maximumBacklogs, int requiredGraduationYear) {
    this.company = company;
    this.role = role;
    this.minimunPercentage = minimunPercentage;
    this.maximumBacklogs = maximumBacklogs;
    this.requiredGraduationYear = requiredGraduationYear;
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
}
