package com.zoftino.daggersubcomponents.di;

import com.zoftino.daggersubcomponents.StoreFragment;

import dagger.Subcomponent;

@Subcomponent(modules = StoreModule.class)
public interface StoreComponent {
    @Subcomponent.Builder
    interface Builder {
        StoreComponent.Builder storeModule(StoreModule module);
        StoreComponent.Builder anotherModule(AnotherModule module);
        StoreComponent build();
    }
    public void inject(StoreFragment fragment);
}
