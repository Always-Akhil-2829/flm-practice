package com.beans;

public class Controller {
    private static Controller controller= null;
    private Controller(){

    }
    public static  Controller getController(){
        if(controller == null){
            controller = new Controller();
            return  controller;
        }
        else {
            return  controller;
        }
    }
}
