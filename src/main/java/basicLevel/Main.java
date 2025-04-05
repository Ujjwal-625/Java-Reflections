package basicLevel;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {

        //problem 1
//        try{
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Enter Class Name like basicLevel.BasicClass");
//            String classname=scanner.next();
//
//            Class c=Class.forName(classname);
//
//            Method[] m=c.getDeclaredMethods();
//            Field[] f=c.getDeclaredFields();
//            Constructor[] constructors= c.getDeclaredConstructors();
//
//            for(Method method:m){
//                System.out.println(method.getName());
//            }
//            for(Field field:f){
//                System.out.println(field.getName());
//            }
//            for(Constructor con:constructors){
//                System.out.println(con.getName());
//            }
//        }
//        catch (ClassNotFoundException e){
//            System.out.println("Class with given name is not present ");
//        }


        //problem 2
//        Person p=new Person();
//        Field [] fields=p.getClass().getDeclaredFields();
//        for(Field f:fields){
//            f.setAccessible(true);
//            System.out.println("Initially "+f.get(p));
//            if(f.getName().equals("name")){
//                f.set(p,"newName");
//            }
//            if(f.getName().equals("age")){
//                f.setInt(p,20);
//            }
//
//            System.out.println("After updation "+f.get(p));
//
//        }

//        problem 3
//        Calculator calculator=new Calculator();
//        Method [] methods=calculator.getClass().getDeclaredMethods();
//        for(Method m:methods){
//            m.setAccessible(true);
//            if(m.getParameterCount()==2){
//                Object res=m.invoke(calculator,10,20);
//                if(res instanceof Integer result){
//                    System.out.println(result);
//                }
//            }
//        }

//        problem 4

        Class c1=basicLevel.Student.class;
        Constructor constructor=c1.getDeclaredConstructor();
        Student student= (Student) constructor.newInstance();

        System.out.println(student.age);
        System.out.println(student.name);




    }
}
