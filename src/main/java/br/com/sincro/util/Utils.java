package br.com.sincro.util;

import java.net.SocketAddress;

public class Utils {

	public static void log(String message) {

		/*
		 * PositionEntity positionEntity = new PositionEntity(); PostionService
		 * postionService = new PostionService();
		 * 
		 * positionEntity.setDate(new Timestamp(System.currentTimeMillis()));
		 * positionEntity.setPosition(message); postionService.save(positionEntity);
		 */
		// System.out.println(message);
	}

	public static void log(SocketAddress socketAddress, String message) {

		System.out.println("< " + socketAddress + " > : " + message);
	}

}
