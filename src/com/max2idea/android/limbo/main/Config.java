/*
Copyright (C) Max Kastanas 2012

 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package com.max2idea.android.limbo.main;

import android.androidVNC.COLORMODEL;
import android.androidVNC.VncCanvasActivity;
import android.os.Environment;
import android.widget.ImageView.ScaleType;

/**
 *
 * @author dev
 */
public class Config {

	// Constants
	public static final int MIN_AIO_THREADS = 1;
	public static final int MAX_AIO_THREADS = 64;
	public static final int UI_VNC = 0;
	public static final int UI_SDL = 1;
	public static final int UI_SPICE = 2;
	public static final int SDL_MOUSE_LEFT = 1;
	public static final int SDL_MOUSE_MIDDLE = 2;
	public static final int SDL_MOUSE_RIGHT = 3;
	public static final int SETTINGS_RETURN_CODE = 1000;
	public static final int SETTINGS_REQUEST_CODE = 1001;
	public static final int FILEMAN_RETURN_CODE = 1002;
	public static final int FILEMAN_REQUEST_CODE = 1003;
	public static final int VNC_REQUEST_CODE = 1004;
	public static final int VNC_RESULT_CODE = 1005;
	public static final int VNC_RESET_RESULT_CODE = 1006;
	public static final int SDL_REQUEST_CODE = 1007;
	public static final int SDL_RESULT_CODE = 1008;
	public static final int SDL_QUIT_RESULT_CODE = 1009;
	public static final int REQUEST_SDCARD_CODE = 1010;
	public static final int STATUS_NULL = -1;
	public static final int STATUS_CREATED = 1000;
	public static final int STATUS_PAUSED = 1001;
	public static final int VM_CREATED = 1002;
	public static final int VM_STARTED = 1003;
	public static final int VM_STOPPED = 1004;
	public static final int VM_NOTRUNNING = 1005;
	public static final int VM_RESTARTED = 1006;
	public static final int VM_PAUSED = 1007;
	public static final int VM_RESUMED = 1008;
	public static final int VM_SAVED = 1009;
	public static final int IMG_CREATED = 1010;
	public static final int VNC_PASSWORD = 1011;
	public static final int SNAPSHOT_CREATED = 1012;
	public static final int UIUTILS_SHOWALERT_HTML = 1013;
	public static final int VM_NO_QCOW2 = 1014;
	public static final int STATUS_CHANGED = 1015;
	public static final int UIUTILS_SHOWALERT_LICENSE = 1016;
	public static final int VM_NO_KERNEL = 1017;
	public static final int VM_NO_INITRD = 1018;
	public static final int VM_EXPORT = 1019;
	public static final int VM_IMPORT = 1020;
	public static final int UI_RESET = 1021;
	public static final int VM_ARM_NOMACHINE = 1022;
	public static final String ACTION_START = "com.max2idea.android.limbo.action.STARTVM";

	public static enum DebugMode {
		X86, X86_64, ARM
	};

	// GUI Options
	public static final boolean enable_SDL_menu = true; //Option for GUI
	public static final boolean enable_SDL_libs = true; //Enable always if you build QEMU with SDL Support
	public static final boolean enable_SPICE_menu = false;
	public static final boolean enable_SPICE = false;
	public static final boolean enable_sound_menu = true; //Option for GUI
	public static final boolean enable_sound_libs = true; //Enable always if you build QEMU with Audio Support
	public static final boolean enable_ARM = false; //Enable if you build QEMU with Arm softmmu
	public static final boolean enable_KVM = false; //Enable if you build with KVM support
	
	public static final boolean enable_qemu_fullScreen = true;
	public static boolean enable_trackpad_relative_position = true; //We should also support "-usbdevice tablet" that needs absolute positions
	public static boolean enableSDLAlwaysFullscreen = true;
	
	
	
	// App config
	public static final String APP_NAME = "Limbo PC Emulator (QEMU)";
	public static final String DBFile = Environment.getExternalStorageDirectory() + "/limbo/machines.csv";
	public static final String basefiledir = Environment.getExternalStorageDirectory() + "/limbo/";
	public static String sharedFolder = basefiledir + "shared";
	public static String tmpFolder = basefiledir + "tmp"; // Do not modify
	public static boolean enableExternalSD = true; // set to true for Lollipop+ devices
	public static boolean enableOpenSL; //future enhancement
	
	public static final String machinedir = basefiledir + "machines/";
	public static final boolean enableHDCache = false;
	public static final String defaultDNSServer = "8.8.8.8";
	public static final String defaultUI = "VNC";
	public static String state_filename = "vm.state";
	public static String QMPServer = "localhost"; 
	public static int QMPPort = 4444;
	
	// App Config
	public static final String downloadLink = "http://limboemulator.weebly.com/downloads";
	public static final String downloadUpdateLink = "https://raw.githubusercontent.com/limboemu/limbo/master/VERSION";

	// VNC Defaults
	public static final String defaultVNCHost = "localhost";
	public static final String defaultVNCUsername = "limbo";
	public static final String defaultVNCPasswd = "";
	public static final int defaultVNCPort = 5901;
	public static final String defaultVNCColorMode = COLORMODEL.C24bit.nameString();
	public static final ScaleType defaultFullscreenScaleMode = ScaleType.FIT_CENTER;
	public static final ScaleType defaultScaleModeCenter = ScaleType.CENTER;
	public static final String defaultInputMode = VncCanvasActivity.TOUCH_ZOOM_MODE;
	
	//Keyboard Layout
	public static String defaultKeyboardLayout = "en-us";
	
	//FIXME: disable for now 
	public static final boolean enableKeyboardLayoutOption = true; 
	
	
	// Features
	protected static final boolean enableSaveVMmonitor = true; // we use the
																// Monitor
																// console to
																// save vms

	// Debug
	public static final boolean debug = false;
	public static final DebugMode debugMode = DebugMode.X86_64;
	
	

}
