package paquete05;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide cuando terminar el proceso
        
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        boolean bandera = true;
        // inicio de solución
        do {
            // Se presenta un mensaje en el cual el usurio debe elejir 
            //que tipo de estudiante desea ingresar
            System.out.print("Tipo de Estudiante a ingresar\n"
                    + "(1) Para Ingresar Estudiante Presencial\n"
                    + "(2) Para Ingresar Estudiante Distancia\n");
            // Se captura el valor ingresado por el usuario 
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            // Se va a solicitar ingresar los datos generales de los estudiantes
            // ya que se va a ocupar lo mismo para cualquiera de las dos opciones
            System.out.println("Ingrese los nombres del Estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del Estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del Estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del Estudiante");
            edadEst = entrada.nextInt();
            // Segun la opcion elegida se va a entrar o no al condicional
            if (tipoEstudiante == 1) {
                // Se declara,crea e inicia un objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                // Se solicita ingresar los datos correspondientes para un 
                // Estudiante de tipo Presencial
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                // Se hace uso de los métodos establecer para asignar valores
                // a los atributos del objeto correspondiente.
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                // Se agrega al arraylistde tipo Estudiante el objeto de tipo
                // EstudiantePresencial
                estudiantes.add(estudianteP);
            } else {
                // Si el usuario ingresa un número igual a 2 se ingresa a la 
                //condicion
                if (tipoEstudiante == 2) {
                    // Se declara,crea e inicia un objeto tipo 
                    // EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    // Se solicita ingresar los datos correspondientes para un 
                    // Estudiante de tipo Distancia
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    // se hace uso de los métodos establecer para asignar valores
                    // a los atributos del objeto correspondiente.
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);

                    // Se agrega al arraylistde tipo Estudiante el objeto de tipo
                    // EstudianteDistancia
                    estudiantes.add(estudianteD);

                } else {
                    //si no es ninguna de las opciones y pone cualquier otro
                    //valor sepresenta un mensaje de valor fuera del rango 
                    System.out.println("Opción fuera del rango permitido");
                }
            }

            entrada.nextLine();
            // Se pregunta si se desea ingresar más estudiante
            System.out.println("Para dejar de ingresar Estudaintes ponga(n)o "
                    + "para continuar cualquier otra letra");
            // se captura el valor ingresado por el usuario para la variable 
            // continuar
            continuar = entrada.nextLine();
            // se pregunta si el valor continuar es igual al valor "n", 
            //si es igual se asigna a bandera el valor de false y se 
            //termina el ciclo, si no es igual continua en el ciclo repetitivo 
            if (continuar.equals("n")) {
                bandera = false;
            }
        } while (bandera);

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
