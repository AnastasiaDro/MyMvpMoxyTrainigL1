package com.trainings.mymvpmoxytrainigl1.moxy.moxyModel;

public class MoxyModel {
    String myString;
    String enteredString;

    public MoxyModel(){
        myString = "";
        enteredString = "";
    }



    public String getMyString() {
        return myString;
    }
    public void setMyString(String madeString) {
        myString = madeString;
    }


    public String getEnteredString() { return enteredString; }

    public void setEnteredString(String enteredString) { this.enteredString = enteredString; }

}
