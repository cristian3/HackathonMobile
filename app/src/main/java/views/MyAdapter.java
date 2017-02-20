package views;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cristian.hackathon.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import model.Oferta;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Oferta> mDataset;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView descripcion;
        public TextView titulo;
        public ViewHolder(View v) {
            super(v);
            descripcion=(TextView) v.findViewById(R.id.descripcion);
            titulo=(TextView) v.findViewById(R.id.titulo);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<Oferta> ofertas) {
        mDataset = ofertas;
    }

    // Create new views (invoked by the layout manager)


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        ButterKnife.bind(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
       holder.descripcion.setText(this.mDataset.get(position).getDescripcion());
        holder.titulo.setText(this.mDataset.get(position).getTitulo());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

