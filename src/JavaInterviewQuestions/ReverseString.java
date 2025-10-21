package JavaInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String s= "Selenium";
        //1) using loop
        int len= s.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("using loop: " +rev);

        //2) using String Buffer
        StringBuffer sb= new StringBuffer(s);
        System.out.println("Using String Buffer: " +sb.reverse());

    }

}
