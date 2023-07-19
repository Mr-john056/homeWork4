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

    public static void task1 () {
        System.out.println("Задача 1");
            byte ageOfMajority = 18;
            if (ageOfMajority >= 18) {
                System.out.println("Вам 18 или больше лет");
            }
            byte minorAge = 17;
            if (minorAge < 18){
                System.out.println("Ваш возраст совершеннолетия ещё не наступил и нужно немного подождать");
            }
        System.out.println();
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte cold = 4;
        if (cold < 5){
            System.out.println("На улице " + cold + " градуса - нужно надеть шапку");
        }
        byte hot = 5;
        if (hot >= 5) {
            System.out.println("На улице " + hot + " градусов - можно идти без шапки");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte speedExceeded = 61;
        if (speedExceeded > 60) {
            System.out.println("Если скорость " + speedExceeded + " км/ч, то придется заплатить штраф");
        }
        byte noOverspeed = 60;
        if (noOverspeed <= 60) {
            System.out.println("Если скорость " + noOverspeed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte lessThanTwoYears = 1;
        if (lessThanTwoYears < 2){
            System.out.println("Если возраст человека равен " + lessThanTwoYears + ", то ему пора спать");
        }
        byte fromTwoToSixYears = 5;
        if (fromTwoToSixYears > 2 && fromTwoToSixYears < 6){
            System.out.println("Если возраст человека равен " + fromTwoToSixYears + ", то ему нужно ходить в детский сад");
        }
        byte sevenToEighteenYears = 1;
        if (sevenToEighteenYears > 7 && sevenToEighteenYears < 18){
            System.out.println("Если возраст человека равен " + sevenToEighteenYears + ", то ему нужно ходить в школу");
        }
        byte over18ButUnder24Years = 19;
        if (over18ButUnder24Years > 18 || over18ButUnder24Years < 24){
            System.out.println("Если возраст человека равен " + over18ButUnder24Years + ", то его место в университете");
        }
        byte over24Years = 25;
        if (over24Years > 24){
            System.out.println("Если возраст человека равен " + over24Years + ", то ему пора ходить на работу");
        }
        byte over60Years = 61;
        if (over60Years > 60){
            System.out.println("Если возраст человека равен " + over60Years + ", то он может отдохнуть");
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
        if (from5To14Years >= 5 && from5To14Years <14){
            System.out.println("Если возраст ребенка равен " + from5To14Years + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзяю");
        }
        byte over14Years = 15;
        if (over14Years > 14){
            System.out.println("Если возраст ребенка равен " + over14Years + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println();
    }

    public static void task6 () {
        System.out.println("Задача 6");

    }
    public static void task7 () {
        System.out.println("Задача 7");

    }
}
