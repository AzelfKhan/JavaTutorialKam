/*
package Phone = directory of where class is located
 */
package Phone;

/*  class level structure
    public = access specifier/modifier
    class = file declaration, declaring that it's a class file
    (other types = interface, enums(constant, time, week, month), abstract(combination of interface and class)
    implements = key word from Java that copies all the values from the Phone interface (values or methods)
 */
public class SmartPhone implements Phone {
    int price = 1000;

    public void call() {
        System.out.println("this method calls someone");
    }

    /*
     *public; It's an access specifier or access modifier
     * String = return type (other return type can be int, boolean, object etc.)
     * greeting = this is called a method name
     * { // } = your method body
     *
     */
    public String greeting () {
        String hello = "Hi how are you";
        return hello;
    }
}
