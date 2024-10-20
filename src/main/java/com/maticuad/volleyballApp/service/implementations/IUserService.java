package com.maticuad.volleyballApp.service.implementations;

import com.maticuad.volleyballApp.dto.ChangePasswordDTO;
import com.maticuad.volleyballApp.model.Persistance.User;
import com.maticuad.volleyballApp.repository.UserRepository;
import com.maticuad.volleyballApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;


@Service
@RequiredArgsConstructor
public class IUserService implements UserService, UserDetailsService {

    private final PasswordEncoder encoder;
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Inside user service");
        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User is not valid"));
    }

    @Override
    public List<User> getAllUsers() {
       return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public void changePassword(ChangePasswordDTO request, Principal connectedUser) {
        User user = (User) ((UsernamePasswordAuthenticationToken) connectedUser).getPrincipal();
        if (!encoder.matches(request.currentPass(), user.getPassword())) {
            throw new IllegalStateException("Wrong password");
        }
        if (request.currentPass().equals(request.newPass())) {
            throw new IllegalStateException("The new password is the same as the old one");
        }
        if (!request.newPass().equals(request.confirmationPass())) {
            throw new IllegalStateException("Passwords do not match");
        }

        user.setPassword(encoder.encode(request.newPass()));
        userRepository.save(user);
    }

}
