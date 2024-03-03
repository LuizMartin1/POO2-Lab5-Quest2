/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg5.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CintoSeguranca cinto = new CintoSeguranca();
        Farol farol = new Farol();
        Motor motor = new Motor();
        Porta porta = new Porta();
        Radio radio = new Radio();
        
        CorridaFachada corrida = new CorridaFachada(cinto, farol, motor, porta, radio);
        corrida.iniciarCorrida();
        corrida.finalizarCorrida();
    }
    
}
