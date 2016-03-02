package lab.app.weather.palacios.alejandro.weatherapp;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;

/**
 * Created by Alex on 2/27/2016.
 */
public class FragmentA extends Fragment{
    View rootView;
    Button boton;
    EditText editText;
    Enviar EM;
    TextView temp;
    TextView mintemp;
    TextView maxtemp;
    TextView tempestado;
    TextView salsol;
    TextView puessol;
    ImageView iconday;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragmenta , container, false);
        editText = (EditText) rootView.findViewById(R.id.input);
        temp = (TextView) rootView.findViewById(R.id.temp);
        mintemp = (TextView) rootView.findViewById(R.id.mintemp);
        maxtemp = (TextView) rootView.findViewById(R.id.maxtemp);
        tempestado = (TextView) rootView.findViewById(R.id.tempestado);
        salsol = (TextView) rootView.findViewById(R.id.salsol);
        puessol = (TextView) rootView.findViewById(R.id.puessol);
        iconday = (ImageView) rootView.findViewById(R.id.iconday);
        boton = (Button) rootView.findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = editText.getText().toString();
                EM.enviarDatos(dato);
                temp.setVisibility(View.VISIBLE);
                mintemp.setVisibility(View.VISIBLE);
                maxtemp.setVisibility(View.VISIBLE);
                iconday.setVisibility(View.VISIBLE);
                tempestado.setVisibility(View.VISIBLE);
                salsol.setVisibility(View.VISIBLE);
                puessol.setVisibility(View.VISIBLE);
                editText.setText("");
            }
        });
        return rootView;
    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        EM = (Enviar)activity;
    }

    public void ocultar(){
        editText.setVisibility(View.INVISIBLE);
        boton.setVisibility(View.INVISIBLE);
    }

    public void mostrar(String datos){
        temp.setText(datos);
        temp.setVisibility(View.VISIBLE);
        mintemp.setVisibility(View.VISIBLE);
        maxtemp.setVisibility(View.VISIBLE);
        iconday.setVisibility(View.VISIBLE);
        tempestado.setVisibility(View.VISIBLE);
        salsol.setVisibility(View.VISIBLE);
        puessol.setVisibility(View.VISIBLE);
    }
}
