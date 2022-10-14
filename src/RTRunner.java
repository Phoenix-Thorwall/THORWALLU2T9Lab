public class RTRunner
{
    public static void main(String[]args)
    {
        RightTriangle rt1 = new RightTriangle(3,4);
        RightTriangle rt2 = new RightTriangle(6.5,10.7);
        RightTriangle rt3 = new RightTriangle(6,9);

        System.out.println(rt1.hypotenuse());
        System.out.println(rt2.hypotenuse());
        System.out.println(rt3.hypotenuse());
    }
}
