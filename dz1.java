/**
 * program
 */
import java.util.Scanner;
public class dz1 { 
public static void main(String[] args) {

}

static int nums_check(){
    Scanner numbers = new Scanner(System.in);
    int nums_out;
          while (true)
          {
              System.out.println("Введите число");
              if (numbers.hasNextInt())
              {
                  nums_out = Integer.parseInt(numbers.nextLine()); //(parseInt)преобразование строки в число
                  return nums_out;
              }
              else
              {
                  System.out.println("Вы ввели не число");
                  numbers.nextLine();
              }
            }
        }


}