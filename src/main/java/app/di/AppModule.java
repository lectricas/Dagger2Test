package app.di;

import app.SomeRepository;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class AppModule {

    @Provides
    @Singleton
    SomeRepository provideUrl() {
        return new SomeRepository();
    }
}
