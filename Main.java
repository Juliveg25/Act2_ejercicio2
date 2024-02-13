public class Main {

    public static void main(String[] args) {
        Students.setThinStudents(Students.randomWeight(Students.allStudents)); //asigna un numero random de estudiantes
        // flacos.
        int amountOfThin = Students.getThinStudents(); //total estudiantes flacos.
        int amountOfFat = Students.allStudents - amountOfThin; //total estudiantes gordos.
        Bus myBus = new Bus();
        myBus.assignSeats(amountOfThin, amountOfFat);//llamada al metodo para encontrar cuantas sillas se necesitan y
        // cuantos buses se deben contratar.
     }
}