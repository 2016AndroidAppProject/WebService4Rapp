package edu.udel.rapp.rapp;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.Max;

public class rappConfiguration extends Configuration {
	@JsonProperty
	@NotEmpty
	private String message;
	
	@JsonProperty
	@Max(10)
	private int messageRepetitions;
	
	@JsonProperty
	private String additionalMessage = "This is optional";
	public String getAdditionalMessage() {
	return additionalMessage;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getMessageRepetitions() {
		return messageRepetitions;
	}
}
