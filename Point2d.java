class Point2d{
double x,y;
Point2d(double len,double wid){
x=len;
y=wid;
}
}

interface Shape2d{public double getArea();}

class Square1 extends Point2d implements Shape2d{
Square1(double len,double wid){super(len,wid);}
public double getArea(){
return(x*y);
}
}


class mSquare1{
public static void main(String[] args){
Square1 sqa=new Square1(12,45);
System.out.println(sqa.getArea());
}


}