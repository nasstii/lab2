import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль");
        int nnew = 0;
        int n = 0;
        while (n<2) {
            String pas;
            pas = in.nextLine();
            int len = pas.length();
            Pattern p1 = Pattern.compile("[A-Z]");
            Matcher m1 = p1.matcher(pas);
            Pattern p2 = Pattern.compile("[a-z]");
            Matcher m2 = p2.matcher(pas);
            Pattern p3 = Pattern.compile("[0-9]");
            Matcher m3 = p3.matcher(pas);
            Pattern pa1 = Pattern.compile("[^A-z_0-9]");
            Matcher ma1 = pa1.matcher(pas);
            if (len>=8) {
                if ((m1.find())&&(m2.find())&&(m3.find())) {
                    if (ma1.find()) {
                        n+=1;
                        nnew = 3-n;
                        System.out.println("Пароль ненадежен. Повторите ввод. У вас осталось " + nnew + " попытки");
                    }
                    else {
                        System.out.println("Пароль надежен");
                        n=10;
                    }
                }
                else{
                    n+=1;
                    nnew = 3-n;
                    System.out.println("Пароль ненадежен. Повторите ввод.  У вас осталось " + nnew + " попытки");
                }
            }
            else{
                n+=1;
                nnew = 3-n;
                System.out.println("Пароль ненадежен. Повторите ввод.  У вас осталось " + nnew + " попытки");
            }
        }
        if (n==2)
            System.out.println("Попробуйте ещё раз позже");
    }
}