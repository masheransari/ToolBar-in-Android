package com.example.iq.toolbarapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refreshSetting:
                Toast.makeText(this, "Activity is being Refreshin", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.main_Setting:
                Toast.makeText(this, "Going to Main Activity", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(this,MainActivity.class);
                startActivity(i);
                return true;
            case R.id.third_Setting:
                Toast.makeText(this, "Goin to Third Activity", Toast.LENGTH_SHORT).show();
                Intent j= new Intent(this,Third.class);
                startActivity(j);
                return true;
            case R.id.second_Setting:
                Toast.makeText(this, "Going to Second Activity", Toast.LENGTH_SHORT).show();
                Intent k= new Intent(this,Second.class);
                startActivity(k);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
