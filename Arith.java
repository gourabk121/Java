class Arith{
public static void main(String[] args){
int d,a;
try{
d=0;
a=42/d;
System.out.println(d);
}
catch(ArithmeticException e){
System.out.println("Divided by zero");
}
}
}