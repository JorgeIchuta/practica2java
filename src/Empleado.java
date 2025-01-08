public class Empleado {
    private String nombre;
    private String cargo;
    private int sueldo;
    public Empleado(){
        this.nombre="rodrigo";
        this.cargo="asistente";
        this.sueldo=3000;
    }
    public Empleado(String nombre, String cargo, int sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getSueldo() {
        return sueldo;
    }
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo: "+cargo);
        System.out.println("Sueldo: "+sueldo);
    } 
}
