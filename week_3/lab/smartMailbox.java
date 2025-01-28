package week_3.lab;

public class smartMailbox {
    private int peicesOfMail;
    private double weightOfMail;
    private boolean locked;

    public smartMailbox(){
        this.peicesOfMail = 0;
        this.weightOfMail = 0;
        this.locked = true;
    }
    public int getMailCount(){ // mail count getter
        return this.peicesOfMail;
    }
    public double getMailWeight(){
        return this.weightOfMail;
    }
    public boolean getLockStatus(){
        return this.locked;
    }
    public void checkMailbox(){
        System.out.printf("Mailbox currently holds %d\n", this.peicesOfMail);
        System.out.printf("Weight of this mail is %.2f lbs.\n", this.weightOfMail);
        System.out.printf("Mailbox is %s",this.locked);
    }
    public void recieveMail(int parcels, double weightOfParcelsLBS){
        if(this.locked == false){
        System.out.println("Mailbox Notification: \"You've got mail!\"");
        this.peicesOfMail =+ parcels;
        this.weightOfMail =+ weightOfParcelsLBS;
        }else{
            System.out.println("Please unlock your mailbox you just missed a delivery!\n");
        }
    }
    public void controlLock(String lockCommand){
        String command = lockCommand.toLowerCase();

        if (command =="lock"){
            this.locked = true;
            System.out.println("Mailbox locked");
        }else if(command == "unlock"){
            this.locked = false;
            System.out.println("Mailbox is now unlocked");
        }else{
            System.out.println("Invalid lock command. Please input Lock or Unlock to control the mailbox lock");
        }

    }
    public double computeAvgMailWeight(){
        return (this.weightOfMail/this.peicesOfMail);
    }
    public void collectMail(){
        this.peicesOfMail = 0;
        this.weightOfMail = 0;
    }

}
