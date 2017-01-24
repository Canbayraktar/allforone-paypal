/**
 * 
 */
package com.allforone.paypal.config;

import java.util.HashMap;

/**
 * @author Can Bayraktar
 *
 */
public class ClientCache {
	
	private static HashMap<String, ClientConfiguration> cacheMap = new HashMap<>();
	
	// PUT method
    public static void put(final String key, final ClientConfiguration value) {
        synchronized (cacheMap) {
            cacheMap.put(key, value);
        }
    }
    
    // GET method
    public static ClientConfiguration get(final String key) {
        synchronized (cacheMap) {
        	return cacheMap.get(key);
        }
    }
}
