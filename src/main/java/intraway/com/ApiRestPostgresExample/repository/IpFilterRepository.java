package intraway.com.ApiRestPostgresExample.repository;

import intraway.com.ApiRestPostgresExample.models.IpFilterSnmpCmdGroup;
import intraway.com.ApiRestPostgresExample.models.SnmpCmdGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpFilterRepository extends JpaRepository<IpFilterSnmpCmdGroup, Long> {
}
