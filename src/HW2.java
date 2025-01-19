import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(),34 ));
        System.out.println(permission(generateRandomAge(),45 ));
        System.out.println(permission(generateRandomAge(),30 ));
        System.out.println(permission(generateRandomAge(),25 ));
        System.out.println(permission(generateRandomAge(),24 ));

    }


    public static String permission (int age, int temn ){
        if ((age >= 20 && age <= 45) &&  (temn >= -20 && temn <= 30)){
            return "Можно идти гулят ";
        }else if (age <= 20 && (temn >= 0 && temn <= 29)) {
            return "Можно идти гулят ";
        } else if (age >= 45 &&   (temn >= -10 && temn <= 25)){
            return "Можно идти гулят ";
        } else {
            return "Оставайтесь дома ";
        } /* второй вариант как это сделат
       if ((age >= 20 && age <= 45) &&  (temn >= -20 && temn <= 30)
                || age <= 20 && (temn >= 0 && temn <= 29)
                || age >= 45 &&  ( temn >= -10 && temn <= 25)) {
            System.out.println("Можно идти гулят ");
        } else {
            System.out.println("оставайтес дома ");
        }*/
    }
    public static int generateRandomAge (){
        Random random = new Random();
        int x = random.nextInt(100);
        return x ;
    }
}