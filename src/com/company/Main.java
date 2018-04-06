package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] skillRatings = {"n/a","beginner", "exceptional", "great", "advance", "expert"};
        String input;
        int i;
        Ratings myRating = new Ratings();

        System.out.print("Select a rating between 1 and 5. ");
        input = sc.nextLine();
        i = Integer.parseInt(input);
        myRating.setRate(skillRatings[i]);

            System.out.println("Your skills is " + skillRatings[i]);
            System.out.print(myRating.getRate());
            System.out.print('\n');
            System.out.print(myRating.thisIsMyRating());

    }
}
