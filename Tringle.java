package My project;
 
 class tringle {
    private double h,w;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
    
    public double getArea(){
        return 0.5*h*w;
    }
}
public class Tringle
{
    public static void main(String[] args) 
    {
        tringle t=new tringle();
         t.setH(2);
        t.setW(2);
        System.out.println(t.getArea());

        

    }
    
}
