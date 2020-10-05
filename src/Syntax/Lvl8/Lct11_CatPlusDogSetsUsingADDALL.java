package Syntax.Lvl8;

import java.util.HashSet;
import java.util.Set;

class Lct11_CatPlusDogSetsUsingADDALL {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }






    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();

        for (int i = 0; i < 4; i++){
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet <Dog> dogs  =new HashSet<Dog>();
        for (int i = 0; i < 3; i++){
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet <Object> join=new HashSet<Object>();
        join.addAll(cats);
        join.addAll(dogs);
        return join;
    }






    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object pet : pets){
            System.out.println(pet);
        }
    }





    public static class Cat {

    }
    public static class Dog {

    }

}