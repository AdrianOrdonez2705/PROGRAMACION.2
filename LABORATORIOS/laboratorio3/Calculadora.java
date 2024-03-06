package laboratorio3;

public class Calculadora {
    
    public int num1;
    public int num2;

    // Contructor con parámetros
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // SUMA
    public int sumar(){
        return getNum1() + getNum2();
    }

    // RESTA
    public int restar(){
        return getNum1() - getNum2();
    }

    // MULTIPLICACIÓN
    public int multiplicar(){
        return getNum1() * getNum2();
    }

    // DIVISIÓN
    public double dividir(){

        double res = 0;
        
        if(getNum2() != 0){
            res = getNum1() / getNum2();
        }
        else{
            res = 1;
        }

        return res;
    }


    // Setter num1
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Getter num1
    public int getNum1() {
        return num1;
    }

    // Setter num2
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Getter num2
    public int getNum2() {
        return num2;
    }


}
