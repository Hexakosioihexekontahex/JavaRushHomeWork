package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/*
 Создать класс Cat, Dog.
 Создать множество (Set) котов и добавить туда 4 объекта – кот.
 Создать множество (Set) собак и добавить туда 3 объекта – собака.
 Создать множество всех животных (Set&lt;Object&gt;)  и добавить в него всех котов и собак.
 Вывести содержимое этого множества на экран
 Удалить из множества всех кошек.
 Вывести содержимое множества всех животных на экран.
 */
public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs()
    {
        Set<Dog> resultD = new HashSet<Dog>();
        resultD.add(new Dog());
        resultD.add(new Dog());
        resultD.add(new Dog());

        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        Set<Object> pets = new HashSet<Object>();

        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object pet : pets)
        {
            System.out.println(pet);
        }

        System.out.println();
    }

    public static class Cat
    {

    }

    public static class Dog
    {

    }


}