public class Reverse_String{
    public static void main(String args[]){
        String orgstr="poorvik";
        String orgstr1="gowdak";
        String input="623487";
        // Method 1 invoking 
        String revstr=reverse(orgstr);
        System.out.println(revstr);
        // Method 2 invoking 
        System.out.println(reverseS(orgstr1));
        // Method 3 invoking 
        System.out.println(strrev(input));
    }
    // method 1 to reverse a string 
    public static String reverse(String str){
  //// using String builder..
    StringBuilder string=new StringBuilder(str);
    string.reverse();
    return string.toString();
    }
////******************************************/

    // method 2 to reverse a string 

   public static String reverseS(String str1){

    char[] arr=str1.toCharArray();

    for(int i=0;i<arr.length/2;i++){
        char temp=arr[i];
        arr[i]=arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
    }
    return new String(arr);
   }
////**************************************/
    // method 3 to reverse a string 
   public static String strrev(String input ) {
    StringBuilder str3=new StringBuilder(input).reverse();
    return str3.toString();
   }
}
 
