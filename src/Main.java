public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 2_459_000;
        double sum = 0;
        int month = 0;
        while (sum <= total) {
            month++;
            sum = sum + sum / 100;
            sum = sum + salary;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 2");

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();

        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRateForThousand = 17;
        int mortalityForThousand = 8;
        int years = 0;
        while (years < 10) {
            years++;
            population += (birthRateForThousand - mortalityForThousand) * population / 1_000;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }

        System.out.println("Задача 4");

        sum = 15_000;
        month = 0;
        double persent = 7 / 100D;
        total = 12_000_000;
        while (sum <= total) {
            month++;
            sum += sum * persent;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Задача 5");

        sum = 15_000;
        month = 0;
        persent = 7 / 100D;
        total = 12_000_000;
        while (sum <= total) {
            month++;
            sum += sum * persent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println("Задача 6");

        sum = 15_000;
        month = 0;
        persent = 7 / 100D;
        int months = 9 * 12;
        while (month < months) {
            month++;
            sum += sum * persent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
        }

        System.out.println("Задача 7");

        int friday1 = 1;
        for (int friday = friday1; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача 8");

        int currentYear = 2024;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        int period = 79;
        int startPeriod = 0;
        for (int year = startPeriod; year <= finishYear; year += period) {
            if (year >= startYear) {
                System.out.println(year);
            }

        }

    }
}