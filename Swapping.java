public class Swapping {
    public static void main(String[] args)
    {
        int a=5;
        int b=6;
        a=a+b;         
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a +",b = " + b);
    }
}
