package com.trainings.mymvpmoxytrainigl1.moxy.moxyView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.trainings.mymvpmoxytrainigl1.R;
import com.trainings.mymvpmoxytrainigl1.moxy.moxyPresenter.MoxyPresenter;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;

public class MoxyActivity extends MvpAppCompatActivity implements MoxyView {

    private static final String TAG = "MainActivity";

    private EditText editText;
    private Button sendTextBtn;
    private TextView textView;

    @InjectPresenter
    MoxyPresenter moxyPresenter;

    //А для чего же оно всё-таки нужно?
//    @ProvidePresenter
//    private MoxyPresenter providePresenter(){return new MoxyPresenter(this);}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        init();
    }

    private void init(){
        editText = findViewById(R.id.editText);
        sendTextBtn = findViewById(R.id.sendTextBtn);
        textView = findViewById(R.id.textView);
    }

    public void onSendBtnClick(View view) {
        moxyPresenter.onSendBtnClick();
    }


    @Override
    public void saveEnteredText() {
        moxyPresenter.saveEnteredText(editText.getText().toString());
    }

    @Override
    public void setTextToTextView(String madeString) {
        textView.setText(madeString);
    }

    @Override
    public void clearEditText() {
        editText.setText("");
    }

//    @Override
//    public String getEnteredString() {
//        return editText.getText().toString();
//    }
}