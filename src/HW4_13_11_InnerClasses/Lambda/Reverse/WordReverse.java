package HW4_13_11_InnerClasses.Lambda.Reverse;

public class WordReverse {
    public static void main(String[] args) {
        FunctionInterf fi=(s)->{
            String result="";
            for (int i=s.length()-1;i>=0;i--){
                result+=s.charAt(i);
            }
            return result;
        };
        System.out.println();
    }
}

