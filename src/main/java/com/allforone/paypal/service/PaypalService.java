/**
 * 
 */
package com.allforone.paypal.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import com.allforone.paypal.api.generated.PaypalData;
import com.allforone.paypal.config.ClientCache;
import com.allforone.paypal.config.ClientConfiguration;
import com.allforone.paypal.config.PaypalConfig;
import com.allforone.paypal.config.PaypalPaymentIntent;
import com.allforone.paypal.config.PaypalPaymentMethod;
import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.PaymentExecution;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
/**
 * @author Can Bayraktar
 *
 */
@ManagedBean
public class PaypalService {
	
	public Payment createPayment(
			Double total, 
			String currency, 
			String description, ClientConfiguration clientConfig) throws PayPalRESTException{
		Amount amount = new Amount();
		amount.setCurrency(currency);
		amount.setTotal(String.format("%.2f", total));

		Transaction transaction = new Transaction();
		transaction.setDescription(description);
		transaction.setAmount(amount);

		List<Transaction> transactions = new ArrayList<>();
		transactions.add(transaction);

		Payer payer = new Payer();
		payer.setPaymentMethod(clientConfig.getMethod().toString());

		Payment payment = new Payment();
		payment.setIntent(clientConfig.getIntent().toString());
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl(clientConfig.getCancelUrl());
		redirectUrls.setReturnUrl(clientConfig.getSuccessUrl());
		payment.setRedirectUrls(redirectUrls);
		
		return payment.create(clientConfig.getApiContext());
	}
	
	public Payment executePayment(final String paymentId, final String payerId, final  APIContext apiContext) throws PayPalRESTException{
		Payment payment = new Payment();
		payment.setId(paymentId);
		PaymentExecution paymentExecute = new PaymentExecution();
		paymentExecute.setPayerId(payerId);
		return payment.execute(apiContext, paymentExecute);
	}
	
	public ClientConfiguration prepareConfiguration(final PaypalData paypalData){
		ClientConfiguration clientConfiguration = ClientCache.get(paypalData.getClientId());
//		if(clientConfiguration == null){
			clientConfiguration = new ClientConfiguration();
			clientConfiguration.setClientId(paypalData.getClientId());
			clientConfiguration.setClientSecrect(paypalData.getClientSecretId());
			
			PaypalConfig ppc = new PaypalConfig();
			APIContext apiContext;
			try {
				apiContext = ppc.apiContext(paypalData.getClientId().trim(), paypalData.getClientSecretId().trim(), paypalData.getMode().trim());
				clientConfiguration.setApiContext(apiContext);
			} catch (PayPalRESTException e) {
				e.printStackTrace();
			}
			
			clientConfiguration.setMode(paypalData.getMode());
			clientConfiguration.setIntent(PaypalPaymentIntent.sale);
			clientConfiguration.setMethod(PaypalPaymentMethod.paypal);
			clientConfiguration.setSuccessUrl(paypalData.getSuccessUrl());
			clientConfiguration.setCancelUrl(paypalData.getCancelUrl());
//			ClientCache.put(paypalData.getClientId(), clientConfiguration);
//		}
		
		return clientConfiguration;
	}
}