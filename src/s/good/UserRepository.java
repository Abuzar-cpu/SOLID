package s.good;

import s.UserEntity;

import java.util.Random;


public class UserRepository {
    private final Random random = new Random();

    private final UserEntity user = new UserEntity("user", random.nextInt(), random.nextBoolean());


    // This is good because there is only database logic. Business logic is in service class
    public UserEntity getUser() {
        return user;
    }
}
