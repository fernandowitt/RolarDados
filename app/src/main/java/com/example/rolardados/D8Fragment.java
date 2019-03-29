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


public class D8Fragment extends Fragment {
    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_d8, container, false);

        final TextView welcomemsg = (TextView) v.findViewById(R.id.d8msg);
        final Button roll = (Button) v.findViewById(R.id.d8but);
        final ImageView dado = (ImageView) v.findViewById(R.id.d8iv);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                Random rand = new Random();
                i = rand.nextInt(8)+1;
                switch(i){
                    case 1:
                        dado.setImageResource(R.drawable.doitoum);
                        welcomemsg.setText(R.string.rollone);
                        break;
                    case 2:
                        dado.setImageResource(R.drawable.doitodois);
                        welcomemsg.setText(R.string.rolltwo);
                        break;
                    case 3:
                        dado.setImageResource(R.drawable.doitotres);
                        welcomemsg.setText(R.string.rollthree);
                        break;
                    case 4:
                        dado.setImageResource(R.drawable.doitoquatro);
                        welcomemsg.setText(R.string.rollfour);
                        break;
                    case 5:
                        dado.setImageResource(R.drawable.doitocinco);
                        welcomemsg.setText(R.string.rollfive);
                        break;
                    case 6:
                        dado.setImageResource(R.drawable.doitoseis);
                        welcomemsg.setText(R.string.rollsix);
                        break;
                    case 7:
                        dado.setImageResource(R.drawable.doitosete);
                        welcomemsg.setText(R.string.rollseven);
                        break;
                    case 8:
                        dado.setImageResource(R.drawable.doitooito);
                        welcomemsg.setText(R.string.rolleight);
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

