package com.allforone.paypal.api.generated;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultPaypallistsResourceTest extends com.allforone.paypal.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /paypallists,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/paypallists";

	/* get() /paypallists */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* post(entity) /paypallists */
	@Test
	public void testPostWithPaypallist()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final Paypallist entityBody =
		new Paypallist();
		final javax.ws.rs.client.Entity<Paypallist> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	/* get() /paypallists/clientId */
	@Test
	public void testGetByClientId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/clientId");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /paypallists/clientId */
	@Test
	public void testPutByClientIdWithPaypallist()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/clientId");
		final Paypallist entityBody =
		new Paypallist();
		final javax.ws.rs.client.Entity<Paypallist> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /paypallists/clientId */
	@Test
	public void testDeleteByClientId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/clientId");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultPaypallistsResource.class);
		return application;
	}
}
