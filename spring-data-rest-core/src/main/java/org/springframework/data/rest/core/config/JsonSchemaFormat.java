/*
 * Copyright 2015-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.rest.core.config;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * An enum to represent JSON Schema pre-defined formats.
 *
 * @author Oliver Gierke
 * @since 2.3
 */
public enum JsonSchemaFormat {

	EMAIL, DATE_TIME, HOSTNAME, IPV4, IPV6, URI;

	/*
	 * (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@JsonValue
	public String toString() {
		return name().toLowerCase(Locale.US).replaceAll("_", "-");
	}
}
