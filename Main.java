package com.company;
import java.util.Scanner;
//урок второй, не смог создать новый пакет/класс
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    //Integer1. Дано расстояние L в сантиметрах. Используя операцию деления
        // нацело, найти количество полных метров в нем (1 метр = 100 см).
        /*
        System.out.print("Введите целое число - количество сантиметров: ");
        int L = in.nextInt();
        int m = L/100;
        System.out.println("Количество полных метров в L: "+m);
         */
        //Integer3. Дан размер файла в байтах. Используя операцию деления нацело,
        //найти количество полных килобайтов, которые занимает данный файл
        //(1 килобайт = 1024 байта).
        /*
        System.out.print("Введите число байт: ");
        int bytes= in.nextInt();
        System.out.print(bytes/(double)1024 + " килобайтов");
         */
        //Integer6. Дано двузначное число. Вывести вначале его левую цифру (десятки),
        //a затем — его правую цифру (единицы).
        //Для нахождения десятков использовать операцию деления нацело,
        //для нахождения единиц — операцию взятия остатка от деления
        /*
        System.out.print("Введите двузначное число: ");
        int number= in.nextInt();
        System.out.println("Десятки "+number/10);
        System.out.println("Единицы "+number%10);
         */
        //Integer7. Дано двузначное число. Найти сумму и произведение его цифр.
        /*
        System.out.print("Введите двузначное число: ");
        int num= in.nextInt();
        int a=num/10;
        int b=num%10;
        int c=a+b;
        int d=a*b;
        System.out.println("Cумма цифр: "+(a+b));
        System.out.print("Произведение: "+(a*b));
        */
        //Integer8. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
        /*
        System.out.print("Введите двузначное число: ");
        int num = in.nextInt();
        int a=num/10;
        int b=num%10;
        int c=b*10+a;
        System.out.println("Полученое число "+c);
         */
        //Integer9. Дано трехзначное число. Используя одну операцию деления нацело,
        //вывести первую цифру данного числа (сотни).
        /*
        System.out.print("Введите трехзначное число: ");
        int num= in.nextInt();
        System.out.print("Первое цифра числа "+num/100);
         */
        //Integer10. Дано трехзначное число. Вывести вначале его последнюю цифру
        //(единицы), а затем — его среднюю цифру (десятки).
        /*
        System.out.print("Введите трехзначное число: ");
        int num=in.nextInt();
        int a=num%10;
        System.out.println("Единицы: "+a);
        int b=(num/10)%10;//(num%100)/10;
        System.out.println("Десятки: "+b);
         */
        //Integer11. Дано трехзначное число. Найти сумму и произведение его цифр.
        /*
        System.out.print("Введите трехзначное число: ");
        int num=in.nextInt();
        int ed=num%10;
        int des=(num%100)/10;
        int sot=num/100;
        int sum=ed+des+sot;
        int pr=ed*des*sot;
        System.out.printf("Cумма цифр: %d \n Произведение цифр: %d",sum,pr);
         */
        //Integer12. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        /*
        System.out.print("Введите трехзначное число: ");
        int num=in.nextInt();
        int ed=num%10;
        int des=(num%100)/10;
        int sot=num/100;
        int ed1=ed*100;
        int des1=des*10;
        int res=ed1+des1+sot;
        System.out.print("Полученое при прочтении наоброт: "+res);
         */
        //Integer13. Дано трехзначное число. В нем зачеркнули первую слева цифру и
        //приписали ее справа. Вывести полученное число.
        /*
        System.out.print("Введите трехзначное число: ");
        int num=in.nextInt();
        int sot=num/100;
        int ost=num%100;
        int res=ost*10+sot;
        System.out.print(res);
         */
    }
}
