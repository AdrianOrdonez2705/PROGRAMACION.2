package PRACTICAS.practica03.Ejercicio4;

public class Libro {
    private String titulo;
    private Autor autor;
    private int ISBN;
    private String genero;
    private boolean disponible = true;

    public Libro(String titulo,Autor autor,int ISBN,String genero){
        this.titulo=titulo;
        this.ISBN=ISBN;
        this.autor=autor;
        this.genero=genero;
    }

    // Inicio - getters setters
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    // Fin - getters setters
}
