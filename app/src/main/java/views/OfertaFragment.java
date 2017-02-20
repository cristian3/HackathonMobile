package views;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cristian.hackathon.MainActivity;
import com.example.cristian.hackathon.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import model.Oferta;

/**
 * Created by Cristian on 18/02/2017.
 */

public class OfertaFragment extends Fragment {

    private Oferta oferta;
    public TextView texto;
    public static OfertaFragment newInstance(Oferta oferta) {
        OfertaFragment fragment = new OfertaFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("oferta", oferta);
        fragment.setArguments(bundle);

        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment, container, false);
        //texto=(TextView) vista.findViewById(R.id.textView2);
        oferta=(Oferta) getArguments().getSerializable(
                "oferta");
        texto.setText(oferta.getDescripcion());
        return vista;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

}
