package com.syhd.customshotview;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //FloatingWindowActivity的布局视图按钮
        Button start = (Button)findViewById(R.id.start_id);

        Button remove = (Button)findViewById(R.id.remove_id);

        start.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, FxService.class);
                startService(intent);
                finish();
            }
        });

        remove.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                //uninstallApp("com.phicomm.hu");
                Intent intent = new Intent(MainActivity.this, FxService.class);
                stopService(intent);
            }
        });

    }
}