class Square extends Rectangle{
private static double size;
public  void setColors()
{
System.out.println("Color of Square is:"+ Circle.getColor());
}
public  void setSize()
{
size = y.nextDouble();
}
public static double getSize()
{
return size;
}
public static void getAreaS()
{
System.out.println("Area of Square :" + Math.pow((Square.getSize()),2));
}
public static void getPerimeterS()
{
System.out.println("Perimeter of square:" + (4*Square.getSize()));
}
public static void main(String[] args)
{
Square s = new Square();
s.setColor();
s.setColors();
s.setSize();
s.getAreaS();
s.getPerimeterS();
}
}
