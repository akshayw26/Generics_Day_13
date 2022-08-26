package com.generics;

public class FindMaxValue<E extends Comparable<E>> {

    E x;
    E y;
    E z;

    public FindMaxValue(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static <E extends Comparable>E maximum(E x, E y, E z){

        E max = x;

         if(y.compareTo(max)>0){
             max = y;
         }
         if(z.compareTo(max)>0){
             max = z;
         }
         return max;
    }

    public static void main(String[] args) {
        System.out.println("The Maximum Of Integer is -> " +maximum(10,20,15));
        System.out.println("The Maximum Of Float is -> " +maximum(1.1f,2.0f,1.5f));
        System.out.println("The Maximum Of String is -> " +maximum("Red","blue","Yellow"));
    }
}
