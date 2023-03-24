package br.com.ifsc.falepormim;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

public class TextToSpeechHelper implements TextToSpeech.OnInitListener {
    private TextToSpeech tts;
    boolean loaded =false;

    public TextToSpeechHelper(Context context){
        tts=new TextToSpeech(context,this);
    }
    @Override
    public void onInit(int status) {
        if (status==TextToSpeech.SUCCESS){
            tts.setLanguage(Locale.getDefault());
            loaded =true;
        }
    }
    public void speak(String text){
        if(loaded){
            tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);
        }

    }
}
