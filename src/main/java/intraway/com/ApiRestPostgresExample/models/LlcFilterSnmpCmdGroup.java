/*
 * Copyright (C) Intraway Corporation - All Rights Reserved (2020)
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 *
 * Proprietary and confidential
 *
 * This file is subject to the terms and conditions defined in file LICENSE.txt, which is part of this source code
 * package.
 */
package intraway.com.ApiRestPostgresExample.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name = "snmp_cmd_group_llc_filter")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("llc")
@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LlcFilterSnmpCmdGroup extends SnmpCmdGroup {

}
