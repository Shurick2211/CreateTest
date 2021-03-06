package com.sn.org.uplevel;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    Label erName;
    @FXML
    TextArea quArea, rezArea1, rezArea2, rezArea3, rezArea4;
    @FXML
    TextField nameTest, answ1, answ2,answ3,answ4, bal1,bal2,bal3,bal4;
    @FXML
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;
    @FXML
    TableView tableView;
    @FXML
    TableColumn<Question,String> N;
    @FXML
    TableColumn<Question,String> quCol;
    @FXML
    TableColumn<Question,String> an1;
    @FXML
    TableColumn<Question,String> an2;
    @FXML
    TableColumn<Question,String> an3;
    @FXML
    TableColumn<Question,String> an4;
    @FXML
    TableColumn<Question,String> b1;
    @FXML
    TableColumn<Question,String> b2;
    @FXML
    TableColumn<Question,String> b3;
    @FXML
    TableColumn<Question,String> b4;
    Question question;
    int i=0;

    @FXML
    ObservableList<Question> questions = FXCollections.observableArrayList();

    public void initialize(){
        tableView.itemsProperty().setValue(questions);

        N.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getN()+""));
        quCol.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getQu()));
        an1.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getAn1()));
        an2.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getAn2()));
        an3.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getAn3()));
        an4.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getAn4()));
        b1.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getB1()));
        b2.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getB2()));
        b3.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getB3()));
        b4.setCellValueFactory(c->new SimpleStringProperty(c.getValue().getB4()));

        tableView.refresh();

    }
    @FXML
    protected void addQu() {
        if(!quArea.getText().isEmpty()){
           question=new Question(i,quArea.getText(),answ1.getText(),answ2.getText(),answ3.getText(),answ4.getText(),bal1.getText(),
                   bal2.getText(),bal3.getText(),bal4.getText());
          if(checkBox1.isSelected()&(bal1.getText().isEmpty()||bal1.getText().equals("")))
          question.setB1("+");
          if(checkBox2.isSelected()&(bal2.getText().isEmpty()||bal2.getText().equals("")))
                question.setB2("+");
          if(checkBox3.isSelected()&(bal3.getText().isEmpty()||bal3.getText().equals("")))
                question.setB3("+");
          if(checkBox4.isSelected()&(bal4.getText().isEmpty()||bal4.getText().equals("")))
                question.setB4("+");
           questions.add(question);
           i=0;
            questions.forEach(c->{
                i++;
                c.setN(i);});
            tableView.refresh();


        }
    }
    @FXML
    protected void editRow() {

    }
    @FXML
    protected void deletRow() {
        questions.remove(tableView.getSelectionModel().getSelectedItem());
        i=0;
        questions.forEach(c->{
            i++;
            c.setN(i);});

    }
    @FXML
    protected void addDb() {
        if(nameTest.getText().isEmpty()){
            erName.setText("?????????????? ????????????????!");
            }
        else {


        }
    }
}