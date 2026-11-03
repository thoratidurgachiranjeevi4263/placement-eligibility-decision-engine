# Placement Eligibility Decision Engine

A small Java console application that checks whether a candidate meets a selected job's placement requirements.

## Features

- Collects a candidate's name, percentage, backlogs, graduation year, and skills.
- Lets you enter multiple companies' job requirements and choose a job to evaluate.
- Checks four rules and prints each result:
  - Candidate percentage is at least the job's minimum.
  - Candidate backlogs do not exceed the job's maximum.
  - Candidate graduation year matches the required year.
  - Candidate has every required skill (skill matching ignores letter case).
- Prints a final `ELIGIBLE` or `NOT ELIGIBLE` result.

## Requirements

- Java Development Kit (JDK) installed, with `javac` and `java` available on your command line.

Check your installation with:

```text
javac -version
java -version
```

## Compile and run

Run these commands from the project root:

```sh
javac -d out src/*.java
java -cp out Main
```

The compiled classes are placed in `out/`; the source files remain in `src/`.

## Using the program

Enter the candidate details when prompted, then enter the number of jobs. For each job, provide its company, role, minimum percentage, maximum backlogs, required graduation year, and required skills. Finally, select a job by its displayed number.

Names and skills for the candidate can include spaces in the name, but company names, role names, and individual skills are read as single words.

## Project structure

```text
src/
  Main.java              Console input and output
  Candidate.java         Candidate data and skill lookup
  Job.java               Job requirements
  EligibilityChecker.java Applies all eligibility rules
  EligibilityRule.java   Base type for eligibility rules
  PercentageRule.java
  BacklogRule.java
  GraduationYear.java
  SkillRule.java
```
