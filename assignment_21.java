class Method_Overloding{
    void display_details(String name){
        System.out.println("The name is: "+name);
    }
    void display_details(String name,int age){
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);
    }
}
public class assignment_21 {
    public static void main(String[] args) {
        Method_Overloding md=new Method_Overloding();
        md.display_details("suman");
        md.display_details("Manish",22);
    }
}
