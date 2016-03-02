package lab.app.weather.palacios.alejandro.weatherapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Alex on 2/29/2016.
 */
public class FragmentC extends Fragment {
    View rootView;
    String datos;
    TextView titulo;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragmentc , container, false);
        titulo = (TextView) rootView.findViewById(R.id.titulo);
        return rootView;
    }

    public void RecibirDatos(String datos){
        this.datos = datos;
        System.out.print(datos);
        titulo.setText(datos);
    }
}
