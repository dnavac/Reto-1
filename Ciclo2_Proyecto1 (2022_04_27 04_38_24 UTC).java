/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo2_proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lenovo
 */
public class Ciclo2_Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0, i = 0, j = 0;
        boolean salir=false;
        
        
        Scanner entrada = new Scanner(System.in);
        int[][] nota = new int[5][4];
        while(!salir){
        JOptionPane.showMessageDialog(null, "*****************************  colegio HighSchool **********************    \n 1.Cargar calificaciones de estudiantes\n "
                + "2. Imprimir Boletin (Todas las Asignaturas)\n"
                + "3. Imprimir Estado Asignatura (Ver calificaciones de la Asignatura seleccionada)\n"
                + "4. Salir");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Elija una opcíon"));
        
      

                switch (opc) {
                    case 1:
                        for (i = 0; i < 5; i++) {
                            for (j = 0; j < 4; j++) {
                                System.out.print("Diguite la nota de la matería[" + i + "] del periodo [" + j + "]: ");
                                nota[i][j] = entrada.nextInt();
                            }
                        }
                        
                        break;
                    case 2:
                        System.out.println("Las notas son: ");
                        System.out.println("MATEMÁTICAS: \n 1° Periodo: " + nota[0][0] + "\n 2° Periodo: " + nota[0][1] + "\n 3° Periodo: " + nota[0][2] + " \n 4° Periodo: " + nota[0][3]);
                        System.out.println("CIENCIAS:\n 1° Periodo: " + nota[1][0] + "\n 2° Periodo: " + nota[1][1] + "\n 3° Periodo: " + nota[1][2] + "\n 4° Periodo: " + nota[1][3]);
                        System.out.println("INGLES: \n 1° Periodo: " + nota[2][0] + " \n 2° Periodo: " + nota[2][1] + "\n 3° Periodo: " + nota[2][2] + "\n 4° Periodo: " + nota[2][3]);
                        System.out.println("INFORMÁTICA: \n 1° Periodo: " + nota[3][0] + "\n 2° Periodo: " + nota[3][1] + "\n 3° Periodo: " + nota[3][2] + " \n 4° Periodo: " + nota[3][3]);
                        System.out.println("DEPORTES :\n 1° Periodo: " + nota[4][0] + "\n 2° Periodo: " + nota[4][1] + " \n 3° Periodo: " + nota[4][2] + "\n 4° Periodo: " + nota[4][3]);
                        break;
                    case 3:
                        int n;
                        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la matería que desea ver:\n 0.Matemáticas \n 1. Ciencias \n 2. Ingles \n 3. Informática \n 4. Deportes"));
                        switch (n) {
                            case (0):
                                JOptionPane.showMessageDialog(null, "Las notas de Matemáticas son: \n 1° Periodo:" + nota[0][0] + "\n 2° Periodo: " + nota[0][1] + "\n 3° Periodo: " + nota[0][2] + " \n 4° Periodo:" + nota[0][3]);
                                break;
                            case (1):
                                JOptionPane.showMessageDialog(null, "Las notas de Ciencias son: \n 1° Periodo:" + nota[1][0] + "\n 2° Periodo: " + nota[1][1] + "\n 3° Periodo: " + nota[1][2] + " \n 4° Periodo:" + nota[1][3]);
                                break;
                            case (2):
                                JOptionPane.showMessageDialog(null, "Las notas de Ingles son: \n 1° Periodo:" + nota[2][0] + "\n 2° Periodo: " + nota[2][1] + "\n 3° Periodo: " + nota[2][2] + " \n 4° Periodo:" + nota[2][3]);
                                break;
                            case (3):
                                JOptionPane.showMessageDialog(null, "Las notas de Informática son: \n 1° Periodo:" + nota[3][0] + "\n 2° Periodo: " + nota[3][1] + "\n 3° Periodo: " + nota[3][2] + " \n 4° Periodo:" + nota[3][3]);
                                break;
                            case (4):
                                JOptionPane.showMessageDialog(null, "Las notas de Deportes son: \n 1° Periodo:" + nota[4][0] + "\n 2° Periodo: " + nota[4][1] + "\n 3° Periodo: " + nota[4][2] + " \n 4° Periodo:" + nota[4][3]);
                                break;
                            default:
                                JOptionPane.showInputDialog("Numero no valido, intentelo de nuevo.");
                                break;
                                
                        }           break;
                    case 4:
                        salir=true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Numero no valido, intentelo de nuevo.");
                        break;
                }
        
        
    }
    }
}
