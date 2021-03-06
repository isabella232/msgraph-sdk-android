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
 * The class for the Base Workbook Chart Request Builder.
 */
public class BaseWorkbookChartRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartRequestBuilder {

    /**
     * The request builder for the WorkbookChart
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookChartRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookChartRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookChartRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartAxes.
     */
    public IWorkbookChartAxesRequestBuilder getAxes() {
        return new WorkbookChartAxesRequestBuilder(getRequestUrlWithAdditionalSegment("axes"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartDataLabels.
     */
    public IWorkbookChartDataLabelsRequestBuilder getDataLabels() {
        return new WorkbookChartDataLabelsRequestBuilder(getRequestUrlWithAdditionalSegment("dataLabels"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartAreaFormat.
     */
    public IWorkbookChartAreaFormatRequestBuilder getFormat() {
        return new WorkbookChartAreaFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartLegend.
     */
    public IWorkbookChartLegendRequestBuilder getLegend() {
        return new WorkbookChartLegendRequestBuilder(getRequestUrlWithAdditionalSegment("legend"), getClient(), null);
    }
    public IWorkbookChartSeriesCollectionRequestBuilder getSeries() {
        return new WorkbookChartSeriesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("series"), getClient(), null);
    }

    public IWorkbookChartSeriesRequestBuilder getSeries(final String id) {
        return new WorkbookChartSeriesRequestBuilder(getRequestUrlWithAdditionalSegment("series") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartTitle.
     */
    public IWorkbookChartTitleRequestBuilder getTitle() {
        return new WorkbookChartTitleRequestBuilder(getRequestUrlWithAdditionalSegment("title"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet.
     */
    public IWorkbookWorksheetRequestBuilder getWorksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    public IWorkbookChartSetDataRequestBuilder getSetData(final com.google.gson.JsonElement sourceData, final String seriesBy) {
        return new WorkbookChartSetDataRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setData"), getClient(), null, sourceData, seriesBy);
    }

    public IWorkbookChartSetPositionRequestBuilder getSetPosition(final com.google.gson.JsonElement startCell, final com.google.gson.JsonElement endCell) {
        return new WorkbookChartSetPositionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setPosition"), getClient(), null, startCell, endCell);
    }

    public IWorkbookChartImageRequestBuilder getImage() {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null);
    }

    public IWorkbookChartImageRequestBuilder getImage(final Integer width) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, width);
    }

    public IWorkbookChartImageRequestBuilder getImage(final Integer width, final Integer height) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, width, height);
    }

    public IWorkbookChartImageRequestBuilder getImage(final Integer width, final Integer height, final String fittingMode) {
        return new WorkbookChartImageRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.image"), getClient(), null, width, height, fittingMode);
    }
}
