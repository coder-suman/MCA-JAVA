import java.util.Scanner;
class Password_strength_Check{
    boolean hasUpper=false;
    boolean hasLower=false;
    boolean hasDigit=false;
    boolean hasSpecial=false;
    int score=0;
    void password_feedback(String password){
        if(password.length()<6){
            System.out.println("please enter atleast 6 letter.");
        }
        else{
            check_charecter(password);
            if(!hasUpper){
                System.out.println("Please enter at least 1 Upper Case.");
            }else if(!hasLower){
                System.out.println("Please enter at least 1 Lower Case.");
            }else if(!hasDigit){
                System.out.println("Please enter at least 1 Digit.");
            }else if(!hasSpecial){
                System.out.println("Please enter at least 1 Special Character.");
            }
        } 
        password_score();
    }
    void check_charecter(String password){
        for (int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpper=true;
            }
            else if(Character.isLowerCase(ch)){
                hasLower=true;
            }
            else if(Character.isDigit(ch)){
                hasDigit=true;
            }
            else if(check_special(ch)){
                hasSpecial=true;   
            }
        }
    }
    
    boolean check_special(char a){
        String sp_char="!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        String strChar = Character.toString(a);
            if(sp_char.contains(strChar)){
                return true;
            }else{
                return false;
            }
        }

    void check_score(){
        if(hasUpper){
            score++;
        }if(hasLower){
            score++;
        }if(hasDigit){
            score++;
        }if(hasSpecial){
            score++;
        }
    }
    void password_score(){
        check_score();
        if(score==4){
            System.out.println("Strong Password...");
        }
        else if(score>=2 && score<4){
            System.out.println("Moderate Password...");
        }
        else{
            System.out.println("Weak Password...");
        }
    }     
}

public class assignment_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password=sc.nextLine();
        Password_strength_Check psc=new Password_strength_Check();
        psc.password_feedback(password);
        sc.close();
    }
}
