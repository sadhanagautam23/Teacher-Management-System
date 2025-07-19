public class Tutor extends Teacher
{   //declaring attributes
    private  double salary;
    private String specialization;
    private String academic_qualifications;
    private int performance_index;
    private boolean is_certified ;
    //creating constructor 
    public Tutor( int teacher_id,String teacher_name,String address,String working_type,String employment_status,int working_hours,double salary, String specialization,String academic_qualifications,int performance_index)
    {
       super(teacher_id,teacher_name,address, working_type,employment_status);//calling super class cons
       this.salary = salary;
       this.specialization = specialization;
       this.academic_qualifications = academic_qualifications;
       this.performance_index = performance_index;
       is_certified = false;
       setWorking_hours(working_hours);
       
       
    }
   //creating getter method
    public double getSalary()
    {
        return this.salary;
    }
    
    public String getSpecialization()
    {
        return this.specialization;
    }
    
    public String getAcademic_qualifications()
    {
        return this.academic_qualifications;
    }
    
    public double getPerformance_index()
    {
        return this.performance_index;
    }
    
    public boolean getIs_certified()
    {
        return this.is_certified;
    }
    //creating setter method
    public void setSalary(double salary,int performance_index)
    {
        if(performance_index > 5 && getWorking_hours() > 20){//if clause 
         if(performance_index >= 5 && performance_index <= 7){//neated if
                this.salary = salary+(salary * 0.05d );
                is_certified = true;
            }
            else if(performance_index >= 8 && performance_index >= 9){
                this.salary = salary+(salary * 0.1d);
                is_certified = true;
            }
            else if(performance_index == 10) {
                this.salary = salary+(salary * 0.2d);
                is_certified = true;
            }
            else{
               System.out.println("the performance index is not valid");
            }
        }
        else{
            System.out.println("Salary cannot be approved");
        }
    }
    //creating method to remove tutor
    public void removeTutor()
    {
        if(is_certified != true){
            salary = 0.0;
            performance_index = 0;
            specialization = null;
            academic_qualifications = null;
            is_certified = false;
            System.out.println("Tutor is removed");
        }
         else{
             System.out.println("tutor cannot be removed");
        }
    }
    
    @Override 
    //creating display method to display/print
    public void display()
    {
         if(is_certified == false){
             super.display();//calling display method of parent class
         }
         else{
             super.display();
             System.out.println("The tutor has specialization in "+specialization);
             System.out.println( "the tutors's academic qualification is "+academic_qualifications);
             System.out.println(" the tutor has salary of  "+ salary+" NRS");
             System.out.println( "the tutor's perfomance index is "+performance_index);
         }
    }
}