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
public class PaypalItem
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="mode")
	private java.lang.String _mode;

	@com.fasterxml.jackson.annotation.JsonProperty(value="successUrl")
	private java.lang.String _successUrl;

	@com.fasterxml.jackson.annotation.JsonProperty(value="cancelUrl")
	private java.lang.String _cancelUrl;
	
	public java.lang.String getMode()
	{
		return _mode;
	}
	
	public java.lang.String getSuccessUrl()
	{
		return _successUrl;
	}
	
	public java.lang.String getCancelUrl()
	{
		return _cancelUrl;
	}

	public void setMode(final java.lang.String _mode)
	{
		this._mode = _mode;
	}

	public void setSuccessUrl(final java.lang.String _successUrl)
	{
		this._successUrl = _successUrl;
	}

	public void setCancelUrl(final java.lang.String _cancelUrl)
	{
		this._cancelUrl = _cancelUrl;
	}

}
