import java.util.Random;

public class Rect {

    public static String number;

    //Конструктор,передаем номер региона и первые три цифры номера.
    public Rect(String number) {
        this.number = number;
    }

// Генерируем телефонный номер ,случайные числа.
    public static String genNumber() {
        Random rand = new Random();
        int sila;
        String numFone;

        sila = 1000000+rand.nextInt(8999999);
        numFone = String.valueOf(sila);
        return numFone;


    }
    // Создаем телефонный номер,как строку
    public static String glueNumber() {
        return number + genNumber() + ";";
    }



    }




