
package com.allforone.paypal.api.generated;

import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

/**
* Resource class containing the custom logic. Please put your logic here!
*/
@Component("apiPaypallistsResource")
@Singleton
public class DefaultPaypallistsResource implements com.allforone.paypal.api.generated.PaypallistsResource
{
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	/* GET / */
	@Override
	public Response get(final YaasAwareParameters yaasAware)
	{
		// place some logic here
		return Response.ok()
			.entity(new java.util.ArrayList<Paypallist>()).build();
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Paypallist paypallist)
	{
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath())
			.build();
	}

	/* GET /{clientId} */
	@Override
	public Response getByClientId(final YaasAwareParameters yaasAware, final java.lang.String clientId)
	{
		// place some logic here
		return Response.ok()
			.entity(new Paypallist()).build();
	}

	/* PUT /{clientId} */
	@Override
	public Response putByClientId(final YaasAwareParameters yaasAware, final java.lang.String clientId, final Paypallist paypallist)
	{
		// place some logic here
		return Response.ok()
			.build();
	}

	/* DELETE /{clientId} */
	@Override
	public Response deleteByClientId(final YaasAwareParameters yaasAware, final java.lang.String clientId)
	{
		// place some logic here
		return Response.noContent()
			.build();
	}

}
