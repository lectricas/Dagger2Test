package app;

import javax.inject.Inject;

public class Activity2 {

    @Inject
    SomeRepository someRepository;

    @Inject
    SomeRouter someRouter;

    public Activity2() {
        App.plusChatComponent().inject(this);
    }

    public void hello() {
        System.out.println(someRepository.toString());
        System.out.println(someRouter.toString());
    }
}
