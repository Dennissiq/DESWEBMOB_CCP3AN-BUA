package br.com.dennissiqueira.twoviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mensagemEditText;


    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ciclodevida","MainActivity:onResume");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("ciclodevida","MainActivity:onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("ciclodevida","MainActivity:onDestroy");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("ciclodevida","MainActivity:onStop");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("ciclodevida","MainActivity:onStart");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ciclodevida","MainActivity:onCreate");
        setContentView(R.layout.activity_main);
    }

    public final static String EXTRA_MESSAGE = "br.com.dennissiqueira.twoviews.MESSAGE";

   public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
   }
}
