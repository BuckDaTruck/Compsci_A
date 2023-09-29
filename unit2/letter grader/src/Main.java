import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your grade as a percent.");
        grades(myObj.nextInt());


    }
    static int grades(int percent){
        char grade='0';
        boolean skip=false;
        if(percent>=105){
            grade ='a';
            skip=true;
            System.out.println("In your Dreams!");
        }else if(percent>=90){
            grade ='a';
        }else if(percent>=80){
            grade ='b';
        }else if(percent>=70){
            grade ='c';
        }else if(percent < 70){
            grade ='f';
        }
        if(!skip) {
            System.out.println("You have an " + grade + "!");
        }
        return 0;
    }

}