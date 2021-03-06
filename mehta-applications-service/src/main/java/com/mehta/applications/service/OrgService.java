package com.mehta.applications.service;

import java.util.List;

import com.mehta.applications.common.vo.OrgDetailsVo;
import com.mehta.applications.common.vo.OrgVo;
import com.mehta.applications.model.Org;

public interface OrgService {
	
	Integer createOrg (OrgVo orgVo);
	
	boolean updateOrg (Org org);
	
	OrgVo readOrg (Integer id);
	
	boolean deleteOrg (Integer id);
	
	List<OrgVo> listOrg();
	
	List<OrgVo> listOrgByCountry(String country);

	OrgDetailsVo readOrgDetails(Integer id); 
	
	Integer createCompositeOrg (OrgVo orgVo);
}
