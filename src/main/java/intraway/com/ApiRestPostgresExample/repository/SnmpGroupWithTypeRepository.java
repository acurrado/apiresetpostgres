package intraway.com.ApiRestPostgresExample.repository;

import intraway.com.ApiRestPostgresExample.models.SnmpCmdGroup;
import intraway.com.ApiRestPostgresExample.models.SnmpGroupWithType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SnmpGroupWithTypeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<SnmpGroupWithType> getSnmpGroupsWithType() {
        List<SnmpGroupWithType> returnList = new ArrayList<>();

        TypedQuery<Object[]> query = entityManager.createQuery(
                "SELECT e, TYPE(e) FROM SnmpCmdGroup e",
                Object[].class
        );

        List<Object[]> result = query.getResultList();

        for (Object[] obj : result) {
            SnmpCmdGroup employee = (SnmpCmdGroup) obj[0];
            String employeeType = (String) obj[1];
            // Process the data as needed

            returnList.add(new SnmpGroupWithType(employee, employeeType));
        }

        return returnList;
    }
}
