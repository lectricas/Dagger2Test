package app.di;

import app.SomeRepository;
import dagger.Component;

import javax.inject.Singleton;

@Component(modules = app.di.AppModule.class)
@Singleton
public interface AppComponent {
    ChatComponent plusChatComponent(ChatModule chatModule);
}
