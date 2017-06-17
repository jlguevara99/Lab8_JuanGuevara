/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_juanguevara;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class Hilo extends Thread{
    private JLabel j ;
    private boolean a;
    private boolean b;
    
    public Hilo(JLabel tiempo){
        j = tiempo;
        a = true;
    }

    public JLabel getJ() {
        return j;
    }

    public void setJ(JLabel j) {
        this.j = j;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
    
    @Override
    public void run(){
        int h=0,m=0,s=0;
        while(a){
            s++;
            if (s == 60) {
                m++;
                s=0;
            }
            if (m==60) {
                h++;
                m=0;
            }
            j.setText(h+":"+m+":"+s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
