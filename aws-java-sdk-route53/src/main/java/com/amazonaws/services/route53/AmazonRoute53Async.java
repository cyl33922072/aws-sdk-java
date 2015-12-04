/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.route53.model.*;

/**
 * Interface for accessing AmazonRoute53 asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * 
 */
public interface AmazonRoute53Async extends AmazonRoute53 {
    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * To get information about the traffic policy instance, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit a CreateTrafficPolicyInstance or an
     * UpdateTrafficPolicyInstance request, there's a brief delay while
     * Amazon Route 53 creates the resource record sets that are specified in
     * the traffic policy definition. For more information, see the State
     * response element.
     * </p>
     *
     * @param getTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the GetTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrafficPolicyInstance service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * To get information about the traffic policy instance, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit a CreateTrafficPolicyInstance or an
     * UpdateTrafficPolicyInstance request, there's a brief delay while
     * Amazon Route 53 creates the resource record sets that are specified in
     * the traffic policy definition. For more information, see the State
     * response element.
     * </p>
     *
     * @param getTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the GetTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrafficPolicyInstance service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest,
            AsyncHandler<GetTrafficPolicyInstanceRequest, GetTrafficPolicyInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS
     * resource record sets for one domain name (such as example.com) or one
     * subdomain name (such as www.example.com).
     * </p>
     * <p>
     * To create a traffic policy, send a <code>POST</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource. The request body must
     * include an XML document with a <code>CreateTrafficPolicyRequest</code>
     * element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains
     * information about the new traffic policy.
     * </p>
     *
     * @param createTrafficPolicyRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicy operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrafficPolicy service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS
     * resource record sets for one domain name (such as example.com) or one
     * subdomain name (such as www.example.com).
     * </p>
     * <p>
     * To create a traffic policy, send a <code>POST</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource. The request body must
     * include an XML document with a <code>CreateTrafficPolicyRequest</code>
     * element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains
     * information about the new traffic policy.
     * </p>
     *
     * @param createTrafficPolicyRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicy operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrafficPolicy service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest,
            AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * To update the comment, send a <code>POST</code> request to the
     * <code>/2013-04-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include an XML document with an
     * <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     *
     * @param updateTrafficPolicyCommentRequest Container for the necessary
     *           parameters to execute the UpdateTrafficPolicyComment operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrafficPolicyComment service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * To update the comment, send a <code>POST</code> request to the
     * <code>/2013-04-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include an XML document with an
     * <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     *
     * @param updateTrafficPolicyCommentRequest Container for the necessary
     *           parameters to execute the UpdateTrafficPolicyComment operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrafficPolicyComment service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest,
            AsyncHandler<UpdateTrafficPolicyCommentRequest, UpdateTrafficPolicyCommentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a
     * <code>GET</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource. The delegation set is the four Amazon Route
     * 53 name servers that were assigned to the hosted zone when you created
     * it.
     * </p>
     *
     * @param getHostedZoneRequest Container for the necessary parameters to
     *           execute the GetHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest getHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a
     * <code>GET</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource. The delegation set is the four Amazon Route
     * 53 name servers that were assigned to the hosted zone when you created
     * it.
     * </p>
     *
     * @param getHostedZoneRequest Container for the necessary parameters to
     *           execute the GetHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest getHostedZoneRequest,
            AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request
     * have not replicated to all Amazon Route 53 DNS servers. This is the
     * initial status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to
     * all Amazon Route 53 DNS servers.
     * </p>
     *
     * @param getChangeRequest Container for the necessary parameters to
     *           execute the GetChange operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetChange service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetChangeResult> getChangeAsync(GetChangeRequest getChangeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request
     * have not replicated to all Amazon Route 53 DNS servers. This is the
     * initial status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to
     * all Amazon Route 53 DNS servers.
     * </p>
     *
     * @param getChangeRequest Container for the necessary parameters to
     *           execute the GetChange operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetChange service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetChangeResult> getChangeAsync(GetChangeRequest getChangeRequest,
            AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DNS type of the resource record sets that you're
     * updating must match the DNS type in the JSON document that is
     * associated with the traffic policy version that you're using to update
     * the traffic policy instance.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues
     * to respond to DNS queries for the root resource record set name (such
     * as example.com) while it replaces one group of resource record sets
     * with another. Amazon Route 53 performs the following operations:
     * </p>
     * <ol> <li>Amazon Route 53 creates a new group of resource record sets
     * based on the specified traffic policy. This is true regardless of how
     * substantial the differences are between the existing resource record
     * sets and the new resource record sets. </li>
     * <li>When all of the new resource record sets have been created,
     * Amazon Route 53 starts to respond to DNS queries for the root resource
     * record set name (such as example.com) by using the new resource record
     * sets.</li>
     * <li>Amazon Route 53 deletes the old group of resource record sets
     * that are associated with the root resource record set name.</li>
     * </ol> <p>
     * To update a traffic policy instance, send a <code>POST</code> request
     * to the <code>/2013-04-01/trafficpolicyinstance/traffic policy ID
     * </code> resource. The request body must include an XML document with
     * an <code>UpdateTrafficPolicyInstanceRequest</code> element.
     * </p>
     *
     * @param updateTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the UpdateTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrafficPolicyInstance service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DNS type of the resource record sets that you're
     * updating must match the DNS type in the JSON document that is
     * associated with the traffic policy version that you're using to update
     * the traffic policy instance.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues
     * to respond to DNS queries for the root resource record set name (such
     * as example.com) while it replaces one group of resource record sets
     * with another. Amazon Route 53 performs the following operations:
     * </p>
     * <ol> <li>Amazon Route 53 creates a new group of resource record sets
     * based on the specified traffic policy. This is true regardless of how
     * substantial the differences are between the existing resource record
     * sets and the new resource record sets. </li>
     * <li>When all of the new resource record sets have been created,
     * Amazon Route 53 starts to respond to DNS queries for the root resource
     * record set name (such as example.com) by using the new resource record
     * sets.</li>
     * <li>Amazon Route 53 deletes the old group of resource record sets
     * that are associated with the root resource record set name.</li>
     * </ol> <p>
     * To update a traffic policy instance, send a <code>POST</code> request
     * to the <code>/2013-04-01/trafficpolicyinstance/traffic policy ID
     * </code> resource. The request body must include an XML document with
     * an <code>UpdateTrafficPolicyInstanceRequest</code> element.
     * </p>
     *
     * @param updateTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the UpdateTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateTrafficPolicyInstance service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest,
            AsyncHandler<UpdateTrafficPolicyInstanceRequest, UpdateTrafficPolicyInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to
     * the <code>2013-04-01/geolocation</code> resource with one of these
     * options: continentcode | countrycode | countrycode and
     * subdivisioncode.
     * </p>
     *
     * @param getGeoLocationRequest Container for the necessary parameters to
     *           execute the GetGeoLocation operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetGeoLocation service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetGeoLocationResult> getGeoLocationAsync(GetGeoLocationRequest getGeoLocationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to
     * the <code>2013-04-01/geolocation</code> resource with one of these
     * options: continentcode | countrycode | countrycode and
     * subdivisioncode.
     * </p>
     *
     * @param getGeoLocationRequest Container for the necessary parameters to
     *           execute the GetGeoLocation operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetGeoLocation service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetGeoLocationResult> getGeoLocationAsync(GetGeoLocationRequest getGeoLocationRequest,
            AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request
     * to the <code>2013-04-01/hostedzone/hosted zone ID </code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to
     * this request includes the modified <code>HostedZone</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> The comment can have a maximum length of 256 characters.
     * </p>
     *
     * @param updateHostedZoneCommentRequest Container for the necessary
     *           parameters to execute the UpdateHostedZoneComment operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHostedZoneComment service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request
     * to the <code>2013-04-01/hostedzone/hosted zone ID </code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to
     * this request includes the modified <code>HostedZone</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> The comment can have a maximum length of 256 characters.
     * </p>
     *
     * @param updateHostedZoneCommentRequest Container for the necessary
     *           parameters to execute the UpdateHostedZoneComment operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHostedZoneComment service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest,
            AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy. <code>ListTrafficPolicyVersions</code> lists only versions
     * that have not been deleted.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> maxitems traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy versions associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy version that is associated with the
     * specified traffic policy.
     * </p>
     * <li> <b>TrafficPolicyVersionMarker</b> </li>
     * <p>
     * The ID of the next traffic policy version that is associated with the
     * current AWS account. If you want to list more traffic policies, make
     * another call to <code>ListTrafficPolicyVersions</code> , and specify
     * the value of the <code>TrafficPolicyVersionMarker</code> element in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , Amazon Route 53
     * omits the <code>TrafficPolicyVersionMarker</code> element from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyVersionsRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicyVersions operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyVersions service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy. <code>ListTrafficPolicyVersions</code> lists only versions
     * that have not been deleted.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> maxitems traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy versions associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy version that is associated with the
     * specified traffic policy.
     * </p>
     * <li> <b>TrafficPolicyVersionMarker</b> </li>
     * <p>
     * The ID of the next traffic policy version that is associated with the
     * current AWS account. If you want to list more traffic policies, make
     * another call to <code>ListTrafficPolicyVersions</code> , and specify
     * the value of the <code>TrafficPolicyVersionMarker</code> element in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , Amazon Route 53
     * omits the <code>TrafficPolicyVersionMarker</code> element from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyVersionsRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicyVersions operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyVersions service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest,
            AsyncHandler<ListTrafficPolicyVersionsRequest, ListTrafficPolicyVersionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the <code>2013-04-01/healthcheck/health
     * check ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a health check only if there are no
     * resource record sets associated with this health check. If resource
     * record sets are associated with this health check, you must
     * disassociate them before you can delete your health check. If you try
     * to delete a health check that is associated with resource record sets,
     * Amazon Route 53 will deny your request with a HealthCheckInUse error.
     * For information about disassociating the records from your health
     * check, see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHealthCheckRequest Container for the necessary parameters
     *           to execute the DeleteHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest deleteHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the <code>2013-04-01/healthcheck/health
     * check ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a health check only if there are no
     * resource record sets associated with this health check. If resource
     * record sets are associated with this health check, you must
     * disassociate them before you can delete your health check. If you try
     * to delete a health check that is associated with resource record sets,
     * Amazon Route 53 will deny your request with a HealthCheckInUse error.
     * For information about disassociating the records from your health
     * check, see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHealthCheckRequest Container for the necessary parameters
     *           to execute the DeleteHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest deleteHealthCheckRequest,
            AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listTagsForResourcesRequest Container for the necessary
     *           parameters to execute the ListTagsForResources operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResources service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listTagsForResourcesRequest Container for the necessary
     *           parameters to execute the ListTagsForResources operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResources service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest,
            AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * 
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results
     * at the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name. </li>
     * <li>If both Name and Type are specified, this means start the results
     * at the first RRSET in the list whose name is greater than or equal to
     * Name and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * 
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any
     * processes making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page
     * of record sets. For subsequent calls, set Name and Type to the
     * NextName and NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there
     * is no consistency of results across calls to ListResourceRecordSets.
     * The only way to get a consistent multi-page snapshot of all RRSETs in
     * a zone is to stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent
     * within a page. If MakeChange calls are taking place concurrently, the
     * result of each one will either be completely visible in your results
     * or not at all. You will not see partial changes, or changes that do
     * not ultimately succeed. (This follows from the fact that MakeChange is
     * atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a
     * call to ChangeResourceRecordSets and receives a successful response,
     * the effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     *
     * @param listResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ListResourceRecordSets operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest listResourceRecordSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * 
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results
     * at the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name. </li>
     * <li>If both Name and Type are specified, this means start the results
     * at the first RRSET in the list whose name is greater than or equal to
     * Name and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * 
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any
     * processes making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page
     * of record sets. For subsequent calls, set Name and Type to the
     * NextName and NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there
     * is no consistency of results across calls to ListResourceRecordSets.
     * The only way to get a consistent multi-page snapshot of all RRSETs in
     * a zone is to stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent
     * within a page. If MakeChange calls are taking place concurrently, the
     * result of each one will either be completely visible in your results
     * or not at all. You will not see partial changes, or changes that do
     * not ultimately succeed. (This follows from the fact that MakeChange is
     * atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a
     * call to ChangeResourceRecordSets and receives a successful response,
     * the effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     *
     * @param listResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ListResourceRecordSets operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest listResourceRecordSetsRequest,
            AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <p>
     * To delete a traffic policy instance, send a <code>DELETE</code>
     * request to the <code>2013-04-01/trafficpolicy/traffic policy instance
     * ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>When you delete a traffic policy instance, Amazon
     * Route 53 also deletes all of the resource record sets that were
     * created when you created the traffic policy instance.
     * </p>
     *
     * @param deleteTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the DeleteTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrafficPolicyInstance service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <p>
     * To delete a traffic policy instance, send a <code>DELETE</code>
     * request to the <code>2013-04-01/trafficpolicy/traffic policy instance
     * ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>When you delete a traffic policy instance, Amazon
     * Route 53 also deletes all of the resource record sets that were
     * created when you created the traffic policy instance.
     * </p>
     *
     * @param deleteTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the DeleteTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrafficPolicyInstance service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest,
            AsyncHandler<DeleteTrafficPolicyInstanceRequest, DeleteTrafficPolicyInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * in a specified hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that you
     * created in a specified hosted zone, send a <code>GET</code> request to
     * the <code>2013-04-01/trafficpolicyinstance</code> resource and include
     * the ID of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code></code> IsTruncated in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>TrafficPolicyInstanceNameMarker</b> and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these two values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByHostedZone</code> , and specify
     * these values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesByHostedZoneRequest Container for the
     *           necessary parameters to execute the
     *           ListTrafficPolicyInstancesByHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyInstancesByHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * in a specified hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that you
     * created in a specified hosted zone, send a <code>GET</code> request to
     * the <code>2013-04-01/trafficpolicyinstance</code> resource and include
     * the ID of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code></code> IsTruncated in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>TrafficPolicyInstanceNameMarker</b> and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these two values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByHostedZone</code> , and specify
     * these values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesByHostedZoneRequest Container for the
     *           necessary parameters to execute the
     *           ListTrafficPolicyInstancesByHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyInstancesByHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest,
            AsyncHandler<ListTrafficPolicyInstancesByHostedZoneRequest, ListTrafficPolicyInstancesByHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2013-04-01/delegationset/delegation set ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a reusable delegation set only if
     * there are no associated hosted zones. If your reusable delegation set
     * contains associated hosted zones, you must delete them before you can
     * delete your reusable delegation set. If you try to delete a reusable
     * delegation set that contains associated hosted zones, Amazon Route 53
     * will deny your request with a DelegationSetInUse error.
     * </p>
     *
     * @param deleteReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the DeleteReusableDelegationSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2013-04-01/delegationset/delegation set ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a reusable delegation set only if
     * there are no associated hosted zones. If your reusable delegation set
     * contains associated hosted zones, you must delete them before you can
     * delete your reusable delegation set. If you try to delete a reusable
     * delegation set that contains associated hosted zones, Amazon Route 53
     * will deny your request with a DelegationSetInUse error.
     * </p>
     *
     * @param deleteReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the DeleteReusableDelegationSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest,
            AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     *
     * @param getChangeDetailsRequest Container for the necessary parameters
     *           to execute the GetChangeDetails operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetChangeDetails service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetChangeDetailsResult> getChangeDetailsAsync(GetChangeDetailsRequest getChangeDetailsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     *
     * @param getChangeDetailsRequest Container for the necessary parameters
     *           to execute the GetChangeDetails operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetChangeDetails service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetChangeDetailsResult> getChangeDetailsAsync(GetChangeDetailsRequest getChangeDetailsRequest,
            AsyncHandler<GetChangeDetailsRequest, GetChangeDetailsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource.
     * </p>
     *
     * @param getHealthCheckRequest Container for the necessary parameters to
     *           execute the GetHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest getHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource.
     * </p>
     *
     * @param getHealthCheckRequest Container for the necessary parameters to
     *           execute the GetHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest getHealthCheckRequest,
            AsyncHandler<GetHealthCheckRequest, GetHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code>
     * request to the <code>2013-04-01/delegationset</code> resource. The
     * request body must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element
     * that contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     *
     * @param createReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the CreateReusableDelegationSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(CreateReusableDelegationSetRequest createReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code>
     * request to the <code>2013-04-01/delegationset</code> resource. The
     * request body must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element
     * that contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     *
     * @param createReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the CreateReusableDelegationSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReusableDelegationSet service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(CreateReusableDelegationSetRequest createReusableDelegationSetRequest,
            AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/checkeripranges</code> resource. You can use these IP
     * addresses to configure router and firewall rules to allow health
     * checkers to check the health of your resources.
     * </p>
     *
     * @param getCheckerIpRangesRequest Container for the necessary
     *           parameters to execute the GetCheckerIpRanges operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetCheckerIpRanges service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest getCheckerIpRangesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/checkeripranges</code> resource. You can use these IP
     * addresses to configure router and firewall rules to allow health
     * checkers to check the health of your resources.
     * </p>
     *
     * @param getCheckerIpRangesRequest Container for the necessary
     *           parameters to execute the GetCheckerIpRanges operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetCheckerIpRanges service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest getCheckerIpRangesRequest,
            AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/disassociatevpc</code> resource. The request body must include an
     * XML document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response returns the
     * <code>DisassociateVPCFromHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param disassociateVPCFromHostedZoneRequest Container for the
     *           necessary parameters to execute the DisassociateVPCFromHostedZone
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateVPCFromHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/disassociatevpc</code> resource. The request body must include an
     * XML document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response returns the
     * <code>DisassociateVPCFromHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param disassociateVPCFromHostedZoneRequest Container for the
     *           necessary parameters to execute the DisassociateVPCFromHostedZone
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateVPCFromHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest,
            AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for
     * a given hosted zone and RRSet.
     * </p>
     *
     * @param listChangeBatchesByRRSetRequest Container for the necessary
     *           parameters to execute the ListChangeBatchesByRRSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListChangeBatchesByRRSet service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListChangeBatchesByRRSetResult> listChangeBatchesByRRSetAsync(ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for
     * a given hosted zone and RRSet.
     * </p>
     *
     * @param listChangeBatchesByRRSetRequest Container for the necessary
     *           parameters to execute the ListChangeBatchesByRRSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListChangeBatchesByRRSet service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListChangeBatchesByRRSetResult> listChangeBatchesByRRSetAsync(ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest,
            AsyncHandler<ListChangeBatchesByRRSetRequest, ListChangeBatchesByRRSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why
     * it failed most recently (if at all), you can get the failure reason
     * for the most recent failure. Send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID/lastfailurereason</code>
     * resource.
     * </p>
     *
     * @param getHealthCheckLastFailureReasonRequest Container for the
     *           necessary parameters to execute the GetHealthCheckLastFailureReason
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckLastFailureReason service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why
     * it failed most recently (if at all), you can get the failure reason
     * for the most recent failure. Send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID/lastfailurereason</code>
     * resource.
     * </p>
     *
     * @param getHealthCheckLastFailureReasonRequest Container for the
     *           necessary parameters to execute the GetHealthCheckLastFailureReason
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckLastFailureReason service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest,
            AsyncHandler<GetHealthCheckLastFailureReasonRequest, GetHealthCheckLastFailureReasonResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code>
     * request to the <code>2013-04-01/healthcheck</code> resource. The
     * response to this request includes a <code>HealthChecks</code> element
     * with zero, one, or multiple <code>HealthCheck</code> child elements.
     * By default, the list of health checks is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the health check that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHealthChecksRequest Container for the necessary parameters
     *           to execute the ListHealthChecks operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListHealthChecks service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHealthChecksResult> listHealthChecksAsync(ListHealthChecksRequest listHealthChecksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code>
     * request to the <code>2013-04-01/healthcheck</code> resource. The
     * response to this request includes a <code>HealthChecks</code> element
     * with zero, one, or multiple <code>HealthCheck</code> child elements.
     * By default, the list of health checks is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the health check that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHealthChecksRequest Container for the necessary parameters
     *           to execute the ListHealthChecks operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHealthChecks service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHealthChecksResult> listHealthChecksAsync(ListHealthChecksRequest listHealthChecksRequest,
            AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a
     * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
     * resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element with zero, one, or
     * multiple <code>GeoLocationDetails</code> child elements. The list is
     * sorted by country code, and then subdivision code, followed by
     * continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination
     * of <code>NextContinentCode, NextCountryCode,
     * NextSubdivisionCode</code> will be populated. You can pass these as
     * parameters to <code>StartContinentCode, StartCountryCode,
     * StartSubdivisionCode</code> to control the geo location that the list
     * begins with.
     * </p>
     *
     * @param listGeoLocationsRequest Container for the necessary parameters
     *           to execute the ListGeoLocations operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListGeoLocations service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest listGeoLocationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a
     * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
     * resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element with zero, one, or
     * multiple <code>GeoLocationDetails</code> child elements. The list is
     * sorted by country code, and then subdivision code, followed by
     * continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination
     * of <code>NextContinentCode, NextCountryCode,
     * NextSubdivisionCode</code> will be populated. You can pass these as
     * parameters to <code>StartContinentCode, StartCountryCode,
     * StartSubdivisionCode</code> to control the geo location that the list
     * begins with.
     * </p>
     *
     * @param listGeoLocationsRequest Container for the necessary parameters
     *           to execute the ListGeoLocations operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListGeoLocations service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest listGeoLocationsRequest,
            AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the
     * <code>CreateHealthCheckResponse</code> element that contains metadata
     * about the health check.
     * </p>
     *
     * @param createHealthCheckRequest Container for the necessary parameters
     *           to execute the CreateHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest createHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the
     * <code>CreateHealthCheckResponse</code> element that contains metadata
     * about the health check.
     * </p>
     *
     * @param createHealthCheckRequest Container for the necessary parameters
     *           to execute the CreateHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest createHealthCheckRequest,
            AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a count of all your health checks, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/healthcheckcount</code> resource.
     * </p>
     *
     * @param getHealthCheckCountRequest Container for the necessary
     *           parameters to execute the GetHealthCheckCount operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckCount service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest getHealthCheckCountRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a count of all your health checks, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/healthcheckcount</code> resource.
     * </p>
     *
     * @param getHealthCheckCountRequest Container for the necessary
     *           parameters to execute the GetHealthCheckCount operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckCount service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest getHealthCheckCountRequest,
            AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param changeTagsForResourceRequest Container for the necessary
     *           parameters to execute the ChangeTagsForResource operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest changeTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param changeTagsForResourceRequest Container for the necessary
     *           parameters to execute the ChangeTagsForResource operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest changeTagsForResourceRequest,
            AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource
     * record sets with a specified domain name (such as example.com) or
     * subdomain name (such as www.example.com). Amazon Route 53 responds to
     * DNS queries for the domain or subdomain name by using the resource
     * record sets that <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * To create a traffic policy instance, send a <code>POST</code> request
     * to the <code>2013-04-01/trafficpolicyinstance</code> resource. The
     * request body must include an XML document with a
     * <code>CreateTrafficPolicyRequest</code> element. The response returns
     * the <code>CreateTrafficPolicyInstanceResponse</code> element, which
     * contains information about the traffic policy instance.
     * </p>
     *
     * @param createTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrafficPolicyInstance service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource
     * record sets with a specified domain name (such as example.com) or
     * subdomain name (such as www.example.com). Amazon Route 53 responds to
     * DNS queries for the domain or subdomain name by using the resource
     * record sets that <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * To create a traffic policy instance, send a <code>POST</code> request
     * to the <code>2013-04-01/trafficpolicyinstance</code> resource. The
     * request body must include an XML document with a
     * <code>CreateTrafficPolicyRequest</code> element. The response returns
     * the <code>CreateTrafficPolicyInstanceResponse</code> element, which
     * contains information about the traffic policy instance.
     * </p>
     *
     * @param createTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicyInstance operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrafficPolicyInstance service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest,
            AsyncHandler<CreateTrafficPolicyInstanceRequest, CreateTrafficPolicyInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that are
     * associated with the current AWS account, send a <code>GET</code>
     * request to the <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these three values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code> , and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicyInstances operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyInstances service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that are
     * associated with the current AWS account, send a <code>GET</code>
     * request to the <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these three values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code> , and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicyInstances operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyInstances service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest,
            AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the latest version for every traffic policy
     * that is associated with the current AWS account. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policies associated with
     * the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy that is associated with the current
     * account.
     * </p>
     * <li> <b>TrafficPolicyIdMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> ,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies. If
     * you want to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code> , and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPoliciesRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicies operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicies service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the latest version for every traffic policy
     * that is associated with the current AWS account. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policies associated with
     * the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy that is associated with the current
     * account.
     * </p>
     * <li> <b>TrafficPolicyIdMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> ,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies. If
     * you want to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code> , and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPoliciesRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicies operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicies service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest,
            AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request
     * to the <code>2013-04-01/healthcheck/health check ID/status</code>
     * resource. You can use this call to get a health check's current
     * status.
     * </p>
     *
     * @param getHealthCheckStatusRequest Container for the necessary
     *           parameters to execute the GetHealthCheckStatus operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckStatus service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest getHealthCheckStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request
     * to the <code>2013-04-01/healthcheck/health check ID/status</code>
     * resource. You can use this call to get a health check's current
     * status.
     * </p>
     *
     * @param getHealthCheckStatusRequest Container for the necessary
     *           parameters to execute the GetHealthCheckStatus operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHealthCheckStatus service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest getHealthCheckStatusRequest,
            AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzone</code> resource. The
     * response to this request includes a <code>HostedZones</code> element
     * with zero, one, or multiple <code>HostedZone</code> child elements. By
     * default, the list of hosted zones is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesRequest Container for the necessary parameters
     *           to execute the ListHostedZones operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListHostedZones service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHostedZonesResult> listHostedZonesAsync(ListHostedZonesRequest listHostedZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzone</code> resource. The
     * response to this request includes a <code>HostedZones</code> element
     * with zero, one, or multiple <code>HostedZone</code> child elements. By
     * default, the list of hosted zones is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesRequest Container for the necessary parameters
     *           to execute the ListHostedZones operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHostedZones service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHostedZonesResult> listHostedZonesAsync(ListHostedZonesRequest listHostedZonesRequest,
            AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzonecount</code> resource.
     * </p>
     *
     * @param getHostedZoneCountRequest Container for the necessary
     *           parameters to execute the GetHostedZoneCount operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostedZoneCount service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest getHostedZoneCountRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzonecount</code> resource.
     * </p>
     *
     * @param getHostedZoneCountRequest Container for the necessary
     *           parameters to execute the GetHostedZoneCount operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetHostedZoneCount service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest getHostedZoneCountRequest,
            AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains
     * metadata about the health check.
     * </p>
     *
     * @param updateHealthCheckRequest Container for the necessary parameters
     *           to execute the UpdateHealthCheck operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest updateHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains
     * metadata about the health check.
     * </p>
     *
     * @param updateHealthCheckRequest Container for the necessary parameters
     *           to execute the UpdateHealthCheck operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateHealthCheck service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest updateHealthCheckRequest,
            AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code>
     * request to the <code>2013-04-01/delegationset/delegation set ID
     * </code> resource.
     * </p>
     *
     * @param getReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the GetReusableDelegationSet operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetReusableDelegationSet service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest getReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code>
     * request to the <code>2013-04-01/delegationset/delegation set ID
     * </code> resource.
     * </p>
     *
     * @param getReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the GetReusableDelegationSet operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetReusableDelegationSet service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest getReusableDelegationSetRequest,
            AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send
     * a <code>GET</code> request to the
     * <code>2013-04-01/hostedzonesbyname</code> resource. The response to
     * this request includes a <code>HostedZones</code> element with zero or
     * more <code>HostedZone</code> child elements lexicographically ordered
     * by DNS name. By default, the list of hosted zones is displayed on a
     * single page. You can control the length of the page that is displayed
     * by using the <code>MaxItems</code> parameter. You can use the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     * control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesByNameRequest Container for the necessary
     *           parameters to execute the ListHostedZonesByName operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListHostedZonesByName service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(ListHostedZonesByNameRequest listHostedZonesByNameRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send
     * a <code>GET</code> request to the
     * <code>2013-04-01/hostedzonesbyname</code> resource. The response to
     * this request includes a <code>HostedZones</code> element with zero or
     * more <code>HostedZone</code> child elements lexicographically ordered
     * by DNS name. By default, the list of hosted zones is displayed on a
     * single page. You can control the length of the page that is displayed
     * by using the <code>MaxItems</code> parameter. You can use the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     * control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesByNameRequest Container for the necessary
     *           parameters to execute the ListHostedZonesByName operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListHostedZonesByName service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(ListHostedZonesByNameRequest listHostedZonesByNameRequest,
            AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a specific traffic policy version. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     *
     * @param getTrafficPolicyRequest Container for the necessary parameters
     *           to execute the GetTrafficPolicy operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrafficPolicy service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a specific traffic policy version. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     *
     * @param getTrafficPolicyRequest Container for the necessary parameters
     *           to execute the GetTrafficPolicy operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrafficPolicy service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest,
            AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     *
     * @param deleteTrafficPolicyRequest Container for the necessary
     *           parameters to execute the DeleteTrafficPolicy operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrafficPolicy service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     *
     * @param deleteTrafficPolicyRequest Container for the necessary
     *           parameters to execute the DeleteTrafficPolicy operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTrafficPolicy service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest,
            AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with
     * the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     *
     * @param getTrafficPolicyInstanceCountRequest Container for the
     *           necessary parameters to execute the GetTrafficPolicyInstanceCount
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrafficPolicyInstanceCount service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with
     * the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     *
     * @param getTrafficPolicyInstanceCountRequest Container for the
     *           necessary parameters to execute the GetTrafficPolicyInstanceCount
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetTrafficPolicyInstanceCount service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest,
            AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"> Deleting a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a hosted zone only if there are no
     * resource record sets other than the default SOA record and NS resource
     * record sets. If your hosted zone contains other resource record sets,
     * you must delete them before you can delete your hosted zone. If you
     * try to delete a hosted zone that contains other resource record sets,
     * Amazon Route 53 will deny your request with a HostedZoneNotEmpty
     * error. For information about deleting records from your hosted zone,
     * see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHostedZoneRequest Container for the necessary parameters
     *           to execute the DeleteHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest deleteHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"> Deleting a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a hosted zone only if there are no
     * resource record sets other than the default SOA record and NS resource
     * record sets. If your hosted zone contains other resource record sets,
     * you must delete them before you can delete your hosted zone. If you
     * try to delete a hosted zone that contains other resource record sets,
     * Amazon Route 53 will deny your request with a HostedZoneNotEmpty
     * error. For information about deleting records from your hosted zone,
     * see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHostedZoneRequest Container for the necessary parameters
     *           to execute the DeleteHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest deleteHostedZoneRequest,
            AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2013-04-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the
     * <code>CreateHostedZoneResponse</code> element that contains metadata
     * about the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four
     * NS records for the zone. The NS records in the hosted zone are the
     * name servers you give your registrar to delegate your domain to. For
     * more information about SOA and NS records, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"> NS and SOA Records that Amazon Route 53 Creates for a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code> .
     * This means that it is not yet available on all DNS servers. The status
     * of the zone changes to <code>INSYNC</code> when the NS and SOA records
     * are available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set,
     * you could specify an optional DelegationSetId, and Route53 would
     * assign those 4 NS records for the zone, instead of alloting a new one.
     * </p>
     *
     * @param createHostedZoneRequest Container for the necessary parameters
     *           to execute the CreateHostedZone operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest createHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2013-04-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the
     * <code>CreateHostedZoneResponse</code> element that contains metadata
     * about the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four
     * NS records for the zone. The NS records in the hosted zone are the
     * name servers you give your registrar to delegate your domain to. For
     * more information about SOA and NS records, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"> NS and SOA Records that Amazon Route 53 Creates for a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code> .
     * This means that it is not yet available on all DNS servers. The status
     * of the zone changes to <code>INSYNC</code> when the NS and SOA records
     * are available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set,
     * you could specify an optional DelegationSetId, and Route53 would
     * assign those 4 NS records for the zone, instead of alloting a new one.
     * </p>
     *
     * @param createHostedZoneRequest Container for the necessary parameters
     *           to execute the CreateHostedZone operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateHostedZone service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest createHostedZoneRequest,
            AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/associatevpc</code> resource. The request body must include an XML
     * document with a <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response returns the
     * <code>AssociateVPCWithHostedZoneResponse</code> element that contains
     * <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param associateVPCWithHostedZoneRequest Container for the necessary
     *           parameters to execute the AssociateVPCWithHostedZone operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateVPCWithHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/associatevpc</code> resource. The request body must include an XML
     * document with a <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response returns the
     * <code>AssociateVPCWithHostedZoneResponse</code> element that contains
     * <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param associateVPCWithHostedZoneRequest Container for the necessary
     *           parameters to execute the AssociateVPCWithHostedZone operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateVPCWithHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest,
            AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTagsForResource service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2013-04-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the
     * length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the delegation set that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listReusableDelegationSetsRequest Container for the necessary
     *           parameters to execute the ListReusableDelegationSets operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListReusableDelegationSets service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest listReusableDelegationSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2013-04-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the
     * length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the delegation set that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listReusableDelegationSetsRequest Container for the necessary
     *           parameters to execute the ListReusableDelegationSets operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListReusableDelegationSets service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest listReusableDelegationSetsRequest,
            AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for
     * a given hosted zone.
     * </p>
     *
     * @param listChangeBatchesByHostedZoneRequest Container for the
     *           necessary parameters to execute the ListChangeBatchesByHostedZone
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListChangeBatchesByHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListChangeBatchesByHostedZoneResult> listChangeBatchesByHostedZoneAsync(ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for
     * a given hosted zone.
     * </p>
     *
     * @param listChangeBatchesByHostedZoneRequest Container for the
     *           necessary parameters to execute the ListChangeBatchesByHostedZone
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListChangeBatchesByHostedZone service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListChangeBatchesByHostedZoneResult> listChangeBatchesByHostedZoneAsync(ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest,
            AsyncHandler<ListChangeBatchesByHostedZoneRequest, ListChangeBatchesByHostedZoneResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this action to create or change your authoritative DNS
     * information. To use this action, send a <code>POST</code> request to
     * the <code>2013-04-01/hostedzone/hosted Zone ID/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional.
     * For more information on transactional changes, also known as change
     * batches, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/APIReference/"> POST ChangeResourceRecordSets </a>
     * in the <i>Amazon Route 53 API Reference</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Due to the nature of transactional changes, you
     * cannot delete the same resource record set more than once in a single
     * change batch. If you attempt to delete the same change batch more than
     * once, Amazon Route 53 returns an InvalidChangeBatch error.
     * </p>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your
     * DNS data is changed on all Amazon Route 53 DNS servers. Initially, the
     * status of a change is <code>PENDING</code> . This means the change has
     * not yet propagated to all the authoritative Amazon Route 53 DNS
     * servers. When the change is propagated to all hosts, the change
     * returns a status of <code>INSYNC</code> .
     * </p>
     * <p>
     * Note the following limitations on a
     * <code>ChangeResourceRecordSets</code> request:
     * </p>
     * 
     * <ul>
     * <li>A request cannot contain more than 100 Change elements.</li>
     * <li> A request cannot contain more than 1000 ResourceRecord
     * elements.</li>
     * <li>The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000
     * characters.</li>
     * 
     * </ul>
     *
     * @param changeResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ChangeResourceRecordSets operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this action to create or change your authoritative DNS
     * information. To use this action, send a <code>POST</code> request to
     * the <code>2013-04-01/hostedzone/hosted Zone ID/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional.
     * For more information on transactional changes, also known as change
     * batches, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/APIReference/"> POST ChangeResourceRecordSets </a>
     * in the <i>Amazon Route 53 API Reference</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Due to the nature of transactional changes, you
     * cannot delete the same resource record set more than once in a single
     * change batch. If you attempt to delete the same change batch more than
     * once, Amazon Route 53 returns an InvalidChangeBatch error.
     * </p>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your
     * DNS data is changed on all Amazon Route 53 DNS servers. Initially, the
     * status of a change is <code>PENDING</code> . This means the change has
     * not yet propagated to all the authoritative Amazon Route 53 DNS
     * servers. When the change is propagated to all hosts, the change
     * returns a status of <code>INSYNC</code> .
     * </p>
     * <p>
     * Note the following limitations on a
     * <code>ChangeResourceRecordSets</code> request:
     * </p>
     * 
     * <ul>
     * <li>A request cannot contain more than 100 Change elements.</li>
     * <li> A request cannot contain more than 1000 ResourceRecord
     * elements.</li>
     * <li>The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000
     * characters.</li>
     * 
     * </ul>
     *
     * @param changeResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ChangeResourceRecordSets operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ChangeResourceRecordSets service method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest,
            AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create
     * a new version of a traffic policy, you specify the ID of the traffic
     * policy that you want to update and a JSON-formatted document that
     * describes the new version.
     * </p>
     * <p>
     * You use traffic policies to create multiple DNS resource record sets
     * for one domain name (such as example.com) or one subdomain name (such
     * as www.example.com).
     * </p>
     * <p>
     * To create a new version, send a <code>POST</code> request to the
     * <code>2013-04-01/trafficpolicy/</code> resource. The request body
     * includes an XML document with a
     * <code>CreateTrafficPolicyVersionRequest</code> element. The response
     * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
     * which contains information about the new version of the traffic
     * policy.
     * </p>
     *
     * @param createTrafficPolicyVersionRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicyVersion operation on
     *           AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrafficPolicyVersion service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create
     * a new version of a traffic policy, you specify the ID of the traffic
     * policy that you want to update and a JSON-formatted document that
     * describes the new version.
     * </p>
     * <p>
     * You use traffic policies to create multiple DNS resource record sets
     * for one domain name (such as example.com) or one subdomain name (such
     * as www.example.com).
     * </p>
     * <p>
     * To create a new version, send a <code>POST</code> request to the
     * <code>2013-04-01/trafficpolicy/</code> resource. The request body
     * includes an XML document with a
     * <code>CreateTrafficPolicyVersionRequest</code> element. The response
     * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
     * which contains information about the new version of the traffic
     * policy.
     * </p>
     *
     * @param createTrafficPolicyVersionRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicyVersion operation on
     *           AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTrafficPolicyVersion service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest,
            AsyncHandler<CreateTrafficPolicyVersionRequest, CreateTrafficPolicyVersionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using a specify traffic policy version.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit a CreateTrafficPolicyInstance or an
     * UpdateTrafficPolicyInstance request, there's a brief delay while
     * Amazon Route 53 creates the resource record sets that are specified in
     * the traffic policy definition. For more information, see the State
     * response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that you
     * created by using a specify traffic policy version, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstance</code> resource and include the
     * ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * specified traffic policy.
     * </p>
     * </li>
     * <li> <b>MaxItems</b> <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * </li>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> <p>
     * If <code>IsTruncated</code> is <code>true</code> , these values in
     * the response represent the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. To list more
     * traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByPolicy</code> , and specify these
     * values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesByPolicyRequest Container for the
     *           necessary parameters to execute the ListTrafficPolicyInstancesByPolicy
     *           operation on AmazonRoute53.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyInstancesByPolicy service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using a specify traffic policy version.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit a CreateTrafficPolicyInstance or an
     * UpdateTrafficPolicyInstance request, there's a brief delay while
     * Amazon Route 53 creates the resource record sets that are specified in
     * the traffic policy definition. For more information, see the State
     * response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that you
     * created by using a specify traffic policy version, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstance</code> resource and include the
     * ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * specified traffic policy.
     * </p>
     * </li>
     * <li> <b>MaxItems</b> <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * </li>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> <p>
     * If <code>IsTruncated</code> is <code>true</code> , these values in
     * the response represent the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. To list more
     * traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByPolicy</code> , and specify these
     * values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesByPolicyRequest Container for the
     *           necessary parameters to execute the ListTrafficPolicyInstancesByPolicy
     *           operation on AmazonRoute53.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListTrafficPolicyInstancesByPolicy service method, as returned by
     *         AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest,
            AsyncHandler<ListTrafficPolicyInstancesByPolicyRequest, ListTrafficPolicyInstancesByPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        