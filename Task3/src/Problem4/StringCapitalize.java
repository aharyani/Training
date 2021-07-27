package Problem4;

public class StringCapitalize {
    static void allCapitalize(){
        String str = "ammar";
        StringBuilder stringBuilder = new StringBuilder("");

        for (int s : str.chars().toArray()) {
                if(s>=97 && s<=122 ){
                    s-=32;
                    stringBuilder.append((char) s);
                }else {
                    stringBuilder.append((char) s);
                }
        }
        System.out.println(stringBuilder);

    }

    static  void startLetter(String str){
        StringBuilder stringBuilder = new StringBuilder("");
        String[] strings = str.split(" ");
        for(String s  : strings){
            {
                for(int i=0 ; i < s.length() ; i++){
                    int a = s.charAt(i);
                    if(a>=97 && a<=122 && i==0){
                        a-=32;
                        stringBuilder.append((char) a);
                    }else{
                        stringBuilder.append((char) a);
                    }
                }
                stringBuilder.append(" ");
            }

        }
        System.out.println(stringBuilder);
    }
}
