package aula04;

class Car {
    private String make;
    private String model;
    private int year;
    private int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;
    }
    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int  getKms() {
        return kms;
    }

    @Override
    public String toString() {
        return "Carro: " + make + " " + model + ", ano " + year + ", quilometragem " + kms;
    }

}
