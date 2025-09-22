package Utiles.CommonHelper;

import com.github.javafaker.Faker;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomSource {
     static  Faker faker=new Faker();
     static  Random random = new Random();

    //Methods
    public static String createFullName(){
        return faker.name().fullName();
    }
    public static String createEmail(){
        return faker.internet().emailAddress();
    }
    public static String createPassword(){
        return faker.internet().password();
    }
    public static String createFirstName(){
        return faker.name().firstName();
    }
    public static String createLastName(){
        return faker.name().lastName();
    }
    public static String createAddress(){
        return faker.address().streetAddress();
    }
    public static String createState(){
        return faker.address().state();
    }
    public static String createCity(){
        return faker.address().city();
    }
    public static String createZipCode(){
        return faker.address().zipCode();
    }
    public static String createEgyptianMobileNumber(){

        String[] prefixes = {"010", "011", "012", "015"};

        String prefix = prefixes[random.nextInt(prefixes.length)];

        String remainingDigits = faker.number().digits(8);

        return prefix + remainingDigits;

    }
    public static String createDay() {
        Date date = faker.date().birthday();
        return new SimpleDateFormat("dd").format(date);
    }

    public static String createMonth() {
        Date date = faker.date().birthday();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        return sdf.format(date);
    }

    public static String createYear() {
        Date date = faker.date().birthday();
        return new SimpleDateFormat("yyyy").format(date);
    }



}
