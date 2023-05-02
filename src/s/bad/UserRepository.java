package s.bad;

import s.UserEntity;

import java.awt.desktop.UserSessionEvent;
import java.util.Random;

public class UserRepository {
    private final Random random = new Random();

    private final UserEntity user = new UserEntity("user", random.nextInt(), random.nextBoolean());


    // This is bad. This class carries both database level and service level logic
    // Service logic should be in separate class
    public UserEntity getUser() {
        if(user.isActive()) {
            return user;
        } else {
            return null;
        }
    }
}
