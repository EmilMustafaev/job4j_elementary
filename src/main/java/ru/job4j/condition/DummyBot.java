package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            result = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            result = "See you later.";
        }
        return result;
    }

    public static void main(String[] args) {
        String result1 = DummyBot.answer("Hi, Bot.");
        System.out.println(result1);
        String result2 = DummyBot.answer("Bye.");
        System.out.println(result2);
        String result3 = DummyBot.answer("Can you add two plus two?");
        System.out.println(result3);

    }
}
