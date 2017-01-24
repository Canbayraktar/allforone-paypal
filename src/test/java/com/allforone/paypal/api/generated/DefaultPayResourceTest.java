package com.allforone.paypal.api.generated;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultPayResourceTest extends com.allforone.paypal.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /pay,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/pay";

	/* post(entity) /pay */
	@Test
	public void testPostWithPaypalData()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");
		final PaypalData entityBody = new PaypalData();
		
		entityBody.setClientId("AervFOVZ");
		entityBody.setClientSecretId("EP1Qz0Odtd5StKPScQiFq4Wn5PyFiSPal");
		entityBody.setMode("paypal");
		entityBody.setCurrency("USD");
		entityBody.setTotalAmount(125.15);
		entityBody.setSuccessUrl("http://localhost:8080/pay/success");
		entityBody.setCancelUrl("http://localhost:8080/pay/cancel");
		
		final javax.ws.rs.client.Entity<PaypalData> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().post(entity);
		if (response.getStatus() == Status.OK.getStatusCode()) {
			PaypalData data = response.readEntity(PaypalData.class);
			System.out.println(data.getRedirectUrl());
		}
		
		System.out.println(response.getEntity());

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.CREATED.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultPayResource.class);
		return application;
	}
}
