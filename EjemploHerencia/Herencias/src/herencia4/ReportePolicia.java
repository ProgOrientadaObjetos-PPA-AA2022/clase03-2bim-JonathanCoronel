/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String cod) {
        super(cod);
    }

    public void establecerPromedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + lista.get(i).getEdad();
        }
        promedioEdades = promedioEdades / lista.size();
    }

    public void establecerLista(ArrayList<Policia> lis) {
        lista = lis;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadenaPol = "";
        for (int i = 0; i < lista.size(); i++) {
            cadenaPol = String.format("%s%s\n", cadenaPol, lista.get(i));
        }
        String cadena = String.format("%s\nLista de Policias:\n"
                + "%sPromedio de Edades: %.2f\n",
                super.toString(),cadenaPol, promedioEdades);
        return cadena;
    }

}
