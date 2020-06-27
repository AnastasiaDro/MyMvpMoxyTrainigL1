package com.trainings.mymvpmoxytrainigl1.standart.presenter;

import android.util.Log;

import com.trainings.mymvpmoxytrainigl1.standart.model.Model;
import com.trainings.mymvpmoxytrainigl1.standart.view.MainView;


public class Presenter {

    private static final String TAG = "Presenter";

    private Model model;
    private MainView mainView;
    String oldString;



    public Presenter (MainView mainView){
        Log.d(TAG, " created");
        this.mainView = mainView;
        model = new Model();
    }



    private String createNewString(String oldString, String enteredString){
        String newString = oldString.concat(enteredString);
        return newString;
    }

    public void onSendBtnClick() {
        String oldString = model.getString();
        String enteredString = mainView.getEnteredString();
        String madeString = createNewString(oldString, enteredString);
        model.setString(madeString);
        mainView.setTextToTextView(madeString);
        mainView.clearEditText();
    }

}
