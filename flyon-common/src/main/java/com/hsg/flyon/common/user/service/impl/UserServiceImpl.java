package com.hsg.flyon.common.user.service.impl;

import org.hibernate.criterion.Order;
import org.springframework.stereotype.Service;

import com.hsg.flyon.base.page.Page;
import com.hsg.flyon.base.page.PageUtil;
import com.hsg.flyon.base.page.Pagination;
import com.hsg.flyon.base.service.AbstractService;
import com.hsg.flyon.common.user.entity.User;
import com.hsg.flyon.common.user.service.UserService;

@Service
public class UserServiceImpl extends AbstractService implements UserService {

    @Override
    public User findById(long userId) {
        return baseHibernateDao.get(User.class, userId);
    }

    @Override
    public Pagination<User> findPagination(Page page) {
       String hql = " from User";
       Order order = PageUtil.getOrder(page);
       if(order!=null){
           hql+=" order by "+order.toString();
       }
       return baseHibernateDao.list(hql, null, PageUtil.getPage(page), PageUtil.getPageSize(page));
    }

}
