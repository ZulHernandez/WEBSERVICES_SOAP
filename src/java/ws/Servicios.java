/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author saulu
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    /**
     * This is a sample web service operation
     * @param numUno
     * @param numDos
     * @param operacion
     * @return 
     */
    //ESTE WEBMETHOD NOS DA UN SERVICIO DE CALCULADORA SENCILLA
    
    @WebMethod(operationName = "calculadora")
    
    //NUMUNO ES UNA VARIABLE WEB QUE ALMACENA EL PRIMER DIGITO DE LA OPERACIÓN DE LA CALCULADORA
    //NUMDOS ES UNA VARIABLE WEB QUE ALMACENA EL SEGUNDO DIGITO DE LA OPERACIÓN DE LA CALCULADORA
    //OPERACION ES UNA VARIABLE WEB QUE ALMACENA EL DIGITO CORRESPONDIENTE A UNA OPERACION EN ESPECIFICO
    //MEDIANTE UN SWITCH SE CHECA QUE OPERACIÓN SE DESEA REALIZAR Y SE PROCEDE A HACERLA
    
    public String calculadora(@WebParam(name = "numUno") String numUno,
            @WebParam(name = "numDOS") String numDos,
            @WebParam(name = "operacion") String operacion) {
        String res = "";
        double numA = Double.parseDouble(numUno); //CONTIENE LA VARIABLE WEB NUMUNO
        double numB = Double.parseDouble(numDos); //CONTIENE LA VARIABLE WEB NUMDOS
        int op = Integer.parseInt(operacion); //CONTIENE LA VARIABLE WEB OPERACION

        switch (op) {
            case 1:
                res = "" + (numA + numB);
                break;
            case 2:
                res = "" + (numA - numB);
                break;
            case 3:
                res = "" + (numA * numB);
                break;
            case 4:
                res = "" + (numA / numB);
                break;
            case 5:
                res = "" + (numA % numB);
                break;
            default:
                res = "No existe dicha operación \n"
                        + "Escribe: \n"
                        + "'1' para sumar \n"
                        + "'2' para restar \n"
                        + "'3' para multiplicar \n"
                        + "'4' para dividir \n"
                        + "'5' para modear \n";
        }
        return res;
    }
    
     //ESTE WEBMETHOD NOS DA UN SERVICIO DE LOGIN SENCILLO
    @WebMethod(operationName = "login")
    
    //USUARIO ES UNA VARIABLE WEB QUE ALMACENA EL USUARIO CON EL QUE LA PERSONA SE LOGUEARA
    //PASWORD ES UNA VARIABLE WEB QUE ALMACENA LA CONTRASEÑA PARA EL INICIO DE SESIÓN
    //MEDIANTE UN IF SE VERIFICAN LOS DATOS INGRESADO, DE SER SATISFACTORIOS SE DA UN MENSAJE DE BIENVENIDA
    //EN CASO CONTRARIO SE LE ADVIERTE QUE ALGUNO DE LOS DATOS INGRESADOS ES ERRONEO
    
    public String login(@WebParam(name = "usuario") String usuario,
            @WebParam(name = "pasword") String pasword) {
        String resp = "";

        if (usuario.equals("Saul") && pasword.equals("1234")) {
            resp = "Buneas Saul, tu sesión a sido iniciada";
        } else {
            resp = "Buneas checa tu usuario o contraseña, alguno de ellos es erroneo";
        }
        return resp;
    }
}
