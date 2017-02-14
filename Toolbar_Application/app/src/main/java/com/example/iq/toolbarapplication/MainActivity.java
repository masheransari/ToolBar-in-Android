package com.example.iq.toolbarapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.refreshId:
                Toast.makeText(this, "Activity Has Been Refresh", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.secondActivity:
                Toast.makeText(this, "now We are Going to Second Activity", Toast.LENGTH_SHORT).show();
                Intent k= new Intent(this,Second.class);
                startActivity(k);
                return true;
            case R.id.settingId:
                Toast.makeText(this, "now We are Going in Setting Activity", Toast.LENGTH_SHORT).show();
                Intent i= new Intent(this,Setting.class);
                startActivity(i);
                return true;
            case R.id.thirdActivity:
                Toast.makeText(this, "now We are Going in Third Activity", Toast.LENGTH_SHORT).show();
                Intent j= new Intent(this,Third.class);
                startActivity(j);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
