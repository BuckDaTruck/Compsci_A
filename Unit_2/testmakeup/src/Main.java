

public class Main {
    public static void main(String[] args) {
        hiPerson("Buck");
        welcome();
        System.out.println("traparea "+traparea(4,4,5));
        System.out.println("pyramid "+pyramid(4,4,5));
        System.out.println("distanceFormula "+distanceFormula(2,5,6,6));
        System.out.println("isGallon "+isGallon(4000));
        System.out.println("octagon "+octagon(4));
        System.out.println("farTocels "+farTocels(77.6));
        System.out.println("slope "+slope(2,5,6,6));
        changecalculator(3.56);
    }



    public static void hiPerson(String name) {
        System.out.println("Good Morning "+name+"!"); // just calls the function which prints this and stitches in the name
    }
    public static void welcome() { //
        System.out.println("Welcome to Westminster!"); // just prints the statment
    }
    public static double traparea(double t,double b,double h){
        return (t+b)/2*h;// simple math
    }
    public static double pyramid(double w,double b,double h){
        return (w*b*h)/3;// does the pyramid formula
    }
    public static double distanceFormula(double x1,double y1,double x2,double y2){ // the distance formula just takes points and does the square thing
        double xt=(x1-x2);
        double yt=(y1-y2);
        return Math.sqrt(Math.pow(yt,2)+Math.pow(xt,2));

    }
    public static boolean isGallon(double mils){ //checks if it is greater than a gallon in mills
        if(mils>3785){
            return true;
        }else{
            return false;
        }
    }
    public static double octagon(double side){
        return 2*(1+Math.sqrt(2))*Math.pow(side,2);// does math that i dont know how to explain
    }
    public static double farTocels(double f){
        return (f-32)*5/9;// subtracts then does conersion factor.
    }
    public static double slope(double x1,double y1,double x2,double y2){
        return (y1-y2)/(x1-x2);// does simple math
    }
    public static void changecalculator(double money){
        int pennies=0;
        int nickles=0;
        int dime=0;
        int quarter=0;
        int dollar=0;
        int mon= (int)(money*100);// have to convert to int so it gives
        dollar = mon /100;
        mon = mon % 100;
        quarter = mon /25;
        mon = mon % 25;
        dime = mon /10;
        mon = mon % 10;
        nickles = mon /5;
        mon = mon % 5;
        pennies = mon;
        System.out.println("Change Due: "+" Dollars: "+dollar+" Quarters: "+quarter+" Dimes: "+dime+" Nickles: "+nickles+" Pennies: "+pennies);
    } // this one took a sec
}
