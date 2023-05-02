package s.good;

import s.UserEntity;

public class UserService {
    private final UserRepository userRepository = new UserRepository();


    // Business logic is here and this class has nothing to do with repository logic
    public UserEntity getUser() {
        UserEntity user = this.userRepository.getUser();

        if(user.isActive())
            return user;

        return null;
    }
}
