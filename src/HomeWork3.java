import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrej 'DeD' Didenko.
 * --- 17.07.2018 ---
 */
public class HomeWork3 {

 /**   Делать только одну задачу
  *
  *          1. Написать программу, которая загадывает случайное число от 0 до 9,
  * и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
  * должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
  * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
  *
  *          2 * Создать массив из слов String[] words = {"apple", "orange", "lemon",
  * "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
  * "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut","pear",
  * "pepper", "pineapple", "pumpkin", "potato"};

  * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
  * сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
  * Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
  * apple – загаданное
  * apricot - ответ игрока
  * ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
  * Для сравнения двух слов посимвольно, можно пользоваться:
  * String str = "apple"; str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
  * Играем до тех пор, пока игрок не отгадает слово0
  * Используем только маленькие буквы */

 public static Scanner sc = new Scanner(System.in);
 public static Random number = new Random();

    public static void main (String[] args){


        System.out.println("Привет! Я программа Ирина.");
        int a = getNumberFromScanner(0,9);
        System.out.println(a);
//        "Угадай, какое число я загадала от 0 до 9 , у тебя 3 попытки"

    }

    public static int getNumberFromScanner(int min, int max) {
        int d = 3 ;
        int x;
        int answer;
        do {
            System.out.println("Угадай, какое число я загадала: от 0 до 9 , у тебя " + d + " попытки!");
//            System.out.println("Смелее, я помогу тебе :)");
            int a = number.nextInt(9);
            x = sc.nextInt();
            if ( x == a ){
                System.out.println("Угодал!!!");
                d = 0 ;
              }
//              else if (x < a){
//                System.out.println("Число которое я загодала, больше того которое ты ввел ;)");
//            } else if (x > a){
//                System.out.println("Число которое я загодала, меньше того которое ты ввел ;)");
//            }
            d--;

            if (d == 0 || x == a) {
                System.out.println("Хочешь сыграть еще разок? 1 - да! , 0 - нет!");
                answer = sc.nextInt();
                if (answer == 1){
                    System.out.println("Ну погнали!!!");
                    getNumberFromScanner(0,9);
                } else
                    System.out.println("Удачи мой друг :)");
                break;
            }
        } while (x != number.nextInt(9));
       // System.out.println("Твое последнее число которое ты ввел");  - почему-то выводит столько раз сколько раз я сыграл в игру
        return x;
    }

}
