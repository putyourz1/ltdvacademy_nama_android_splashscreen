package com.putyourz1.anew.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.putyourz1.anew.splashscreen.R;

public class MainActivity extends AppCompatActivity {

    //set time untuk splashscreen
    private static int splashinterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Setting Tampilan Jadi Fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            //Jika Splash Screen Udah Selesai, Dia Manggil Activity
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);

                //selesai Splashscreen
                this.finish();
            }
            private void finish(){
                // ToDO Auto Generated Method stub
            }
        },splashinterval);

    }
}
