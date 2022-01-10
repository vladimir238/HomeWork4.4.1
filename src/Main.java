// Программа создает телефонные номера с заданными первыми 4 цифрами
// Склеивает их в строку,затем по шаблону проверяет их на наличие платиновых номеров

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Телефонные номера начинаются на +7926 ");
        StringBuilder builder = new StringBuilder();
        Rect rect = new Rect("+7926");
        // Создаем номера телефонов
        for (int i = 0; i < 8; i++) {

            builder.append(rect.glueNumber());

        }

        // /Получаем строку из номеров телефонов

        String rs = builder.toString();
        System.out.println(rs);
        System.out.println("Поиск номеров с повторяющимся набором цифр две и более 3 ");

        // Разбиваем строку на номера по критериям номеров телефонов

        Pattern pattern = Pattern.compile("\\+7\\d{10}");
        Matcher m = pattern.matcher(rs);
        int l = 0;
        Number number = new Number();
        while (m.find()) {

            String rs1 = rs.substring(m.start(), m.end());
        // Проверяем номер на соответсвию критериям и выводим их

            if (number.controlPlatinum(rs1) == true) {
                l++;
                System.out.println("Есть номер с повторяющимся набором цифр " + rs1);
            }
        }
        if (l == 0) System.out.println("Номеров соответствующих критериям отбора нет .");


    }


}
