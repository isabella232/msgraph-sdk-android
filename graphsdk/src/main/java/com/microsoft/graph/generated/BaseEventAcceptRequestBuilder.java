// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.options.*;

import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Event Accept Request Builder.
 */
public class BaseEventAcceptRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this EventAccept
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseEventAcceptRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> options, final String comment, final Boolean sendResponse) {
        super(requestUrl, client, options);
        mBodyParams.put("comment", comment);
        mBodyParams.put("sendResponse", sendResponse);
    }

    /**
     * Creates the IEventAcceptRequest
     *
     * @return The IEventAcceptRequest instance
     */
    public IEventAcceptRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEventAcceptRequest with specific options instead of the existing options
     *
     * @param options the options for the request
     * @return The IEventAcceptRequest instance
     */
    public IEventAcceptRequest buildRequest(final List<Option> options) {
        EventAcceptRequest request = new EventAcceptRequest(
                getRequestUrl(),
                getClient(),
                options
        );

        if (hasParameter("comment")) {
            request.mBody.comment = getParameter("comment");
        }
        if (hasParameter("sendResponse")) {
            request.mBody.sendResponse = getParameter("sendResponse");
        }

        return request;
    }
}
