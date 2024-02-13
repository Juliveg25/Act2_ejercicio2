import java.util.Random;

public class Students {
    private static int thinStudents;
    public static final int allStudents = 300; //total estudiantes que asistirá al paseo.

    public static int getThinStudents() {
        return thinStudents;
    }

    public static void setThinStudents(int newThin) {
        if (newThin != 0){
            thinStudents = newThin;
        }
    }
    //genera un numero de random de estudiantes flacos.
    public static int randomWeight (int allStudents) {
        Random myRandom = new Random();
        return myRandom.nextInt(allStudents + 1);
    }

}


