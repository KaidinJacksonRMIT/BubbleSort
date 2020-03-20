package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {5,6,7,2,4,1,7};
        List<Element> list = new ArrayList<>();
        for (int i = 0; i< 25; i++) {
            list.add(new Element(i));
        }

        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public void bubbleSortArrayList(List<Element> list) {
        Element temp;
        boolean sorted = false;

        while(!sorted) {
            sorted = true;
            for(int i = 0; i < list.size()-1; i++) {
                if(list.get(i).compareTo(list.get(i+1))>0){
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }

    public class Element {
        private int id;
        public Element(int id) {
            this.id = id;
        }

        //Getters and setters

        public int compareTo(Element element){
            int res = 0;
            if (this.id < element.getId()){
                res =-1;
            }
            if (this.id > element.getId()) {
                res = 1;
            }
            return res;
        }
    }
}
