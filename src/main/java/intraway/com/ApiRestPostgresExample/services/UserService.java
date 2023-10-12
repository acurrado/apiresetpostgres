package intraway.com.ApiRestPostgresExample.services;

import intraway.com.ApiRestPostgresExample.models.*;
import intraway.com.ApiRestPostgresExample.repository.IpFilterRepository;
import intraway.com.ApiRestPostgresExample.repository.SnmpGroupRepository;
import intraway.com.ApiRestPostgresExample.repository.SnmpGroupWithTypeRepository;
import intraway.com.ApiRestPostgresExample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    /*@Autowired
    CustomSnmpRepository customSnmpRepository;*/

    @Autowired
    SnmpGroupRepository snmpGroupRepository;

    @Autowired
    IpFilterRepository ipFilterRepository;

    @Autowired
    SnmpGroupWithTypeRepository snmpGroupWithTypeRepository;

    public User createUser(User user) {
        try {

            return userRepository.save(user);
        } catch (Exception ex) {
            ex.getMessage();
        }

        return null;
    }

    public List<User> getUsers() {

        List<SnmpGroupWithType> objectsType = snmpGroupRepository.getSnmpWithType();

        //List<SnmpGroupWithType> objects = snmpGroupWithTypeRepository.getSnmpGroupsWithType();
        return userRepository.findAll();
    }
}
