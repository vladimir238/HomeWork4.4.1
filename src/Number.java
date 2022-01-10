public class Number {
    //Проверяем соответствие номера определенным критериям
    // В данном варианте это две тройки
    public boolean controlPlatinum(String num1) {

        boolean result = false;
        result = num1.matches("\\+7\\d*3\\d*3\\d*");

        if (result == true) {
            // System.out.println("3 встречается 2 и более раз " + num1);
            return true;
        } else {
           // System.out.println(" 3 встречается 1 или менее раз " + num1);
            return false;
        }
    }
}

