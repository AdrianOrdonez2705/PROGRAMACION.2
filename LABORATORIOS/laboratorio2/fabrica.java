package laboratorio2;

public class fabrica {
    public static void main(String[] args) {

        // INSTANCIA DE (3) OBJETOS DE TYPE auto
        auto petaAuto = new auto(); // Instanciar un objeto Type = auto, Object = petaAuto
        auto lamboAuto = new auto(); // Instanciar un objeto Type = auto, Object = lamboAuto
        auto quantumAuto = new auto(); // Instanciar un objeto Type = auto, Object = quantumAuto

        System.out.println("-----PARA LA PETA");
        petaAuto.acelerar("Herbie");
        petaAuto.frenar("Herbie");
        petaAuto.tocarBocina(1);

        System.out.println("-----PARA EL LAMBO"); 
        lamboAuto.acelerar("Johnny");
        lamboAuto.frenar("Johnny");
        lamboAuto.tocarBocina(2);

        System.out.println("-----PARA EL QUANTUM");
        quantumAuto.acelerar("Kevin");
        quantumAuto.frenar("Kevin");
        quantumAuto.tocarBocina(1);
    }
}