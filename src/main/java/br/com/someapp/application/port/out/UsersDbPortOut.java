package br.com.someapp.application.port.out;

import br.com.someapp.domain.User;
import br.com.someapp.domain.dto.UserDto;

import java.util.List;

public interface UsersDbPortOut {
    public User createUser(UserDto userDto) throws Exception;
    public User getUserByDocumentNumber(String documentNumber) throws Exception;
    public List<User> getAllUsersByDocumentNumber(String documentNumber) throws Exception;
    public List<User> getAllUsers() throws Exception;
}
