package com.thoughtworks.capability.gtb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
  @JsonProperty("userId")
  private String id;
  @JsonProperty("userName")
  private String name;
}
