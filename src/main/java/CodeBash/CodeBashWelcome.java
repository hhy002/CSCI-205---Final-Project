/* *****************************************
 * CSCI205 -Software Engineering and Design
 * Fall2022* Instructor: Prof. Brian King
 *
 * Name: Nahom Ayele
 * Section: Section 01-9am
 * Date: 11/15/22
 * Time: 12:53 PM
 *
 * Project: csci205_final_project
 * Package: CodeBash
 * Class: CodeBashWelcome
 *
 * Description:
 *
 * *****************************************/
package CodeBash;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CodeBashWelcome {
    /** Root node for the scene graph */
    private VBox root;
    private Button startBtn;

    private Label title;

    private HBox top;

    /** This constructs our welcome Screen */
    public CodeBashWelcome (){

        initSceneGraph();
        initStyling();

    }

    private void initStyling() {
        root.setPrefSize(800, 200);
        root.setSpacing(20);
    }

    private void initSceneGraph() {
        root = new VBox();
        title = new Label(" Welcome to CodeBash");
        title.setId("Title");
        // Add title text
        root.getChildren().add(title);


        root.setAlignment(Pos.CENTER);

        // Set up the button to initiate typing
        startBtn = new Button("Start");
        startBtn.setAlignment(Pos.TOP_CENTER);
        root.getChildren().add(startBtn);


    }
    public Parent getRoot(){return root;}
    public Button getStartBtn (){return startBtn;}
}

