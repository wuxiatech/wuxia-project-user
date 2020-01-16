package cn.wuxia.project.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wuxia.project.user.dao.OrganizationDao;
import cn.wuxia.project.user.entity.Organization;
import cn.wuxia.project.user.service.OrganizationService;
import cn.wuxia.project.common.dao.CommonDao;
import cn.wuxia.project.common.service.impl.CommonServiceImpl;

import java.util.List;

@Service
public class OrganizationServiceImpl extends CommonServiceImpl<Organization, String> implements OrganizationService {

	@Autowired
	private OrganizationDao hospitalDao;

	@Override
	protected CommonDao<Organization, String> getCommonDao() {
		return hospitalDao;
	}

	@Override
	public List<Organization> findAll(String appid) {
		return hospitalDao.findBy("platform", appid);
	}
}
