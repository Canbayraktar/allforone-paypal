package com.allforone.paypal.api.generated;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Fri Jan 27 13:22:11 MSK 2017")
@XmlRootElement
@JsonAutoDetect(isGetterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE,
		creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE)
public class PaypalData
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="clientId")
	private java.lang.String _clientId;

	@com.fasterxml.jackson.annotation.JsonProperty(value="clientSecretId")
	private java.lang.String _clientSecretId;

	@com.fasterxml.jackson.annotation.JsonProperty(value="mode")
	private java.lang.String _mode;

	@com.fasterxml.jackson.annotation.JsonProperty(value="currency")
	private java.lang.String _currency;

	@com.fasterxml.jackson.annotation.JsonProperty(value="totalAmount")
	private java.lang.Double _totalAmount;

	@com.fasterxml.jackson.annotation.JsonProperty(value="successUrl")
	private java.lang.String _successUrl;

	@com.fasterxml.jackson.annotation.JsonProperty(value="cancelUrl")
	private java.lang.String _cancelUrl;

	@com.fasterxml.jackson.annotation.JsonProperty(value="redirectUrl")
	private java.lang.String _redirectUrl;
	
	public java.lang.String getClientId()
	{
		return _clientId;
	}
	
	public java.lang.String getClientSecretId()
	{
		return _clientSecretId;
	}
	
	public java.lang.String getMode()
	{
		return _mode;
	}
	
	public java.lang.String getCurrency()
	{
		return _currency;
	}
	
	public java.lang.Double getTotalAmount()
	{
		return _totalAmount;
	}
	
	public java.lang.String getSuccessUrl()
	{
		return _successUrl;
	}
	
	public java.lang.String getCancelUrl()
	{
		return _cancelUrl;
	}
	
	public java.lang.String getRedirectUrl()
	{
		return _redirectUrl;
	}

	public void setClientId(final java.lang.String _clientId)
	{
		this._clientId = _clientId;
	}

	public void setClientSecretId(final java.lang.String _clientSecretId)
	{
		this._clientSecretId = _clientSecretId;
	}

	public void setMode(final java.lang.String _mode)
	{
		this._mode = _mode;
	}

	public void setCurrency(final java.lang.String _currency)
	{
		this._currency = _currency;
	}

	public void setTotalAmount(final java.lang.Double _totalAmount)
	{
		this._totalAmount = _totalAmount;
	}

	public void setSuccessUrl(final java.lang.String _successUrl)
	{
		this._successUrl = _successUrl;
	}

	public void setCancelUrl(final java.lang.String _cancelUrl)
	{
		this._cancelUrl = _cancelUrl;
	}

	public void setRedirectUrl(final java.lang.String _redirectUrl)
	{
		this._redirectUrl = _redirectUrl;
	}

}
