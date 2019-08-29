/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.metatron.discovery.domain.engine.monitoring;

public class EngineMonitoringTarget {

  String service;
  String host;
  MetricType metric;
  boolean includeCount = false;

  public EngineMonitoringTarget() {
  }

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public MetricType getMetric() {
    return metric;
  }

  public void setMetric(MetricType metric) {
    this.metric = metric;
  }

  public boolean isIncludeCount() { return includeCount; }

  public void setIncludeCount(boolean includeCount) { this.includeCount = includeCount; }

  public enum MetricType {
    MEM_MAX,
    MEM_USED,
    GC_COUNT,
    GC_CPU,
    QUERY_TIME
  }
}
