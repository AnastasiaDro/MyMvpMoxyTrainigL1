package com.trainings.mymvpmoxytrainigl1.moxy.moxyPresenter;

import android.util.Log;
import com.trainings.mymvpmoxytrainigl1.moxy.moxyView.MoxyView;
import com.trainings.mymvpmoxytrainigl1.standart.model.Model;

public class MoxyPresenter {
    private static final String TAG = "MoxyPresenter";

    private Model model;
    private MoxyView moxyView;
    String oldString;

    public MoxyPresenter (MoxyView moxyView){
        Log.d(TAG, " created");
        this.moxyView = moxyView;
        model = new Model();
    }



    private String createNewString(String oldString, String enteredString){
        String newString = oldString.concat(enteredString);
        return newString;
    }

    public void onSendBtnClick() {
        String oldString = model.getString();
        String enteredString = moxyView.getEnteredString();
        String madeString = createNewString(oldString, enteredString);
        model.setString(madeString);
        moxyView.setTextToTextView(madeString);
        moxyView.clearEditText();
    }
}
