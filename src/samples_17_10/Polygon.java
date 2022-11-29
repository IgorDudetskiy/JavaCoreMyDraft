package samples_17_10;

public class Polygon {
    public static void main(String[] args) {
        Polygon l = new Polygon();
        int a=3,b=4,c=5,d=6,e=7;
        double g,f;
        int b2=2;

        g=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(g);

        f=Math.sqrt(Math.pow(c,2)+Math.pow(g,2));
        System.out.println(f);

        double p =(e+d+f)/2;
        System.out.println(p);

        double s3;
        s3=Math.sqrt(p*(p-e)*(p-d)*(p-f));
        System.out.println(s3);

        double s1 = (a*b)/2;

        double s2 = (g*c)/2;

        double s4;
        s4=s1+s2+s3;
        System.out.printf("area polygon = %.2f",s4);






    }
}
