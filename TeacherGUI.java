//import the necessary components 
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Image;

public class TeacherGUI implements ActionListener
{
    //declare the necessary attributes
    private ArrayList<Teacher> al;
    private JFrame frame1;
    private JPanel panel1,panel2;
    private JLabel title1,title2,lecturer,tutor,teacherId1,teacherName1,address1,workingType1,employmentStatus1,workingHours1,teacherId2,
    teacherName2,address2,workingType2,employmentStatus2,workingHours2,department,yearsOfExperience,
    gradedScore,salary,specialization,academicQualifications,performanceIndex; 
    private JTextField teacherIdTf1,teacherNameTf1,addressTf1,workingTypeTf1,employmentStatusTf1,workingHoursTf1,teacherIdTf2,
    teacherNameTf2,addressTf2,workingTypeTf2,employmentStatusTf2,workingHoursTf2,yearsOfExperienceTf,
    gradedScoreTf,salaryTf,academicQualificationsTf,performanceIndexTf;
    private JButton titleLecturer,titleTutor,addLecturer,addTutor,gradeAssignments,tutorSalary,removeTutor,display1,clear1,
    display2,clear2;
    private JComboBox comboDepartment,comboSpecialization;
    public TeacherGUI(){
        //create object of the components
        al = new ArrayList<Teacher>();
        frame1 = new JFrame("Form1");
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        title1 = new JLabel("Welcome To Our System!!!");
        title1.setFont(new Font("Times New Roman",Font.PLAIN,30));
        title2 = new JLabel("Make a choice:");
        title2.setFont(new Font("Lucida Fax",Font.PLAIN,20));
        lecturer = new JLabel("Lecturer");
        lecturer.setFont(new Font("Times New Roman",Font.PLAIN,30));
        tutor = new JLabel("Tutor");
        tutor.setFont(new Font("Times New Roman",Font.PLAIN,30));
        teacherId1 = new JLabel("TeacherID");
        teacherName1 = new JLabel("Teacher Name");
        address1 = new JLabel("Address");
        workingType1 = new JLabel("Working Type");
        employmentStatus1 = new JLabel("Employment Status");
        workingHours1 = new JLabel("Working Hours");
        teacherId2 = new JLabel("TeacherID");
        teacherName2 = new JLabel("Teacher Name");
        address2 = new JLabel("Address");
        workingType2 = new JLabel("Working Type");
        employmentStatus2 = new JLabel("Employment Status");
        workingHours2 = new JLabel("Working Hours");
        
        department = new JLabel("Department");
        yearsOfExperience = new JLabel("Years Of Experience");
        gradedScore = new JLabel("Graded Score");
        
        
        salary = new JLabel("Salary");
        specialization= new JLabel("Specialization");
        academicQualifications = new JLabel("Academic Qualifications");
        performanceIndex = new JLabel("Performance Index");
        
        
        teacherIdTf1 = new JTextField();
        
        teacherNameTf1 = new JTextField();
        addressTf1 = new JTextField();
        workingTypeTf1 = new JTextField();
        employmentStatusTf1 = new JTextField();
        workingHoursTf1 = new JTextField();
        teacherIdTf2 = new JTextField();
        teacherNameTf2 = new JTextField();
        addressTf2 = new JTextField();
        workingTypeTf2 = new JTextField();
        employmentStatusTf2 = new JTextField();
        workingHoursTf2 = new JTextField();
        String[] list = {"Medical","IT","Business","Mathmatics","Political Science","Pcycology"};
        comboDepartment= new JComboBox<String>(list);
        yearsOfExperienceTf = new JTextField();
        gradedScoreTf = new JTextField();
        salaryTf = new JTextField();
        String[] list2 = {"Java","Networking","Business","Multimedia","AI"};
        comboSpecialization = new JComboBox<String>(list2);
        academicQualificationsTf = new JTextField();
        performanceIndexTf = new JTextField();
        
        addLecturer = new JButton("Add Lecturer");
        ImageIcon image = new ImageIcon("./image/pic_lecturer.png");
        addLecturer.setIcon(new ImageIcon(image.getImage().getScaledInstance(165, -1, Image.SCALE_SMOOTH)));
        
        
        gradeAssignments = new JButton("Grade Assignments");
        ImageIcon image2 = new ImageIcon("./image/pic_grade.png");
        gradeAssignments.setIcon(new ImageIcon(image2.getImage().getScaledInstance(165, -1, Image.SCALE_SMOOTH)));
        
        addTutor = new JButton("Add tutor");
        ImageIcon image5 = new ImageIcon("./image/pic_tutor.png");
        addTutor.setIcon(new ImageIcon(image5.getImage().getScaledInstance(165, -1, Image.SCALE_SMOOTH)));
        
        tutorSalary = new JButton("Set the salary of Tutor");
        ImageIcon image6 = new ImageIcon("./image/pic_salary.png");
        tutorSalary.setIcon(new ImageIcon(image6.getImage().getScaledInstance(170, -1, Image.SCALE_SMOOTH)));
        
        removeTutor = new JButton("Remove the tutor");
        ImageIcon image7 = new ImageIcon("./image/pic_remove.png");
        removeTutor.setIcon(new ImageIcon(image7.getImage().getScaledInstance(165, -1, Image.SCALE_SMOOTH)));
        
        
        display1 = new JButton("Display");
        ImageIcon image3 = new ImageIcon("./image/pic_display.png");
        display1.setIcon(new ImageIcon(image3.getImage().getScaledInstance(160, -1, Image.SCALE_SMOOTH)));
        
        clear1 = new JButton("Clear");
        ImageIcon image4 = new ImageIcon("./image/pic_clear.png");
        clear1.setIcon(new ImageIcon(image4.getImage().getScaledInstance(160, -1, Image.SCALE_SMOOTH)));
        
        display2 = new JButton("Display");
        ImageIcon image8 = new ImageIcon("./image/pic_display2.png");
        display2.setIcon(new ImageIcon(image8.getImage().getScaledInstance(160, -1, Image.SCALE_SMOOTH)));
        
        clear2 = new JButton("Clear");
        ImageIcon image9 = new ImageIcon("./image/pic_clear2.png");
        clear2.setIcon(new ImageIcon(image9.getImage().getScaledInstance(160, -1, Image.SCALE_SMOOTH)));
        
        titleLecturer = new JButton("Lecturer");
        ImageIcon image10 = new ImageIcon("./image/choose_lec.png");
        titleLecturer.setIcon(new ImageIcon(image10.getImage().getScaledInstance(230, -1,Image.SCALE_SMOOTH)));
        
        titleTutor = new JButton("Tutor");
        ImageIcon image11 = new ImageIcon("./image/choose_tutor.png");
        titleTutor.setIcon(new ImageIcon(image11.getImage().getScaledInstance(230, -1,Image.SCALE_SMOOTH)));
        
        /*set bounds of all the components */
        lecturer.setBounds(200,10,150,30);
        teacherId1.setBounds(50, 50, 150, 30);
        teacherName1.setBounds(50, 100, 150, 30);
        address1.setBounds(50, 150, 150, 30);
        workingType1.setBounds(50, 200, 150, 30);
        employmentStatus1.setBounds(50, 250, 150, 30);
        department.setBounds(50, 300, 150, 30);
        yearsOfExperience.setBounds(50, 350, 150, 30);
        workingHours1.setBounds(50, 400, 150, 30);
        gradedScore.setBounds(50, 450, 150, 30);
        
        tutor.setBounds(200,10,150,30);
        teacherId2.setBounds(50, 50, 150, 30);
        teacherName2.setBounds(50, 100, 150, 30);
        address2.setBounds(50, 150, 150, 30);
        workingType2.setBounds(50, 200, 150, 30);
        employmentStatus2.setBounds(50, 250, 150, 30);
        workingHours2.setBounds(50, 300, 150, 30);
        salary.setBounds(50, 350, 150, 30);
        specialization.setBounds(50, 400, 150, 30);
        academicQualifications.setBounds(50, 450, 150, 30);
        performanceIndex.setBounds(50, 500, 150, 30);
        
        teacherIdTf1.setBounds(200, 50, 150, 30);
        teacherNameTf1.setBounds(200, 100, 150, 30);
        addressTf1.setBounds(200, 150, 150, 30);
        workingTypeTf1.setBounds(200, 200, 150, 30);
        employmentStatusTf1.setBounds(200, 250, 150, 30);
        comboDepartment.setBounds(200, 300, 150, 30);
        yearsOfExperienceTf.setBounds(200, 350, 150, 30);
        workingHoursTf1.setBounds(200, 400, 150, 30);
        gradedScoreTf.setBounds(200, 450, 150, 30);
        
        teacherIdTf2.setBounds(200, 50, 150, 30);
        teacherNameTf2.setBounds(200, 100, 150, 30);
        addressTf2.setBounds(200, 150, 150, 30);
        workingTypeTf2.setBounds(200, 200, 150, 30);
        employmentStatusTf2.setBounds(200, 250, 150, 30);
        workingHoursTf2.setBounds(200, 300, 150, 30);
        salaryTf.setBounds(200, 350, 150, 30);
        comboSpecialization.setBounds(200, 400, 150, 30);
        academicQualificationsTf.setBounds(200, 450, 150, 30);
        performanceIndexTf.setBounds(200, 500, 150, 30);
        
        addLecturer.setBounds(400, 50, 150, 35);
        gradeAssignments.setBounds(400, 100, 150, 38);
        display1.setBounds(400, 150, 150, 38);
        clear1.setBounds(400, 200, 150, 38);
        
        addTutor.setBounds(400, 50, 150, 38);
        tutorSalary.setBounds(400, 100, 150, 38);
        removeTutor.setBounds(400, 150, 150, 38);
        display2.setBounds(400, 200, 150, 38);
        clear2.setBounds(400, 250, 150, 38);
        /*add lecturer components to panel1*/
        panel1.add(lecturer);
        panel1.add(teacherId1);
        panel1.add(teacherName1);
        panel1.add(address1);
        panel1.add(workingType1);
        panel1.add(employmentStatus1);
        panel1.add(workingHours1);
        panel1.add(department);
        panel1.add(yearsOfExperience);
        panel1.add(gradedScore);
       
        
        
        panel1.add(teacherIdTf1);
        panel1.add(teacherNameTf1);
        panel1.add(addressTf1);
        panel1.add(workingTypeTf1);
        panel1.add(employmentStatusTf1);
        panel1.add(comboDepartment);
        panel1.add(yearsOfExperienceTf);
        panel1.add(gradedScoreTf);
        panel1.add(workingHoursTf1);
        
        panel1.add(addLecturer);
        panel1.add(gradeAssignments);
        panel1.add(display1);
        panel1.add(clear1);
        /*add tutor objects to panel2*/
        panel2.add(tutor);
        panel2.add(teacherIdTf2);
        panel2.add(teacherNameTf2);
        panel2.add(addressTf2);
        panel2.add(workingTypeTf2);
        panel2.add(employmentStatusTf2);
        panel2.add(workingHoursTf2);
        panel2.add(salaryTf);
        panel2.add(comboSpecialization);
        panel2.add(academicQualificationsTf);
        panel2.add(performanceIndexTf);
    
        panel2.add(teacherId2);
        panel2.add(teacherName2);
        panel2.add(address2);
        panel2.add(workingType2);
        panel2.add(employmentStatus2);
        panel2.add(workingHours2);
        panel2.add(salary);
        panel2.add(specialization);
        panel2.add(academicQualifications);
        panel2.add(performanceIndex);
        
        panel2.add(addTutor);
        panel2.add(tutorSalary);
        panel2.add(removeTutor);
        panel2.add(display2);
        panel2.add(clear2);
        /*attaching action listeners to the "titleLecturer" and "titleTutor" buttons.When thesebuttons are clicked,
         corresponding actions are triggered, such as displaying the panel for adding lecturers or tutors.*/
        addLecturer.addActionListener(this);
        addTutor.addActionListener(this);
        gradeAssignments.addActionListener(this);
        tutorSalary.addActionListener(this);
        removeTutor.addActionListener(this);
        display1.addActionListener(this);
        clear1.addActionListener(this);
        display2.addActionListener(this);
        clear2.addActionListener(this);
        
        /*set bounds of panel1 and panel2*/
        panel1.setBounds(100, 140, 580, 550);
        panel1.setLayout(null);//setting layout to null
        panel1.setVisible(false);
        panel2.setBounds(100, 140, 580, 550);
        panel2.setLayout(null);
        panel2.setVisible(false);
         
        Color aColor = Color.decode("#dde0ab");
        Color aColor2 = Color.decode("#dde0ab");
        panel1.setBackground(aColor);
        panel2.setBackground(aColor2);
        
        
        title1.setBounds(100,20,500,30);
        title2.setBounds(100,60,300,30);
        
        titleLecturer.setBounds(100,90,210,40);
        titleTutor.setBounds(400,90,210,40);
        
        frame1.add(title1);
        frame1.add(title2);
        
        frame1.add(titleLecturer);
        frame1.add(titleTutor);
        
        titleLecturer.addActionListener(this);
        titleTutor.addActionListener(this);
        
        //adding panel1 and panel2 tp frame1
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.setSize(800, 750);
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
    // Method for adding a new lecturer to the system
    public void addingLecturer()
    {
        /* Check if any required field is empty and display error message if found*/
        if (teacherIdTf1.getText().isEmpty()||teacherNameTf1.getText().isEmpty()||addressTf1.getText().isEmpty()||workingTypeTf1.getText().isEmpty()
          ||employmentStatusTf1.getText().isEmpty()||comboDepartment.getSelectedItem()== null||yearsOfExperienceTf.getText().isEmpty()||workingHoursTf1.getText().isEmpty()){
           JOptionPane.showMessageDialog(frame1, "Empty field found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                // Extract input values
                int teacherId = Integer.parseInt(teacherIdTf1.getText());
                String teacherName = teacherNameTf1.getText();
                String address = addressTf1.getText();
                String workingType = workingTypeTf1.getText();
                String employmentStatus = employmentStatusTf1.getText();
                String department = (String)comboDepartment.getSelectedItem();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceTf.getText());
                int workingHours = Integer.parseInt(workingHoursTf1.getText());
                //create a nwe lecturer object
                Lecturer obj1 = new Lecturer(teacherId,teacherName,address,workingType,employmentStatus,department,yearsOfExperience,workingHours);
                boolean add = true;
                // Check if the lecturer ID already exists
                for(Teacher each : al){
                    if(each instanceof Lecturer ){
                        if(teacherId == each.getTeacher_id()){
                        add = false;
                        break;
                       }
                    } 
                }
                // Add the lecturer to the list if it's not already added
                if (al.isEmpty()||add == true){
                        al.add(obj1);
                        JOptionPane.showMessageDialog(frame1, "Lecturer is added", "Info", JOptionPane.INFORMATION_MESSAGE);
                        action_clear1();
                    }
                else {
                        JOptionPane.showMessageDialog(frame1, "This ID has already been used.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            
        }
         catch(NumberFormatException e){
             JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
        }
       }
        
        
    }
    // Method for adding a new tutor to the system
    public void addingTutor()
    {
       /* Check if any required field is empty and display error message if found*/
        if(teacherIdTf2.getText().isEmpty()||teacherNameTf2.getText().isEmpty()||addressTf2.getText().isEmpty()||workingTypeTf2.getText().isEmpty()
          ||employmentStatusTf2.getText().isEmpty()||workingHoursTf2.getText().isEmpty()||salaryTf.getText().isEmpty()||comboSpecialization.getSelectedItem()== null||
          academicQualificationsTf.getText().isEmpty()||performanceIndexTf.getText().isEmpty()){
              JOptionPane.showMessageDialog(frame1, "Empty field found", "Error", JOptionPane.ERROR_MESSAGE);
          }
        else{
          try{
                int teacherId = Integer.parseInt(teacherIdTf2.getText());
                String teacherName = teacherNameTf2.getText();
                String address = addressTf2.getText();
                String workingType = workingTypeTf2.getText();
                String employmentStatus = employmentStatusTf2.getText();
                int workingHours = Integer.parseInt(workingHoursTf2.getText());
                double salary = Double.parseDouble(salaryTf.getText());
                String specialization = (String)comboSpecialization.getSelectedItem();
                String academicQualifications = academicQualificationsTf.getText();
                int performanceIndex = Integer.parseInt(performanceIndexTf.getText());
                // Create a new Tutor object
                Tutor obj1 = new Tutor(teacherId,teacherName,address,workingType,employmentStatus,workingHours,salary,specialization,academicQualifications,performanceIndex); 
                boolean add = true;
                // Check if the tutor ID already exists
                for(Teacher each : al){
                    if(each instanceof Tutor && teacherId == each.getTeacher_id()){
                        add = false;
                        break;
                    }
                }
                /*Add the tutor to the list if it's not already added*/
                if (al.isEmpty()||add == true){
                    al.add(obj1);
                    JOptionPane.showMessageDialog(frame1, "Tutor is added", "Info", JOptionPane.INFORMATION_MESSAGE);
                    action_clear2();
                }
                else {
                    JOptionPane.showMessageDialog(frame1, "This ID has already been used.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                    
            }
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
    /* Method to assign grades to assignments for a lecturer*/
    public void gradeAssignments_button()
    {
        //checking empty fields
        if(teacherIdTf1.getText().isEmpty()||comboDepartment.getSelectedItem()== null||yearsOfExperienceTf.getText().isEmpty()||gradedScoreTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Empty field found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                //get input values
                int teacherId = Integer.parseInt(teacherIdTf1.getText());
                String department = (String)comboDepartment.getSelectedItem();
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceTf.getText());
                int gradedScore = Integer.parseInt(gradedScoreTf.getText());
                boolean lecturerFound = false;
                // Check if the lecturer with the provided ID exists
                for(Teacher each : al){
                  if(each instanceof Lecturer && teacherId == each.getTeacher_id()){
                     lecturerFound = true;
                     Lecturer lecturer = (Lecturer) each;
                     lecturer.gradeAssignment(gradedScore,department,yearsOfExperience);
                     JOptionPane.showMessageDialog(frame1, "grade assignment button is clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
                     action_clear1();
                     break;
                    
                    }
                }
                /*Display error message if lecturer with provided ID is not found*/
                if (lecturerFound == false) {
                   JOptionPane.showMessageDialog(frame1, "Lecturer with the provided ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            /*catch block to handle number format exception*/
          catch(NumberFormatException e){
             JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
          }
         
        }
    }
    // Method to set salary for a tutor
    public void setSalary_button()
    {
        // Check for empty fields
        if(teacherIdTf2.getText().isEmpty()||performanceIndexTf.getText().isEmpty()||salaryTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Empty field found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                int teacherId = Integer.parseInt(teacherIdTf2.getText());
                int performanceIndex = Integer.parseInt(performanceIndexTf.getText());
                double salary = Double.parseDouble(salaryTf.getText());
                boolean tutorFound = false;
                // Check if the tutor with the provided ID exists
                for(Teacher each : al){
                  if(each instanceof Tutor && teacherId == each.getTeacher_id()){
                    tutorFound = true;
                    Tutor tutor = (Tutor) each;
                    tutor.setSalary( salary,performanceIndex);
                    // Set salary for the tutor
                    JOptionPane.showMessageDialog(frame1, "Setsalary button is clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
                    action_clear2();
                  }
                  
                }
                // Display error message if tutor with provided ID is not found
                if(tutorFound == false){
                      JOptionPane.showMessageDialog(frame1, "Tutor doesnot have this object.", "Error", JOptionPane.ERROR_MESSAGE);
                  }
             }
             /*catch block to handle number format exception*/
            catch(NumberFormatException e){
             JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
             }
        }
    }
    // Method to remove a tutor
    public void remove_button()
    {
        // Check for empty teacher ID field
        if(teacherIdTf2.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Empty field found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                // Extract teacher ID
                int teacherId = Integer.parseInt(teacherIdTf2.getText());
                boolean tutorFound = false;
                // Search for the tutor with the provided ID
                for(Teacher each : al){
                  if(each instanceof Tutor && teacherId == each.getTeacher_id()){
                     tutorFound = true;
                     Tutor tutor = (Tutor) each;
                     tutor.removeTutor();// Remove the tutor
                     JOptionPane.showMessageDialog(frame1, "remove tutor button is clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
                     action_clear2();
                  }
                }
                // Display error message if tutor with provided ID is not found
                if(tutorFound == false){
                      JOptionPane.showMessageDialog(frame1, "Tutor doesnot have this object.", "Error", JOptionPane.ERROR_MESSAGE);
                  }
            }
            /*catch block to handle NumberFormatException*/
            catch(NumberFormatException e){
             JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
           }
        }
    }
    /*Method to display information of a tutor*/
    public void displayTutor()
    {
         if(teacherIdTf2.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Empty field found.Enter teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
               int teacherId = Integer.parseInt(teacherIdTf2.getText());
               boolean tutorFound = false;
                // Search for the tutor with the provided ID
               for(Teacher each : al){
                     if(each instanceof Tutor && teacherId == each.getTeacher_id() ){
                          
                            tutorFound = true;
                            Tutor tutor = (Tutor)each;
                            tutor.display();
                            JOptionPane.showMessageDialog(frame1, "Display Tutor button is pressed", "Info",JOptionPane.INFORMATION_MESSAGE);
                            action_clear2();
                        }
                }   
               if (tutorFound == false){
                        
                        JOptionPane.showMessageDialog(frame1, "This ID is not found", "Error",JOptionPane.ERROR_MESSAGE);
                       
               }
            }
            /*catch block to handle number format exception*/
            catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    // Method to display information of a lecturer
    public void displayLecturer()
    {
        // Check for empty teacher ID field
         if(teacherIdTf1.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame1, "Empty field found", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
               int teacherId = Integer.parseInt(teacherIdTf1.getText());
               boolean lecturerFound = false;
               for(Teacher each : al){
                     if(each instanceof Lecturer && teacherId == each.getTeacher_id() ){
                          
                            lecturerFound = true;
                            Lecturer lecturer = (Lecturer)each;
                            lecturer.display();
                            JOptionPane.showMessageDialog(frame1, "Display Lecturer button is pressed", "Info",JOptionPane.INFORMATION_MESSAGE);
                            action_clear1();
                        }
               }   
               if (lecturerFound == false){
                        
                        JOptionPane.showMessageDialog(frame1, "This ID is not found", "Error",JOptionPane.ERROR_MESSAGE);
                       
               }
            }
            /*catch block to handle number format exception*/
            catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(frame1, "Incorrect datatype.Enter the data of correct datatype.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
     /* Method to clear input fields for lecturer*/
     public void action_clear1()
    {
        teacherIdTf1.setText("");
        teacherNameTf1.setText("");
        addressTf1.setText("");
        workingTypeTf1.setText("");
        employmentStatusTf1.setText("");
        //comboDepartment.setText("");
        yearsOfExperienceTf.setText("");
        gradedScoreTf.setText("");
        workingHoursTf1.setText("");
    }
    /* Method to clear input fields for tutor*/
    public void action_clear2()
    {
        teacherIdTf2.setText("");
        teacherNameTf2.setText("");
        addressTf2.setText("");
        workingTypeTf2.setText("");
        employmentStatusTf2.setText("");
        workingHoursTf2.setText("");
        salaryTf.setText("");
        //comboSpecialization.setText("");
        academicQualificationsTf.setText("");
        performanceIndexTf.setText("");
    }
    // Method to clear input fields for lecturer
    public void clear1()
    {
        JOptionPane.showMessageDialog(frame1,"Clear Lecturer button is clicked");
        teacherIdTf1.setText("");
        teacherNameTf1.setText("");
        addressTf1.setText("");
        workingTypeTf1.setText("");
        employmentStatusTf1.setText("");
        yearsOfExperienceTf.setText("");
        gradedScoreTf.setText("");
        workingHoursTf1.setText("");
    }
    // Method to clear input fields for tutor
    public void clear2()
    {
        JOptionPane.showMessageDialog(frame1,"Clear Tutor button is clicked");
        teacherIdTf2.setText("");
        teacherNameTf2.setText("");
        addressTf2.setText("");
        workingTypeTf2.setText("");
        employmentStatusTf2.setText("");
        workingHoursTf2.setText("");
        salaryTf.setText("");
        academicQualificationsTf.setText("");
        performanceIndexTf.setText("");
    }
    // Action performed method to handle button clicks
    public void actionPerformed(ActionEvent e)
    {
            /* Check which button is clicked and perform corresponding action*/
           if (e.getSource() == addLecturer){
                addingLecturer();
           }
           else if (e.getSource() == gradeAssignments){
                gradeAssignments_button();
           }
           else if(e.getSource() == display1){
                displayLecturer();
           }
           else if(e.getSource() == clear1){
                clear1();
           }  
           else if (e.getSource() == addTutor){
                addingTutor();
           }
           else if(e.getSource() == clear2){
                clear2();
           }
           else if(e.getSource() == tutorSalary ){
                setSalary_button();
           }
           else if(e.getSource() == removeTutor){
                remove_button();
           }
           else if(e.getSource() == display2){
                displayTutor();
           }
           else if(e.getSource() == titleTutor){
                panel2.setVisible(true);
                panel1.setVisible(false);
           }
           else if(e.getSource()== titleLecturer){
                panel1.setVisible(true);
                panel2.setVisible(false);
           }
    }
    /* Main method to instantiate the TeacherGUI object*/
    public static void main(String[] args)
    {
        TeacherGUI object = new TeacherGUI();
    }
}