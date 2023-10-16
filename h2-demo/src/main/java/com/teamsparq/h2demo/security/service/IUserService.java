package com.teamsparq.h2demo.security.service;

import com.teamsparq.h2demo.entity.User;
import com.teamsparq.h2demo.web.dto.UserDto;


import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto);
    User getUser(String verificationToken);
    void saveRegisteredUser(User user);
    void deleteUser(User user);
    void createVerificationTokenForUser(User user, String token);
    void createPasswordResetTokenForUser(User user, String token);
    User findUserByEmail(String email);
    Optional<User> getUserByPasswordResetToken(String token);
    Optional<User> getUserByID(long id);
    void changeUserPassword(User user, String password);
    boolean checkIfValidOldPassword(User user, String password);
    String validateVerificationToken(String token);
    String generateQRUrl(User user) throws UnsupportedEncodingException;
    User updateUser2fa(boolean use2fa);
    List<String> getUserFromSessionRegistry();


}
