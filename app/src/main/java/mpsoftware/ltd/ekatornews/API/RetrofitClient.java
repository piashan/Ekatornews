package mpsoftware.ltd.ekatornews.API;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Piash on 11/7/2016.
 */

public class RetrofitClient {

    private static Retrofit sRetrofit;
    public RetrofitClient() {
    }

    public synchronized static Retrofit getInstance(final Context context) {
        if (sRetrofit == null) {
            createRetrofit(context);
        }
        return sRetrofit;
    }


    private static void createRetrofit(final Context context) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().readTimeout(3000, TimeUnit.SECONDS)
                .cache(new Cache(context.getCacheDir(), 10 * 1024 * 1024))
                .build();
        sRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://192.168.0.101/data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
