package com.company;

public class Main {
    static int sum(int a, int b) {
        System.out.println("Sum of a and b="+(a+b));
        return a + b;
    }

    public static void main(String[] args) {
	// write your code here
        String name="Rajanikant";
        int a=2;
        float b=23.22f;
        boolean istrue=false;
        System.out.println(name);
        System.out.println(a);
        System.out.println(b);
        System.out.println(istrue);
        int []arr={1,2,3,4,5,6};
        try{
        System.out.println(arr[9]);}
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Sorry");
        //practice print=new practice();
        int v;
        v=sum(3,7);
      //  System.out.println(sum(4, 3));
    }
}
