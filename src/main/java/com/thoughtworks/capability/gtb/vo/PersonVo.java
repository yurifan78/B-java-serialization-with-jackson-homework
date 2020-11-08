package com.thoughtworks.capability.gtb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  @JsonInclude(Include.NON_NULL)
  private String hobby;
}
