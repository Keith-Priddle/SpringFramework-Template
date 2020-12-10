package com.mct.repositories;

/**
 * @author Keith Priddle www.moderncloudtech.com
 * @version 0.1d
 */

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.mct.models.Account;



@Repository
//@RepositoryRestResource
@RepositoryRestResource(collectionResourceRel = "Account", path = "Account")
//@RepositoryRestResource(exported = false)
public interface AccountRepository extends CrudRepository <Account, Long>{

	
}
