package br.com.dennissiqueira.twoviews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {

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
        Log.i("ciclodevida","SegundaActivity:onCreate");
        setContentView(R.layout.activity_segunda);
        Intent intentDeOrigem = getIntent();
        String mensagem = intentDeOrigem.getStringExtra("texto");
        
    }


}
