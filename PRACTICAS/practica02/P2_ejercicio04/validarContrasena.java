package PRACTICAS.practica02.P2_ejercicio04;

public class validarContrasena{
    public String contrasena;
    public boolean verifier;

    public validarContrasena(String contrasena, boolean verifier){
        this.contrasena = contrasena;
        this.verifier = verifier;
    }


    // Validar la contraseña
    public void controlContrasena(){

        setVerifier(false);

        boolean longitud = false;
        boolean minus = false;
        int cantidadMinusculas = 0;
        boolean mayus = false;
        boolean numero = false;
        boolean caracter = false;



        // Verificar longitud
        if(getContrasena().length() >= 10){
            longitud = true;
        }

        for (int i=0; i < getContrasena().length(); i++){

            char letra = getContrasena().charAt(i);

            // Verificar minúsculas
            if(Character.isLowerCase(letra)){
                cantidadMinusculas ++;
            }
            // Verificar mayúsculas
            else if(Character.isUpperCase(letra)){
                mayus = true;
            }
            // Verificar número
            else if(Character.isDigit(letra)){
                numero = true;
            }
            // Verificar los caracteres
            else if(letra == '%' || letra == '&' || letra == '$' || letra == '/' || letra == '*'){
                caracter = true;
            }
            else{
                getVerifier();
            }
        }

        // Verificar la cantidad de minúsculas 
        if(cantidadMinusculas >= 2){
            minus = true;
        }
        else{
            minus = false;
        }

        // Verificar parámetros
        if(longitud == true && minus == true && mayus == true && numero == true && caracter == true){
            setVerifier(true);
        }
        else{
            setVerifier(false);
        }
    }

    public void confirmarContrasena(){
        if(getVerifier() == true){
            System.out.println("La contrasena es valida");
        }
        else{
            System.out.println("Contrasena Invalida");
        }
    }

    // Contraseña
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Verificador
    public void setVerifier(boolean verifier) {
        this.verifier = verifier;
    }

    public boolean getVerifier() {
        return verifier;
    }
}