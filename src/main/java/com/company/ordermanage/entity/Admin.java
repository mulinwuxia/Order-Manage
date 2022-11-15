package com.company.ordermanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 管理用户登录表
 * </p>
 *
 * @author QIUXue
 * @since 2022-11-02
 */
@Getter
@Setter
  @ApiModel(value = "Admin对象", description = "管理用户登录表")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("用户id")
        @TableId(value = "uid", type = IdType.AUTO)
      private Integer uid;

      @ApiModelProperty("用户登录名")
      private String username;

      @ApiModelProperty("登录密码")
      private String password;

      @ApiModelProperty("创建时间")
      private LocalDateTime addTime;

      @ApiModelProperty("修改时间")
      private LocalDateTime upTime;


}
