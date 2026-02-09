*/Exercise 1:*
Illustrate  about  defining  a  class  named  ‘Point’  with  attributes  such  as  ‘xcoordinate’  and ‘ycoordinate’ .  Include  a  method  such  as  ‘getPoint()’ to  initialize  values  for  the  above attributes by getting input from driver code. Include another method ‘distancePoints()’ to find the distance between two Point objects using Euclidean Distance Formula.
/*





import java.util.*;

class Point {

    private double xcoordinate;
    private double ycoordinate;

    // method to set point values
    public void getPoint(double x, double y) {
        xcoordinate = x;
        ycoordinate = y;
    }

    // method to calculate distance between two points
    public double distancePoint(Point p) {
        return Math.sqrt(
                Math.pow(p.xcoordinate - xcoordinate, 2) +
                Math.pow(p.ycoordinate - ycoordinate, 2)
        );
    }
}

public class Pointdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        Point p2 = new Point();

        System.out.print("Enter X and Y for point 1: ");
        p1.getPoint(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter X and Y for point 2: ");
        p2.getPoint(sc.nextDouble(), sc.nextDouble());

        // Distance calculation
        double distance = p1.distancePoint(p2);

        System.out.println("Distance between two points: " + distance);

        sc.close();
    }
}

   

   

   
  
  