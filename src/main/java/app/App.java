package app;

import app.di.AppComponent;
import app.di.ChatComponent;
import app.di.ChatModule;
import app.di.DaggerAppComponent;

public class App {

    private static AppComponent appComponent;
    private static ChatComponent chatComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static void main(String[] args) {
        appComponent = DaggerAppComponent.builder().build();

        Activity1 activity1 = new Activity1();
        activity1.hello();

        Activity2 activity2 = new Activity2();
        activity2.hello();
    }

    public static ChatComponent plusChatComponent() {
        if (chatComponent == null) {
            chatComponent = appComponent.plusChatComponent(new ChatModule());
        }
        return chatComponent;
    }
}
