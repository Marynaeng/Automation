package com.skillup.automation.Lesson2;

public class Cycles {
    public static void main (String []args) {

        //1. while pre-conditions

        int index=0;
        while (true) {
            // code inside while which will be exec always
            index += 1; //index = index +1; index ++;
            System.out.println(index);

            if (index == 10) {
                break;
            }

            for (int i=0; i< 10; i++) {
                System.out.println("From for:" + i);
            }

            int indexForWhile =0;
            while (indexForWhile <10); {
                System.out.println( "From for: " + indexForWhile);
                indexForWhile++;
            }
        }
    }
}
