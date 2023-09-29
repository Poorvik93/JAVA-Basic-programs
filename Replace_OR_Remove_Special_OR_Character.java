
  public class Replace_OR_Remove_Special_OR_Character {
    public static void main(String[] args){
    String str="@#%#$!^!*$%DGWW$^^$";

        // we want repalce we mentioned below a-zA-Z0-9 with nothing 
        String pls=str.replaceAll("[a-zA-Z0-9]","");
        
        // we want repalce we Special characters .the we use ^ after we put what are not repalce a-zA-Z0-9 below a-zA-Z0-9 
        String pl=str.replaceAll("[^a-zA-Z0-9]","");

        System.out.println(pls);
        System.out.println(pl);
    }
}

