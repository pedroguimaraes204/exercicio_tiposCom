package br.com.pguimaraes;

public class Main {

    // casting implicito

    static int num1 = 23;
    static long num2 = num1;

    public static void main(String args[]) {
        System.out.println(num2);
        castingEx();
    }

    //casting explicito

    static long num3 = 1111111111111111111L;
    static int num4 = (int) num3;

    public static void castingEx(){
        System.out.println(num4);
    }



}
