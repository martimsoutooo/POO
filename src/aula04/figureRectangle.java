package aula04;

class figureRectangle {
    private double length;
    private double height;

    public figureRectangle(double length, double height){
        this.set(length, height);
    }

    public String toString(){
        return "Rectangle: " + this.length + " " + this.height + " " + "Perimeter=" + Math.round(this.getPerimeter()) + " " + "Area=" + Math.round(this.getArea());
    }

    public boolean equals(figureRectangle r){
        return (this.length == r.length && this.height == r.height);
    }

    public double[] getSides(){

        double[] sides = {this.length, this.height};
        return sides;
    }

    public void set(double l, double h){
        if(l<=0 || h<=0){
            throw new IllegalArgumentException("Sides must be positives");        
        }

        this.length = l;
        this.height = h;
    }

    public double getArea(){
        return this.height * this.length;
    }
    
    public double getPerimeter(){
        return(2*this.length)+(2*this.height);
    }

}
