package aula04;

import java.lang.Math;

public class figureCircle {
    private double radius;

    public figureCircle(double radius){
        this.set(radius);
    }

    public void set(double r){
        this.radius = r;

        if(r<=0){
            throw new IllegalArgumentException("Radius must be valid");
        }

    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public String toString(){
        return "Circle: Radius=" + this.radius + " Perimeter=" + Math.round(this.getPerimeter()) + " Area=" + Math.round(this.getArea());
    }

    public boolean equals(figureCircle c){
        return (c.radius == this.radius);
    }
    
    public double getRadius(){
        return this.radius;
    }
    
}
