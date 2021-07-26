public class StringliteralAndObject {

    public static void main(String[] args) {
        stringBuffer();
        stringBuilder();
    }

    static void stringLiteral(){
        String strLiteral1= "Ammar";
        String strLiteral2= "Ammar";

        System.out.println("/* String Literal */");
        System.out.println("using .equals compare the memory reference ---> "+ (strLiteral1.equals(strLiteral2)));//compare value or content of object
        System.out.println("using == compare the value or object  -------> "+ (strLiteral1==strLiteral2));//compare the memory reference


    }

    static void stringObject(){
        String strObject1 = new String("Annus");
        String strObject2 = new String("Annus");

        System.out.println("/* String Object */");
        System.out.println("using .equals compare the memory reference ---> "+strObject1.equals(strObject2));//compare the  memory reference
        System.out.println("using == compare the value or object  -------> "+strObject1==strObject2);//compare the content or value of object


    }

    static void stringCompareto(){
        String strLiteral1= "Ammar";
        String strLiteral2= "Annus";

        String strObject1 = new String("Ammar");
        String strObject2 = new String("Annus");


        System.out.println(strLiteral1.compareTo(strObject1));// compare the unicode of character, return the difference and if all unicode matches it return 0

    }

    static void stringBuffer(){
        long start=System.currentTimeMillis();
        StringBuffer strBuffer = new StringBuffer("Java is an Object Oriented Language");

        for(int i=0 ; i<50 ;i++) {

            System.out.println(strBuffer);
            System.out.println(strBuffer.reverse());
        }
        long end =System.currentTimeMillis();
        System.out.println("Traversal time of String Buffer is "+ (end-start));

    }

    static void stringBuilder(){
        long start1=System.currentTimeMillis();
        StringBuilder strBuilder = new StringBuilder("Java is an Object Oriented Language");


        for(int i=0 ; i<50 ;i++) {
            System.out.println(strBuilder);
            System.out.println(strBuilder.reverse());
        }
        long end1 =System.currentTimeMillis();
        System.out.println("Traversal time of String Builder is "+ (end1-start1));
    }

    static void stringToUpperCase(){
        String str = "ammar";

        System.out.println(str.toUpperCase());
    }

}
