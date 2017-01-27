package com.allforone.paypal.api.generated;

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/pay")
public interface PayResource
{
	@javax.ws.rs.POST
	@javax.ws.rs.Consumes({"application/json"})
	@javax.ws.rs.Produces({"application/json"})
	Response post(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.validation.Valid final PaypalData paypalData);

	@javax.ws.rs.Path("/paymentId/{paymentId}/payerId/{payerId}/client/{clientId}")
	@javax.ws.rs.GET
	Response getPaymentIdByPaymentIdPayerIdByPayerIdClientByClientId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("paymentId") final java.lang.String paymentId, @javax.ws.rs.PathParam("payerId") final java.lang.String payerId, @javax.ws.rs.PathParam("clientId") final java.lang.String clientId);

}
