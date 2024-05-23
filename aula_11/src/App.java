public class App {
    public static void main(String[] args) throws Exception {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados Mensalistas
        // men1
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        
        men1.imprimir();


        // men2
        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();

        men2.imprimir();


        // Empregados Horistas
        //hora1
        hora1 = new Horista("Carlos", "Rua xyz", 20, 50);
        hora1.calcularSalario();

        hora1.imprimir();

        //hora2
        hora2 = new Horista("Cristina", "Rua do centro", 100, 50);
        hora2.calcularSalario();

        hora2.imprimir();
    }
}
