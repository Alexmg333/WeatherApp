package lab.app.weather.palacios.alejandro.weatherapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 2/27/2016.
 */
public class fragmentb extends Fragment {
    private RecyclerView recyclerView;
    private PreAdapter adapter;
    View rootView;
    TextView output;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.fragmentb, container, false);
        output = (TextView) rootView.findViewById(R.id.output);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.estimador);
        adapter = new PreAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    public static List<Info> getData(){
        List<Info> data = new ArrayList<>();
        int[] icons = {R.drawable.cloud, R.drawable.cloud, R.drawable.cloud, R.drawable.cloud, R.drawable.cloud, R.drawable.cloud, R.drawable.cloud};
        String[] titles = {"Dia 1", "Dia 2", "Dia 3", "Dia 4", "Dia 5", "Dia 6", "Dia 7"};
        for(int i = 0; i<titles.length && i<icons.length; i++){
            Info current = new Info();
            current.iconId = icons[i];
            current.title = titles[i];
            data.add(current);
        }
        return data;
    }

    public void recibir(String msg){
        output.setText(msg);
    }
}