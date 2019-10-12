package com.company;

public class Main {

    public static void main(String[] args) {
    int j[] = {5,7,1,9,6,3,2,8,4,0};
    int i=2;
    int a=0;
    int b=0;

    System.out.println("Cocktail sort");
    System.out.print("Исходный массив: "+j[0]+",");
    System.out.print(j[1]+",");
    System.out.print(j[2]+",");
    System.out.print(j[3]+",");
    System.out.print(j[4]+",");
    System.out.print(j[5]+",");
    System.out.print(j[6]+",");
    System.out.print(j[7]+",");
    System.out.print(j[8]+",");
    System.out.println(j[9]);

    while (i>0) {
        i=0;
        for (int k=0;k<9;k++) {
            a=j[k];
            b=j[k+1];
            if (j[k]>j[k+1]) {
                j[k]=b;
                j[k+1]=a;
                i++;
            }
        }
        for (int k=8;k>0;k--) {
            a=j[k-1];
            b=j[k];
            if (j[k-1]>j[k]) {
                j[k-1]=b;
                j[k]=a;
                i++;
            }
        }
    }

    System.out.print("Результат: "+j[0]+",");
    System.out.print(j[1]+",");
    System.out.print(j[2]+",");
    System.out.print(j[3]+",");
    System.out.print(j[4]+",");
    System.out.print(j[5]+",");
    System.out.print(j[6]+",");
    System.out.print(j[7]+",");
    System.out.print(j[8]+",");
    System.out.println(j[9]);

    }
}
