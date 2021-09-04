package My project;

 class circle {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getArea(){
        return r*r*3.14;
    }
    
}
public class Circle
{
    public static void main(String[] args) 
    {
        circle c=new circle();
         c.setR(5);
        System.out.println(c.getArea());
        

    }
    
}
