package com.example.raju.myalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     private Button exit_button;
     private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exit_button=findViewById(R.id.exit_button_id);
        exit_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setTitle(R.string.title_text);//Title

        alertDialogBuilder.setMessage(R.string.message_text);//Message

        alertDialogBuilder.setIcon(R.drawable.logout);//Icon

        alertDialogBuilder.setCancelable(false);//Have to touch alertbutton

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });//Set positive button

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });//Set Negative button

        alertDialogBuilder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You clicked in cancle button",Toast.LENGTH_SHORT).show();
            }
        });//Set Neutral button

        AlertDialog alertDialog=alertDialogBuilder.create();//Creat alertDialog object

        alertDialog.show();//Display alertDialog

    }
}
