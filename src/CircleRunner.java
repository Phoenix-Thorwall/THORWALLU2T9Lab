public class CircleRunner
{
    public static void main(String[]args)
    {
        Circle myCirc = new Circle(5.0);

        System.out.println(myCirc.getInfo());
        myCirc.setRadius(9.2);
        System.out.println(myCirc.getInfo());

        Circle myCirc2 = new Circle(100.1);

        System.out.println(myCirc2.getInfo());
        myCirc2.setRadius(5.0);
        System.out.println(myCirc2.getInfo());
    }
}
