package com.trainings.mymvpmoxytrainigl1.standart.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.trainings.mymvpmoxytrainigl1.R;
import com.trainings.mymvpmoxytrainigl1.standart.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MainView{

    private static final String TAG = "MainActivity";

    private EditText editText;
    private Button sendTextBtn;
    private TextView textView;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        init();

        presenter = new Presenter(this);
    }

    private void init(){
        editText = findViewById(R.id.editText);
        sendTextBtn = findViewById(R.id.sendTextBtn);
        textView = findViewById(R.id.textView);
    }

    public void onSendBtnClick(View view) {
        presenter.onSendBtnClick();
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