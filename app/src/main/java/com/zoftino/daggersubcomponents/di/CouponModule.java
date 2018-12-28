package com.zoftino.daggersubcomponents.di;

import com.zoftino.daggersubcomponents.data.CouponApi;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;

@Module
public class CouponModule {

    @Provides
    public CouponApi getCouponClient(Retrofit retrofit) {
        return retrofit.create(CouponApi.class);
    }

    @Provides
    public CompositeDisposable getComposite() {
        return new CompositeDisposable();
    }
}
