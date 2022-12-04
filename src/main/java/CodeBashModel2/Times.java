/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022
 * Instructor: Prof. Brian King
 * Name: Harmony Yeung
 * Section: 9am - 9:50am
 * Date: 11/11/2022
 * Time: 8:55 AM
 *
 * Project: csci205_final_project
 * Package: CodeBashModel
 * Class: Timer
 *
 * Description:
 *
 * ****************************************
 */
package CodeBashModel2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.Timer;

public class Times {

  JFrame window;
  JLabel counterLabel;
  Font font1 = new Font("Arial", Font.PLAIN, 70);
  javax.swing.Timer time;
  int second;
  int minute;
  String ddSecond;
  String ddMinute;
  DecimalFormat dFormat = new DecimalFormat("00");


  public static void main(String[] args) {
    new Times();
  }

  public Times() {
    window = new JFrame();
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setLayout(null);

    counterLabel = new JLabel("");
    counterLabel.setBounds(300, 230, 200, 100);
    counterLabel.setHorizontalAlignment(JLabel.CENTER);
    counterLabel.setFont(font1);

    window.add(counterLabel);
    window.setVisible(true);

    counterLabel.setText("01:00");
    second = 0;
    minute=1;
    countdown();
    time.start();


  }

  public void countdown() {
    time = new Timer(1000, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        second--;
        ddSecond = dFormat.format(second);
        ddMinute = dFormat.format(minute);
        counterLabel.setText(ddMinute + ":" + ddSecond);

        if (second == -1) {
          second = 59;
          minute--;
          ddSecond = dFormat.format(second);
          ddMinute = dFormat.format(minute);
          counterLabel.setText(ddMinute + ":" + ddSecond);
        }
        if (minute == 0 && second == 0) {
          time.stop();
        }
      }
    });
  }
}