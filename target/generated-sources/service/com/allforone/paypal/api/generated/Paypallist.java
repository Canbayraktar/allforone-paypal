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
public class Paypallist
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="clientId")
	@javax.validation.constraints.NotNull
	private java.lang.String _clientId;

	@com.fasterxml.jackson.annotation.JsonProperty(value="clientSecretId")
	@javax.validation.constraints.NotNull
	private java.lang.String _clientSecretId;

	@com.fasterxml.jackson.annotation.JsonProperty(value="createdAt")
	private java.util.Date _createdAt;

	@com.fasterxml.jackson.annotation.JsonProperty(value="items")
	@javax.validation.Valid
	private java.util.List<com.allforone.paypal.api.generated.PaypalItem> _items;
	
	public java.lang.String getClientId()
	{
		return _clientId;
	}
	
	public java.lang.String getClientSecretId()
	{
		return _clientSecretId;
	}
	
	public java.util.Date getCreatedAt()
	{
		return _createdAt;
	}
	
	public java.util.List<com.allforone.paypal.api.generated.PaypalItem> getItems()
	{
		return _items;
	}

	public void setClientId(final java.lang.String _clientId)
	{
		this._clientId = _clientId;
	}

	public void setClientSecretId(final java.lang.String _clientSecretId)
	{
		this._clientSecretId = _clientSecretId;
	}

	public void setCreatedAt(final java.util.Date _createdAt)
	{
		this._createdAt = _createdAt;
	}

	public void setItems(final java.util.List<com.allforone.paypal.api.generated.PaypalItem> _items)
	{
		this._items = _items;
	}

}
