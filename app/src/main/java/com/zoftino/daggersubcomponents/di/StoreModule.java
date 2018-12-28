package com.zoftino.daggersubcomponents.di;

import com.zoftino.daggersubcomponents.data.StoreApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;
import retrofit2.Retrofit;

@Module(includes = AnotherModule.class)
public class StoreModule {

    @Provides
    public StoreApi getStoreClient(Retrofit retrofit) {
        return retrofit.create(StoreApi.class);
    }

    @Provides
    public CompositeDisposable getComposite() {
        return new CompositeDisposable();
    }
}
