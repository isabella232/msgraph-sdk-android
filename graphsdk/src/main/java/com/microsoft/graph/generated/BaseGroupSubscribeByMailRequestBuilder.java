// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group Subscribe By Mail Request Builder.
 */
public class BaseGroupSubscribeByMailRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this GroupSubscribeByMail
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseGroupSubscribeByMailRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IGroupSubscribeByMailRequest
     *
     * @return The IGroupSubscribeByMailRequest instance
     */
    public IGroupSubscribeByMailRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IGroupSubscribeByMailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IGroupSubscribeByMailRequest instance
     */
    public IGroupSubscribeByMailRequest buildRequest(final java.util.List<Option> requestOptions) {
        GroupSubscribeByMailRequest request = new GroupSubscribeByMailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
