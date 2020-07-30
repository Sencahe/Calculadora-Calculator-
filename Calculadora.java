
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bIgual, bMas, bMenos, bMultiplicar, bDividir, bComa, bExponencial, bCerrar, bDel, bAC;
    JTextField pantalla1, pantalla2;
    JLabel pantalla3, label1;

    String operacion = "";
    String resultado2 = "";
    String pantallaUno, pantallaDos, pantallaTres;
    double resultado = 0;
    double valor1 = 0;
    double valor2 = 0;
    char opcion;
    int cont = 0;

    Color color1 = new Color(255, 255, 255);
    Border border = BorderFactory.createLineBorder(Color.gray);

    public Calculadora() {
        setLayout(null);
        setBounds(0, 0, 285, 450);       
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setEnabled(true);

        b1 = new JButton("1");
        b1.setBounds(10, 100, 45, 45);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(60, 100, 45, 45);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(110, 100, 45, 45);
        add(b3);
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(10, 150, 45, 45);
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(60, 150, 45, 45);
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(110, 150, 45, 45);
        add(b6);
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setBounds(10, 200, 45, 45);
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(60, 200, 45, 45);
        add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(110, 200, 45, 45);
        add(b9);
        b9.addActionListener(this);

        b0 = new JButton("0");
        b0.setBounds(60, 250, 45, 45);
        add(b0);
        b0.addActionListener(this);

        bComa = new JButton(".");
        bComa.setBounds(110, 250, 45, 45);
        add(bComa);
        bComa.addActionListener(this);

        bMas = new JButton("+");
        bMas.setBounds(160, 100, 45, 45);
        add(bMas);
        bMas.addActionListener(this);

        bMenos = new JButton("-");
        bMenos.setBounds(160, 150, 45, 45);
        add(bMenos);
        bMenos.addActionListener(this);

        bMultiplicar = new JButton("x");
        bMultiplicar.setBounds(160, 200, 45, 45);
        add(bMultiplicar);
        bMultiplicar.addActionListener(this);

        bDividir = new JButton("÷");
        bDividir.setBounds(160, 250, 45, 45);
        add(bDividir);
        bDividir.addActionListener(this);

        bExponencial = new JButton("^");
        bExponencial.setBounds(10, 250, 45, 45);
        add(bExponencial);
        bExponencial.addActionListener(this);

        bIgual = new JButton("=");
        bIgual.setBounds(210, 200, 55, 95);
        bIgual.addActionListener(this);
        add(bIgual);

        bCerrar = new JButton("Cerrar");
        bCerrar.setBounds(160, 370, 95, 40);
        bCerrar.addActionListener(this);
        add(bCerrar);

        bDel = new JButton("Del");
        bDel.setBounds(210, 100, 55, 45);
        bDel.addActionListener(this);
        add(bDel);

        bAC = new JButton("AC");
        bAC.setBounds(210, 150, 55, 45);
        bAC.addActionListener(this);
        add(bAC);

        label1 = new JLabel("Powered by Sencahe! ©");
        label1.setBounds(10, 380, 150, 25);
        add(label1);

        pantalla1 = new JTextField();
        pantalla1.setBackground(color1);
        pantalla1.setOpaque(true);
        pantalla1.setBorder(border);
        pantalla1.setEditable(false);
        pantalla1.setBounds(10, 35, 200, 25);
        add(pantalla1);

        pantalla2 = new JTextField();
        pantalla2.setBackground(color1);
        pantalla2.setOpaque(true);
        pantalla2.setBorder(border);
        pantalla2.setEditable(false);
        pantalla2.setBounds(10, 65, 200, 25);
        add(pantalla2);

        pantalla3 = new JLabel();
        pantalla3.setBounds(215, 35, 25, 25);
        pantalla3.setBackground(color1);
        pantalla3.setOpaque(true);
        pantalla3.setBorder(border);
        add(pantalla3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bCerrar) {
            System.exit(0);
        }
        if (e.getSource() == b1) {
            operacion = operacion + "1";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b2) {
            operacion = operacion + "2";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b3) {
            operacion = operacion + "3";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b4) {
            operacion = operacion + "4";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b5) {
            operacion = operacion + "5";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b6) {
            operacion = operacion + "6";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b7) {
            operacion = operacion + "7";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b8) {
            operacion = operacion + "8";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b9) {
            operacion = operacion + "9";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == b0) {
            operacion = operacion + "0";
            pantalla1.setText(operacion);
        }
        if (e.getSource() == bComa) {
            if (operacion.length() > 0 && operacion != "-") {
                if (cont == 0) {
                    operacion = operacion + ".";
                    pantalla1.setText(operacion);
                    cont++;
                }
            }
        }
        if (e.getSource() == bMas) {
            if (resultado2.length() == 0 && operacion.length() > 0 && operacion != "-") {
                pantalla3.setText("   +");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'a';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'a';
                    cont = 0;
                }
            } else if (resultado2.length() > 0 && (pantalla3.getText()).length() == 0 && operacion.length() > 0) {
                pantalla3.setText("   +");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'a';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'a';
                    cont = 0;
                }
            } else {
                pantalla3.setText("   +");
                opcion = 'a';
            }
        }
        if (e.getSource() == bMenos) {
            if (resultado2.length() == 0) {
                if ((pantalla3.getText()).length() == 0) {
                    if ((pantalla3.getText()).length() == 0 && (pantalla2.getText()).length() == 0 && (pantalla1.getText()).length() == 0) {
                        operacion = "-";
                        pantalla1.setText(operacion);
                    } else if (operacion.length() == 0 || operacion.equals("-")) {
                        pantalla3.setText("   -");
                        opcion = 'b';
                    } else if (operacion.length() > 0 && operacion != "-") {
                        pantalla3.setText("   -");
                        valor1 = Double.parseDouble(operacion);
                        if (valor1 == (int) valor1) {
                            resultado2 = String.valueOf((int) valor1);
                            pantalla2.setText(resultado2);
                            pantalla1.setText("");
                            operacion = "";
                            opcion = 'b';
                            cont = 0;
                        } else {
                            resultado2 = String.valueOf(valor1);
                            pantalla2.setText(resultado2);
                            pantalla1.setText("");
                            operacion = "";
                            opcion = 'b';
                            cont = 0;
                        }
                    }
                } else if (operacion.length() == 0) {
                    operacion = "-";
                    pantalla1.setText(operacion);
                } else if (operacion == "-") {
                    pantalla1.setText(operacion);
                    pantalla3.setText("   -");
                    opcion = 'b';
                } else if (operacion.length() > 0) {
                    pantalla3.setText("   -");
                    valor1 = Double.parseDouble(operacion);
                    if (valor1 == (int) valor1) {
                        resultado2 = String.valueOf((int) valor1);
                        pantalla2.setText(resultado2);
                        pantalla1.setText("");
                        operacion = "";
                        opcion = 'b';
                        cont = 0;
                    } else {
                        resultado2 = String.valueOf(valor1);
                        pantalla2.setText(resultado2);
                        pantalla1.setText("");
                        operacion = "";
                        opcion = 'b';
                        cont = 0;
                    }
                }
            } else {
                if (resultado2.length() > 0 && (pantalla3.getText()).length() == 0 && operacion.length() > 0) {
                    pantalla3.setText("   -");
                    valor1 = Double.parseDouble(operacion);
                    if (valor1 == (int) valor1) {
                        resultado2 = String.valueOf((int) valor1);
                        pantalla2.setText(resultado2);
                        pantalla1.setText("");
                        operacion = "";
                        opcion = 'b';
                        cont = 0;
                    } else {
                        resultado2 = String.valueOf(valor1);
                        pantalla2.setText(resultado2);
                        pantalla1.setText("");
                        operacion = "";
                        opcion = 'b';
                        cont = 0;
                    }
                } else if ((pantalla3.getText()).length() == 0) {
                    pantalla3.setText("   -");
                    opcion = 'b';
                } else if (operacion.length() == 0) {
                    operacion = "-";
                    pantalla1.setText(operacion);
                } else if (operacion == "-") {
                    pantalla1.setText(operacion);
                    pantalla3.setText("   -");
                    opcion = 'b';
                } else {
                    pantalla3.setText("   -");
                    opcion = 'b';
                }
            }
        }
        if (e.getSource() == bMultiplicar) {
            if (resultado2.length() == 0 && operacion.length() > 0 && operacion != "-") {
                pantalla3.setText("   x");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'c';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'c';
                    cont = 0;
                }
            } else if (resultado2.length() > 0 && (pantalla3.getText()).length() == 0 && operacion.length() > 0) {
                pantalla3.setText("   x");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'c';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'c';
                    cont = 0;
                }
            } else {
                pantalla3.setText("   x");
                opcion = 'c';
            }
        }
        if (e.getSource() == bDividir) {
            if (resultado2.length() == 0 && operacion.length() > 0 && operacion != "-") {
                pantalla3.setText("   ÷");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'd';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'd';
                    cont = 0;
                }
            } else if (resultado2.length() > 0 && (pantalla3.getText()).length() == 0 && operacion.length() > 0) {
                pantalla3.setText("   ÷");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'd';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'd';
                    cont = 0;
                }
            } else {
                pantalla3.setText("   ÷");
                opcion = 'd';
            }
        }
        if (e.getSource() == bExponencial) {
            if (resultado2.length() == 0 && operacion.length() > 0 && operacion != "-") {
                pantalla3.setText("   ^");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'e';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'e';
                    cont = 0;
                }
            } else if (resultado2.length() > 0 && (pantalla3.getText()).length() == 0 && operacion.length() > 0) {
                pantalla3.setText("   ^");
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'e';
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    operacion = "";
                    opcion = 'e';
                    cont = 0;
                }
            } else {
                pantalla3.setText("   ^");
                opcion = 'e';
            }
        }
        if (e.getSource() == bDel) {
            String punto = ".";
            int index = operacion.indexOf(punto);
            if (operacion.length() > 0) {
                operacion = operacion.substring(0, operacion.length() - 1);
                pantalla1.setText(operacion);
            }
            if (index == operacion.length()) {
                cont = 0;
            }
        }
        if (e.getSource() == bAC) {
            operacion = "";
            resultado = 0;
            resultado2 = "";
            opcion = 'z';
            valor1 = 0;
            valor2 = 0;
            pantalla1.setText("");
            pantalla2.setText("");
            pantalla3.setText("");
            cont = 0;
        }
        if (e.getSource() == bIgual) {
            if ((pantalla1.getText()).length() == 0 && (pantalla2.getText()).length() == 0) {
            } else if ((resultado2.length() == 0 && operacion != "-") || (operacion.length() > 0 && resultado2.length() > 0 && operacion != "-" && (pantalla3.getText()).length() == 0)) {
                valor1 = Double.parseDouble(operacion);
                if (valor1 == (int) valor1) {
                    resultado2 = String.valueOf((int) valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    pantalla3.setText("");
                    opcion = 'z';
                    operacion = "";
                    cont = 0;
                } else {
                    resultado2 = String.valueOf(valor1);
                    pantalla2.setText(resultado2);
                    pantalla1.setText("");
                    pantalla3.setText("");
                    opcion = 'z';
                    operacion = "";
                    cont = 0;
                }
            }
            if (operacion.equals("-")) {
                JOptionPane.showMessageDialog(null, "         Operacion invalida.");
            }
            switch (opcion) {
                case 'a':
                    if ((pantalla1.getText()).length() > 0 && (pantalla2.getText()).length() > 0 && operacion != "-") {
                        valor2 = Double.parseDouble(operacion);
                        resultado = valor1 + valor2;
                        if (resultado == (int) resultado) {
                            resultado2 = String.valueOf((int) resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        } else {
                            resultado2 = String.valueOf(resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        }
                    }
                    break;

                case 'b':
                    if ((pantalla1.getText()).length() > 0 && (pantalla2.getText()).length() > 0 && operacion != "-") {
                        valor2 = Double.parseDouble(operacion);
                        resultado = valor1 - valor2;
                        if (resultado == (int) resultado) {
                            resultado2 = String.valueOf((int) resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        } else {
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        }
                    }
                    break;

                case 'c':
                    if ((pantalla1.getText()).length() > 0 && (pantalla2.getText()).length() > 0 && operacion != "-") {
                        valor2 = Double.parseDouble(operacion);
                        resultado = valor1 * valor2;
                        if (resultado == (int) resultado) {
                            resultado2 = String.valueOf((int) resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        } else {
                            resultado2 = String.valueOf(resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        }
                    }
                    break;

                case 'd':
                    if ((pantalla1.getText()).length() > 0 && (pantalla2.getText()).length() > 0 && operacion != "-") {
                        valor2 = Double.parseDouble(operacion);
                        resultado = valor1 / valor2;
                        if (resultado == (int) resultado) {
                            resultado2 = String.valueOf((int) resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        } else {
                            resultado2 = String.valueOf(resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        }
                    }
                    break;

                case 'e':
                    if ((pantalla1.getText()).length() > 0 && (pantalla2.getText()).length() > 0 && operacion != "-") {
                        valor2 = Double.parseDouble(operacion);
                        resultado = Math.pow(valor1, valor2);
                        if (resultado == (int) resultado) {
                            resultado2 = String.valueOf((int) resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        } else {
                            resultado2 = String.valueOf(resultado);
                            pantalla1.setText("");
                            pantalla2.setText(resultado2);
                            pantalla3.setText("");
                            valor1 = resultado;
                            operacion = "";
                            opcion = 'z';
                        }
                    }
                    break;
                default:
                    pantalla2.setText(resultado2);
            }
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        Calculadora calculadora1 = new Calculadora();
        calculadora1.setVisible(true);
        
    }
}
