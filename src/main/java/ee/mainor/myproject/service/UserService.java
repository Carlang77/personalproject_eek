package ee.mainor.myproject.service;

import ee.mainor.myproject.model.UserModel;
import ee.mainor.myproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel registerUser(String login, String password, String email){
        if(login != null && password != null){
            UserModel userModel = new UserModel();
            userModel.setLogin(login);
            userModel.setPassword(password);
            userModel.setEmail(email);
            return userRepository.save(userModel);

        }
        else {
            return null;
        }

    }

    public UserModel authenticate (String login, String password){
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }


}
