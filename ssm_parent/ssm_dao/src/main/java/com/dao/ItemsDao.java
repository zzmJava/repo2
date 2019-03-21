package com.dao;

import com.domain.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {

    public Items findById(Integer id);

}
