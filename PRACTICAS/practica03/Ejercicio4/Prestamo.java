package PRACTICAS.practica03.Ejercicio4;

public class Prestamo implements Transaccion{
    private String fechaPrestamo;
    private String fechaDevolucionPrevista;
    private Libro libroPrestado;
    private Usuario usuarioPrestado;

    public Prestamo(String fechaPrestamo,String fechaDevolucionPrevista,Libro libroPrestado,Usuario usuarioPrestado){
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
        this.libroPrestado = libroPrestado;
        this.usuarioPrestado = usuarioPrestado;
    }

    // Inicio - getters setters
    public String getFechaDevolucionPrevista() {
        return fechaDevolucionPrevista;
    }
    public void setFechaDevolucionPrevista(String fechaDevolucionPrevista) {
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
    }
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Libro getLibroPrestado() {
        return libroPrestado;
    }
    public void setLibroPrestado(Libro libroPrestado) {
        this.libroPrestado = libroPrestado;
    }
    public Usuario getUsuarioPrestado() {
        return usuarioPrestado;
    }
    public void setUsuarioPrestado(Usuario usuarioPrestado) {
        this.usuarioPrestado = usuarioPrestado;
    }
    // Fin - getters setters

    public void realizarTransaccion(){
        if (getLibroPrestado().getDisponible()){
            getLibroPrestado().setDisponible(false);
        }else{
            getLibroPrestado().setDisponible(true);
        }
    }
}
