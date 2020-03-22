package Phone;

public class TheRunner {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone ();
        sp.call();
        sp.call();
        sp.call();
        int x = sp.price;
        System.out.println(x);
        String greetingFromSP = sp.greeting();

       // concatenation = when you take 2 different variables and you keep adding them
        System.out.println("this is greeting: " + greetingFromSP);

        System.out.println(sp.greeting());
    }
}

