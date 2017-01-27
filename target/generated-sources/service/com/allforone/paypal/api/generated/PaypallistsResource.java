package com.allforone.paypal.api.generated;

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/paypallists")
public interface PaypallistsResource
{
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response get(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware);

	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	Response post(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.validation.Valid final Paypallist paypallist);

	@javax.ws.rs.Path("/{clientId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByClientId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("clientId") final java.lang.String clientId);

	@javax.ws.rs.Path("/{clientId}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByClientId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("clientId") final java.lang.String clientId, @javax.validation.Valid final Paypallist paypallist);

	@javax.ws.rs.Path("/{clientId}")
	@javax.ws.rs.DELETE
	Response deleteByClientId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("clientId") final java.lang.String clientId);

}
