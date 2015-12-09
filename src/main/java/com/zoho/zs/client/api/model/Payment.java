//$Id$
package com.zoho.zs.client.api.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zoho.zs.client.api.exception.ZSAPIException;
import com.zoho.zs.client.api.net.Resource;
import com.zoho.zs.client.api.net.ResourceUtil;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment extends Resource
{

	String customerId;

	BigDecimal amount;

	String date;

	String paymentMode;

	String description;

	String referenceNumber;

	BigDecimal exchangeRate;

	List<Invoice> invoices;

	@JsonIgnore
	String refundId;

	@JsonIgnore
	String refundMode;

	@JsonIgnore
	String status;

	@JsonIgnore
	String customerName;

	@JsonIgnore
	String email;

	@JsonIgnore
	Integer pricePrecision;

	@JsonIgnore
	String currencyCode;

	@JsonIgnore
	String currencySymbol;

	@JsonIgnore
	Creditnote creditnote;

	@JsonIgnore
	Autotransaction autotransaction;

	@JsonIgnore
	String source;

	@JsonIgnore
	String paymentId;
	@JsonIgnore
	String gatewayTransactionId;
	@JsonIgnore
	String gatewayErrorMessage;
	@JsonIgnore
	String lastFourDigits;

	public static Payment retrieve(String id) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.GET, instancePath(Payment.class, id), Payment.class);
	}

	public static Payment refund(Payment payment, String paymentId) throws ZSAPIException
	{
		return ResourceUtil.process(RequestMethod.POST, instancePath(Payment.class, paymentId) + "/refunds", Payment.class, payment);
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getDate()
	{
		return date;
	}

	public void setPaymentMode(String paymentMode)
	{
		this.paymentMode = paymentMode;
	}

	public String getPaymentMode()
	{
		return paymentMode;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setReferenceNumber(String referenceNumber)
	{
		this.referenceNumber = referenceNumber;
	}

	public String getReferenceNumber()
	{
		return referenceNumber;
	}

	public void setInvoices(List<Invoice> invoices)
	{
		this.invoices = invoices;
	}

	public List<Invoice> getInvoices()
	{
		return invoices;
	}

	public void setAmount(BigDecimal amount)
	{
		this.amount = amount;
	}

	public BigDecimal getAmount()
	{
		return amount;
	}

	@JsonProperty
	public void setRefundId(String refundId)
	{
		this.refundId = refundId;
	}

	@JsonIgnore
	public String getRefundId()
	{
		return refundId;
	}

	@JsonProperty
	public void setCurrencyCode(String currencyCode)
	{
		this.currencyCode = currencyCode;
	}

	@JsonIgnore
	public String getCurrencyCode()
	{
		return currencyCode;
	}

	@JsonProperty
	public void setRefundMode(String refundMode)
	{
		this.refundMode = refundMode;
	}

	@JsonIgnore
	public String getRefundMode()
	{
		return refundMode;
	}

	@JsonProperty
	public void setStatus(String status)
	{
		this.status = status;
	}

	@JsonIgnore
	public String getStatus()
	{
		return status;
	}

	@JsonProperty
	public void setCreditnote(Creditnote creditnote)
	{
		this.creditnote = creditnote;
	}

	@JsonIgnore
	public Creditnote getCreditnote()
	{
		return creditnote;
	}

	@JsonProperty
	public void setAutotransaction(Autotransaction autotransaction)
	{
		this.autotransaction = autotransaction;
	}

	@JsonIgnore
	public Autotransaction getAutotransaction()
	{
		return autotransaction;
	}

	@JsonProperty
	public void setCurrencySymbol(String currencySymbol)
	{
		this.currencySymbol = currencySymbol;
	}

	@JsonIgnore
	public String getCurrencySymbol()
	{
		return currencySymbol;
	}

	@JsonProperty
	public void setEmail(String email)
	{
		this.email = email;
	}

	@JsonIgnore
	public String getEmail()
	{
		return email;
	}

	@JsonProperty
	public void setPricePrecision(Integer pricePrecision)
	{
		this.pricePrecision = pricePrecision;
	}

	@JsonIgnore
	public Integer getPricePrecision()
	{
		return pricePrecision;
	}

	@JsonProperty
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	@JsonIgnore
	public String getCustomerName()
	{
		return customerName;
	}

	@JsonIgnore
	public BigDecimal getExchangeRate()
	{
		return exchangeRate;
	}

	@JsonProperty
	public void setExchangeRate(BigDecimal exchangeRate)
	{
		this.exchangeRate = exchangeRate;
	}

	@JsonProperty
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	@JsonIgnore
	public String getCustomerId()
	{
		return customerId;
	}

	@JsonIgnore
	public String getSource()
	{
		return source;
	}

	@JsonProperty
	public void setSource(String source)
	{
		this.source = source;
	}

	@JsonIgnore
	public String getPaymentId()
	{
		return paymentId;
	}

	@JsonProperty
	public void setPaymentId(String paymentId)
	{
		this.paymentId = paymentId;
	}

	@JsonIgnore
	public String getGatewayTransactionId()
	{
		return gatewayTransactionId;
	}

	@JsonProperty
	public void setGatewayTransactionId(String gatewayTransactionId)
	{
		this.gatewayTransactionId = gatewayTransactionId;
	}

	@JsonIgnore
	public String getGatewayErrorMessage()
	{
		return gatewayErrorMessage;
	}

	@JsonProperty
	public void setGatewayErrorMessage(String gatewayErrorMessage)
	{
		this.gatewayErrorMessage = gatewayErrorMessage;
	}

	@JsonIgnore
	public String getLastFourDigits()
	{
		return lastFourDigits;
	}

	@JsonProperty
	public void setLastFourDigits(String lastFourDigits)
	{
		this.lastFourDigits = lastFourDigits;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Invoice extends Resource
	{
		String invoiceId;
		BigDecimal amountApplied;

		@JsonIgnore
		String invoiceNumber;
		@JsonIgnore
		String date;
		@JsonIgnore
		BigDecimal invoiceAmount;
		@JsonIgnore
		BigDecimal balanceAmount;

		@JsonIgnore
		Integer retryCount;
		@JsonIgnore
		String nextRetryAt;
		@JsonIgnore
		List<String> subscriptionIds;

		public void setInvoiceId(String invoiceId)
		{
			this.invoiceId = invoiceId;
		}

		public String getInvoiceId()
		{
			return invoiceId;
		}

		public void setAmountApplied(BigDecimal amountApplied)
		{
			this.amountApplied = amountApplied;
		}

		public BigDecimal getAmountApplied()
		{
			return amountApplied;
		}

		@JsonIgnore
		public String getInvoiceNumber()
		{
			return invoiceNumber;
		}

		@JsonProperty
		public void setInvoiceNumber(String invoiceNumber)
		{
			this.invoiceNumber = invoiceNumber;
		}

		@JsonIgnore
		public String getDate()
		{
			return date;
		}

		@JsonProperty
		public void setDate(String date)
		{
			this.date = date;
		}

		@JsonIgnore
		public BigDecimal getInvoiceAmount()
		{
			return invoiceAmount;
		}

		@JsonProperty
		public void setInvoiceAmount(BigDecimal invoiceAmount)
		{
			this.invoiceAmount = invoiceAmount;
		}

		@JsonIgnore
		public BigDecimal getBalanceAmount()
		{
			return balanceAmount;
		}

		@JsonProperty
		public void setBalanceAmount(BigDecimal balanceAmount)
		{
			this.balanceAmount = balanceAmount;
		}

		@JsonIgnore
		public Integer getRetryCount()
		{
			return retryCount;
		}

		@JsonProperty
		public void setRetryCount(Integer retryCount)
		{
			this.retryCount = retryCount;
		}

		@JsonIgnore
		public String getNextRetryAt()
		{
			return nextRetryAt;
		}

		@JsonProperty
		public void setNextRetryAt(String nextRetryAt)
		{
			this.nextRetryAt = nextRetryAt;
		}

		@JsonIgnore
		public List<String> getSubscriptionIds()
		{
			return subscriptionIds;
		}

		@JsonProperty
		public void setSubscriptionIds(List<String> subscriptionIds)
		{
			this.subscriptionIds = subscriptionIds;
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Creditnote extends Resource
	{
		@JsonIgnore
		String creditnoteId;

		@JsonIgnore
		String creditnoteNumber;

		@JsonIgnore
		String date;

		@JsonIgnore
		BigDecimal amount;

		@JsonIgnore
		BigDecimal refundAmount;

		@JsonIgnore
		BigDecimal balanceAmount;

		@JsonProperty
		public void setCreditnoteId(String creditnoteId)
		{
			this.creditnoteId = creditnoteId;
		}

		@JsonIgnore
		public String getCreditnoteId()
		{
			return creditnoteId;
		}

		@JsonProperty
		public void setCreditnoteNumber(String creditnoteNumber)
		{
			this.creditnoteNumber = creditnoteNumber;
		}

		@JsonIgnore
		public String getCreditnoteNumber()
		{
			return creditnoteNumber;
		}

		@JsonProperty
		public void setDate(String date)
		{
			this.date = date;
		}

		@JsonIgnore
		public String getDate()
		{
			return date;
		}

		@JsonProperty
		public void setAmount(BigDecimal amount)
		{
			this.amount = amount;
		}

		@JsonIgnore
		public BigDecimal getAmount()
		{
			return amount;
		}

		@JsonProperty
		public void setRefundAmount(BigDecimal refundAmount)
		{
			this.refundAmount = refundAmount;
		}

		@JsonIgnore
		public BigDecimal getRefundAmount()
		{
			return refundAmount;
		}

		@JsonProperty
		public void setBalanceAmount(BigDecimal balanceAmount)
		{
			this.balanceAmount = balanceAmount;
		}

		@JsonIgnore
		public BigDecimal getBalanceAmount()
		{
			return balanceAmount;
		}

	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Autotransaction extends Resource
	{
		@JsonIgnore
		String autotransactionId;

		@JsonIgnore
		String paymenGateway;

		@JsonIgnore
		String gatewayTransactionId;

		@JsonIgnore
		String lastFourDigits;

		@JsonIgnore
		String gatewayErrorMessage;

		@JsonProperty
		public void setAutotransactionId(String autotransactionId)
		{
			this.autotransactionId = autotransactionId;
		}

		@JsonIgnore
		public String getAutotransactionId()
		{
			return autotransactionId;
		}

		@JsonProperty
		public void setGatewayName(String paymenGateway)
		{
			this.paymenGateway = paymenGateway;
		}

		@JsonIgnore
		public String getGatewayName()
		{
			return paymenGateway;
		}

		@JsonProperty
		public void setGatewayTransactionId(String gatewayTransactionId)
		{
			this.gatewayTransactionId = gatewayTransactionId;
		}

		@JsonIgnore
		public String getGatewayTransactionId()
		{
			return gatewayTransactionId;
		}

		@JsonProperty
		public void setLastFourDigits(String lastFourDigits)
		{
			this.lastFourDigits = lastFourDigits;
		}

		@JsonIgnore
		public String getLastFourDigits()
		{
			return lastFourDigits;
		}

		@JsonIgnore
		public String getGatewayErrorMessage()
		{
			return gatewayErrorMessage;
		}

		@JsonIgnore
		public void setGatewayErrorMessage(String gatewayErrorMessage)
		{
			this.gatewayErrorMessage = gatewayErrorMessage;
		}

		@JsonIgnore
		public String getPaymenGateway()
		{
			return paymenGateway;
		}

		@JsonProperty
		public void setPaymenGateway(String paymenGateway)
		{
			this.paymenGateway = paymenGateway;
		}
	}
}