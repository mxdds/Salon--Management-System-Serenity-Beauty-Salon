package lk.ijse.serenity.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;


public class MainformController {

    @FXML
    private Pane bodypane;

    public void initialize(){
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/dashbordForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        loadTime();
//        loadData();

    }

    private void loadTime() {
    }


    @FXML
    void btnAppoinmentOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/appoimentForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void btnCustomerOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/customerForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void btnDashbordOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/dashbordForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void btnEmpOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/employeForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/paymentForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void btnProductOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/productForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void btnServiceOnAction(ActionEvent event) {
        bodypane.getChildren().clear();
        try {
            bodypane.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/servicesForm.fxml")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
