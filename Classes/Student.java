package gradebook.application.logic;

import java.util.ArrayList;

public class Student {
    private String fullName, address;
    private String birthday, indexNo;
    private String phoneNo, parentName;
    private String gender;
    private String grade, classroom, bloodGroup;
    private String photoPath;
    
    ArrayList<String> errorFields = new ArrayList<String>();
    
     Database database = new Database();

    public Student(String fullName, String address, String birthday, String indexNo, 
            String phoneNo, String parentName, String gender, String grade, String classroom, String bloodGroup, String photoPath) {
        this.fullName = fullName;
        this.address = address;
        this.birthday = birthday;
        this.indexNo = indexNo;
        this.phoneNo = phoneNo;
        this.parentName = parentName;
        this.gender = gender;
        this.grade = grade;
        this.classroom = classroom;
        this.bloodGroup = bloodGroup;
        this.photoPath = photoPath;
        
        
        // Data Validation
        emptyCheck(fullName, "Full Name");
        emptyCheck(address, "Address");
        emptyCheck(birthday, "Birthday");
        indexNoValidation(indexNo);
        emptyCheck(phoneNo, "Phone");
        emptyCheck(parentName, "Parent Name");
        emptyCheck(gender, "Gender");
        
        if(grade.equals("Select"))
            errorFields.add("Grade");
        
        if(classroom.equals("Select"))
            errorFields.add("Class");
        
        if(bloodGroup.equals("Select"))
            errorFields.add("Blood Group");         
    }
    
    private void indexNoValidation(String indexNo) {
        if(indexNo.isEmpty())
            errorFields.add("Index No");
        else {
           
            String sql = "select exists(select * from students where Index_No = '"+indexNo+"') as count";
            String[] columns = {"count"};
            String[] array = database.getData(sql, columns);  //if there is a similar index no array will have a value of 1, if not 0
            
            if(array[0].equals("1"))
                errorFields.add("Index No");
        }
            
    }
    
    private void emptyCheck(String data, String error) {
        if(data.isEmpty())
            errorFields.add(error);
    }
    
    
    public boolean errorsDetected() {
        if(errorFields.isEmpty()) {
            insertData();
            return false;
        }
        
        return true;
    }
    
    private void insertData() {
        String sql = "INSERT INTO `students`(Index_No, Full_Name, Address, Birthday, Phone_No, Parent_Name, Gender, Grade, Class, Blood_Group, Photo_Path) "
                + "VALUE ('"+indexNo+"','"+fullName+"','"+address+"','"+birthday+"', '"+phoneNo+"', '"+parentName+"', '"+gender+"'"
                + ", '"+grade+"', '"+classroom+"', '"+bloodGroup+"', '"+photoPath+"')";
        database.updateData(sql);
    }

    public ArrayList<String> getErrorFields() {
        return errorFields;
    }
    
    
}
