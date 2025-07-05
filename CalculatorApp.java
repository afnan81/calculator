class Calculator{
public double add(double a, double b){
    return a+b;
}
public double subtract(double a, double b){
    return a-b;
}
public double multiple (double a, double b){
    return a*b;
}
public double divide(double a, double b){
    return a/b;
}
}
public class CalculatorApp{
    public static void main(String[]args){
        Calculator calcu=new Calculator();
        System.out.println("Addition:" + calcu.add(10,5));
        System.out.println("Subtraction:" + calcu.subtract(10,5));
        System.out.println("Multiple:" + calcu.multiple(10,5));
        System.out.println("Divioson:" + calcu.divide(10,5));



    }
}