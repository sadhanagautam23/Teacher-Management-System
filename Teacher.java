public class Teacher
{
    //declaring attributes
    private int teacher_id;
    private String teacher_name;
    private String address; 
    private String working_type; 
    private String employment_status; 
    private int working_hours;
    //making constructor
    public Teacher(int teacher_id,String teacher_name,String address,String working_type,String employment_status){//creating constructor
        this.teacher_id = teacher_id;//inisilizing the instance variable teacher_id of this class 
        this.teacher_name = teacher_name;//inisilizing the instance variable teacher_name of this class 
        this.address = address;//inisilizing the instance variable address of this class 
        this.working_type = working_type;//inisilizing the instance variable working_type of this class 
        this.employment_status = employment_status;//inisilizing the instance variable employment_status of this class 
    }
    
    public int getTeacher_id()
    {//creating/declaring a getter method for teacher_id 
         return this.teacher_id;
    }
    
    public String getTeacher_name()
    {//creating/declaring a getter method for teacher_name
         return this.teacher_name;
    }
    
    public String getAddress()
    {//creating/declaring a getter method for address
         return this.address;
    }
    
    public String getWorking_type() 
    {//creating/declaring a getter method for working_type
         return this.working_type;
    }
    
    public String getEmployment_status() 
    {//creating/declaring a getter method for employment_status
         return this.employment_status;
    }
    
    public int getWorking_hours() 
    {//creating/declaring a getter method for working_hours
         return this.working_hours;
    }
    
    public void setWorking_hours(int working_hours) 
    {//creating/declaring a setter method for working_hours
         this.working_hours = working_hours;
    }
    
    public void display()//creating method named display
    {
        System.out.println("Id of the teacher is " + teacher_id );//printing teacher_id
        System.out.println("The name of the teacher is " + teacher_name );//printing teacher_name
        System.out.println("the teacher lives in "+ address);//printing address
        System.out.println("the teacher is working " + working_type);//printing working_type
        System.out.println("The teacher is "+employment_status );//printing employment_status
        if(working_hours == 0) {//using if statement to execute the code of the condition is met
             System.out.println("The working hours is not assigned");//printing 
        }
        else{
            System.out.println("The working hour of teacher is "+working_hours);
        }
    }
}
