package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
         idea += "But I am a newbie.";
        String separate = " ";
         int year = 2023;
        idea = idea +  year + separate + "years old";
        System.out.println(idea);
    }
}
