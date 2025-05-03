/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifei.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaPrincipal extends JFrame {
    private JButton btnCadastro;

    public TelaPrincipal() {
        setTitle("Tela Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        btnCadastro = new JButton("Cadastrar");
        add(btnCadastro);

        btnCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaCadUsuario telaCadastro = new TelaCadUsuario();
                telaCadastro.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
}