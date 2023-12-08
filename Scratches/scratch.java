import javax.swing.JButton;
import javax.swing.JFrame;

class Scratch {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); //Gör en ruta

        JButton button = new JButton();
        button.setBounds(200, 100, 100, 50);


        frame.setTitle("Rompus Status effekts helper"); //Ändrar titlen på rutan :P
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Annars blir rutan bara minimiserad
        frame.setLayout(null);
        frame.setVisible(true); //Göra rutan synlig
        frame.setSize(500, 500); //Hur stor den ska vara i x, och y kordinater
        frame.add(button);
    }

    }






        /*
        String a = "a";
        String b = "b";
        String c = "c";

        for (int i = 0; i <= 100; i++) {
            // System.out.println("i: " + i + " % " + (i % 33)); // Om du vill testa lite vad som händer eller går fel, eller kan du se vad som händer genom att bara läsa, se och förstå?
            if (i % 34 == 1) {
                b = "i % 34 == 1";
            } else if (i % 43 == 0) {
                c = "i % 43 == 0";
            } else if (i % 50 == 0) {
                b = "i % 50 == 0";
            } else if (i % 66 == 0) {
                a = "i % 66 == 0";
            } else if (i % 33 == 0) {
                b = "i % 33 == 0";
            } else if (i % 44 == 0) {
                a = "i % 44 == 0";
            } else {
                a = "Nothing of the above";
            }
            System.out.println("i: " + i + " % " + (i % 33));
        }
    }
}



      /*
     Random number generator

      Random random = new Random();
      int R = random.nextInt(10)+1;

        if (R<5) {JOptionPane.showMessageDialog(null,"Noooo! it's under 5");}
        if (R>5) {JOptionPane.showMessageDialog(null,"WOW it's over 5!");}
        if (R==5) {JOptionPane.showMessageDialog(null, "Nice");}
      */
        /*
        Gui box

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " +name );

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " +age+ " years old" );

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " +height+ "cm tall" );
        */

         /*   int i = 0;
            boolean boo = true;

            while (boo) { // But there is "for" as well to be used.
                i++; // Starting from one.

                if (i > 4) { // If bigger than 4, do Boo.
                    boo = false;
                    System.out.println("Boo: " + boo + " and " + i);
                } else { // If not bigger than or equal to 4, then do NoBoo.
                    boo = true; // Not needed.
                    System.out.println("NoBoo: " + boo + " and " + i);
                }
                */