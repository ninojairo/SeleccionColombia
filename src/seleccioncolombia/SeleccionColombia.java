/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccioncolombia;

/**
 *
 * @author jaironino
 */
public class SeleccionColombia {
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
                
         
    
    }
    
        
    static class Equipo{
        
        public enum Delanteros{
            //Apellido, Efectividad, Goles por partido
            FALCAO("85%", 3),
            VACCA("75%", 2),
            BORJA("70%",1),
            MURIEL("60%",1);
            private final String efectividad;
            private final int goles;

            private Delanteros(String efectividad, int goles) {
                this.efectividad = efectividad;
                this.goles = goles;
            }

            public String getEfectividad() {
                return efectividad;
            }

            public int getGoles() {
                return goles;
            }
        }
    
        public enum Volantes{
            //Apellido, Efectividad, Goles por partido
            CUADRADO(15, 2),
            JAMES(25, 3),
            QUINTERO(25,3),
            BARRIOS(5,1);
            private final int pases;
            private final int goles;

            private Volantes(int pases, int goles) {
                this.pases = pases;
                this.goles = goles;
            }

            public int getPases() {
                return pases;
            }

            public int getGoles() {
                return goles;
            }
        }
    
        public enum Defensas{
            //Apellido, Efectividad, Goles por partido
            MINA(15),
            ARIAS(25),
            MOJICA(25),
            SANCHEZ(5);
            private final int kilometros;

            private Defensas(int kilometros) {
                this.kilometros = kilometros;

            }

            public int getKilometros() {
                return kilometros;
            }
        }
    }   
   
    
    
    
    
}
