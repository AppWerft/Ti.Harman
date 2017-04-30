/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.harman;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;
import org.appcelerator.titanium.TiApplication;

import com.harman.hkwirelessapi.HKWirelessHandler;
import com.harman.hkwirelessapi.HKWirelessListener;

@Kroll.module(name = "Harman", id = "de.appwerft.harman")
public class HarmanModule extends KrollModule {

	// Standard Debugging variables
	private static final String LCAT = "Harman";
	HKWirelessHandler hControlHandler;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final int EXTERNAL_NAME =hControlHandler. ;

	public HarmanModule() {
		super();
		hControlHandler = new HKWirelessHandler();
		HKWirelessHandler hKWirelessHandler = new HKWirelessHandler();

		hKWirelessHandler
				.registerHKWirelessControllerListener(new WirelessListenerHandler());
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {

	}

	// Methods
	@Kroll.method
	public void initializeHKWirelessController(String key) {
		hControlHandler.initializeHKWirelessController(key);
	}

	// Methods
	@Kroll.method
	public void startRefreshDeviceInfo() {
		hControlHandler.startRefreshDeviceInfo();
	}

	public class WirelessListenerHandler implements HKWirelessListener {

		@Override
		public void onDeviceStateUpdated(long deviceId, int reason) {

		}

		@Override
		public void onErrorOccurred(int code, String message) {

		}

		@Override
		public void onPlayEnded() {

		}

		@Override
		public void onPlaybackStateChanged(int state) {

		}

		@Override
		public void onPlaybackTimeChanged(int timeElapsed) {

		}

		@Override
		public void onVolumeLevelChanged(long deviceId, int deviceVolume,
				int avgVolume) {

		}
	}

}
