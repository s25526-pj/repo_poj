package com.company;

public class Main {

    public static void main(String[] args) {

        String[] tablica = {"1","6","1"};

        System.out.println(count(tablica,1));

    }

    public static int count (String[] array,int counted){

        int j = 0;
        Integer doStringa = counted;
        doStringa.toString();

        for (int i = 0; i < array.length; i++) {
            String przypis = array[i];

            if (przypis.equals(doStringa.toString())){
                j++;
            }
        }


        return j;
    }

}
