package project0.nd.khan.jubair.mohammad.project0_appsportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Toast mAppToast;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn1;
        Button btn2;
        Button btn3;
        Button btn4;
        Button btn5;
        Button btn6;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           btn1 = (Button) findViewById(R.id.btnApp1);
           btn1.setOnClickListener(this);

           btn2 = (Button) findViewById(R.id.btnApp2);
           btn2.setOnClickListener(this);

           btn3 = (Button)findViewById(R.id.btnApp3);
           btn3.setOnClickListener(this);

           btn4 = (Button)findViewById(R.id.btnApp4);
           btn4.setOnClickListener(this);

           btn5 = (Button)findViewById(R.id.btnApp5);
           btn5.setOnClickListener(this);

           btn6 = (Button)findViewById(R.id.btnApp6);
           btn6.setOnClickListener(this);
    }

    // onClick is called when a view has been clicked.
    @Override
    public void onClick(View v) {
        if(null != v){
            Button clickedButton = (Button) v;
            //Stop any previous toasts
            if(mAppToast !=null) mAppToast.cancel();
            //Make and display new toast
            mAppToast = Toast.makeText(this,"This button will launch my "+ clickedButton.getText(),Toast.LENGTH_SHORT);
            mAppToast.show();
        }
    }
}
