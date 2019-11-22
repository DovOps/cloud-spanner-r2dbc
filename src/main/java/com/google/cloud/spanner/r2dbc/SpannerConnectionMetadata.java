/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner.r2dbc;

import io.r2dbc.spi.ConnectionMetadata;

/**
 * Connection metadata for Cloud Spanner.
 *
 * <p>Effectively the same as {@link SpannerConnectionFactoryMetadata}, as there is no
 * connection-level difference in database behavior.
 */
public class SpannerConnectionMetadata implements ConnectionMetadata {

  @Override
  public String getDatabaseProductName() {
    return SpannerConnectionFactoryMetadata.NAME;
  }

  @Override
  public String getDatabaseVersion() {
    return "n/a";
  }
}