package com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.TransactionBSL;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.Model.Transactions.PaymentTransaction;


public class RefundTransactionBSL {
	
	public  static Vector<RefundTransactionBSL> refund = new Vector<>();
	
	public void RefundTransVector(RefundTransactionBSL refundTrans )
	{
		refund.add(refundTrans);
	}
	public Vector<RefundTransactionBSL> printvector()
	{
		return refund;
	}
}