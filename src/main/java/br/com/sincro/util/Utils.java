package br.com.sincro.util;

import java.net.SocketAddress;

public class Utils {

	public static void log(String message) {
		System.out.println(message);
	}

	public static void log(SocketAddress socketAddress, String message) {
		System.out.println("< " + socketAddress + " > : " + message);
	}

}
