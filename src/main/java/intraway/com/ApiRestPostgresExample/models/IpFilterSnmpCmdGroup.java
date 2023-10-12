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
@Table(name = "snmp_cmd_group_ip_filter")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue("ip")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class IpFilterSnmpCmdGroup extends SnmpCmdGroup {

  /**
   * TODO validar tipos
   */
  private Integer control;

  /**
   * TODO validar tipos
   */
  private Integer interfaceId;

  /**
   * TODO validar tipos
   */
  private Integer direction;

  /**
   * TODO validar tipos
   */
  private Integer broadcast;

  private String sourceIp;

  private String sourceMask;

  private String destIp;

  private String destMask;

  /**
   * TODO validar tipos
   */
  private Integer protocol;

  private Integer sourcePortLow;

  private Integer sourcePortHigh;

  private String tos;

  private String tosMaks;

  private Boolean isContinue;

  private String policyTosAndMask;

  private String policyTosOrMask;

}
