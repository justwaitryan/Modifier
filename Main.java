
package author;

import modifier.Person;
public class Main {
    
    public static void main(String[] args) {
        Person mPerson = new Person();
        mPerson.setName ("Ryan");
        System.out.println("Person name:"+ mPerson.getName());
    }
}
