package com.company.ordermanage.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.web.bind.annotation.RequestMapping;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

import com.company.ordermanage.service.IAdminService;
import com.company.ordermanage.entity.Admin;

import org.springframework.web.bind.annotation.RestController;

/**
 * 管理用户登录表 前端控制器
 *
 * @author QIUXue
 * @since 2022-11-02
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private IAdminService adminService;

    @PostMapping
    public Boolean save(@RequestBody Admin admin) {
        return adminService.saveOrUpdate(admin);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return adminService.removeById(id);
    }

    @DeleteMapping("/del/batch")
    public Boolean deleteBatch(@RequestBody List<Integer> ids) {
        return adminService.removeByIds(ids);
    }

    @GetMapping
    public List<Admin> findAll() {
        return adminService.list();
    }

    @GetMapping("/{id}")
    public Admin findOne(@PathVariable Integer id) {
        return adminService.getById(id);
    }

    @GetMapping("/page")
    public Page<Admin> findPage(@RequestParam Integer pageNum,
                                @RequestParam Integer pageSize,
                                @RequestParam(defaultValue = "") String username) {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        if (!"".equals(username)){
            queryWrapper.like("username", username);
        }
        queryWrapper.orderByDesc("id");
        return adminService.page(new Page<>(pageNum, pageSize));
    }

}

