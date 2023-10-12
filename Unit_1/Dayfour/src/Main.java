public class Main {
    public static void main(String[] args) {
        double mpg=7.2;
        double gallons=2;
        double range = miles(mpg,gallons);
        double sphere= volumesphere(4);
        double height = 20;
        double radius = 2.5423;
        double volume = Math.PI * Math.pow(radius,2) * height;
        System.out.println("The Cylinders Volume is "+volume);
        System.out.println(sphere);
    }
    static double volumesphere(double r){
        double vol = 4/3*Math.PI*Math.pow(r,3);
        return vol;
    }
    static double miles(double g, double v){
        double left = g*v;
        return left;
    }
}
//Code written by Buckley Wiley