/**
 * 
 */
package com.allforone.paypal.config;

import java.util.HashMap;
import java.util.Map;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

/**
 * @author Can Bayraktar
 *
 */
public class PaypalConfig {
	
	public Map<String, String> paypalSdkConfig(final String mode){
		Map<String, String> sdkConfig = new HashMap<>();
		sdkConfig.put("mode", mode);
		return sdkConfig;
	}
	
	public OAuthTokenCredential authTokenCredential(final String clientId, final String clientSecret, final String mode) {
		return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig(mode));
	}
	
	public APIContext apiContext(final String clientId, final String clientSecret, final String mode) throws PayPalRESTException{
		APIContext apiContext = new APIContext(authTokenCredential(clientId, clientSecret, mode).getAccessToken());
//		APIContext apiContext = new APIContext(clientId, clientSecret, "sandbox");
		apiContext.setConfigurationMap(paypalSdkConfig(mode));
		return apiContext;
	}
}