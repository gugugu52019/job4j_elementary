package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот.")) {
            rsl = "Привет, умник.";
        } else if (question.equals("Пока.")) { /* заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить. */
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Ты очень глупый Бот.");
        System.out.println(rsl);
    }
}
