package lab1;

import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello");

        book book = new book( 100);
        System.out.println("Price :" + book.getPrice());
        //displayMethods(book);
        Cat myCat=new Cat();
        Animal myAnimal=myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();
    }
    public static void displayMethods(book book){
        Class c= book.getClass();
        Method[] allMethods = c.getMethods();
        for(Method m : allMethods){
            System.out.println(m);
        }
    }
}
