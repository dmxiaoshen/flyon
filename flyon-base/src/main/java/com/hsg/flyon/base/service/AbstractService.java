package com.hsg.flyon.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hsg.flyon.base.dao.BaseHibernateDao;

public abstract class AbstractService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected BaseHibernateDao baseHibernateDao;

}
