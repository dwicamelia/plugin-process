package com.risedev.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import com.risedev.processes.dispose.DisposeAsset;

public class DisposeAssetProcess implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
		if(className.equals("com.risedev.processes.dispose"))
			return new DisposeAsset();
		return null;
	}

}
