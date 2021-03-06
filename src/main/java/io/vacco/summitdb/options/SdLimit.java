package io.vacco.summitdb.options;

import io.vacco.summitdb.spi.SdOptions;

public class SdLimit implements SdOptions {

  private long limit = -1;

  public SdLimit limit(long limit) {
    this.limit = limit;
    return this;
  }

  @Override public Object[] toArgs() {
    return limit != -1 ? new Object[] {"LIMIT", limit} : null;
  }
}
