package com.company;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Atividade03 {
    public Atividade03() {
    }

    public static void main(String[] args) {
        String dado = JOptionPane.showInputDialog("Informe a nota da prova 1");
        double n1 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota da prova 2");
        double n2 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota da prova 3");
        double n3 = Double.parseDouble(dado);
        double media = (n1 + n2 + n3) / 3.0D;
        if (media > 6.0D) {
            JOptionPane.showMessageDialog((Component)null, "Aprovado, a média é" + media);
        } else {
            JOptionPane.showMessageDialog((Component)null, "Reprovado, a média é" + media);
        }

    }
}
