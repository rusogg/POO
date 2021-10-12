
import javax.swing.JOptionPane;

public class menu {
    public static void main (String [] args){
        String[] carreras = {
            "Crear circulo",
            "Crear punto"
        };
        String[] options = {
            "Salir",
            "Quedarse"
        };
        int seleccion;
        do{
        String resp = (String) JOptionPane.showInputDialog(null, "Fijate lo que queres hacer amigo", "Creador de boludeces", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);
        if (resp == "Crear circulo") { 
            JOptionPane.showMessageDialog(null, "Elegiste crear un circulito", "Creador de boludeces", JOptionPane.INFORMATION_MESSAGE);
            String resp1 = JOptionPane.showInputDialog(null, "Coloque coordenada x para el punto del circulo", "Creador de boludeces", JOptionPane.QUESTION_MESSAGE);
            String resp2 = JOptionPane.showInputDialog(null, "Coloque coordenada y para el punto del circulo", "Creador de boludeces", JOptionPane.QUESTION_MESSAGE);
            int x = Integer.valueOf(resp1);
            int y = Integer.valueOf(resp2);
            if (x >= 0 && y >= 0){Punto unPunto = new Punto(x,y);
            JOptionPane.showMessageDialog(null, "Creaste el punto " +unPunto.getX() +unPunto.getY(), "Creador de boludeces", JOptionPane.INFORMATION_MESSAGE );
            String resp3 = JOptionPane.showInputDialog(null, "Coloque el radio del circulo", "Creador de boludeces", JOptionPane.QUESTION_MESSAGE);
            int radio = Integer.valueOf(resp3);
            if (radio >= 0) {
            Circulo unCirculo = new Circulo(unPunto, radio);
            JOptionPane.showMessageDialog(null, "Creaste tu circulito animal!!", "Creador de boludeces", JOptionPane.INFORMATION_MESSAGE);
            double sup = unCirculo.superficie();
            JOptionPane.showMessageDialog(null,"La superficie de tu circulito va a ser: " + sup, "Creador de boludeces", JOptionPane.INFORMATION_MESSAGE);
        }else {JOptionPane.showMessageDialog(null, "Como vas a poner un negativo mogolico de mierda", "Creador de boludeces", JOptionPane.ERROR_MESSAGE);
        } 
    } else {JOptionPane.showMessageDialog(null, "Como vas a poner un negativo mogolico de mierda", "Creador de boludeces", JOptionPane.ERROR_MESSAGE);
    }
    }
        if  (resp == "Crear punto") {
            JOptionPane.showMessageDialog(null, "Elegiste crear un puntito", "Creador de boludeces", JOptionPane.INFORMATION_MESSAGE);
            String resp1 = JOptionPane.showInputDialog(null, "Coloque coordenada x para el puntito", "Creador de boludeces", JOptionPane.QUESTION_MESSAGE);
            String resp2 = JOptionPane.showInputDialog(null, "Coloque coordenada y para el puntito", "Creador de boludeces", JOptionPane.QUESTION_MESSAGE);
            int x = Integer.valueOf(resp1);
            int y = Integer.valueOf(resp2);
            if (x >= 0 && y >= 0){
            Punto unPunto = new Punto(x,y);
            JOptionPane.showMessageDialog(null, "Creaste el punto " +unPunto.getX() +unPunto.getY(), "Creador de boludeces", JOptionPane.INFORMATION_MESSAGE );
        }else {JOptionPane.showMessageDialog(null, "Como vas a poner un negativo mogolico de mierda", "Creador de boludeces", JOptionPane.ERROR_MESSAGE);}
    }
        
        seleccion = JOptionPane.showOptionDialog(null, "Ya te queres ir capo?", "No te vayas amigo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    } while (seleccion == 1);
}
}

