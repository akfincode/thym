/*******************************************************************************
 * Copyright (c) 2013, 2014 Red Hat, Inc. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * 	Contributors:
 * 		 Red Hat Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.thym.ios.core.simulator;

import org.eclipse.thym.ios.core.IOSCore;
/**
 * Constants used by the iOS Simulator launch configuration type
 * @author Gorkem Ercan
 *
 */
public interface IOSSimulatorLaunchConstants {

	/**
	 * Type id for the IOSSimulator Launch 
	 */
	public static final String ID_LAUNCH_CONFIG_TYPE = "org.eclipse.thym.ios.core.IOSSimulatorLaunchConfigType";
	
	/**
	 * Attribute to pass the device identifier to be launched
	 */
	public static final String ATTR_DEVICE_IDENTIFIER = IOSCore.PLUGIN_ID + ".ATTR_DEVICE_IDENTIFIER";
}
