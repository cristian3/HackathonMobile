package rest;

import java.util.List;

import model.Oferta;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by Cristian on 18/02/2017.
 */

public interface OfertaRest {
    @GET("ofertas/all")
    Call<List<Oferta>> getAllOfertas();
}
