package aula04;

public class figureTriangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public figureTriangle(double ladoA, double ladoB, double ladoC) {
        this.set(ladoA, ladoB, ladoC);
    }

    public double getArea(){
        double p = (ladoA + ladoB + ladoC)/2;
        double area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
            
        return area;
    }

    public double getPerimeter(){
        return ladoA+ladoB+ladoC;
    }

    public double[] getSides(){
        double [] sides = {this.ladoA, this.ladoB, this.ladoC};
        return sides;
    }
    
    public String toString(){
        return "Triangle: " + this.ladoA + " " + this.ladoB + " " + this.ladoC + " " + "Perimeter=" + Math.round(this.getPerimeter()) + " " + "Area=" + Math.round(this.getArea());
    }

    public boolean equals(figureTriangle t){
        return (this.ladoA == t.ladoA && this.ladoB == t.ladoB && this.ladoC == t.ladoC);
    }

    public void set(double A,double B, double C){

        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;

        if (A<=0 || B<=0 || C<=0){
            throw new IllegalArgumentException("Sides must be positives");
        }
        if (A + B <= C && A + C <= B && C + B <= A){
            throw new IllegalArgumentException("Invalid triangle");
        }
    }
}
