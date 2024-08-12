package br.com.pguimaraes;

public class Main {

    public static void main(String args[]) {
        unbox();
        castingIm();
        castingEx();
    }

    //unboxing
    static Boolean a = true;
    static Integer i = 2;
    static Long l = 11L;

    public static void unbox(){
        System.out.println(a);
        System.out.println(i);
        System.out.println(l);
    }

    // casting implicito de tipo primitivo para primitivo

    static int num1 = 23;
    static long num2 = num1;

    public static void  castingIm(){
        System.out.println(num2);
    }


    //casting explicito de tipo primitivo para complexo

    static int num3 = 111111;
    static int num4 = (Integer) num3;

    public static void castingEx(){
        System.out.println(num4);
    }



}
