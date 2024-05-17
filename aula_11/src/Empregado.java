public class Empregado {
    
    protected String name;
    protected String address;
    protected double salary;

    // Contrutor
    public Empregado() {

    }

    public Empregado(String newName, String newAddress) {
        this.name = newName;
        this.address = newAddress;
    }

    // Métodos acessores
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public double getSalary() {
        return this.salary;
    }

    // Métodos modificadores
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    
    

}
