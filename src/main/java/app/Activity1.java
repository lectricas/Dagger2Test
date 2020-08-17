package app;

import javax.inject.Inject;

public class Activity1 {

    @Inject
    SomeRepository someRepository;

    @Inject
    SomeRouter someRouter;

    public Activity1() {
        App.plusChatComponent().inject(this);
    }

    public void hello() {
        System.out.println(someRepository.toString());
        System.out.println(someRouter.toString());
    }
}
