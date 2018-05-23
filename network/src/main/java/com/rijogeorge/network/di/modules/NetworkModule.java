package com.rijogeorge.network.di.modules;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.rijogeorge.network.BuildConfig;
import com.rijogeorge.network.interceptors.RequestInterceptor;
import com.rijogeorge.network.webServices.DoctorSearchService;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    private static final int CONNECT_TIMEOUT_IN_MS = 200000;

    @Provides
    OkHttpClient provideOkHttpClient(RequestInterceptor requestInterceptor) {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new okhttp3.OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIMEOUT_IN_MS, TimeUnit.MILLISECONDS)
                .addInterceptor(loggingInterceptor)
                .addInterceptor(requestInterceptor)
                .build();
    }

    @Provides
    Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.DOCTOR_API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build();
    }

    @Provides
    DoctorSearchService doctorSearchService(Retrofit retrofit) {
        return retrofit.create(DoctorSearchService.class);
    }

}
