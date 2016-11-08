package mpsoftware.ltd.ekatornews.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Piash on 11/7/2016.
 */

public interface NewsPaperInterface {

    @GET("n.php")
    Call<List<String>> getNewsTitle();
}
