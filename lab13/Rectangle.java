public class Rectangle{
    double height;
    double width;
    public void setHeigth(double h){
         height = h;
    }
    public void setWidth(double w){
         width = w;
    }
    public double getArea(){
        return height*width;
    }
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setHeigth(5.3);
        r1.setWidth(7.3);
        System.out.println(r1.getArea());
    }
}