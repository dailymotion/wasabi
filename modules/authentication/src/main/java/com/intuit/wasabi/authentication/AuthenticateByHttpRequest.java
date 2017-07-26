/*******************************************************************************
 * Copyright 2017 Intuit
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.intuit.wasabi.authentication;

import com.sun.jersey.api.core.HttpRequestContext;
import java.util.Map;

public interface AuthenticateByHttpRequest {

    /**
     * Looks for required headers in the http request and uses that information to authenticate the request.
     * @param httpRequest
     * @return a map of any additional information obtained during the authentication process
     * which might be useful in subsequent code flow.
     */
    Map<String, String> authenticate(HttpRequestContext httpRequest);
}