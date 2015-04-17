
package com.hsg.flyon.common.user.service;

import com.hsg.flyon.base.page.Page;
import com.hsg.flyon.base.page.Pagination;
import com.hsg.flyon.common.user.entity.User;

public interface UserService {

    User findById(long userId);

    Pagination<User> findPagination(Page page);

}
