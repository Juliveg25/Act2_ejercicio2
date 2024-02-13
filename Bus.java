
public class Bus {
    public int busSeats = 40;

    public void assignSeats(int amountOfThin, int amountOfFat){
        int doubleSeats = amountOfFat * 2; //total de sillas dobles
        double totalSeats = ((double)doubleSeats + (double)amountOfThin); //sumando sillas
        int exactBuses = (int) Math.ceil(totalSeats / (double)busSeats); //aproximando al siguiente int.

        System.out.println("Este es el total de estudiantes flacos que asistirán al paseo: " + amountOfThin + "\n"
                + "Este es el total de estudiantes gordos que asistirán al paseo: " + amountOfFat);
        System.out.println("Para un total de " + totalSeats + " sillas. \n"
                + "Si se contratan buses de 40 sillas, el total de buses que se necesita contratar es de: " + exactBuses);

    }
}
