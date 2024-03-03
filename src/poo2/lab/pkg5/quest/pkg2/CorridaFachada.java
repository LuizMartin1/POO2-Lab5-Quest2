/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg5.quest.pkg2;

/**
 *
 * @author Luiz Henrique
 */
public class CorridaFachada {
    
    CintoSeguranca cinto;
    Farol farol;
    Motor motor;
    Porta porta;
    Radio radio;
    
    public CorridaFachada(CintoSeguranca cinto, Farol farol, Motor motor, Porta porta, Radio radio){
        
        this.cinto = cinto;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }
    
    public void iniciarCorrida(){
        System.out.println("Preparando para a corrida...");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar("JovemPan");
    }
    
    public void finalizarCorrida(){
        System.out.println("Encerrando a corrida...");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}
