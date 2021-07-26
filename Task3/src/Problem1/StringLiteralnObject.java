package Problem1;

public class StringLiteralnObject {


    static void stringLiteralnObject(){
        String strLiteral1= "Ammar";
        String strLiteral2= "Ammar";
        String strObject1 = new String("Annus");
        String strObject2 = new String("Annus");


        System.out.println("/* String Literal */");
        System.out.println("using .equals compare the memory reference ---> "+ (strLiteral1.equals(strLiteral2)));//compare value or content of object
        System.out.println("using == compare the value or object  -------> "+ (strLiteral1==strLiteral2));//compare the memory reference

        System.out.println("/* String Object */");
        System.out.println("using .equals compare the memory reference ---> "+strObject1.equals(strObject2));//compare the  memory reference
        System.out.println("using == compare the value or object  -------> "+strObject1==strObject2);//compare the content or value of object

    }


}
