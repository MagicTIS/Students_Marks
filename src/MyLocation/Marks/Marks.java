package MyLocation.Marks;

import java.util.Scanner;


public class Marks {

    @Override
    public String toString() {
        return "Marks{" +
                "x=" + x +
                ", y=" + y +
                ", calculation=" + calculation +
                '}';
    }

    private int x;
    private int y;
    private int calculation;

    public void mark() {


        Scanner scan = new Scanner( System.in );
        System.out.println( "enter case score then student mark" );
        x = scan.nextInt();
        y = scan.nextInt();

        System.out.println( "you're case score: " + x + " and your Mark: " + y );


        switch (x) {
            case 1:
                if (y < 30) {
                    System.out.println( "F" );
                }
                break;
            case 2:
                if ( 30 <= y && y < 50) {
                    System.out.println( "D" );
                }
                break;
            case 3:
                if ( 50 <= y && y < 60) {
                    System.out.println( "C" );
                }
                break;
            case 4:
                if ( 60 <= y && y < 80) {
                    System.out.println( "B" );
                }
                break;
            case 5:
                if ( 80 <= y && y < 95) {
                    System.out.println( "A" );
                }
            case 6:
                if ( y >= 95) {
                    System.out.println( "A+" );
                }

            default:
                System.out.println( "Did not make a test" );
        }
    }
}
