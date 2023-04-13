package br.com.someapp.framework.repository;

import br.com.someapp.domain.User;
import org.springframework.data.repository.Repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface UsersRepository extends Repository<User,Long> {

    public User save(User user);
    public User findByDocumentNumber(String documentNumber);
    public List<User> findAllByDocumentNumber(String documentNumber);
    public List<User> findAll();
}
