package br.com.ifsc.falepormim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    TextToSpeechHelper textToSpeechHelper;
    EditText editText;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= findViewById(R.id.editText);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                falar(v);
            }
        });
        textToSpeechHelper=new TextToSpeechHelper(this);
    }

    private void falar(View v) {
        textToSpeechHelper.speak(editText.getText().toString());
    }


}