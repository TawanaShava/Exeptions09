package com.company;

public class Task2 {

    public static void main(String[ ] args) {
        int[] Tawana56415 = {1, 2, 3, 6 , 8 , 21};
        System.out.println(Tawana56415[7]);


        try {
            Tawana56415 = new int[]{1, 2, 3, 6 , 8 , 21};

            System.out.println(Tawana56415[7]);
        } catch (Exception e) {
            System.out.println("Something is off.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }


    }
}
