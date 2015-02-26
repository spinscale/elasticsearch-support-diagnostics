/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.support.diagnostics.indices;

import com.google.api.client.http.HttpRequestFactory;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.elasticsearch.support.diagnostics.http.UnversionedHttpRequestDiagnosticProcess;

/**
 * {@code StatsDiagnosticProcess} performs a request to <code>{baseUrl}/_stats?pretty&human</code> and writes to
 * <code>"stats.json"</code>.
 * <p />
 * As implied by the class extension, this does not currently have any version restrictions.
 */
@Singleton
class StatsDiagnosticProcess extends UnversionedHttpRequestDiagnosticProcess {
    /**
     * Create a new {@link StatsDiagnosticProcess}.
     */
    @Inject
    StatsDiagnosticProcess(HttpRequestFactory httpRequestFactory) {
        super("_stats?all&pretty&human", "stats.json", httpRequestFactory);
    }
}