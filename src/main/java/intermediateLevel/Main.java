package intermediateLevel;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

class CheckFieldAnnotation{
    @FieldAnnotation
    int value;

    int valueWithoutAnnotaion;
    CheckFieldAnnotation(int value,int valueWithoutAnnotaion){
        this.value=value;
        this.valueWithoutAnnotaion=valueWithoutAnnotaion;
    }

    int getValue(){
        return value;
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        //problem 5
//        MathOperation mathOperation=new MathOperation();
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a :");
//        int a=sc.nextInt();
//        System.out.print("Enter b :");
//        int b=sc.nextInt();
//
//        System.out.println("Enter operation +,- or *");
//        char op=sc.next().charAt(0);
//
//        Method [] methods=mathOperation.getClass().getDeclaredMethods();
//        switch (op){
//            case '+':{
//                for(Method m:methods){
//                    m.setAccessible(true);
//                    if(m.getName().equals("add")){
//                       Object res= m.invoke(mathOperation,a,b);
//                       if(res instanceof Integer result){
//                           System.out.println("Sum of "+a+" and "+ b +" = "+result);
//                       }
//                    }
//                }
//                break;
//            }case '-':{
//                for(Method m:methods){
//                    m.setAccessible(true);
//                    if(m.getName().equals("sub")){
//                       Object res= m.invoke(mathOperation,a,b);
//                       if(res instanceof Integer result){
//                           System.out.println("Sub of "+a+" and "+ b +" = "+result);
//                       }
//                    }
//                }
//                break;
//            }case '*':{
//                for(Method m:methods){
//                    m.setAccessible(true);
//                    if(m.getName().equals("multiply")){
//                       Object res= m.invoke(mathOperation,a,b);
//                       if(res instanceof Integer result){
//                           System.out.println("Multiplication of "+a+" and "+ b +" = "+result);
//
//                       }
//                    }
//
//                }
//                break;
//            } default:{
//                System.out.println("Enter valid operation");
//            }
//        }


        //problem 6

        CheckFieldAnnotation checkFieldAnnotation=new CheckFieldAnnotation(10,20);

        Field [] fields=checkFieldAnnotation.getClass().getDeclaredFields();

        for(Field f:fields){
            if(f.isAnnotationPresent(FieldAnnotation.class)){
                System.out.println("Annotation is present in "+f.getName());
            }
            else{
                System.out.println("Annotation is not present in "+f.getName());

            }
        }


    }

}
