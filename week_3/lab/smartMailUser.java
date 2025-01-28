package week_3.lab;

public class smartMailUser{
    public static void main(String[] args){
        System.out.println("Good morning! its 7:00am - I better unlock my mailbox for deliveries today\n");
        smartMailbox myMailbox = new smartMailbox();
        myMailbox.controlLock("unlock");

        //////GO THROUGHOUT DAY/////////
        
        myMailbox.recieveMail(20, 0.3);
        System.out.println("Hmm I wonder if my new keyboard I ordered has arrived yet- lets check!\n");

        int noOfParcels = myMailbox.getMailCount();
        double wieghtOfParcels = myMailbox.getMailWeight();
        double avgWeightOfParcels = myMailbox.computeAvgMailWeight();

        System.out.printf("Looks like I got some mail, I currently have %d peices of mail",noOfParcels);
        System.out.printf("and the weight of them is %.2f which means the average weight in lbs. for each piece is %.2f lbs.\n",wieghtOfParcels, avgWeightOfParcels);
        System.out.println("Hmm that 0.3 pounds doesn't seem heavy enought to be my keyboard must just be credit card promotions");

        // WAIT TO AFTERNOON//

        myMailbox.recieveMail(1, 2.5);
        noOfParcels = myMailbox.getMailCount();
        wieghtOfParcels = myMailbox.getMailWeight();
        avgWeightOfParcels = myMailbox.computeAvgMailWeight();

        System.out.printf("Looks like I got some new mail, I currently have %d peices of mail",noOfParcels);
        System.out.printf("and the weight of them is %.2f which means the average weight in lbs. for each piece is %.2f lbs.\n",wieghtOfParcels, avgWeightOfParcels);
        System.out.println("OOO thats definitely my new keyboard- lets go get my mail!\n\n");
        myMailbox.collectMail();

        myMailbox.checkMailbox();
        System.out.println("Sweet I've been waiting all week - oh its getting late I better lock it up - wow I love my mailbox!\n");
        myMailbox.controlLock("lock");

    }
}