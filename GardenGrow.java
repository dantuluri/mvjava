import java.awt.*;
import java.awt.event.*;
import javax.swing.*;///import java libraries: swing , event , awt , applet

        class GardenGrow extends JPanel implements MouseListener ,KeyListener {
			///classheader which extends Jpanel and implements keylistener,mouselistener
        int click=0;//clicked ( times)
        boolean modulus = false;
        boolean sun = false;
        int code = 0;
        int code2=0;
        int code3=0;
        char five;
        char f = '%';
        int x =0;
        int y =0;
        boolean water = false;
        boolean up = false;
        boolean shift =false;
        public GardenGrow(){///constructor header
                addMouseListener(this);//add MouseListener
                addKeyListener(this);//add KeyListener
        }
        public void paintComponent(Graphics g){///paintcomponent() header

                super.paintComponent(g);///super.paintComponent
				setBackground(Color.WHITE);
                g.setColor(Color.PINK);
                g.fillRect(50,50,100,50);
                g.setColor(Color.black);
                g.drawString("To Water the garden  you have to click the mouse in the garden,press shift and type the key with % ", 200 ,100);///draw a garden (100 X 50)
                        ///garden should be pink intially
                if(shift && modulus&& water){
                        g.setColor(Color.GREEN);
                        g.fillRect(50,50,100,50);
                        g.setColor(Color.BLACK);
                        g.drawString("To add flowers to you garden , please  click inside the garden and press the up key.(Click after in garden to confirm selection)", 200 ,170);
                }
                if(sun && up){
                        for(int x = 50;x<=140;x+=20){
                                        for(int y  = 50;y <=100;y+=20){
                                                g.setColor(Color.yellow);
                                                g.fillOval(x,y,5,5);
												g.setColor(Color.WHITE);
												g.fillRect(200,50,2000,2000);
                                }
                        }

                }
                }

        ///mouseListeners:
        public void mouseClicked(MouseEvent e){
                        requestFocus();///requestFocus
                        x=e.getX();
                        y=e.getY();
                        if(x>=50 && x <=150){
                        if(y>=50 && y<=100){
                                click+=1;
                                if(click==1){
                                        water=true;
                                }
                                if(water=true){
                                        if(click>1){
                                                sun=true;
                                                }
                                        }
                                }
                        }
                                repaint();
        ///if mouse clicked
                ///add "SUN"
                ///draw flowers: fill circles ( 5X5), until reaches edge of garden
                ///use nested loops

        }
        //mouseClicked()
        public void mouseReleased(MouseEvent e){}//mouseReleased()
        public void mousePressed(MouseEvent e){}//mousePressed()
        public void mouseEntered(MouseEvent e){}//mouseEntered()
        public void mouseExited(MouseEvent e){}//mouseExited()


        public void keyPressed(KeyEvent e){
                if(x>=50 && x <=150){
                        if(y>=50 && y<=100){
                                code2=e.getKeyCode();
                                if(code2==KeyEvent.VK_SHIFT){
                                        shift=true;
                                }
                                code=e.getKeyCode();
                               if(code==KeyEvent.VK_UP){
                                        up=true;
                        }
                        }
                }
        }///keyPressed()
                                ///keyListeners:
        public void keyTyped(KeyEvent e){
                five=e.getKeyChar();
                if(five==f){
                        modulus=true;
                }
                repaint();
                }///keyTyped()
        public void keyReleased(KeyEvent e){}
        ///then paint the background green

}
