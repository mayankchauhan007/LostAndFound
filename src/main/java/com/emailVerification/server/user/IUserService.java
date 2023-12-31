package com.emailVerification.server.user;

import com.emailVerification.server.registration.RegistrationRequest;
import com.emailVerification.server.registration.token.VerificationToken;

import java.util.List;
import java.util.Optional;

/**
 * @author Sampson Alfred
 */

public interface IUserService {
    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);

    String validateToken(String theToken);
}