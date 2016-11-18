package nz.co.zufang.model;

/**
 * Created by Lillian on 2/25/2016.
 */
public class GenericResponse {
    
    /** The code. */
    String code;
    
    /** The message. */
    String message;
    
    /** The token. */
    String token;
    
    /** The uid. */
    String uid;
    
    /**
     * Gets the uid.
     *
     * @return the uid
     */
    public String getUid() {
		return uid;
	}

	/**
	 * Sets the uid.
	 *
	 * @param uid the new uid
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code the code
     * @return the generic response
     */
    public GenericResponse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     *
     * @param message the message
     * @return the generic response
     */
    public GenericResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Gets the token.
     *
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the token.
     *
     * @param token the token
     * @return the generic response
     */
    public GenericResponse setToken(String token) {
        this.token = token;
        return this;
    }

}