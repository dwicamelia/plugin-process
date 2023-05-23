package com.risedev.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import com.risedev.processes.copyasset.CopyAsset;


public class CopyAssetProcess implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		if(className.equals("com.risedev.processes.CopyAsset"))
			return new CopyAsset();
		return null;
	}
	

}
