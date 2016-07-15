package io.netty.example.codec.person;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PhoneNumberOrBuilder extends MessageOrBuilder {			

	/**
	 * <code>required string number = 1;</code>
	 */
	boolean hasNumber();

	/**
	 * <code>required string number = 1;</code>
	 */
	java.lang.String getNumber();

	/**
	 * <code>required string number = 1;</code>
	 */
	ByteString getNumberBytes();

	/**
	 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
	 */
	boolean hasType();

	/**
	 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
	 */
	PhoneType getType();
}