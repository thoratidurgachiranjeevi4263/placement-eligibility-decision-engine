public class SkillRule extends EligibilityRule {
  @Override 
  public String getRuleName() {
    return "Skills";
  }
  @Override 
  public boolean check(Candidate candidate, Job job) {
    String[] requiredSkills = job.getRequiredSkills();
    for (String skill : requiredSkills) {
      if (!candidate.hasSkill(skill)) {
        return false;
      }
    }
    return true;
  }
  
}
