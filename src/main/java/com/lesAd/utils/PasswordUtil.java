package com.lesAd.utils;

import java.io.IOException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class PasswordUtil {
	public static String decryptingPassword(String input) throws IOException {

		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes = decoder.decodeBuffer(input);

		return new String(decodedBytes);
	}

	public static String encryptingPassword(String input) {

		BASE64Encoder encoder = new BASE64Encoder();
		String encodedBytes = encoder.encodeBuffer(input.getBytes());
		return encodedBytes;
	}
}
