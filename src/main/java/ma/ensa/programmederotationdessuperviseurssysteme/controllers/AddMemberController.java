package ma.ensa.programmederotationdessuperviseurssysteme.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ma.ensa.programmederotationdessuperviseurssysteme.dao.MembreDao;
import ma.ensa.programmederotationdessuperviseurssysteme.dao.impl.MembreDaoImp;
import ma.ensa.programmederotationdessuperviseurssysteme.models.Membre;

import java.util.Set;

public class AddMemberController {

    private final MembreDao membreDao = new MembreDaoImp();

    @FXML
    private TextField nomField;
    @FXML
    private TextField prenomField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneField;
    @FXML
    private Button addButton;

    private void initialize() {
        addButton.setOnAction(event -> addMembre());
    }

    private void addMembre() {

        String id = "ID" + (int)(Math.random() * 10000);
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();

        if(!nom.isEmpty() && !prenom.isEmpty() && !email.isEmpty() && !phone.isEmpty()) {
            Membre membre = new Membre(id, nom, prenom, email, phone);
            membreDao.inserer(membre);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Succès");
            alert.setHeaderText(null);
            alert.setContentText("Mmebre ajoutè avec succès !");
            alert.showAndWait();
            clearFields();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText(null);
            alert.setContentText("Veuillez remplir tous les champs");
            alert.showAndWait();
        }
    }

    private void clearFields() {
        nomField.clear();
        prenomField.clear();
        emailField.clear();
        phoneField.clear();
    }


}
