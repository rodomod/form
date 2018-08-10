import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class form extends JFrame {
    JTextArea display = new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(4, 20));
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonOps = new JButton("+/-");
    JButton buttonPoint = new JButton(".");
    JButton buttonCent = new JButton("pow^3");
    JButton buttonBack = new JButton("C");
    JButton buttonSE = new JButton("SE");
    JButton buttonSum = new JButton("+");
    JButton buttonMul = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonStart = new JButton("=");
    JButton buttonDiv = new JButton("sqrt");
    String operation = "+,-,*,/";
    double firstnum;
    double secondnum;

    form() {
        super("form");
        this.button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 0);
            }
        });
        this.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 1);
            }
        });
        this.button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 2);
            }
        });
        this.button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 3);
            }
        });
        this.button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 4);
            }
        });
        this.button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 5);
            }
        });
        this.button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 6);
            }
        });
        this.button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 7);
            }
        });
        this.button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 8);
            }
        });
        this.button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText(form.this.display.getText() + 9);
            }
        });
        this.buttonOps.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(form.this.display.getText()));
                ops *= -1.0D;
                form.this.display.setText(String.valueOf(ops));
            }
        });
        this.buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstnum = Double.parseDouble(form.this.display.getText());
                double secondnum = Double.parseDouble(form.this.display.getText());
                String d = form.this.display.getText();
                if (d.indexOf("") == 0) {
                    form.this.display.setText(Math.sqrt(firstnum * secondnum / secondnum) + "");
                }

            }
        });
        this.buttonPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String Pnt = form.this.display.getText();
                if (Pnt.indexOf(".") < 0) {
                    form.this.display.setText(form.this.display.getText() + ".");
                }

            }
        });
        this.buttonBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = form.this.display.getText();
                form.this.display.setText(temp.substring(0, temp.length() - 1));
            }
        });
        this.buttonPanel.add(this.buttonCent);
        this.buttonCent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double fn = Double.parseDouble(form.this.display.getText());
                String Pow = form.this.display.getText();
                if (Pow.indexOf("") == 0) {
                    form.this.display.setText(Math.pow(fn,3) + "");
                }

            }
        });
        this.buttonPanel.add(this.buttonSE);
        this.buttonSE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.display.setText("");
            }
        });
        this.buttonSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.firstnum = Double.parseDouble(form.this.display.getText());
                form.this.display.setText("");
                form.this.operation = "+";
            }
        });
        this.buttonMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.firstnum = Double.parseDouble(form.this.display.getText());
                form.this.display.setText("");
                form.this.operation = "*";
            }
        });
        this.buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.firstnum = Double.parseDouble(form.this.display.getText());
                form.this.display.setText("");
                form.this.operation = "/";
            }
        });
        this.buttonSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                form.this.firstnum = Double.parseDouble(form.this.display.getText());
                form.this.display.setText("");
                form.this.operation = "-";
            }
        });
        this.buttonStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double secondnum = Double.parseDouble(form.this.display.getText());
                if (form.this.operation == "+") {
                    form.this.display.setText(form.this.firstnum + secondnum + "");
                } else if (form.this.operation == "-") {
                    form.this.display.setText(form.this.firstnum - secondnum + "");
                } else if (form.this.operation == "*") {
                    form.this.display.setText(form.this.firstnum * secondnum + "");
                } else if (form.this.operation == "/") {
                    form.this.display.setText(form.this.firstnum / secondnum + "");
                }

            }
        });
        this.setBounds(400, 250, 400, 250);
        this.setLayout(new BorderLayout());
        this.add(this.display, "North");
        this.add(this.buttonPanel, "Center");
        this.add(this.buttonStart, "South");
        this.buttonPanel.add(this.button0);
        this.buttonPanel.add(this.button1);
        this.buttonPanel.add(this.button2);
        this.buttonPanel.add(this.button3);
        this.buttonPanel.add(this.button4);
        this.buttonPanel.add(this.button5);
        this.buttonPanel.add(this.button6);
        this.buttonPanel.add(this.button7);
        this.buttonPanel.add(this.button8);
        this.buttonPanel.add(this.button9);
        this.buttonPanel.add(this.buttonPoint);
        this.buttonPanel.add(this.buttonCent);
        this.buttonPanel.add(this.buttonSum);
        this.buttonPanel.add(this.buttonSub);
        this.buttonPanel.add(this.buttonMul);
        this.buttonPanel.add(this.buttonDivide);
        this.buttonPanel.add(this.buttonDiv);
        this.buttonPanel.add(this.buttonOps);
        this.buttonPanel.add(this.buttonBack);
        this.buttonPanel.add(this.buttonSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new form();
    }
}
