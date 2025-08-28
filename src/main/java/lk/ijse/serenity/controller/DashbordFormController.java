package lk.ijse.serenity.controller;

        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.chart.PieChart;
        import javafx.scene.control.Label;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;

public class DashbordFormController {

    @FXML
    private ImageView imgDashImage;

    @FXML
    private PieChart pieChart;

    @FXML
    private Label txtTotCustomer;

    @FXML
    private Label txtTotEmp;

    @FXML
    private Label txtTpotAppoinment;

    @FXML
    private Label txtpayIncome;

    public void initialize(){
        ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList(
                new PieChart.Data("Nail Art", 10),
                new PieChart.Data("Colouring", 20),
                new PieChart.Data("Terapy", 30),
                new PieChart.Data("Haircut", 40),
                new PieChart.Data("Dressing", 50),
                new PieChart.Data("Makeup", 100)

        );
        pieChart.setData(observableList);
        new Thread(){
            @Override
            public void run() {
                try {
                    while (true) {
                        imgDashImage.setImage(new Image("assets/images/service-img-1.jpg"));
                        sleep(1500);
                        imgDashImage.setImage(new Image("assets/images/service-img-2.jpg"));
                        sleep(1500);
                        imgDashImage.setImage(new Image("assets/images/service-img-3.jpg"));
                        sleep(1500);
                        imgDashImage.setImage(new Image("assets/images/service-img-4.jpg"));
                        sleep(1500);
                        imgDashImage.setImage(new Image("assets/images/service-img-5.jpg"));
                        sleep(1500);
                        imgDashImage.setImage(new Image("assets/images/service-img-6.jpg"));
                        sleep(1500);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }.start();
    }


}
