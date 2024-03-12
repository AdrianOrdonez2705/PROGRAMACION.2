package PRACTICAS.practica02.P2_ejercicio04;

public class validarContrasena{
    public String contrasena;
    public int verifier;

    public validarContrasena(String contrasena, int verifier){
        this.contrasena = contrasena;
        this.verifier = verifier;
    }


    // Validar la contraseña
    public int controlContrasena(){

        setVerifier(0);

        // Verificar longitud
        if(getContrasena().length() >= 10){
            setVerifier(getVerifier() + 1);
        }

        for (int i=0; i < getContrasena().length(); i++){

            char letra = getContrasena().charAt(i);

            // Verificar minúsculas
            if(Character.isLowerCase(letra)){
                setVerifier(getVerifier() + 1);
            }
            // Verificar mayúsculas
            else if(Character.isUpperCase(letra)){
                setVerifier(getVerifier() + 1);
            }
            // Verificar número
            else if(Character.isDigit(letra)){
                setVerifier(getVerifier() + 1);
            }
            // Verificar los caracteres
            else if(letra == '%' || letra == '&' || letra == '$' || letra == '/' || letra == '*'){
                setVerifier(getVerifier() + 1);
            }
        }

        // Toda la suma en el verifier() debe ser mayor o igual a 6
        return getVerifier();
    }

    public void confirmarContrasena(){
        if(getVerifier() >= 6){
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
    public void setVerifier(int verifier) {
        this.verifier = verifier;
    }

    public int getVerifier() {
        return verifier;
    }
}