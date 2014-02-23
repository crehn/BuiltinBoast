package com.github.crehn.builtinboast;

/**
 * Contains some constants whcih may be helpful for writing and especially
 * documenting rest services.
 * 
 * Note that it's normally not a good idea to provide a constants class as
 * grouping based on semantics should be preferred over syntactical groupings.
 * As this library is currently really small, there is no other possibility at
 * the moment.
 */
public class RestConstants {
	
	/**
	 * Media types for json and xml concatenated by a comma. Useful for
	 * specifying typical media types in swagger api annotatioons.
	 */
	public static final String JSON_AND_XML = "application/json,application/xml";
	
	/**
	 * Media types for json, xml and plain text concatenated by a comma. Useful
	 * for specifying typical media types in swagger api annotatioons.
	 */
	public static final String JSON_XML_AND_PLAIN = "application/json,application/xml,text/plain";
	
	/**
	 * Name of a custom header specifying additional information as a result of
	 * a rest call.
	 */
	public static final String ENHANCED_STATUS = "X-CR-Enhanced-Response";
}
