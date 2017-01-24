
package com.allforone.paypal.api.generated;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import com.allforone.paypal.config.ClientConfiguration;
import com.allforone.paypal.service.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;

/**
 * Resource class containing the custom logic. Please put your logic here!
 */
@Component("apiPayResource")
@Singleton
public class DefaultPayResource implements com.allforone.paypal.api.generated.PayResource {
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	@Inject
	private PaypalService paypalService;

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final PaypalData paypalData) {
		ClientConfiguration config = paypalService.prepareConfiguration(paypalData);
		try {
			Payment payment = paypalService.createPayment(paypalData.getTotalAmount(), paypalData.getCurrency(),
					"Description", config);
			List<Links> links = payment.getLinks();
			for (Links link : links) {
				System.out.println(link);
				if (link.getRel().equals("approval_url")) {
					paypalData.setRedirectUrl(link.getHref());
				}
			}
		} catch (PayPalRESTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok(paypalData, "application/json").status(Status.OK).build();
	}
}