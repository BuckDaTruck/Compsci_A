import java.util.Scanner;
    public class ConditionalPracitce {

    public static void main(String[] args) {
        String shapes;
        double length;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Shape Name:");
        shapes = myObj.nextLine();
        Scanner mylength = new Scanner(System.in);
        System.out.println("Length:");
        length = mylength.nextDouble();
        System.out.println(shapes+" with a length of: "+length);

        System.out.println(shape(shapes, length));

    }
// write a function that takes in a string of a month and gives days in month

    static double shape(String a,double b) {
        double area = 0.0;
        if(a.equals("triangle")) {
            area = Math.sqrt(3) / 4 * Math.pow(b, 2);
        }else if(a.equals("circle")) {
            area = Math.PI*Math.pow(b, 2);
        }else if(a.equals("square")) {
            area = Math.pow(b, 2);
        }else{
            System.out.println("invalid input");
        }
        return area;
    }
}