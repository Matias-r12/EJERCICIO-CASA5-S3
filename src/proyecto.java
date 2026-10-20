public class proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (progreso == 100) {
                this.terminado = true;
            }
        }
    }

    public int getProgreso() {
        return this.progreso;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public boolean isTerminado() {
        return this.terminado;
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;
            if (nuevoProgreso > 100) {
                this.progreso = 100;
                this.terminado = true;
            } else {
                this.progreso = nuevoProgreso;
            }
        }
    }
}
