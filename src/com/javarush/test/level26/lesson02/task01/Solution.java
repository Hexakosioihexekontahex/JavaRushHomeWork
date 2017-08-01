package com.javarush.test.level26.lesson02.task01;

import java.util.Arrays;
import java.util.Comparator;

/* Почитать в инете про медиану выборки
Реализовать логику метода sort, который должен сортировать данные в массиве по удаленности от его медианы
Вернуть отсортированный массив от минимального расстояния до максимального
Если удаленность одинаковая у нескольких чисел, то выводить их в порядке возрастания
*/
public class Solution {
    public static Integer[] sort(Integer[] array) {

        //implement logic here
        //Рассчет медианы массива Integer[]
        double median;
        int sum = 0;
        int count = 0;
        int iMedium;
        if(array.length%2==0){
            iMedium = array.length / 2;
        } else iMedium = array.length / 2 - 1;
        median = array[iMedium];
        double delta;
        for(Integer value : array){
            sum += value;
            count++;
            delta = sum / count / count;
            if(value>median){
                median+=delta;
            } else if(value<median){
                median-=delta;
            } else if(value==median){
                //do nothing
            }
        }
        final double finalMedian = median;

        //Компаратор
        Comparator<Integer> compareByMedian = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double value = Math.abs(o1 - finalMedian) - Math.abs(o2 - finalMedian);
                if (value == 0){
                    value = o1 - o2;
                }
                return (int) value;
            }
        };
        Arrays.sort(array, compareByMedian);
        System.out.println(finalMedian);
        return array;
    }

    public static void main(String[] args) {
        Integer[] mass = new Integer[]{1,2,3,4,5,6,7,8,9,10,12,15,31,15,48,77,55,21,32,45};
        System.out.println(Arrays.toString(sort(mass)));
    }
}
