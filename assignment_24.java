abstract class Phone{
    void call(){
        System.out.println("Ringing...");
    }
    abstract void take_photo();
    abstract void play_music();
}
class Smart_phone extends Phone{
    void take_photo(){
        System.out.println("Picture sucessfull...");
    }
    void play_music(){
        System.out.println("play song...");
    }
    void make_transaction(){
        System.out.println("Transaction sucessfully...");
    }
}

public class assignment_24 {
    public static void main(String[] args) {
        Smart_phone sp=new Smart_phone();
        sp.call();
        sp.play_music();
    }
}
