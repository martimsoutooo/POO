package aula07.exercicio1;

class figureRectangle extends Forma {
    private double length;
    private double height;

    public figureRectangle(double length, double height, String cor){
        super(cor);
        this.set(length, height);
    }

    public String toString(){
        return "Rectangle: " + this.length + " " + this.height + " " + "Perimeter=" + Math.round(this.getPerimeter()) + " " + "Area=" + Math.round(this.getArea()) + " Cor=" + this.cor;
    }

    public boolean equals(figureRectangle r){
        return (this.length == r.length && this.height == r.height);
    }

    public double[] getSides(){

        double[] sides = {this.length, this.height};
        return sides;
    }

    public String getCor() {
        return cor;
    }

    public void set(double l, double h){
        if(l<=0 || h<=0){
            throw new IllegalArgumentException("Sides must be positives");        
        }
        this.length = l;
        this.height = h;
    }
    @Override
    public double getArea(){
        return this.height * this.length;
    }
    @Override
    public double getPerimeter(){
        return(2*this.length)+(2*this.height);
    }

}
