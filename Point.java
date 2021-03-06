public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
   return x;
 }

 public double getY(){
   return y;
 }

 public double distanceTo(Point other){
   return Math.sqrt(Math.pow((other.x-x),2)+(Math.pow((other.y-y),2)));
 }

 public boolean equals( Point other) {
   return other != null && x==other.x && y == other.y;
 }

 public String toString(){
   return "("+getX()+","+getY()+")";
 }

}
