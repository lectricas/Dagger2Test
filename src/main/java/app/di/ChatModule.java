package app.di;

import app.SomeRouter;
import app.di.scopes.ActivityScope;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule {
    @Provides
    @ActivityScope
    SomeRouter providesSomeRouter() {
        return new SomeRouter();
    }
}
