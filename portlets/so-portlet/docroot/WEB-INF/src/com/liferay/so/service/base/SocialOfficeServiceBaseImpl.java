/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.so.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.GroupLocalService;
import com.liferay.portal.service.GroupService;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.GroupPersistence;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.so.service.FavoriteSiteLocalService;
import com.liferay.so.service.MemberRequestLocalService;
import com.liferay.so.service.ProjectsEntryLocalService;
import com.liferay.so.service.SocialOfficeService;
import com.liferay.so.service.persistence.FavoriteSiteFinder;
import com.liferay.so.service.persistence.FavoriteSitePersistence;
import com.liferay.so.service.persistence.MemberRequestPersistence;
import com.liferay.so.service.persistence.ProjectsEntryPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the social office remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.so.service.impl.SocialOfficeServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.so.service.impl.SocialOfficeServiceImpl
 * @see com.liferay.so.service.SocialOfficeServiceUtil
 * @generated
 */
public abstract class SocialOfficeServiceBaseImpl extends BaseServiceImpl
	implements SocialOfficeService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.so.service.SocialOfficeServiceUtil} to access the social office remote service.
	 */

	/**
	 * Returns the favorite site local service.
	 *
	 * @return the favorite site local service
	 */
	public FavoriteSiteLocalService getFavoriteSiteLocalService() {
		return favoriteSiteLocalService;
	}

	/**
	 * Sets the favorite site local service.
	 *
	 * @param favoriteSiteLocalService the favorite site local service
	 */
	public void setFavoriteSiteLocalService(
		FavoriteSiteLocalService favoriteSiteLocalService) {
		this.favoriteSiteLocalService = favoriteSiteLocalService;
	}

	/**
	 * Returns the favorite site persistence.
	 *
	 * @return the favorite site persistence
	 */
	public FavoriteSitePersistence getFavoriteSitePersistence() {
		return favoriteSitePersistence;
	}

	/**
	 * Sets the favorite site persistence.
	 *
	 * @param favoriteSitePersistence the favorite site persistence
	 */
	public void setFavoriteSitePersistence(
		FavoriteSitePersistence favoriteSitePersistence) {
		this.favoriteSitePersistence = favoriteSitePersistence;
	}

	/**
	 * Returns the favorite site finder.
	 *
	 * @return the favorite site finder
	 */
	public FavoriteSiteFinder getFavoriteSiteFinder() {
		return favoriteSiteFinder;
	}

	/**
	 * Sets the favorite site finder.
	 *
	 * @param favoriteSiteFinder the favorite site finder
	 */
	public void setFavoriteSiteFinder(FavoriteSiteFinder favoriteSiteFinder) {
		this.favoriteSiteFinder = favoriteSiteFinder;
	}

	/**
	 * Returns the member request local service.
	 *
	 * @return the member request local service
	 */
	public MemberRequestLocalService getMemberRequestLocalService() {
		return memberRequestLocalService;
	}

	/**
	 * Sets the member request local service.
	 *
	 * @param memberRequestLocalService the member request local service
	 */
	public void setMemberRequestLocalService(
		MemberRequestLocalService memberRequestLocalService) {
		this.memberRequestLocalService = memberRequestLocalService;
	}

	/**
	 * Returns the member request persistence.
	 *
	 * @return the member request persistence
	 */
	public MemberRequestPersistence getMemberRequestPersistence() {
		return memberRequestPersistence;
	}

	/**
	 * Sets the member request persistence.
	 *
	 * @param memberRequestPersistence the member request persistence
	 */
	public void setMemberRequestPersistence(
		MemberRequestPersistence memberRequestPersistence) {
		this.memberRequestPersistence = memberRequestPersistence;
	}

	/**
	 * Returns the projects entry local service.
	 *
	 * @return the projects entry local service
	 */
	public ProjectsEntryLocalService getProjectsEntryLocalService() {
		return projectsEntryLocalService;
	}

	/**
	 * Sets the projects entry local service.
	 *
	 * @param projectsEntryLocalService the projects entry local service
	 */
	public void setProjectsEntryLocalService(
		ProjectsEntryLocalService projectsEntryLocalService) {
		this.projectsEntryLocalService = projectsEntryLocalService;
	}

	/**
	 * Returns the projects entry persistence.
	 *
	 * @return the projects entry persistence
	 */
	public ProjectsEntryPersistence getProjectsEntryPersistence() {
		return projectsEntryPersistence;
	}

	/**
	 * Sets the projects entry persistence.
	 *
	 * @param projectsEntryPersistence the projects entry persistence
	 */
	public void setProjectsEntryPersistence(
		ProjectsEntryPersistence projectsEntryPersistence) {
		this.projectsEntryPersistence = projectsEntryPersistence;
	}

	/**
	 * Returns the social office remote service.
	 *
	 * @return the social office remote service
	 */
	public SocialOfficeService getSocialOfficeService() {
		return socialOfficeService;
	}

	/**
	 * Sets the social office remote service.
	 *
	 * @param socialOfficeService the social office remote service
	 */
	public void setSocialOfficeService(SocialOfficeService socialOfficeService) {
		this.socialOfficeService = socialOfficeService;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the group local service.
	 *
	 * @return the group local service
	 */
	public GroupLocalService getGroupLocalService() {
		return groupLocalService;
	}

	/**
	 * Sets the group local service.
	 *
	 * @param groupLocalService the group local service
	 */
	public void setGroupLocalService(GroupLocalService groupLocalService) {
		this.groupLocalService = groupLocalService;
	}

	/**
	 * Returns the group remote service.
	 *
	 * @return the group remote service
	 */
	public GroupService getGroupService() {
		return groupService;
	}

	/**
	 * Sets the group remote service.
	 *
	 * @param groupService the group remote service
	 */
	public void setGroupService(GroupService groupService) {
		this.groupService = groupService;
	}

	/**
	 * Returns the group persistence.
	 *
	 * @return the group persistence
	 */
	public GroupPersistence getGroupPersistence() {
		return groupPersistence;
	}

	/**
	 * Sets the group persistence.
	 *
	 * @param groupPersistence the group persistence
	 */
	public void setGroupPersistence(GroupPersistence groupPersistence) {
		this.groupPersistence = groupPersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = InfrastructureUtil.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = FavoriteSiteLocalService.class)
	protected FavoriteSiteLocalService favoriteSiteLocalService;
	@BeanReference(type = FavoriteSitePersistence.class)
	protected FavoriteSitePersistence favoriteSitePersistence;
	@BeanReference(type = FavoriteSiteFinder.class)
	protected FavoriteSiteFinder favoriteSiteFinder;
	@BeanReference(type = MemberRequestLocalService.class)
	protected MemberRequestLocalService memberRequestLocalService;
	@BeanReference(type = MemberRequestPersistence.class)
	protected MemberRequestPersistence memberRequestPersistence;
	@BeanReference(type = ProjectsEntryLocalService.class)
	protected ProjectsEntryLocalService projectsEntryLocalService;
	@BeanReference(type = ProjectsEntryPersistence.class)
	protected ProjectsEntryPersistence projectsEntryPersistence;
	@BeanReference(type = SocialOfficeService.class)
	protected SocialOfficeService socialOfficeService;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = GroupLocalService.class)
	protected GroupLocalService groupLocalService;
	@BeanReference(type = GroupService.class)
	protected GroupService groupService;
	@BeanReference(type = GroupPersistence.class)
	protected GroupPersistence groupPersistence;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private SocialOfficeServiceClpInvoker _clpInvoker = new SocialOfficeServiceClpInvoker();
}