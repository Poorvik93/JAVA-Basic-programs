public class floatto {
    public static void main(String[] args) {

        // float to byte ....
        float a1 = 85.36f;
        byte b1;
        b1 = (byte) a1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println("float to byte is Explicit Casting\n");

        // float to short ....
        float a2 = 85.36f;
        short b2;
        b2 = (short) a2;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println("float to short is Explicit Casting\n");

        // float to int....
        float a3 = 85.36f;
        int b3;
        b3 = (int) a3;
        System.out.println(a3);
        System.out.println(b3);
        System.out.println("float to int is Explicit Casting \n");

        // float to char ...
        float a4 = 85.36f;
        char b4;
        b4 = (char) a4;
        System.out.println(a4);
        System.out.println(b4);
        System.out.println("float to char is Explicit Casting\n");

        // float to long...
        float a5 = 85.36f;
        long b5;
        b5 = (long) a5;
        System.out.println(a5);
        System.out.println(b5);
        System.out.println("float to long is Explicit Casting\n");

        // float to float...
        float a6 = 85.36f;
        float b6;
        b6 = a6;
        System.out.println(a6);
        System.out.println(b6);
        System.out.println("float to float Casting is not required\n");

        // float to double....
        float a7 = 85.36f;
        double b7;
        b7 = a7;
        System.out.println(a7);
        System.out.println(b7);
        System.out.println("float to double is implicit Casting\n");
    }

}
