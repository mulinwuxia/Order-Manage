package com.company.ordermanage.mapper;

import com.company.ordermanage.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 管理用户登录表 Mapper 接口
 * </p>
 *
 * @author QIUXue
 * @since 2022-11-02
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}
