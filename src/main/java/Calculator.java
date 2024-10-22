package main.java;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    Boolean isOparetoclicked = false;
//	String oldValue;
//	String newValue;

    JFrame jf;
    JLabel DisplayLabel;
    JButton sevenbutton, eightbutton, ninebutton,
            plusbutton, fourbutton, fivebutton, sixbutton,
            minbutton, onebutton, twobutton, threebutton, mulbutton, dotbutton, zerobutton, equelbutton, subbutton, clearbutton,
            modButton, powButton, miniButton, maxButton, roundButton, sqrtButton, logButton;

    double newValue, oldValue;
    int calculation;

    public Calculator() {
        jf = new JFrame("calculator");
        jf.setBounds(0, 0, 595, 550);
        jf.setLayout(null);
        jf.setAlwaysOnTop(true);
        jf.getContentPane().setBackground(Color.BLACK);

        DisplayLabel = new JLabel();
        DisplayLabel.setBounds(20, 30, 530, 90);
        DisplayLabel.setBackground(Color.white);
        DisplayLabel.setOpaque(true);
        DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        DisplayLabel.setForeground(Color.BLACK);
        DisplayLabel.setFont(new Font("arial", Font.PLAIN, 30));
        DisplayLabel.setVisible(true);
        jf.add(DisplayLabel);

        sevenbutton = new JButton("7");
        sevenbutton.setBounds(20, 150, 70, 70);
        sevenbutton.setFont(new Font("arial", Font.PLAIN, 20));
        sevenbutton.addActionListener(this);
        sevenbutton.setBackground(Color.white);
        sevenbutton.setOpaque(true);
        jf.add(sevenbutton);

        eightbutton = new JButton("8");
        eightbutton.setBounds(110, 150, 70, 70);
        eightbutton.setFont(new Font("arial", Font.PLAIN, 20));
        eightbutton.addActionListener(this);
        eightbutton.setBackground(Color.white);
        eightbutton.setOpaque(true);
        jf.add(eightbutton);

        ninebutton = new JButton("9");
        ninebutton.setBounds(200, 150, 70, 70);
        ninebutton.setFont(new Font("arial", Font.PLAIN, 20));
        ninebutton.addActionListener(this);
        ninebutton.setBackground(Color.white);
        ninebutton.setOpaque(true);
        jf.add(ninebutton);

        plusbutton = new JButton("+");
        plusbutton.setBounds(290, 150, 75, 70);
        plusbutton.setFont(new Font("arial", Font.PLAIN, 30));
        plusbutton.addActionListener(this);
        plusbutton.setBackground(Color.YELLOW);
        plusbutton.setOpaque(true);
        jf.add(plusbutton);

        minbutton = new JButton("-");
        minbutton.setBounds(380, 150, 75, 70);
        minbutton.setFont(new Font("arial", Font.PLAIN, 30));
        minbutton.addActionListener(this);
        minbutton.setBackground(Color.YELLOW);
        minbutton.setOpaque(true);
        jf.add(minbutton);

        miniButton = new JButton("min");
        miniButton.setBounds(475, 150, 75, 70);
        miniButton.setFont(new Font("arial", Font.PLAIN, 18));
        miniButton.addActionListener(this);
        miniButton.setBackground(Color.YELLOW);
        miniButton.setOpaque(true);
        jf.add(miniButton);


        fourbutton = new JButton("4");
        fourbutton.setBounds(20, 240, 70, 70);
        fourbutton.setFont(new Font("arial", Font.PLAIN, 20));
        fourbutton.addActionListener(this);
        fourbutton.setBackground(Color.white);
        fourbutton.setOpaque(true);
        jf.add(fourbutton);

        fivebutton = new JButton("5");
        fivebutton.setBounds(110, 240, 70, 70);
        fivebutton.setFont(new Font("arial", Font.PLAIN, 20));
        fivebutton.addActionListener(this);
        fivebutton.setBackground(Color.white);
        fivebutton.setOpaque(true);
        jf.add(fivebutton);

        sixbutton = new JButton("6");
        sixbutton.setBounds(200, 240, 70, 70);
        sixbutton.setFont(new Font("arial", Font.PLAIN, 20));
        sixbutton.addActionListener(this);
        sixbutton.setBackground(Color.white);
        sixbutton.setOpaque(true);
        jf.add(sixbutton);

        mulbutton = new JButton("x");
        mulbutton.setBounds(290, 240, 70, 70);
        mulbutton.setFont(new Font("arial", Font.PLAIN, 30));
        mulbutton.addActionListener(this);
        mulbutton.setBackground(Color.YELLOW);
        mulbutton.setOpaque(true);
        jf.add(mulbutton);

        modButton = new JButton("mod");
        modButton.setBounds(380, 240, 70, 70);
        modButton.setFont(new Font("arial", Font.PLAIN, 18));
        modButton.addActionListener(this);
        modButton.setBackground(Color.YELLOW);
        modButton.setOpaque(true);
        jf.add(modButton);

        maxButton = new JButton("max");
        maxButton.setBounds(475, 240, 75, 70);
        maxButton.setFont(new Font("arial", Font.PLAIN, 18));
        maxButton.addActionListener(this);
        maxButton.setBackground(Color.YELLOW);
        maxButton.setOpaque(true);
        jf.add(maxButton);


        onebutton = new JButton("1");
        onebutton.setBounds(20, 330, 70, 70);
        onebutton.setFont(new Font("arial", Font.PLAIN, 20));
        onebutton.addActionListener(this);
        onebutton.setBackground(Color.white);
        onebutton.setOpaque(true);
        jf.add(onebutton);

        twobutton = new JButton("2");
        twobutton.setBounds(110, 330, 70, 70);
        twobutton.setFont(new Font("arial", Font.PLAIN, 20));
        twobutton.addActionListener(this);
        twobutton.setBackground(Color.white);
        twobutton.setOpaque(true);
        jf.add(twobutton);

        threebutton = new JButton("3");
        threebutton.setBounds(200, 330, 70, 70);
        threebutton.setFont(new Font("arial", Font.PLAIN, 20));
        threebutton.addActionListener(this);
        threebutton.setBackground(Color.white);
        threebutton.setOpaque(true);
        jf.add(threebutton);

        subbutton = new JButton("/");
        subbutton.setBounds(290, 330, 70, 70);
        subbutton.setFont(new Font("arial", Font.PLAIN, 30));
        subbutton.addActionListener(this);
        subbutton.setBackground(Color.YELLOW);
        subbutton.setOpaque(true);
        jf.add(subbutton);

        powButton = new JButton("^");
        powButton.setBounds(380, 330, 70, 70);
        powButton.setFont(new Font("arial", Font.PLAIN, 30));
        powButton.addActionListener(this);
        powButton.setBackground(Color.YELLOW);
        powButton.setOpaque(true);
        jf.add(powButton);

        roundButton = new JButton("Rnd");
        roundButton.setBounds(475, 330, 75, 70);
        roundButton.setFont(new Font("arial", Font.PLAIN, 18));
        roundButton.addActionListener(this);
        roundButton.setBackground(Color.YELLOW);
        roundButton.setOpaque(true);
        jf.add(roundButton);


        dotbutton = new JButton(".");
        dotbutton.setBounds(20, 420, 70, 70);
        dotbutton.setFont(new Font("arial", Font.PLAIN, 50));
        dotbutton.addActionListener(this);
        dotbutton.setBackground(Color.white);
        dotbutton.setOpaque(true);
        jf.add(dotbutton);

        zerobutton = new JButton("0");
        zerobutton.setBounds(110, 420, 70, 70);
        zerobutton.setFont(new Font("arial", Font.PLAIN, 30));
        zerobutton.addActionListener(this);
        zerobutton.setBackground(Color.white);
        zerobutton.setOpaque(true);
        jf.add(zerobutton);

        equelbutton = new JButton("=");
        equelbutton.setBounds(200, 420, 70, 70);
        equelbutton.setFont(new Font("arial", Font.PLAIN, 30));
        equelbutton.addActionListener(this);
        equelbutton.setBackground(Color.WHITE);
        equelbutton.setOpaque(true);
        jf.add(equelbutton);

        sqrtButton = new JButton("sqrt");
        sqrtButton.setBounds(290, 420, 70, 70);
        sqrtButton.setFont(new Font("arial", Font.PLAIN, 18));
        sqrtButton.addActionListener(this);
        sqrtButton.setBackground(Color.YELLOW);
        sqrtButton.setOpaque(true);
        jf.add(sqrtButton);

        logButton = new JButton("log");
        logButton.setBounds(380, 420, 75, 70);
        logButton.setFont(new Font("arial", Font.PLAIN, 18));
        logButton.addActionListener(this);
        logButton.setBackground(Color.YELLOW);
        logButton.setOpaque(true);
        jf.add(logButton);

        clearbutton = new JButton("C");
        clearbutton.setBounds(475, 420, 70, 70);
        clearbutton.setFont(new Font("sans-serif", Font.PLAIN, 25));
        clearbutton.addActionListener(this);
        clearbutton.setBackground(Color.RED);
        clearbutton.setOpaque(true);
        jf.add(clearbutton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object Source = e.getSource();
        if (Source == sevenbutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("7");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "7");
            }
        } else if (Source == eightbutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("8");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "8");
            }
        } else if (Source == ninebutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("9");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "9");
            }
        } else if (Source == fourbutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("4");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "4");
            }
        } else if (Source == fivebutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("5");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "5");
            }
        } else if (Source == sixbutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("6");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "6");
            }
        } else if (Source == onebutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("1");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "1");
            }
        } else if (Source == twobutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("2");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "2");
            }
        } else if (Source == threebutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("3");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "3");
            }
        } else if (Source == zerobutton) {
            if (isOparetoclicked) {
                DisplayLabel.setText("0");
                isOparetoclicked = false;
            } else {
                DisplayLabel.setText(DisplayLabel.getText() + "0");
            }
        } else if (Source == dotbutton) {
            DisplayLabel.setText(DisplayLabel.getText() + ".");
        } else if (Source == plusbutton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 1;
        } else if (Source == minbutton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 2;
        } else if (Source == miniButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 3;
        } else if (Source == mulbutton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 4;
        } else if (Source == modButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 5;
        } else if (Source == maxButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 6;
        } else if (Source == subbutton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 7;
        } else if (Source == powButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 8;
        } else if (Source == roundButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 9;
        } else if (Source == sqrtButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 10;
        } else if (Source == logButton) {
            isOparetoclicked = true;
            oldValue = Double.parseDouble(DisplayLabel.getText());
            calculation = 11;
        } else if (Source == clearbutton) {
            DisplayLabel.setText("");
        } else if (Source == equelbutton) {
            switch (calculation) {
                case 1: {
                    newValue = Addition.add(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 2: {
                    newValue = Subtraction.subtract(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 3: {
                    newValue = Min.getSmaller(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 4: {
                    newValue = Multiplication.multiply(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 5: {
                    newValue = Mod.Modulo(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 6: {
                    newValue = Max.getGreater(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 7: {
                    newValue = Division.divide(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 8: {
                    newValue = Pow.pow(oldValue, Double.parseDouble(DisplayLabel.getText()));
                    replaceZero();
                    break;
                }
                case 9: {
                    newValue = Round.round(oldValue);
                    replaceZero();
                    break;
                }
                case 10: {
                    newValue = Sqrt.sqrt(oldValue);
                    replaceZero();
                    break;
                }
                case 11: {
                    newValue = Log.log(oldValue);
                    replaceZero();
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + calculation);
            }

        }

    }

    private void replaceZero() {
        if (Double.toString(newValue).endsWith(".0")) {
            DisplayLabel.setText(Double.toString(newValue).replace(".0", ""));
        } else {
            DisplayLabel.setText(Double.toString(newValue));
        }
    }
}