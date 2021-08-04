package poofiguras;
import javax.swing.JOptionPane;
public class Figuras {
public void cuadrado(){
    int lado,area;
    lado=Integer.parseInt(JOptionPane.showInputDialog("Digite el lado del cuadrado"));
    area=lado*lado;
    JOptionPane.showMessageDialog(null,"El area del circulo es."+area);
}

public void triangulo(){
    int base,altura,area;
    base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base del triangulo"));
    altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura del triangulo"));
    area=(base*altura/2);
    JOptionPane.showMessageDialog(null,"El area del triangulo es"+area);
}
public void Rectangulo(){
    int largo,ancho,area;
    largo=Integer.parseInt(JOptionPane.showInputDialog("Digite el largo del rectangulo"));
    ancho=Integer.parseInt(JOptionPane.showInputDialog("Digite el ancho  del rectangulo"));
    area=(largo*ancho);
    JOptionPane.showMessageDialog(null,"El area del triangulo es"+area);
}
public void Pentagono(){
    int perimetro,altura,area;
    perimetro=Integer.parseInt(JOptionPane.showInputDialog("Digite el perimetro del pentagono"));
    altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura  del pentagono"));
    area=(perimetro*altura/2);
    JOptionPane.showMessageDialog(null,"El area del triangulo es"+area);
}

}
