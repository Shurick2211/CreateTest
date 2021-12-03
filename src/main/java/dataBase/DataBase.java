package dataBase;

import  java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataBase {
    //  Database credentials
    private  String DB_URL ;
    private  String USER ;
    private  String PASS ;
    private String sql;
    private Statement statement=statementBD();

    private void action() throws SQLException {


            //statement.execute(creatTablUser());
              statement.execute(creatTablTest());
            // statement.execute(creatTablVictorina());


    }

    private Statement statementBD(){
        dbConfig();

        try {

           Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        Connection connection = null;
        Statement statement=null;
        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        if(connection!=null)
            System.out.println("Connected!");
        else System.out.println("Connected is FAIL!");
        try {
            statement=connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }


    private  String creatTablUser(){
        String create="CREATE TABLE IF NOT EXISTS public.users ("+
    "chatid integer NOT NULL,"+
    "firstName character varying(20),"+
    "CONSTRAINT users_pkey PRIMARY KEY (chatid))";
    return create;
    }

    private  String creatTablTest(){
        String create="CREATE TABLE IF NOT EXISTS public.test ("+
                "numQw integer NOT NULL,"+
                "question character varying(300),"+
                "answer1 character varying(50),"+
                "answer2 character varying(50),"+
                "answer3 character varying(50),"+
                "answer4 character varying(50),"+
                "CONSTRAINT test_pkey PRIMARY KEY (numQw))";
        return create;
    }

    private  String creatTablVictorina(){
        String create="CREATE TABLE IF NOT EXISTS public.victorina ("+
                "numQw integer NOT NULL,"+
                "question character varying(300),"+
                "answer character varying(100),"+
                "CONSTRAINT victorina_pkey PRIMARY KEY (numQw))";
        return create;
    }




    public void deletUser() {
        sql="DELETE FROM users WHERE chatid="+"'"+"'";


        try {

            statementBD().execute(sql);
           // System.out.println("User chatId="+user.getChatId()+" deleted!" );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



    private void dbConfig(){
        final String rootPath ="resourcesDb/DataBaseHeroku.properties";
        Properties dbProps = new Properties();
        try {
            dbProps.load(new FileInputStream(rootPath));
            DB_URL=dbProps.getProperty("DB_URL");
            USER=dbProps.getProperty("USER");
            PASS=dbProps.getProperty("PASS");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
