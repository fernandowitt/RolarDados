package com.example.rolardados;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class D4Fragment extends Fragment {


    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_second, container, false);

        final TextView welcomemsg = (TextView) v.findViewById(R.id.d4msg);
        final Button roll = (Button) v.findViewById(R.id.d4but);
        final ImageView dado = (ImageView) v.findViewById(R.id.d4iv);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                Random rand = new Random();
                i = rand.nextInt(4)+1;
                switch(i){
                    case 1:
                        dado.setImageResource(R.drawable.dquatroum);
                        welcomemsg.setText(R.string.rollone);
                        break;
                    case 2:
                        dado.setImageResource(R.drawable.dquatrodois);
                        welcomemsg.setText(R.string.rolltwo);
                        break;
                    case 3:
                        dado.setImageResource(R.drawable.dquatrotres);
                        welcomemsg.setText(R.string.rollthree);
                        break;
                    case 4:
                        dado.setImageResource(R.drawable.dquatroquatro);
                        welcomemsg.setText(R.string.rollfour);
                        break;
                    default:
                        Toast.makeText(roll.getContext(), getString(R.string.errormsg), Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });

        return v;
    }

}
