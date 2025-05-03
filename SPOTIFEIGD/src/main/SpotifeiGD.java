/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author garac
 */

public class SpotifeiGD {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Spotifei!");
        // chamar a tela de login dps aqui
        
    TelaCadUsuario telaCadastro = new TelaCadUsuario();
        telaCadastro.setVisible(true);
        
    }

    private static class TelaCadUsuario {

        public TelaCadUsuario() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}

