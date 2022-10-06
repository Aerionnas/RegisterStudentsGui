

public class Student{
  private String name;
  private String sageID;
  private String graduationYear;

  public Student(String name, String sageID, String graduationYear){
    this.name = name;
    this.sageID = sageID;
    this.graduationYear = graduationYear;
  }
  public String getName(){
    return this.name;
  }
  public String getSageID(){
    return this.sageID;
  }
  public String getGraduationYr(){
    return this.graduationYear;
  }
  public String toString(){
    return "( Name: " + getName()+ " , Student ID:"+ getSageID() + " , Graduation Year: "+ getGraduationYr() + " )";
}
  public static void main(String [] args){

    Student[] newS= new Student[3];

    Student aeri= new Student("Aerionna","S10573","Sp2021");
    Student josue= new Student("Josue","S10563","Sp2021");
    Student steven= new Student("Steven","S10553","Sp2021");
  
    newS[0]=aeri;
    newS[1]=josue;
    newS[2]=steven;

    for(int i=0; i<newS.length; i++){
         System.out.println(newS[i].toString());
       }

  }
}


// class Registrar extends JPanel{
//   private static StudentBody students;
//
//   public Registrar()
//   {
//     students= new StudentBody("Brandeis");
//   }
//
//   public static void main (String [] args){
//   Registrar g= new Registrar();
//   JFrame window=new JFrame("Registrar");
//   JPanel center= new JPanel();
//   JPanel bottom= new JPanel();
//   JPanel main= new JPanel();
//   JLabel name = new JLabel("name");
//   JLabel sage= new JLabel("sageID");
//   JLabel year= new JLabel("year");
//
//   JTextField name1 = new JTextField("Aeri");
//   JTextField sageID= new JTextField("111r");
//   JTextField yearg= new JTextField("spr50");
//
//   JButton remove=new JButton("remove student");
//   JButton add= new JButton("add student");
//   JButton search= new JButton("lookup student");
//
//   center.add(name);
//   center.add(sage);
//   center.add(year);
//   center.add(name1);
//   center.add(sageID);
//   center.add(yearg);
//
//   bottom.add(add);
//   bottom.add(remove);
//   bottom.add(search);
//
//   main.setLayout(new BorderLayout());
//   main.add(center, BorderLayout.CENTER);
//   main.add(bottom, BorderLayout.PAGE_END);
//   window.setContentPane(main);
//   window.setSize(250,300);
//   window.setLocation(100,100);
//   window.setVisible(true);
//
//   remove.addActionListener(new ActionListener(){
//
//     public void actionPerformed(ActionEvent e){
//       Student l= new Student(name1.getText(),sageID.getText(), yearg.getText());
//       students.removeStudent(l);
//     }
//   });
//   add.addActionListener(new ActionListener(){
//
//     public void actionPerformed(ActionEvent e){
//       Student l= new Student(name1.getText(),sageID.getText(), yearg.getText());
//       students.addStudent(l);
//     }
//   });
//   search.addActionListener(new ActionListener(){
//
//     public void actionPerformed(ActionEvent e){
//
//       String id= sageID.getText();
//       for(Student val: students.getList()){
//
//           if(val.getSageID().equals(sageID)){
//           name1.setText(val.getName());
//           yearg.setText(val.getGraduationYr());
//         }
//         else
//         {
//           name1.setText("UNKNOWN");
//           yearg.setText(" ");
//         }
//         }
//       }
//     });
//   }
//   }
