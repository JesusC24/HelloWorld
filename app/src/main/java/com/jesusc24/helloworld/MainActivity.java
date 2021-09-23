package com.jesusc24.helloworld;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Crear una variable de objeto de una subclase de View
    TextView tv_message;
    Button btn_change_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Instanciar la variable
        tv_message = findViewById(R.id.tv_message);
        btn_change_msg = findViewById(R.id.btn_change_msg);

        //3. Modificar el texto en tiempo de ejecución

        // tv_message.setText("Hola mundo"); No!!!

        tv_message.setText(R.string.msg_caracola);
        //btn_change_msg.setBackgroundColor(getResources().getColor(R.color.teal_200)); mala praxis
        btn_change_msg.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200));


    }
}