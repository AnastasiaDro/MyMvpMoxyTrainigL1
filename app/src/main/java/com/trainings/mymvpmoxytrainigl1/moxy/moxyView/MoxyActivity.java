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
import com.trainings.mymvpmoxytrainigl1.standart.presenter.Presenter;

public class MoxyActivity extends AppCompatActivity implements MoxyView {

    private static final String TAG = "MainActivity";

    private EditText editText;
    private Button sendTextBtn;
    private TextView textView;
    private MoxyPresenter moxyPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        init();

        moxyPresenter = new MoxyPresenter(this);
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
    public void setTextToTextView(String madeString) {
        textView.setText(madeString);
    }

    @Override
    public void clearEditText() {
        editText.setText("");
    }

    @Override
    public String getEnteredString() {
        return editText.getText().toString();
    }
}