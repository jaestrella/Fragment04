package com.iesvirgendelcarmen.dam.fragment04;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

/**
 * Created by matinal on 11/10/2017.
 */

public class Fragmento1 extends DialogFragment {
    static Fragmento1 nuevaInstancia(String titulo){
        Fragmento1 fragmento=new Fragmento1();
        Bundle args=new Bundle();
        args.putString("titulo",titulo);
        fragmento.setArguments(args);
        return fragmento;
    }

    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String titulo=getArguments().getString("titulo");
        return new AlertDialog.Builder(getActivity())
                .setTitle(titulo)
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int which){
                        ((Fragment04)getActivity()).positivo();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog,int which){
                        ((Fragment04)getActivity()).negativo();
                    }
                })
                .create();
    }
}
