import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy, начиная с 1900 года до 9000 года");
        String data;
        data = in.nextLine();
        Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher m = p.matcher(data);
        Pattern p11 = Pattern.compile("\\d(0)[1-9]]/\\d{2}/\\d{4}");
        Matcher m11 = p11.matcher(data);
        Pattern p12 = Pattern.compile("\\d(3)[0-1]/\\d{2}/\\d{4}");
        Matcher m12 = p12.matcher(data);
        Pattern p13 = Pattern.compile("[1-2][0-9]/\\d{2}/\\d{4}");
        Matcher m13 = p13.matcher(data);
        Pattern p21 = Pattern.compile("\\d{2}/[0][1-9]/\\d{4}");
        Matcher m21 = p21.matcher(data);
        Pattern p22 = Pattern.compile("\\d{2}/[1][0-2]/\\d{4}");
        Matcher m22 = p22.matcher(data);
        Pattern p31 = Pattern.compile("\\d{2}/\\d{2}/[1][9][0-9][0-9]");
        Matcher m31 = p31.matcher(data);
        Pattern p32 = Pattern.compile("\\d{2}/\\d{2}/[2-8][0-9][0-9][0-9]");
        Matcher m32 = p32.matcher(data);
        Pattern p33 = Pattern.compile("\\d{2}/\\d{2}/[9][0][0][0]");
        Matcher m33 = p33.matcher(data);
        if (m.find()) {
            if (((m11.find())|(m12.find())|(m13.find()))&&((m21.find())|(m22.find()))&&((m31.find())|(m32.find())|(m33.find())))
                System.out.println("Введенное выражение является датой");
            else
                System.out.println("Введенное выражение не является датой");
        }
        else
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
    }
}
