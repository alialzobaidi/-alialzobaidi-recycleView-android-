package org.codeforiraq.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.codeforiraq.Controller.DatabaseHelper;
import org.codeforiraq.Model.Data;
import org.codeforiraq.sqliterecycleview.MainActivity;
import org.codeforiraq.sqliterecycleview.R;

public class EditData extends AppCompatActivity {

    private EditText nameText , jobText , phoneText ;
    private Button editButton;
    private DatabaseHelper databaseHelper;
    Data personInfo;
    int position;
    String str_position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);


        nameText = findViewById(R.id.name1);
        jobText = findViewById(R.id.job);
        phoneText = findViewById(R.id.phone);
        editButton = findViewById(R.id.buttonedit);


        Bundle bundle = getIntent().getExtras();
        str_position = bundle.getString("position");
        position = Integer.parseInt(str_position);
        databaseHelper = new DatabaseHelper(this);
        personInfo = databaseHelper.getData(position);

        if(personInfo != null){
            nameText.setText(personInfo.getName());
            jobText.setText(personInfo.getJob());
            phoneText.setText(personInfo.getPhone());
        }



        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personInfo.setName(  nameText.getText().toString() );
                personInfo.setJob(  jobText.getText().toString() );
                personInfo.setPhone(  phoneText.getText().toString() );

                databaseHelper.updateData(personInfo);
                MainActivity.notifyAdapter();
                Intent intent = new Intent(EditData.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
