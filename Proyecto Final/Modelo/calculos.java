package Modelo;

public class calculos {
    
    public double calcularNotaPonderada(double nota, double ponderacion) {
    	if (verificarRangosNotas(nota) && verificarRangosPonderacion(ponderacion)) {
    		double resultado = (nota / 100.00) * ponderacion;
    		return redondearADosDecimales(resultado);
    	}
    		
    	return -1;
    }
    
    public double calcularPromedioFinal(double notaHabilitacion, double notaExamenFinal) {
    	 if (verificarRangosNotas(notaHabilitacion) && verificarRangosNotas(notaExamenFinal)) {
             double resultado = (notaHabilitacion + notaExamenFinal) / 2.00;
             return redondearADosDecimales(resultado);
         }
         
    	 return -1;
    }
    
    private double redondearADosDecimales(double calificacion) {
        double notaRedondeada = Math.round(calificacion * 100.0) / 100.0;
        return notaRedondeada;
    }
    
    private boolean verificarRangosNotas(double nota) {
    	return nota >= 0 && nota <= 100;
    }
    
    private boolean verificarRangosPonderacion(double ponderacion) {
    	return ponderacion >= 1 && ponderacion <= 100;
    }
}


