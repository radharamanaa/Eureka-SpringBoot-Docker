package dev.abhijeet.userms.repo;

import dev.abhijeet.userms.model.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends ListCrudRepository<User, Integer> {
}
