package com.zoho.zs.client.api.model;

public class Test
{

	public static void main(String args[]) throws Exception
	{
		//		ZSClient.setAuthtoken("df679ffac5b57a6329ccc84f7e4a6f03");
		//		ZSClient.setHost("subscriptions.localzoho.com");
		//		ZSClient.setOrganizationId("11117508");
		//
		//		Product prd = new Product();
		//		prd.setName("test");
		//		prd.setDescription("testing");
		//		Product.create(prd);

		Long id = 1300000000000135l;
		Long id1 = 2767000000000135l;
		id = Double.valueOf(id / Math.pow(10, 12)).longValue();

		System.out.println(id);
	}

}
