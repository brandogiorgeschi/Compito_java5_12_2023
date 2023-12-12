import java.io.*;
public class Main {
    public static void main(String[] Args) {
        Point point1 = new Point();
        Circle circle1 = new Circle(point1,0);
        Point point2 = new Point();
        Circle circle2 = new Circle(point2,0);
        Point point3 = new Point();
        Circle circle3 = new Circle(point3,0);
        Point point4 = new Point();
        Circle circle4 = new Circle(point4,0);


        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int y;
        for (int i = 0; i <= 3; i++) {//scelta progettuale dimensione di 3 essendo 4 le variabili associate alla classe Circle

            System.out.println("Inserire la cordinata X della circonferenza");
            try {
                x = Integer.parseInt(keyboard.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Inserire la cordinata Y della circonferenza");
            try {
                y = Integer.parseInt(keyboard.readLine());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (i == 0) {
                circle1=new Circle(point1,y);
            }
            if (i == 1) {
                circle2=new Circle(point2,y);
            }
            if (i == 2) {
                circle3=new Circle(point3,y);
            }
            if (i == 3) {
                circle4=new Circle(point4,y);
            }
        }
    }
}