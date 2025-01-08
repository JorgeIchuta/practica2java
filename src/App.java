public class App {
    public static void main(String[] args) throws Exception {
        Empresa e1 = new Empresa();
        Empresa e2 = new Empresa("Dazasoft");

        Empleado em1 = new Empleado();
        Empleado em2 = new Empleado("Maria", "secretaria",5000);
        System.out.println("------------------------------");
        e1.mostrar();
        System.out.println("------------------------------");
        e2.mostrar();
        System.out.println("------------------------------");
        em1.mostrar();
        System.out.println("------------------------------");
        em2.mostrar();
        System.out.println("------------------------------");
        //b)
        e1.verificarEmpleado("juan");
        System.out.println("------------------------------");
        //c)
        if (e1.adicionarEmpleado(em1)) {
            System.out.println("Se adiciono");
        }else{
            System.out.println("No se adiciono");
        }
        e1.mostrar();
    }
}
