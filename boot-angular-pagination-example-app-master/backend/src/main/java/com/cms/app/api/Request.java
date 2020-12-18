package com.cms.app.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
  private final String task;

  @JsonCreator
  public Request(@JsonProperty("task") String task) {
    this.task = task;
  }

  public String getTask() {
    return task;
  }
}
