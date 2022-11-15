package com.company.ordermanage.service.impl;

import com.company.ordermanage.entity.Admin;
import com.company.ordermanage.mapper.AdminMapper;
import com.company.ordermanage.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理用户登录表 服务实现类
 * </p>
 *
 * @author QIUXue
 * @since 2022-11-02
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
