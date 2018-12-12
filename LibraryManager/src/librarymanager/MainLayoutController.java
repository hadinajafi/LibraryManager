/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author hadin
 */
public class MainLayoutController implements Initializable {

    @FXML
    private AnchorPane generalAnchorPane;
    @FXML
    private AnchorPane categoriesPane;
    @FXML
    private AnchorPane tagViewPane;
    @FXML
    private AnchorPane folderViewPane;
    @FXML
    private TableView<?> typeViewTable;
    @FXML
    private ListView<?> typeViewListView;
    @FXML
    private TableColumn<?, ?> typeViewTableNameColumn;
    @FXML
    private TableColumn<?, ?> typeViewTableDateModColumn;
    @FXML
    private TableColumn<?, ?> typeViewTableSizeColumn;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generalAnchorPane.getStyleClass().add("pane");
        categoriesPane.getStyleClass().add("pane");
        tagViewPane.getStyleClass().add("pane");
        folderViewPane.getStyleClass().add("pane");
    }    
    
}
