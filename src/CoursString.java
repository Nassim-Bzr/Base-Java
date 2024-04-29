public class CoursString {
public static void main (String[] args){
    String s = "Hello";

    System.out.println(s  +"World ");

    System.out.println(s.substring(0,2));

    System.out.println(inverse(s));
}

public static String inverse(String s) {
   // for(int i =0; i<s.length(); i++) {
   // System.out.println(s.charAt(i));
 //  }

    String inverseString = null;
   for (int i = s.length()-1 ; i>=0; i--){
    System.out.println(s.charAt(i));
    inverseString+=s.charAt(i);
   }
   for (char c : s.toCharArray()){

   }
   return inverseString;
}
}
