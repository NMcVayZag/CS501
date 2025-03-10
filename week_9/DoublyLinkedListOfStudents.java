package week_9;

public class DoublyLinkedListOfStudents {

    class Student {
        private String firstName;
        private String lastName;
        private Student previousStudent;
        private Student nextStudent;

        //creating constructor
        public Student(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            this.previousStudent = null;
            this.nextStudent = null;
        }
        //getters and setters
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public Student getNext(){
            return nextStudent;
        }
        public void setNext(Student next){
            this.nextStudent =next;
        }
        public Student getPrevious(){
            return previousStudent;
        }
        public void setPrev(Student prev){
            this.previousStudent = prev;
        }
        public String toString(){
            return firstName +" "+lastName;
        }
    }
    
    private Student head;
    private Student tail;

    public DoublyLinkedListOfStudents(){
        this.head = null;
        this.tail = null;
    }

    // append student
    public void addStudent(String firstName, String lastName){
        Student newStudent = new Student(firstName, lastName);
        if (head == null){
            head = newStudent;
            tail = newStudent; // since head of linked list is null so is tail
        }else{
            tail.setNext(newStudent); // take ref tail student and put the new student after them
            newStudent.setPrev(tail); // establish for new student that tail ref student is infront of them.
            tail = newStudent;
        }
    }
    public void removeStudent(String firstName, String lastName){
        Student currentStudent = head; // start at front of list searching for student to remove
        while (currentStudent != null){
            String currentFirstName = currentStudent.getFirstName();
            String currentLastName = currentStudent.getLastName();
            if ((currentFirstName == firstName) && (currentLastName == lastName)){
                if (currentStudent.getNext() == null){// if nobody after we have to alter tail
                    tail = currentStudent.getPrevious();
                }else{
                    currentStudent.getNext().setPrev(currentStudent.getPrevious()); //go to next student and set their previous the previous of current since we are removing current
                }
                if (currentStudent.getPrevious() == null){
                    head = currentStudent.getNext(); // if there is nobody infront of student to remove we set the next student to the head
                } else{
                    currentStudent.getPrevious().setNext(currentStudent.getNext()); // if there is sombody infront we set their next to the current student's next ref
                }
                return; // end loop over linked list if the removal student is found
            }
            currentStudent = currentStudent.getNext(); // iterate to next student
        }
    }

    public void rollCall(){
        Student current = head;
        int count = 1;
        while (current != null){
            if ((current.getPrevious() != null) && current.getNext()!= null){//not at front or back
            System.out.println("Student #" + Integer.toString(count)+ " my name is " + current.toString()+ ". Infront of me is " + current.getPrevious().toString()+ " and behind me is "+ current.getNext().toString()+".");
            }else if (current.getPrevious() == null){//at start
            System.out.println("Student #" + Integer.toString(count)+ " my name is " + current.toString()+ ". Behind me is "+ current.getNext().toString()+".");
            }else{//at end
            System.out.println("Student #" + Integer.toString(count)+ " my name is " + current.toString()+ ". Infront of me is " + current.getPrevious().toString()+ ".");
            }
            current = current.getNext();
            count++;
        }
    }

    public void sortAlphabetically(){
        Student current = head.getNext(); // start on second student in line
        while(current != null){
            Student next = current.getNext();
            Student temp = current;
            while ((temp.getPrevious() != null) && (compareStudents(temp.getPrevious(), temp) > 0)){// if person infront has a higher alpha value
                swapStudents(temp.getPrevious(), temp);
            }
            current = next;
        }
    }
    public int compareStudents(Student student_1, Student student_2){
        int lastNameCompare = student_1.getLastName().compareTo(student_2.getLastName());
        if (lastNameCompare !=0){
            return lastNameCompare;
        }else{
        int firstNameCompare = student_1.getFirstName().compareTo(student_2.getFirstName());
        return firstNameCompare;
        }
    }
    //swap adjacent students
    public void swapStudents(Student student_1, Student student_2){
        // controlling references outside of students being swapped
        Student outsidePrev = student_1.getPrevious(); // getting the previous student outside the swap
        Student outsideNext = student_2.getNext(); // getting the next student outside the swap

        if (outsidePrev != null){
            outsidePrev.setNext(student_2);// go to person in front and change ref to student two
        } else {
            head = student_2; // set head to student 2
        }
        if (outsideNext != null){
            outsideNext.setPrev(student_1);// go to person behind current and change prev ref to student two
        } else{
            tail = student_1;// set tail to student 2
        }
        student_1.setNext(outsideNext);// replace references in student 1
        student_2.setPrev(outsidePrev);
        student_1.setPrev(student_2); //set student1 prev ref to student 2
        student_2.setNext(student_1); // set student2 next ref to student 1

    }

}


