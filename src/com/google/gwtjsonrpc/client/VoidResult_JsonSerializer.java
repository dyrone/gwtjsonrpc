// Copyright 2008 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gwtjsonrpc.client;

public class VoidResult_JsonSerializer extends JsonSerializer<VoidResult> {
  public static final VoidResult_JsonSerializer INSTANCE =
      new VoidResult_JsonSerializer();

  private VoidResult_JsonSerializer() {
  }

  @Override
  public void printJson(final StringBuffer sb, final VoidResult o) {
    sb.append("{}");
  }

  @Override
  public VoidResult fromJson(final Object o) {
    return VoidResult.INSTANCE;
  }
}
