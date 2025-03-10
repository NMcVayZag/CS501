package week_9;

public class Teacher {
    public static void main(String[] args) {
        DoublyLinkedListOfStudents studentList = new DoublyLinkedListOfStudents();
        studentList.addStudent("Nick", "McVay");
        studentList.addStudent("Tim", "Roddy");
        studentList.addStudent("dtan", "wake");
        studentList.addStudent("Hannah", "Schmidt");

        System.out.println("Roll call pre-sorting");
        studentList.rollCall();

        studentList.sortAlphabetically();

        System.out.println("Roll call post-sorting");
        studentList.rollCall();
    }
    
}
