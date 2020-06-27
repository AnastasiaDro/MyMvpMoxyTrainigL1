package com.trainings.mymvpmoxytrainigl1.moxy.moxyPresenter;

import android.util.Log;

import com.trainings.mymvpmoxytrainigl1.moxy.moxyModel.MoxyModel;
import com.trainings.mymvpmoxytrainigl1.moxy.moxyView.MoxyView;
import com.trainings.mymvpmoxytrainigl1.standart.model.Model;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyView> {
    private static final String TAG = "MoxyPresenter";

    private MoxyModel moxyModel;

    public MoxyPresenter() {
        Log.d(TAG, " created");
        moxyModel = new MoxyModel();
    }


    private String createNewString(String oldString, String enteredString) {
        String newString = oldString.concat(enteredString);
        return newString;
    }

    public void onSendBtnClick() {
        String oldString = moxyModel.getMyString();
        //матрёшка какая-то получается:
        //вызываю здесь метод в мэйнАктивити, который перебрасывает в презентер данные из EditText.
        //А презентер перебрасывает в модель.
        //После чего сразу же и берет из модели значение сохраненного текста
        getViewState().saveEnteredText();
        String madeString = createNewString(oldString, moxyModel.getEnteredString());
        moxyModel.setMyString(madeString);
        getViewState().setTextToTextView(madeString);
        getViewState().clearEditText();
    }

    public void saveEnteredText(String enteredText) {
        Log.d(TAG, "saveEnteredText");
        moxyModel.setEnteredString(enteredText);
    }
}
