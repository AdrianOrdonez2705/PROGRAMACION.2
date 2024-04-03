package laboratorio6;

/* Características de Clases Abstractas

 * - No se pueden crear objetos en clases abstractas
 * - Métodos abstractos
 * - Reutilización de Código
 * 
 *                  INTERFACES
 * Las interfaces son esqueletos o contratos que
 * definen qué comportamientos deben tener ciertas
 * clases. La interfaz solo declara los métodos que 
 * una clase debe implementar para considerarse 
 * compatible con la interfaz.
 * 
 * Las INTERFACES/CONTRATOS parametrizan a los MÉTODOS
 * 
 * Palabra clave: IMPLEMENTS
 * 
 *              'class' implements 'interface' {
    *                  @Override
    *                  method1(){
    *                  }
    * 
    *                  @Override
    *                  method2(){
    *                  }
    * 
    *                  @Override
    *                  method3(){
    *                  }
 *              }
 * 
 */

public class PromediosParciales implements notasParcialesInterfaz {

   public double exam;
   public double practica;
   public double labos;
   public double asist;

   public PromediosParciales(double exam, double practica, double labos, double asist){
      this.exam = exam;
      this.practica = practica;
      this.labos = labos;
      this. asist = asist;
   }

   @Override
   public double primerParcial(){
      
    double examen1 = getExam() * (40/100);
    double practica1 = getPractica() * (25/100);
    double labos1 = getLabos() * (25/100);
    double asist1 = getAsist() * (10/100);

    if(getAsist() == 100){
        return examen1 + practica1 + labos1 + (asist1 + 5);
    }
    else{
        return examen1 + practica1 + labos1 + asist1;
    }
    
   }

   @Override
   public double segundoParcial(){
    double examen2 = getExam() * (40/100);
    double practica2 = getPractica() * (25/100);
    double labos2 = getLabos() * (25/100);
    double asist2 = getAsist() * (10/100);

    if(getAsist() == 100){
        return examen2 + practica2 + labos2 + (asist2 + 5);
    }
    else{
        return examen2 + practica2 + labos2 + asist2;
    }
   }

   @Override
   public double tercerParcial(){
    double examen3 = getExam() * (40/100);
    double practica3 = getPractica() * (25/100);
    double labos3 = getLabos() * (25/100);
    double asist3 = getAsist() * (10/100);

    if(getAsist() == 100){
        return examen3 + practica3 + labos3 + (asist3 + 5);
    }
    else{
        return examen3 + practica3 + labos3 + asist3;
    }
   }


   // exam
   public void setExam(double exam) {
      this.exam = exam;
  }
  public double getExam() {
      return exam;
  }
  // practica
  public void setPractica(double practica) {
      this.practica = practica;
  }
  public double getPractica() {
      return practica;
  }
  // labos
  public void setLabos(double labos) {
      this.labos = labos;
  }
  public double getLabos() {
      return labos;
  }
  // asistencia
  public void setAsist(double asist) {
      this.asist = asist;
  }
  public double getAsist() {
      return asist;
  }
}




