package com.promineo.PARM.exception;

public class ResourceNotFoundException extends RuntimeException{

  private String resourceName;
  private String fieldName;
  
  private Object fieldValue;

  public String getResourceName() {
    return resourceName;
  }

  public String getFieldName() {
    return fieldName;
  }

  public Object getFieldValue() {
    return fieldValue;
  }

  public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
    super(String.format("%s not found with %s : %s", fieldValue));
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }
  
  
  
}
