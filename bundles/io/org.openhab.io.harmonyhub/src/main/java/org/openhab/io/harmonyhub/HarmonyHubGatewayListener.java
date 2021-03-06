/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.harmonyhub;

/**
 * Interface to let others know the the HarmonyHubGatway is configured or not
 * 
 * @author Dan Cunningham
 * @since 1.7.0
 */
public interface HarmonyHubGatewayListener {

    /**
     * Is the HarmonyHubGatway properly configured
     * 
     * @param isConfigured
     */
    public void configured(boolean isConfigured);
}
