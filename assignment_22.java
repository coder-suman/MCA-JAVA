class Animal{
    void animal_details(){
        System.out.println("Have four legs...");
    }
}
class Dog extends Animal {
    void Speek(){
        System.out.println("Bark...");
    }
    void eat(){
        System.out.println("Eat meat...");
    } 
}
class breed extends Dog{
    void breed_name(){
        System.out.println("German Sheperd...");
    }
}
public class assignment_22 {
    public static void main(String[] args) {
        breed obj=new breed();
        obj.animal_details();
        obj.Speek();
        obj.breed_name();
    }
}
