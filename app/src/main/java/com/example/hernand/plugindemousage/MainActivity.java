package com.example.hernand.plugindemousage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private NativeUtilsImpl nativeUtils = new NativeUtilsImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewMessage = findViewById(R.id.text_msg);
        //How to retrieve the protected keys
        textViewMessage.setText(
                "getPrivateKeyNative = " + nativeUtils.getPrivateKeyNative() + "\n" +
                        "getPrivateKey2Native = " + nativeUtils.getPrivateKey2Native()
        );
    }
}
