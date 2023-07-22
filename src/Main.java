public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 15;
        if (age >= 18) {
            System.out.println("Вам 18 или больше лет");
        } else {
            System.out.println("Ваш возраст совершеннолетия ещё не наступил и нужно немного подождать");
        }
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte temperature = 7;
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градуса - нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов - можно идти без шапки");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte age = 1;
        if (age <= 2){
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        }
        byte age = 5;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        byte age = 1;
        if (age >= 7 && age < 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        byte age = 19;
        if (age >= 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        byte age = 25;
        if (age >= 24 && age <= 60){
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        byte age = 61;
        if (age > 60){
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte lessThan5Years = 4;
        if (lessThan5Years < 5) {
            System.out.println("Если возраст ребенка равен " + lessThan5Years + ", то он не может кататься на аттракционе");
        }
        byte from5To14Years = 7;
        if (from5To14Years >= 5 && from5To14Years <=13){
            System.out.println("Если возраст ребенка равен " + from5To14Years + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзяю");
        }
        byte over14Years = 15;
        if (over14Years >= 14){
            System.out.println("Если возраст ребенка равен " + over14Years + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println();
    }

    public static void task6 () {
        System.out.println("Задача 6");
        short trainCarFull = 50;
        if (trainCarFull < 120){
            System.out.println("В вагоне есть свободные места");
        }   else {
            System.out.println("В вагоне нет мест");
        }
        if (trainCarFull <= 60){
            System.out.println("Есть свободные сидячие места");
        }
        else if (trainCarFull > 60 && trainCarFull < 102){
            System.out.println("Есть только стоячие места");
        }
       System.out.println();
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Число 1 больше чисел 2 и 3");
        } else if (two > three){
            System.out.println("Число 2 больше числа 3");
        } else System.out.println("Число 3 больше чем, число 1 и число 2");
    }
}
