public class Horista extends Empregado{
    
    private double hour, vl_hour;

    // Construtores
    public Horista(String newName, String newAddress, double newHour, double newVl_hour) {
        super(newName, newAddress);
        this.hour = newHour;
        this.vl_hour = newVl_hour;
    }

    public Horista() {

    }

    // Método acessor
    public double getHour() {
        return this.hour;
    }

    // Método modificador
    public void setHour(double newHour) {
        this.hour = newHour;
    }

    public void calcularSalario() {
        salary = hour * vl_hour;
    }
}
