public class Main{
    public static void main(String[] args) {
        proyecto p = new proyecto();
        p.setNombre("Sistema Web");
        p.setProgreso(80);

        p.avanzar(30); // Superaría 100, debe limitarse a 100
        System.out.println("Progreso actual: " + p.getProgreso() + "%");
        System.out.println("Terminado: " + p.isTerminado());
    }
}
