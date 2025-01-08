public class Empresa {
    private String nombre;
    private int nroEmpleados;
    private String direccion;
    private String rubro;
    private String[][] em = new String[50][3];
    public Empresa() {
        this.nombre = "developers";
        this.nroEmpleados = 3;
        this.direccion = "Av. Arce";
        this.rubro = "software";
        this.em[0][0]="juan";this.em[0][1]=" contador";this.em[0][2]="2000";
        this.em[1][0]="pedro";this.em[1][1]=" analista de sistemas";this.em[1][2]="8000";
        this.em[2][0]="andres";this.em[2][1]=" jefe";this.em[2][2]="20000";
    }
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.nroEmpleados = 4;
        this.direccion = "Av. Arce";
        this.rubro = "software";
        this.em[0][0]="juan";this.em[0][1]="contador";this.em[0][2]="2000";
        this.em[1][0]="pedro";this.em[1][1]="analista de sistemas";this.em[1][2]="8000";
        this.em[2][0]="andres";this.em[2][1]="jefe";this.em[2][2]="20000";
    }
    public Empresa(String nombre, int nroEmpleados, String direccion, String rubro, String[][] em) {
        this.nombre = nombre;
        this.nroEmpleados = nroEmpleados;
        this.direccion = direccion;
        this.rubro = rubro;
        this.em = em;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("NroEmpleados: "+nroEmpleados);
        System.out.println("Direccion: "+direccion);
        System.out.println("Rubro: "+rubro);
        for (int i = 0; i < nroEmpleados; i++) {
            System.out.println("Nombre: "+this.em[i][0]+" Cargo: "+this.em[i][1]+" Sueldo: "+this.em[i][2]);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNroEmpleados() {
        return nroEmpleados;
    }
    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getRubro() {
        return rubro;
    }
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    public String[][] getEm() {
        return em;
    }
    public void setEm(String[][] em) {
        this.em = em;
    }
    
    public boolean verificarEmpleado(String nomx){
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (em[i][0] == nomx) {
                System.out.println("existe");
                return true;
            }
        }
        return false;
    }

    public boolean adicionarEmpleado(Empleado e){
        if (this.verificarEmpleado(e.getNombre())) {
            return false;
        }else{
            this.em[this.nroEmpleados][0] = e.getNombre();
            this.em[this.nroEmpleados][1] = e.getCargo();
            this.em[this.nroEmpleados][2] = String.valueOf(e.getSueldo());
            this.nroEmpleados++;
            return true;
        }
    }
}
