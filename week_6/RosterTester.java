package week_6;

/**********************
 * RosterTester.java
 * statement coverage test
 * @author Tammy Pirmann
 * @version 20210430
 **************************/
// Test all roster class functionality.
public class RosterTester{
    public static void main(String[] args){
      //create a roster with no args
      Roster jav = new Roster();
      //create a roster with args
      Roster fds = new Roster("Freshman Design", "CI10X", 5);
      
      //use setters
      jav.setCourseName("Intro to Programming with Java");
      jav.setCourseId("CS501");

      // define students for the roster to test roster class functionality
      Student jeremy = new Student("jeremy", "wilson", "41", "he", 2022);
      Student jonsiah = new Student("jonsiah", "hamilton", "12", "he", 2002);

      // add students to tha rosta
      fds.addStudent("jeremy", "wilson", jeremy.getId(),jeremy.getPronouns(),jeremy.getGradYear());
      fds.addStudent("jonsiah", "hamilton", jonsiah.getId(), jonsiah.getPronouns(), jonsiah.getGradYear());

      //use getters
      System.out.println(jav.getCourseName());
      System.out.println(jav.getCourseId());
      System.out.println(jav.getStudents());
      System.out.println(fds.getCourseName());
      System.out.println(fds.getCourseId());
      System.out.println(fds.getStudents());
      System.out.println(fds.getOneStudent(1));
      
      //use toString
      System.out.println(jav);
      System.out.println(fds);
    }
  }
