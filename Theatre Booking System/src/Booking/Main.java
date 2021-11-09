package Booking;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Mayajal",8,12);
        theatre.getSeats();

        if (theatre.reserveSeat("A11")){
            System.out.println("Please Pay");
        }
        if (theatre.reserveSeat("F12")){
            System.out.println("Please Pay");
        }
        else {
            System.out.println("Sorry the seat was already taken");
        }
    }
}
