package com.pranav.bros;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "extension", "size" })
public class FileBean {

	@JsonProperty("name")
	private String name;
	@JsonProperty("extension")
	private String extension;
	@JsonProperty("size")
	private Integer size;
	

	public FileBean(String name, String extension, Integer size) {
		super();
		this.name = name;
		this.extension = extension;
		this.size = size;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("extension")
	public String getExtension() {
		return extension;
	}

	@JsonProperty("extension")
	public void setExtension(String extension) {
		this.extension = extension;
	}

	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}


}
