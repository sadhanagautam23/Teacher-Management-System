public class Lecturer extends Teacher
{    //declaring attributes                                               
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    //making constructor 
    public Lecturer( int teacher_id,String teacher_name,String address,String working_type,String employment_status,String department,int yearsOfExperience,int working_hours) {
        super(teacher_id,teacher_name,address, working_type,employment_status);//calling super class constructor
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        gradedScore = 0;
        hasGraded = false;
        setWorking_hours( working_hours);
    }
    //creating getter methods
    public String getDepartment() 
    {
        return this.department;
    }
    
    public int getGradedScore() 
    {
        return this.gradedScore;
    }
    
    public boolean getHasGraded()
    {
        return this.hasGraded;
    }
    
    public int getYearsOfExperience()
    {
        return this.yearsOfExperience;
    }
    //creating setter method
    public void setGradedScore(int gradedScore) 
    {
        this.gradedScore = gradedScore;
    }
    //making method for assigning grade
    public void gradeAssignment(int gradedScore,String department,int yearsOfExperience)
    {
        this.gradedScore = gradedScore;
        String grade = "not graded";
        if(yearsOfExperience >= 5 && this.department == department) {
            if(gradedScore >= 70) {
                grade = "A";
                hasGraded = true;
            }
            else if(gradedScore>=60 && gradedScore<70) {
                grade = "B";
                hasGraded = true;
            }
            else if(gradedScore>=50 && gradedScore<60) {
                grade = "C";
                hasGraded = true;
            }
            else if(gradedScore>=40 && gradedScore<50) {
                grade = "D";
                hasGraded = true;
            }
            else if(gradedScore<40){
                grade = "E";
                hasGraded = true;
            }
            else {
                System.out.println("Invalid input");
            }
            System.out.println("The graded score is "+ grade);
        }
    
        else {
            System.out.println("The student's grades are not graded ");
        }
    }
    
    @Override
    //making method to display/print
    public void display() {
        super.display();
        if(hasGraded == false) {
        System.out.println("the student's grades are not graded yet");
        }
        else {
            System.out.println("The lecturer works in "+department+" department");
            System.out.println("The lecturer has "+yearsOfExperience+" years of experience");
            System.out.println("The graded score is "+ gradedScore);
            
        }
    
    }
}
    