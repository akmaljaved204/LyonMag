package com.fortsolution.lyonmag.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import android.content.Context;
import android.os.Environment;
import android.util.Base64;

public class Constants {
	public static final String GOOGLE_ADDMOB_INTERSTITIAL_KEY ="ca-app-pub-5292432475881872/2167839333";
	public static final String GOOGLE_ANALYTICS_KEY = "UA-26087717-19";
	public static  String URLFORHOROSCOPE="";
	public static final String BASE_URL="http://mfmradio.fr/api/";	
	public static final String PUBLIC_KEY = "6c3c9bd1e7c70b675135d3d5ff550a39cda2e6be4ea6eb347ed8fdec02a191ed";
	public static final String PRIVATE_KEY = "f5652d12b9102e2e138e664db939bdadfd2efd97cb4d1d645e877648a74bbf27";
	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
	public static final String SDCARD_PATH =Environment.getExternalStorageDirectory().getAbsolutePath()+"/.Generations";
	public static Context APP_CONTEXT=null;
	public static Context ACTIVITY_CONTEXT=null;
	public static String USER_ID="";
	public static String USER_EMAIL="";
	public static final String IMAGE_FOLDER=".Generation";
	public static boolean hasFavourite = false ;
	public static int  position  ;
	public static String artistName="",songName="";
	public static boolean like =false , dislike = false;
	public static String songLiked ="" , songDisliked = "";
	
	/*public static byte[] calculateRFC2104HMACBinary(String data, String key)
	            throws SignatureException, NoSuchAlgorithmException, InvalidKeyException
	    {
	        SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), HMAC_SHA1_ALGORITHM);
	        Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
	        mac.init(signingKey);
	        return mac.doFinal(data.getBytes());
	    }

	    public static String base64Encode(byte bytes[]) {
	       // byte[] encodedBytes = Base64.encodeBase64(bytes);
	        return new String(encodedBytes);
	    }*/
	    
}