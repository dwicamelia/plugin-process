package com.risedev.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import com.risedev.processes.AssetTransfer;

public class AssetTransferProcess implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		if(className.equals("com.rise.processes.AssetTransfer"))
			return new AssetTransfer();
		return null;
	}
	

}
