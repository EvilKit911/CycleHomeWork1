public class Main {
    public static void main(String[] args){
        // задание 1
        for(int i = 0; i <= 10 ; i++ ){// for(обьявление переменной; условие которое должно выполняться; действие которое должно выполняться)
            System.out.println("Итерация цикла " + i); // если условие выполняется, выполняется действие после {фигурных скобок}
        }

        System.out.println(" ");

        // задание 2
        for( int i = 10; i >= 0 ; i-- ){
            System.out.println("Интерация цикла " + i);
        }

        System.out.println(" ");

        // задание 3
        for( int i = 0; i <= 17 ; i = i + 2){    // не знал что так можно =)
            System.out.println("Интерация цикла " + i);
        }

        System.out.println(" ");

        // задание 4
        for(int i = 10; i >= -10; i--){
            System.out.println("Интерация цикла " + i);
        }

        System.out.println(" ");

        //задание 5

        for(int i = 1904; i <= 2096; i = i + 4){
            System.out.println("Високосный год "+ i );
        }

        System.out.println(" ");

        //задание 6

        for(int i = 0; i <=100; i = i + 7){
            System.out.println(i);
        } System.out.println("каждое число увеличено на 7");

        System.out.println(" ");
        //задание 7
        for(int i = 1; i<= 512; i = i * 2){
            System.out.println(i);
        } System.out.println("каждое число умножено на 2");

        System.out.println(" ");

        //задание 8 и 9
        // цикл 2 урок
        //задание 1
        int salary = 29000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i = i + 1 ;
            total = total + total/100; // сумма накоплений при накоплении с процентами
            total = total + salary;// сумма накоплений

            //System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total);

        System.out.println(" ");

        //задание 2

        int o = 0;
        while (o < 10){
            o = o + 1;
            System.out.println(o);
        }
        System.out.println(" ");

        for (;o > 0;o --){
            System.out.println(o);
        }

        System.out.println(" ");

        // задача 3
        int y = 12_000_000;
        int x = 0;
        int thousand = 0;// тысячи =)
        int birth = 17;
        int dead = 8;
        for(i = 1;i <= 10;i++ ){
            x = y / 1000;
            thousand = y / x; // привожу 12миллионов к тысячи
            thousand = thousand + birth - dead;// произвожу нужные вычесления
            y = thousand * x;// возвращаю полученное значение к милионам
            System.out.println("Год " + i + " Численность населения составляет " + y);
        }

        System.out.println(" ");

        // задача 4

        int moneyVasa = 15000;// взнос под процент
        int percent = 0;// процент
        for(i = 1; moneyVasa < 12_000_000; i++){
            percent = moneyVasa / 100 * 7;
            moneyVasa = moneyVasa + percent;
            if(i % 6 == 0) {
                System.out.println("Месяц " + i + " Накопления " + moneyVasa);
            }
        }

        System.out.println(" ");

        //задача 5

        int moneyVasa1 = 15000;// взнос под процент
        int percent1 = 0;// процент
        int year = 12 * 9;// количество месяцов в 9 годах
        for(int i1 =1;i1 <=year; i1++){
            percent1 = moneyVasa1 / 100 * 7;
            moneyVasa1 = moneyVasa1 + percent1;
            if(i1 % 6 == 0) {
                System.out.println("Месяц " + i1 + " Накопления " + moneyVasa1);
            }
        }

        System.out.println(" ");

        // задача 6
        int yearComet = 79;
        int yearDone = 2060;
        int yearStart = 1820;
        int yearZero = 0;
        while(yearZero <= yearDone){
            yearZero = yearZero + yearComet;
            if(yearZero >= yearStart){
             if (yearZero < yearDone){
                System.out.println("Год когда комета снова пролетит " + yearZero);
           }}
        }

        System.out.println(" ");

        // задача 7

        int onePeremen = 2;
        for(int q = 1; q<=10; q++){
            int result = onePeremen * q;
            System.out.println(onePeremen + "*" + q + "=" + result);
        }




    }
}