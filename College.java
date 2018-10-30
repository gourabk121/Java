class College{
 String collegeName;
 College(String a){
 collegeName=a;

}
void display(){
 System.out.println(collegeName);

}






}

class B{
 public static void main(String[] args){
   College c=new College("BITM");
   c.display();

}


}