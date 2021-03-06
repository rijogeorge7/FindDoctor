package com.rijogeorge.network.interceptors;

import com.rijogeorge.network.BuildConfig;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RequestInterceptor implements Interceptor {

    @Inject
    public RequestInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        HttpUrl originalHttpUrl = original.url();

        HttpUrl url = originalHttpUrl.newBuilder()
                .addQueryParameter("user_key", BuildConfig.BETTER_DOCTOR_API_KEY)
                .build();

        Request request = original.newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
