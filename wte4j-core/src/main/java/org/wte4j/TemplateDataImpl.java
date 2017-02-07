package org.wte4j;

import java.util.Date;
import java.util.Map;

public class TemplateDataImpl<E> implements TemplateData {
	private String documentName;
	private String language;
	private User editor;
	private Class<E> inputType;
	private Map<String, String> properties;
	private Map<String, MappingDetail> contentMapping;
	private byte[] content;
	private Date editedAt;
	private Date createdAt;
	private User lockingUser;

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	@Override
	public String getDocumentName() {
		return documentName;
	}

	public void setLanguage(String language) {
		this.language = language;

	}

	@Override
	public String getLanguage() {
		return language;
	}

	public void setEditor(User user) {
		this.editor = user;
	}

	@Override
	public User getEditor() {
		return editor;
	}

	public void setInputType(Class<E> inputType) {
		this.inputType = inputType;

	}

	@Override
	public Class<?> getInputType() {
		return inputType;
	}

	public void setProperties(Map<String, String> modelProperties) {
		this.properties = modelProperties;
	}

	@Override
	public Map<String, String> getProperties() {
		return properties;
	}

	public void setContentMapping(Map<String, MappingDetail> mappingData) {
		this.contentMapping = mappingData;
	}

	@Override
	public Map<String, MappingDetail> getContentMapping() {
		return contentMapping;
	}



	@Override
	public void setContent(byte[] content, User editor) {
		this.content = content;
		this.editor = editor;
	
	}

	@Override
	public byte[] getContent() {
		return content;
	}

	public void setEditedAt(Date date) {
		this.editedAt = date;
	}

	@Override
	public Date getEditedAt() {
		return editedAt;
	}

	public void setCreatedAt(Date date) {
		this.createdAt = date;
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public User getLockingUser() {
		return lockingUser;
	}

	public void setContent(byte[] content2) {
		this.content = content2;
	}

}
