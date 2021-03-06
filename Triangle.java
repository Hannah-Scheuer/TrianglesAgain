public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    Point a = new Point(x1,y1);
    Point b = new Point(x2,y2);
    Point c = new Point(x3,y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public double getPerimeter(){
    return v1.distanceTo(v2)+v1.distanceTo(v3)+v3.distanceTo(v2);
  }

  public double getArea(){
    double semi = getPerimeter()/2;
    return Math.sqrt(semi*(semi-v1.distanceTo(v2))*(semi-v1.distanceTo(v3))*(semi-v3.distanceTo(v2)));
  }

  public String classify(){
    double side1 = Math.round(v1.distanceTo(v2)*10000)/10000;
    double side2 = Math.round(v1.distanceTo(v3)*10000)/10000;
    double side3 = Math.round(v2.distanceTo(v3)*10000)/10000;
    if (side1==side2 && side1==side3 && side2==side3){
      return "equilateral";
    }
    else if(side1==side2 || side1==side3 || side2==side3){
      return "isosceles";
    }
    else{
      return "scalene";
    }
  }

  public String toString(){
    return "v1"+v1.toString()+" v2"+v2.toString()+" v3"+v3.toString();
  }

  public void setVertex(int index, Point newP){
    if (index==0){
      v1 = newP;
    }
    else if (index==1){
      v2 = newP;
    }
    else {
      v3 = newP;
    }
  }

}
