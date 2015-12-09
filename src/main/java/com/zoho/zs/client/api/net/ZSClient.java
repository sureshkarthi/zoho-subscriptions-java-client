//$Id$

package com.zoho.zs.client.api.net;

import com.zoho.zs.client.api.exception.APIConnectionException;

public class ZSClient
{

	public static final String CHARSET = "UTF-8"; //No I18N

	public static final String DEFAULT_ACCEPT_HEADER = "application/json"; //No I18N

	public static String host = "subscriptions.zoho.com"; //No I18N

	public static String version = "v1"; //No I18N

	public static String authtoken;

	public static String organizationId;

	public static String userAgentName = "ZohoSubscriptions-Java-Client"; //No I18N

	private static String getDefaults(String propName, String defValue)
	{
		String value = System.getProperty(propName);
		return (value == null || value.trim().isEmpty()) ? defValue : value.trim();
	}

	public static void setHost(String host)
	{
		ZSClient.host = host;
	}

	public static void setVersion(String version)
	{
		ZSClient.version = version;
	}

	public static void setAuthtoken(String authtoken) throws Exception
	{
		if (authtoken == null || authtoken.trim().isEmpty())
		{
			throw new Exception("AuthToken to speak with Zoho Subscriptions is not set. Please set the authtoken in System property");//No I18n
		}
		ZSClient.authtoken = authtoken;
	}

	public static void setOrganizationId(String organizationId)
	{
		ZSClient.organizationId = organizationId;
	}

	public static void setUserAgentName(String userAgentName)
	{
		ZSClient.userAgentName = userAgentName;
	}

	protected static String getHost()
	{
		return host;
	}

	protected static String getVersion()
	{
		return version;
	}

	protected static String getBaseUrl()
	{
		return "https://" + getHost() + "/api/" + getVersion(); //No I18N
	}

	protected static String getAuthtoken() throws Exception
	{
		if (authtoken == null || authtoken.trim().isEmpty())
		{
			throw new APIConnectionException("AuthToken to speak with Zoho Subscriptions is not set. Please set the authtoken in System property");//No I18n
		}
		return authtoken;
	}

	protected static String getOrganizationId()
	{
		return organizationId;
	}

	protected static String getUserAgentName()
	{
		return userAgentName;
	}

}
