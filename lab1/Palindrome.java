
package lab1;

public class Palindrome {

    public static void main(String[] args) {
        //Введение данных в массив
        String[] word = new String[] {"java", "Palindrome", "madam", "racecar", "apple", "kayak", "song", "noon", "спел лепс"};
        //Цикл на введение данных масива в функцию обработки
        for(int i = 0; i < word.length; i++){
            boolean result = isPalindrome(word[i]);
            //Вывод результа
            System.out.println("Является ли слово "+ word[i] +" палиндромом? - " + result);
        }
    }

    /**
     * Функция по проверке, является ли слово полиндромом
     * @param s входящий параметр (слово)
     * @return boolean (true или false)
     */
    public static boolean isPalindrome(String s) {

//        System.out.println("Входящее слово: " + s);

        //Цикл прохода по слову в одну сторону и в обратную
        for (int i=0 , j=s.length()-1 ; i<j ; i++ , j-- ) {

//            System.out.println(s.charAt(i));
//            System.out.println(s.charAt(j));

            //Проверка, на совпадение букв, если буквы различаются, цикл продолжается
            if ( s.charAt(i) != s.charAt(j) ) {
                //Возвращение результата и прерывание цикла
                return false;
            }
        }

        //Возвращение результата
        return true;
    }
}
