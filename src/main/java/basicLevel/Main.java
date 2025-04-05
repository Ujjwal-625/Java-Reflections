package basicLevel;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //problem 1
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Class Name like basicLevel.BasicClass");
            String classname=scanner.next();

            Class c=Class.forName(classname);

            Method[] m=c.getDeclaredMethods();
            Field[] f=c.getDeclaredFields();
            Constructor[] constructors= c.getDeclaredConstructors();

            for(Method method:m){
                System.out.println(method.getName());
            }
            for(Field field:f){
                System.out.println(field.getName());
            }
            for(Constructor con:constructors){
                System.out.println(con.getName());
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("Class with given name is not present ");
        }

    }
}
