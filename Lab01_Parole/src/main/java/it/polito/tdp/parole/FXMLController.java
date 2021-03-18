package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	private Parole model;
	
	public void setModel( Parole model) {
		this.model=model;
	}
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	//controllo che sia una parola(non ha numeri)
    	String parola=txtParola.getText();
    	if(parola.length()==0) {
    		txtResult.setText("devi inserire una parola");
    		return ;}
    	else {
    	model.addParola(parola);
    	txtParola.clear();
    	List<String>ordina=model.getElenco();
    	String s="";
    	for(String st:ordina)
    		s=s+st+"\n";
    	txtResult.setText(s);
    	}
    	// TODO
    }

    @FXML
    void doCancella(ActionEvent event) {
      model.cancellaParola(txtParola.getText());
      txtParola.clear();
      List<String>ordina=model.getElenco();
  	String s="";
  	for(String st:ordina)
  		s=s+st+"\n";
  	txtResult.setText(s);
      
    }

    @FXML
    void doReset(ActionEvent event) {
    	model.reset();
    	txtResult.clear();
    	txtParola.clear();
    	// TODO
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
