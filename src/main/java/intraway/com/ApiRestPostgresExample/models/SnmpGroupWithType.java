package intraway.com.ApiRestPostgresExample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SnmpGroupWithType {

    private SnmpCmdGroup snmpCmdGroup;
    private String type;

    public SnmpGroupWithType(SnmpCmdGroup snmpCmdGroup, String type){
        this.snmpCmdGroup = snmpCmdGroup;
        this.type = type;
    }
}
