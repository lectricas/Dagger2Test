package app.di;

import app.Activity1;
import app.Activity2;
import app.di.scopes.ActivityScope;
import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = ChatModule.class)
@ActivityScope
public interface ChatComponent {
    void inject(Activity1 activity);
    void inject(Activity2 activity);
}
