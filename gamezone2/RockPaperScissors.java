/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RockPaperScissors {

    private String usuario;
    private Integer winuser;
    private Integer pc;
    private Integer wincomp;
    private Integer nusuario;
    private Integer empate;

    public RockPaperScissors() {
        this.wincomp = 0;
        this.winuser = 0;
        this.empate = 0;
    }

    public void ganador() {
        if (this.nusuario == this.pc) {
            System.out.println("Empate");
            empate++;
        } else if ((this.nusuario == 1 && this.pc == 3) || (this.nusuario == 2 && this.pc == 1) || (this.nusuario == 3 && this.pc == 2)) {
            System.out.println("Ganas");
            winuser++;
        } else if ((this.nusuario == 1 && this.pc == 2) || (this.nusuario == 2 && this.pc == 3) || (this.nusuario == 3 && this.pc == 1)) {
            System.out.println("Pierdes");
            wincomp++;
        }else if(this.nusuario==0){
            wincomp++;
        }

    }

    public void estadisticas() {
        System.out.println();
        System.out.println(String.format("Empataron %d veces\nGanaste %d veces\nPerdiste %d veces", empate, winuser, wincomp));
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario() {
        Scanner pen = new Scanner(System.in);
        String opcion = pen.next();
        String n = opcion.substring(0, 2);
        this.setOpcionPC();
        if (opcion.equalsIgnoreCase("scissors") || n.equalsIgnoreCase("sc")) {
            this.usuario = opcion;
            this.nusuario = 3;
        } else if (opcion.equalsIgnoreCase("rock") || n.equalsIgnoreCase("ro")) {
            this.usuario = opcion;
            this.nusuario = 1;
        } else if (opcion.equalsIgnoreCase("paper") || n.equalsIgnoreCase("pa")) {
            this.usuario = opcion;
            this.nusuario = 2;
        }else{
            System.out.println("opcion incorrecta, pierdes automatico");
            this.nusuario=0;
        }
    }

    public Integer getPc() {
        return this.pc;
    }

    private void setOpcionPC() {
        this.pc = (int) (Math.random() * 3 + 1);
    }
}
