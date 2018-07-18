package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("1 max/min from arr: ");
//        int[] minAndMax = OwnArray.minAndMax(new int[]{15,7,123});
//        System.out.println("min: " + minAndMax[0]);
//        System.out.println("max: " + minAndMax[1]);
//
//
//        System.out.println("2 array sum: ");
//        int[][] arr2 = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println("array: " + Arrays.deepToString(arr2));
//        System.out.println("sum of array:" + OwnArray.sum(arr2));

//        System.out.println("3 part one - rand array : ");
//        int[] arr3 = OwnArray.rand(25);
//        System.out.println(Arrays.toString(arr3));
//        System.out.println("3 part 2 sorted : ");
//        OwnArray.sortBubble(arr3);
//        System.out.println(Arrays.toString(arr3));


//        System.out.println("4 rand array");
//        String[] arr4 = OwnArray.randString(10);
//        System.out.println(Arrays.toString(arr4));
//        System.out.println("concat: " + OwnArray.concat(arr4));
//        System.out.println("concat S: " + OwnArray.concatS(arr4));
//
//
//        System.out.println("5 number");
//        UserNumber n = OwnArray.parseNumber("375-29-8987410");
//        System.out.println(n.getNumber());
//        System.out.println("Country: " + n.getCountry());
//        System.out.println("city: " + n.getCity());



        Cat cat1 = new Cat("kobra", Cat.Genders.v, Cat.Breeds.sheepdog, Cat.Positions.home);
        Cat cat2 = new Cat("kobra2", Cat.Genders.v);
        Cat[] cats = {cat1, cat2};

        CatCafe cafe = new CatCafe("address", cats, "1111");

        System.out.println(Arrays.toString(cafe.find(Cat.Breeds.sheepdog)));


    }
}
