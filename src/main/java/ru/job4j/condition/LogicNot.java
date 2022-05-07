package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
       return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
       return isPositive(num) && !isEven(num);
      }

   public static boolean evenOrNotPositive(int num) {
       return !isPositive(num) || isEven(num);
   }

    public static void main(String[] args) {
    int number = 3;
    Boolean iseven = LogicNot.isEven(number);
    Boolean ispositive = LogicNot.isPositive(number);
    Boolean noteven = LogicNot.notEven(number);
    Boolean notpositive = LogicNot.notPositive(number);
    Boolean notevenAndpositive = LogicNot.notEvenAndPositive(number);
    Boolean evenOrnotpositive = LogicNot.evenOrNotPositive(number);
    System.out.println("_________________________________________________"); 
    System.out.println("Четное число? Ответ: " + iseven + ".");
    System.out.println("Не четное число? Ответ: " + noteven + ".");
    System.out.println("_________________________________________________");
    System.out.println("Положительное число? Ответ: " + ispositive + ".");
    System.out.println("Не положительное число? Ответ: " + notpositive + ".");
    System.out.println("_________________________________________________");
    System.out.println("Число нечетное и положительное? Ответ: " + notevenAndpositive + ".");
    System.out.println("Число четное или не положительное? Ответ: " + evenOrnotpositive + ".");  }
}


