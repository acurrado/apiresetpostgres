package intraway.com.ApiRestPostgresExample.repository;

import intraway.com.ApiRestPostgresExample.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
