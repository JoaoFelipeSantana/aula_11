public class Mensalista extends Empregado{
    
    private String position;

    // Construtores
    public Mensalista(String newName, String newAddress, String newPosition) {
        super(newName, newAddress);
        this.position = newPosition;
    }

    public Mensalista() {

    }

    // Método Acessore
    public String getPosition() {
        return position;
    }

    // Método Modificador
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }
}
