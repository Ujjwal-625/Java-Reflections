package intermediateLevel;

import java.lang.reflect.Field;

import static javax.management.Query.value;


public class Main {
    public static void main(String[] args) throws Exception{
        //problem 5
//        MathOperation mathOperation=new MathOperation();
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
//        CheckFieldAnnotation checkFieldAnnotation=new CheckFieldAnnotation();
//
//        if(checkFieldAnnotation.getClass().isAnnotationPresent(Author.class)){
//            Author author=checkFieldAnnotation.getClass().getAnnotation(Author.class);
//            System.out.println("Name of the Author is : "+author.name());
//        }


        //problem 7

        CustomApi api=new CustomApi();

        Class customApi=api.getClass();

        Field api_key=customApi.getDeclaredField("API_KEY");

        api_key.setAccessible(true);
        System.out.println("Before updating the final variable : api_key : "+api_key.get(api));

        api_key.setAccessible(true);
        api_key.set(api,"updated the api key");

        System.out.println("After updating the final variable : api_key : "+api_key.get(api));


    }

}
