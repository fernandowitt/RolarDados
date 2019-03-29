package com.example.rolardados;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int contIdD4 = 0;
    int contIdD6 = 0;
    int contIdD8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.addd4) {
            String myTag;
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            D4Fragment frag1 = new D4Fragment();
            myTag = "D4" + Integer.toString(contIdD4);
            ft.add(R.id.LinearLayout, frag1, myTag);
            contIdD4++;
            ft.commit();
        }else if (id == R.id.addd6) {
            String myTag;
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            D6Fragment frag1 = new D6Fragment();
            myTag = "D6" + Integer.toString(contIdD6);
            ft.add(R.id.LinearLayout, frag1, myTag);
            contIdD6++;
            ft.commit();
        }else if (id == R.id.addd8) {
            String myTag;
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            D8Fragment frag1 = new D8Fragment();
            myTag = "D8" + Integer.toString(contIdD8);
            ft.add(R.id.LinearLayout, frag1, myTag);
            contIdD8++;
            ft.commit();
        }else if (id == R.id.removed4) {
            String myTag;
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            myTag = "D4" + Integer.toString(contIdD4-1);
            if(fm.findFragmentByTag(myTag)!=null){
                contIdD4--;
                ft.remove(fm.findFragmentByTag(myTag));
                ft.commit();
            }else
                Toast.makeText(getApplicationContext(),"Não há D4 para ser removido!",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.removed6) {
            String myTag;
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            myTag = "D6" + Integer.toString(contIdD6-1);
            if(fm.findFragmentByTag(myTag)!=null){
                contIdD6--;
                ft.remove(fm.findFragmentByTag(myTag));
                ft.commit();
            }else
                Toast.makeText(getApplicationContext(),"Não há D6 para ser removido!",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.removed8) {
            String myTag;
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            myTag = "D8" + Integer.toString(contIdD8-1);
            if(fm.findFragmentByTag(myTag)!=null){
                contIdD8--;
                ft.remove(fm.findFragmentByTag(myTag));
                ft.commit();
            }else
                Toast.makeText(getApplicationContext(),"Não há D8 para ser removido!",Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}
