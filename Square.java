interface Shape2d{
public double getArea();
}

class Square implements Shape2d{
 double side;
 Square(double a){
side=a;
}
public double getArea(){
return(side*side);
}
}

class mSquare{
public static void main(String[] args){
Square sq=new Square(22);
System.out.println(sq.getArea());

}

}