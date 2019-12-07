package com.example.databasehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    SQLiteDatabase sqLiteDatabase;
    EditText et_Name,et_Mail,et_Phone;
    Button btn_Add;
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_Name = (EditText)findViewById(R.id.txt_1);
        et_Phone = (EditText)findViewById(R.id.txt_2);
        et_Mail = (EditText)findViewById(R.id.txt_3);
        btn_Add = (Button)findViewById(R.id.button_add);
    }
    public void AddContact(View view){
        String name = et_Name.getText().toString();
        String phone = et_Phone.getText().toString();
        String mail = et_Mail.getText().toString();
        databaseHelper = new DatabaseHelper(context);
        sqLiteDatabase = databaseHelper.getWritableDatabase();
        databaseHelper.AddInf(name,phone,mail,sqLiteDatabase);
        Toast.makeText(getBaseContext(),"Data Saved",Toast.LENGTH_SHORT).show();
        databaseHelper.close();

    }
}
