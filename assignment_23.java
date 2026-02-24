class People{
    void work(){
        System.out.println("Every people have a work...");
    }
}
class Newton extends People{
    @Override
    void work(){
        System.out.println("Newton work as a scientist...");
    }
}
public class assignment_23 {
    public static void main(String[] args) {
        People obj=new Newton();
        obj.work();
    }
}
