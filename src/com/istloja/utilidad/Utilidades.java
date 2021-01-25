/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.utilidad;

import java.util.regex.Pattern;

/**
 *
 * @author johnp
 */
public class Utilidades {

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }
    
    public boolean validarNumeros(String numero){
        if (numero.isEmpty()) {
            return false;
        }else if (numero.length()<10) {
            return false;
        }
        try {
            int validarNumero=Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//public String EliminarEspaciosMetodoInicial(String cadena){        
//        String newCadena = "";        
//        for(int i=0; i<cadena.length(); i++){
//           if(cadena.charAt(i)!=' ' && cadena.charAt(i)!='\n'){
//              newCadena = newCadena + cadena.charAt(i);  
//           }
//        }        
//        return newCadena;
//    }
//
//    public String EliminarEspaciosMetodoSecundario(String cadena){
//
//        StringBuilder newCadena = new StringBuilder(cadena);
//
//        int i=0;
//        while(i<newCadena.length()){
//            if(cadena.charAt(i)==' ' || cadena.charAt(i)=='\n'){
//                newCadena.deleteCharAt(i);
//                i--;
//            }
//            i++;
//        }
//        
//        return newCadena.toString();
//    }
//
//
//    public static void main(String [] args){
//        Utilidades principal = new Utilidades();
//
//        String cadena = " Hola Mundo \n 1";
//
//        cadena = principal.EliminarEspaciosMetodoIncial(cadena);
//        cadena = principal.EliminarEspaciosMetodoSecundario(cadena);
//
//        System.out.println("Metodo Inicial: "+cadena+ " longitud: "+cadena.length());
//        System.out.println("Método Secundario: "+cadena+ " longitud: "+cadena.length());
//
//        cadena = cadena.replaceAll("\\s+", "");
//        System.out.println("Cadena: "+cadena+ " Longitud: "+cadena.length());
//
//    }
//
//    private String EliminarEspaciosMetodoIncial(String cadena) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//   
//    unction GestionPersonaV1( email ) {
//expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
//if ( !expr.test(email) )
//alert(«Error: La dirección de correo » + email + » es incorrecta.»);
//}
    private static boolean validarMovilER(String movil) {
    Utilidades Utilidades = Utilidades.compile("^(\+34|0034|34)?[6|7|9][0-9]{8}$");
    return Utilidades.matcher(movil).matches();
}

private static boolean validarMovilP(String movil) {
    Pattern Utilidades = Utilidades.PHONE;
    return pattern.matcher(movil).matches();
}
}
 

