package Chapter_One;

public class DemoTest {

    public static void main(String[] args) {
        String string = "Hello";
        String string2= new String("Hello");
        String string3 = "Hello";
        String string4 =new String ("Hello");
        System.out.println(string==string2);
        System.out.println(string==string3);
        System.out.println(string==string4);
        System.out.println(string2==string3);
        System.out.println(string2==string4);
        System.out.println(string3==string4);

    }
}
