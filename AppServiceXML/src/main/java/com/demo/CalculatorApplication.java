package com.demo;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.demo.CalculatorStub.Add;
import com.demo.CalculatorStub.AddResponse;
import com.demo.CalculatorStub.Divide;
import com.demo.CalculatorStub.DivideResponse;
import com.demo.CalculatorStub.Multiply;
import com.demo.CalculatorStub.MultiplyResponse;
import com.demo.CalculatorStub.Subtract;
import com.demo.CalculatorStub.SubtractResponse;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CalculatorStub stub = new CalculatorStub();
			
			Add add = new Add();
			add.setIntA(2);
			add.setIntB(1);
			AddResponse resAdd = stub.add(add);
			System.out.println("Add Result : "+resAdd.getAddResult());
			
			Divide divide = new Divide();
			divide.setIntA(2);
			divide.setIntB(2);
			DivideResponse resDivide = stub.divide(divide);
			System.out.println("Divide Result : "+resDivide.getDivideResult());
			
			Multiply mtp = new Multiply();
			mtp.setIntA(2);
			mtp.setIntB(2);
			MultiplyResponse resMtp = stub.multiply(mtp);
			System.out.println("Multiply Result : "+resMtp.getMultiplyResult());
			
			Subtract sub = new Subtract();
			sub.setIntA(2);
			sub.setIntB(1);
			SubtractResponse resSub = stub.subtract(sub);
			System.out.println("Subtract Result : "+resSub.getSubtractResult());

			} catch (AxisFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
