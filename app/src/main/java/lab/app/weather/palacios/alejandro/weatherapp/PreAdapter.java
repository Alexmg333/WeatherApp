package lab.app.weather.palacios.alejandro.weatherapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by Alex on 2/28/2016.
 */
public class PreAdapter extends RecyclerView.Adapter<PreAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    List<Info> data = Collections.emptyList();

    public PreAdapter(Context context, List<Info> data){
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Info current = data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.pretext);
            icon = (ImageView) itemView.findViewById(R.id.preicon);
            title.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent("lab.app.weather.palacios.alejandro.weatherapp.SecondActivity");
            intent.putExtra("Title", title.getText().toString());
            context.startActivity(intent);
        }
    }
}
