
package ie.atu.week10b

public class Person_App {
    public static void main(String[] args) {

        Person1 dave = new Person1();
        Customer myCust = new Customer("dave","545454","mervue","4347874365",true);
        System.out.println("details" + myCust.toString());

    }
}