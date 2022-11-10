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

        //задание 8

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100; // сумма накоплений при накоплении с процентами
            total = total + salary; // сумма накоплений
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }




    }
}