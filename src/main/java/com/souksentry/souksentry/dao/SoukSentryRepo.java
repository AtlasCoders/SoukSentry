package com.souksentry.souksentry.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SoukSentryRepo<T, ID> extends CrudRepository<T, ID> {
}
