package intraway.com.ApiRestPostgresExample.repository;

import intraway.com.ApiRestPostgresExample.models.CustomSnmpCmdGroup;
import intraway.com.ApiRestPostgresExample.models.SnmpCmdGroup;
import intraway.com.ApiRestPostgresExample.models.SnmpGroupWithType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface SnmpGroupRepository extends JpaRepository<SnmpCmdGroup, Long> {

    @Query("SELECT NEW intraway.com.ApiRestPostgresExample.models.SnmpGroupWithType(e, " +
            "CASE TYPE(e) " +
            "  WHEN SnmpCmdGroup THEN 'SnmpCmdGroup' " +
            "  ELSE 'Other' " +
            "END) " +
            "FROM SnmpCmdGroup e")
    List<SnmpGroupWithType> getSnmpWithType();


}
