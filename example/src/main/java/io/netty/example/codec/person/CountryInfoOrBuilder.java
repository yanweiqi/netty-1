package io.netty.example.codec.person;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CountryInfoOrBuilder extends
		// @@protoc_insertion_point(interface_extends:Person.CountryInfo)
		MessageOrBuilder {

	/**
	 * <code>required string name = 1;</code>
	 */
	boolean hasName();

	/**
	 * <code>required string name = 1;</code>
	 */
	java.lang.String getName();

	/**
	 * <code>required string name = 1;</code>
	 */
	ByteString getNameBytes();

	/**
	 * <code>required string code = 2;</code>
	 */
	boolean hasCode();

	/**
	 * <code>required string code = 2;</code>
	 */
	java.lang.String getCode();

	/**
	 * <code>required string code = 2;</code>
	 */
	ByteString getCodeBytes();

	/**
	 * <code>optional int32 number = 3;</code>
	 */
	boolean hasNumber();

	/**
	 * <code>optional int32 number = 3;</code>
	 */
	int getNumber();
}