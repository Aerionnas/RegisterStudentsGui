import java.util.ArrayList;
public class StudentBody {
  private ArrayList<Student> studentList = new ArrayList<Student>();
  private String schoolName;

  public StudentBody(String school){
    this.schoolName = school;

  }

  public void addStudent(Student s)
  {
    this.studentList.add(s);
  }

  public void removeStudent(Student s){
    this.studentList.remove(s);
  }

  public ArrayList<Student> getList(){
    System.out.println(studentList);
    return studentList;
  }

  public void printStudents(){
    System.out.println("The students that attend "  +this.schoolName+" are:" );
    for(int i=0; i<studentList.size();i++){
      System.out.println(studentList.get(i));
    }
  }

  
  public static void main(String [] args){
    StudentBody newBody= new StudentBody("Brandeis");
    Student aeri= new Student("Aerionna","S10573","Sp2021");
    Student josue= new Student("Josue","S10563","Sp2021");
    Student steven= new Student("Steven","S10553","Sp2021");
    newBody.addStudent(aeri);
    newBody.addStudent(josue);
    newBody.addStudent(steven);
    newBody.printStudents();
  

  }

}
