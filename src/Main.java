public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 17;
        // Решение через переменную
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +" , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Решение через boolean
        boolean humanLegalAge = age >= 18;
        if (humanLegalAge) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // Задача 2
        int temp = 6;
        // Так как в задаче не сказано, что делать в случае равенства 5 градусам, то добавил еще условие
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, решай сам");
        }
        // Задача 3
        int speed = 60;
        boolean speedMore60Less60 = speed <= 60;
        if (speedMore60Less60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        // Задача 4
        int humanAge = 70;
        // Так как в задаче не сказано, что делать до 2 лет, то добавил еще условие
        // Иначе был бы конфликт по логике при указании 1 года - он ходил бы на работу
        if (humanAge <= 1) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему никуда не нужно ходить");
        } else if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему пора ходить на работу");
        }
        // Задача 5
        int babyAge = 4;
        if (babyAge < 5) {
            System.out.println("Если возраст ребенка равен " + babyAge +
                    ", то ему нельзя кататься на аттракционе");
        } else if (babyAge >= 5 && babyAge < 14) {
            System.out.println("Если возраст ребенка равен " + babyAge +
                    ", то, чтобы ему кататься, нужен взрослый старше 18 лет для сопровождения!");
        } else {
            System.out.println("Если возраст ребенка равен " + babyAge +
                    ", то он может кататься без сопровождения взрослого");
        }
        // Задача 6
        int passengers = 103;
        int capacity = 102;
        int seats = 60;
        int standing = capacity - seats;
        System.out.println("В вагоне " + capacity + " места, из них сидячих - " + seats + ", а стоячих - " + standing);
        if (passengers < capacity && passengers <= seats) {
            System.out.println("Если в вагон зашло " + passengers + " пассажира(ов), " +
                    "то в вагоне места есть и осталось " + (seats - passengers) + " сидячих и " + standing + " стоячих места");
        } else if (passengers < capacity && passengers > seats) {
            System.out.println("Если в вагон зашло " + passengers + " пассажира(ов), " +
                    "то в вагоне места еще есть, но осталось только " + (standing + seats - passengers) + " стоячих места");
        } else if (passengers == capacity) {
            System.out.println("Если в вагон зашло " + passengers + " пассажира(ов), то все места заняты!");
            // Я понимаю, что это условие лишнее, можно было без него со знаками <= вместо: passengers < capacity
        } else {
            System.out.println("Если в вагон зашло " + passengers + " пассажира(ов), " +
                    "то вагон переполнен!");
        }
        // Задача 7
        int one = 60;
        int two = 80;
        int three = 50;
        if (one >= two && one >= three) {
            System.out.println("Значение " + one + " больше значения " + two + " и значения " + three);
        } else if (two >= one && two >= three) {
            System.out.println("Значение " + two + " больше значения " + one + " и значения " + three);
        } else if (three >= one && three >= two) {
            System.out.println("Значение " + three + " больше значения " + one + " и значения " + two);
        }
    }
}