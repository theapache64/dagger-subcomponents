package com.zoftino.daggersubcomponents.di;

import dagger.Module;
import dagger.Provides;

@Module
public class AnotherModule {

    private final String name;

    public AnotherModule(String name) {
        this.name = name;
    }

    @Provides
    String provideName() {
        return name;
    }
}
