/**
 * 
 */
package com.allforone.paypal.config;

import com.paypal.base.rest.APIContext;

/**
 * @author Can Bayraktar
 *
 */
public class ClientConfiguration {
	private String clientId;
	private String clientSecrect;
	private String mode;
	private String cancelUrl;
	private String successUrl;
	private PaypalPaymentMethod method; 
	private PaypalPaymentIntent intent;
	private APIContext apiContext;
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the clientSecrect
	 */
	public String getClientSecrect() {
		return clientSecrect;
	}
	/**
	 * @param clientSecrect the clientSecrect to set
	 */
	public void setClientSecrect(String clientSecrect) {
		this.clientSecrect = clientSecrect;
	}
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}
	/**
	 * @return the cancelUrl
	 */
	public String getCancelUrl() {
		return cancelUrl;
	}
	/**
	 * @param cancelUrl the cancelUrl to set
	 */
	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}
	/**
	 * @return the successUrl
	 */
	public String getSuccessUrl() {
		return successUrl;
	}
	/**
	 * @param successUrl the successUrl to set
	 */
	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}
	/**
	 * @return the method
	 */
	public PaypalPaymentMethod getMethod() {
		return method;
	}
	/**
	 * @param method the method to set
	 */
	public void setMethod(PaypalPaymentMethod method) {
		this.method = method;
	}
	/**
	 * @return the intent
	 */
	public PaypalPaymentIntent getIntent() {
		return intent;
	}
	/**
	 * @param intent the intent to set
	 */
	public void setIntent(PaypalPaymentIntent intent) {
		this.intent = intent;
	}
	/**
	 * @return the apiContext
	 */
	public APIContext getApiContext() {
		return apiContext;
	}
	/**
	 * @param apiContext the apiContext to set
	 */
	public void setApiContext(APIContext apiContext) {
		this.apiContext = apiContext;
	}
}