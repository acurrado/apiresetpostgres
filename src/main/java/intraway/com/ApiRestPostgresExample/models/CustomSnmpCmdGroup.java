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

import javax.persistence.*;

import lombok.*;

/*@Entity
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("custom")
@Getter
@Setter
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)*/
public class CustomSnmpCmdGroup extends SnmpCmdGroup {

}
