/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.alexaforbusiness;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.services.alexaforbusiness.AmazonAlexaForBusinessClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.services.alexaforbusiness.model.transform.*;

/**
 * Client for accessing Alexa For Business. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Alexa for Business helps you use Alexa in your organization. Alexa for Business provides the tools you to manage
 * Alexa devices, enroll your users, and assign skills, at scale. You can build your own context-aware voice skills
 * using the Alexa Skills Kit and the Alexa for Business API operations. You can also make these available as private
 * skills for your organization. Alexa for Business makes it efficient to voice-enable your products and services, thus
 * providing context-aware voice experiences for your customers. In addition, Alexa for Business enables Alexa Voice
 * Services (AVS) device manufacturers to centrally deploy and manage their devices in Alexa for Business as shared
 * devices as a part of their existing management flow.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonAlexaForBusinessClient extends AmazonWebServiceClient implements AmazonAlexaForBusiness {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonAlexaForBusiness.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "a4b";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConcurrentModificationException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.ConcurrentModificationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.LimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NameInUseException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.NameInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AlreadyExistsException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.AlreadyExistsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.ResourceInUseException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.UnauthorizedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidUserStatusException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidUserStatusException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidCertificateAuthorityException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidCertificateAuthorityException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDeviceException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.InvalidDeviceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DeviceNotRegisteredException").withModeledClass(
                                    com.amazonaws.services.alexaforbusiness.model.DeviceNotRegisteredException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.alexaforbusiness.model.AmazonAlexaForBusinessException.class));

    public static AmazonAlexaForBusinessClientBuilder builder() {
        return AmazonAlexaForBusinessClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Alexa For Business using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAlexaForBusinessClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Alexa For Business using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonAlexaForBusinessClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("a4b.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/alexaforbusiness/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/alexaforbusiness/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user
     * implicitly accepts access to this skill during enablement.
     * </p>
     * 
     * @param approveSkillRequest
     * @return Result of the ApproveSkill operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.ApproveSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ApproveSkill" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ApproveSkillResult approveSkill(ApproveSkillRequest request) {
        request = beforeClientExecution(request);
        return executeApproveSkill(request);
    }

    @SdkInternalApi
    final ApproveSkillResult executeApproveSkill(ApproveSkillRequest approveSkillRequest) {

        ExecutionContext executionContext = createExecutionContext(approveSkillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ApproveSkillRequest> request = null;
        Response<ApproveSkillResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ApproveSkillRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(approveSkillRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ApproveSkill");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ApproveSkillResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ApproveSkillResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a contact with a given address book.
     * </p>
     * 
     * @param associateContactWithAddressBookRequest
     * @return Result of the AssociateContactWithAddressBook operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.AssociateContactWithAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateContactWithAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateContactWithAddressBookResult associateContactWithAddressBook(AssociateContactWithAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateContactWithAddressBook(request);
    }

    @SdkInternalApi
    final AssociateContactWithAddressBookResult executeAssociateContactWithAddressBook(
            AssociateContactWithAddressBookRequest associateContactWithAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(associateContactWithAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateContactWithAddressBookRequest> request = null;
        Response<AssociateContactWithAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateContactWithAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateContactWithAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateContactWithAddressBook");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<AssociateContactWithAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateContactWithAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all
     * the skills in any skill groups added to that room. This operation requires the device to be online, or else a
     * manual sync is required.
     * </p>
     * 
     * @param associateDeviceWithRoomRequest
     * @return Result of the AssociateDeviceWithRoom operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.AssociateDeviceWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateDeviceWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDeviceWithRoomResult associateDeviceWithRoom(AssociateDeviceWithRoomRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDeviceWithRoom(request);
    }

    @SdkInternalApi
    final AssociateDeviceWithRoomResult executeAssociateDeviceWithRoom(AssociateDeviceWithRoomRequest associateDeviceWithRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDeviceWithRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDeviceWithRoomRequest> request = null;
        Response<AssociateDeviceWithRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDeviceWithRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateDeviceWithRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDeviceWithRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDeviceWithRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateDeviceWithRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices
     * in the room.
     * </p>
     * 
     * @param associateSkillGroupWithRoomRequest
     * @return Result of the AssociateSkillGroupWithRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.AssociateSkillGroupWithRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillGroupWithRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSkillGroupWithRoomResult associateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSkillGroupWithRoom(request);
    }

    @SdkInternalApi
    final AssociateSkillGroupWithRoomResult executeAssociateSkillGroupWithRoom(AssociateSkillGroupWithRoomRequest associateSkillGroupWithRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSkillGroupWithRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillGroupWithRoomRequest> request = null;
        Response<AssociateSkillGroupWithRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillGroupWithRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateSkillGroupWithRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSkillGroupWithRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSkillGroupWithRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSkillGroupWithRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a skill with a skill group.
     * </p>
     * 
     * @param associateSkillWithSkillGroupRequest
     * @return Result of the AssociateSkillWithSkillGroup operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.AssociateSkillWithSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/AssociateSkillWithSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateSkillWithSkillGroupResult associateSkillWithSkillGroup(AssociateSkillWithSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateSkillWithSkillGroup(request);
    }

    @SdkInternalApi
    final AssociateSkillWithSkillGroupResult executeAssociateSkillWithSkillGroup(AssociateSkillWithSkillGroupRequest associateSkillWithSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(associateSkillWithSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateSkillWithSkillGroupRequest> request = null;
        Response<AssociateSkillWithSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateSkillWithSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateSkillWithSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateSkillWithSkillGroup");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<AssociateSkillWithSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateSkillWithSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an address book with the specified details.
     * </p>
     * 
     * @param createAddressBookRequest
     * @return Result of the CreateAddressBook operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateAddressBookResult createAddressBook(CreateAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAddressBook(request);
    }

    @SdkInternalApi
    final CreateAddressBookResult executeCreateAddressBook(CreateAddressBookRequest createAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(createAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAddressBookRequest> request = null;
        Response<CreateAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAddressBook");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds a new conference provider under the user's AWS account.
     * </p>
     * 
     * @param createConferenceProviderRequest
     * @return Result of the CreateConferenceProvider operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @sample AmazonAlexaForBusiness.CreateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateConferenceProviderResult createConferenceProvider(CreateConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeCreateConferenceProvider(request);
    }

    @SdkInternalApi
    final CreateConferenceProviderResult executeCreateConferenceProvider(CreateConferenceProviderRequest createConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(createConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConferenceProviderRequest> request = null;
        Response<CreateConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateConferenceProvider");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateConferenceProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a contact with the specified details.
     * </p>
     * 
     * @param createContactRequest
     * @return Result of the CreateContact operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateContactResult createContact(CreateContactRequest request) {
        request = beforeClientExecution(request);
        return executeCreateContact(request);
    }

    @SdkInternalApi
    final CreateContactResult executeCreateContact(CreateContactRequest createContactRequest) {

        ExecutionContext executionContext = createExecutionContext(createContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateContactRequest> request = null;
        Response<CreateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateContact");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new room profile with the specified details.
     * </p>
     * 
     * @param createProfileRequest
     * @return Result of the CreateProfile operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.CreateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateProfileResult createProfile(CreateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProfile(request);
    }

    @SdkInternalApi
    final CreateProfileResult executeCreateProfile(CreateProfileRequest createProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(createProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProfileRequest> request = null;
        Response<CreateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProfile");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a room with the specified details.
     * </p>
     * 
     * @param createRoomRequest
     * @return Result of the CreateRoom operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @sample AmazonAlexaForBusiness.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateRoomResult createRoom(CreateRoomRequest request) {
        request = beforeClientExecution(request);
        return executeCreateRoom(request);
    }

    @SdkInternalApi
    final CreateRoomResult executeCreateRoom(CreateRoomRequest createRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(createRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRoomRequest> request = null;
        Response<CreateRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a skill group with a specified name and description.
     * </p>
     * 
     * @param createSkillGroupRequest
     * @return Result of the CreateSkillGroup operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource being created already exists.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.CreateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSkillGroupResult createSkillGroup(CreateSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSkillGroup(request);
    }

    @SdkInternalApi
    final CreateSkillGroupResult executeCreateSkillGroup(CreateSkillGroupRequest createSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSkillGroupRequest> request = null;
        Response<CreateSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSkillGroup");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a user.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceInUseException
     *         The resource in the request is already in use.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateUser" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        request = beforeClientExecution(request);
        return executeCreateUser(request);
    }

    @SdkInternalApi
    final CreateUserResult executeCreateUser(CreateUserRequest createUserRequest) {

        ExecutionContext executionContext = createExecutionContext(createUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateUserRequest> request = null;
        Response<CreateUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateUser");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<CreateUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an address book by the address book ARN.
     * </p>
     * 
     * @param deleteAddressBookRequest
     * @return Result of the DeleteAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteAddressBookResult deleteAddressBook(DeleteAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteAddressBook(request);
    }

    @SdkInternalApi
    final DeleteAddressBookResult executeDeleteAddressBook(DeleteAddressBookRequest deleteAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAddressBookRequest> request = null;
        Response<DeleteAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteAddressBook");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a conference provider.
     * </p>
     * 
     * @param deleteConferenceProviderRequest
     * @return Result of the DeleteConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DeleteConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteConferenceProviderResult deleteConferenceProvider(DeleteConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteConferenceProvider(request);
    }

    @SdkInternalApi
    final DeleteConferenceProviderResult executeDeleteConferenceProvider(DeleteConferenceProviderRequest deleteConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConferenceProviderRequest> request = null;
        Response<DeleteConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteConferenceProvider");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteConferenceProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a contact by the contact ARN.
     * </p>
     * 
     * @param deleteContactRequest
     * @return Result of the DeleteContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteContactResult deleteContact(DeleteContactRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteContact(request);
    }

    @SdkInternalApi
    final DeleteContactResult executeDeleteContact(DeleteContactRequest deleteContactRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteContactRequest> request = null;
        Response<DeleteContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteContact");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a device from Alexa For Business.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws InvalidCertificateAuthorityException
     *         The Certificate Authority can't issue or revoke a certificate.
     * @sample AmazonAlexaForBusiness.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDeviceResult deleteDevice(DeleteDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDevice(request);
    }

    @SdkInternalApi
    final DeleteDeviceResult executeDeleteDevice(DeleteDeviceRequest deleteDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDeviceRequest> request = null;
        Response<DeleteDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDevice");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a room profile by the profile ARN.
     * </p>
     * 
     * @param deleteProfileRequest
     * @return Result of the DeleteProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteProfileResult deleteProfile(DeleteProfileRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProfile(request);
    }

    @SdkInternalApi
    final DeleteProfileResult executeDeleteProfile(DeleteProfileRequest deleteProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProfileRequest> request = null;
        Response<DeleteProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProfile");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a room by the room ARN.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return Result of the DeleteRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteRoomResult deleteRoom(DeleteRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoom(request);
    }

    @SdkInternalApi
    final DeleteRoomResult executeDeleteRoom(DeleteRoomRequest deleteRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomRequest> request = null;
        Response<DeleteRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     * </p>
     * 
     * @param deleteRoomSkillParameterRequest
     * @return Result of the DeleteRoomSkillParameter operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteRoomSkillParameterResult deleteRoomSkillParameter(DeleteRoomSkillParameterRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteRoomSkillParameter(request);
    }

    @SdkInternalApi
    final DeleteRoomSkillParameterResult executeDeleteRoomSkillParameter(DeleteRoomSkillParameterRequest deleteRoomSkillParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRoomSkillParameterRequest> request = null;
        Response<DeleteRoomSkillParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRoomSkillParameterRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteRoomSkillParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteRoomSkillParameter");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteRoomSkillParameterResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteRoomSkillParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Unlinks a third-party account from a skill.
     * </p>
     * 
     * @param deleteSkillAuthorizationRequest
     * @return Result of the DeleteSkillAuthorization operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSkillAuthorizationResult deleteSkillAuthorization(DeleteSkillAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSkillAuthorization(request);
    }

    @SdkInternalApi
    final DeleteSkillAuthorizationResult executeDeleteSkillAuthorization(DeleteSkillAuthorizationRequest deleteSkillAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSkillAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSkillAuthorizationRequest> request = null;
        Response<DeleteSkillAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSkillAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteSkillAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSkillAuthorization");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSkillAuthorizationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteSkillAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a skill group by skill group ARN.
     * </p>
     * 
     * @param deleteSkillGroupRequest
     * @return Result of the DeleteSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteSkillGroupResult deleteSkillGroup(DeleteSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSkillGroup(request);
    }

    @SdkInternalApi
    final DeleteSkillGroupResult executeDeleteSkillGroup(DeleteSkillGroupRequest deleteSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSkillGroupRequest> request = null;
        Response<DeleteSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSkillGroup");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specified user by user ARN and enrollment ARN.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DeleteUser" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteUserResult deleteUser(DeleteUserRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteUser(request);
    }

    @SdkInternalApi
    final DeleteUserResult executeDeleteUser(DeleteUserRequest deleteUserRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteUserRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteUserRequest> request = null;
        Response<DeleteUserResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteUserRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteUserRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteUser");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DeleteUserResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteUserResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a contact from a given address book.
     * </p>
     * 
     * @param disassociateContactFromAddressBookRequest
     * @return Result of the DisassociateContactFromAddressBook operation returned by the service.
     * @sample AmazonAlexaForBusiness.DisassociateContactFromAddressBook
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateContactFromAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateContactFromAddressBookResult disassociateContactFromAddressBook(DisassociateContactFromAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateContactFromAddressBook(request);
    }

    @SdkInternalApi
    final DisassociateContactFromAddressBookResult executeDisassociateContactFromAddressBook(
            DisassociateContactFromAddressBookRequest disassociateContactFromAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateContactFromAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateContactFromAddressBookRequest> request = null;
        Response<DisassociateContactFromAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateContactFromAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateContactFromAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateContactFromAddressBook");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateContactFromAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateContactFromAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is
     * still registered to the account. The device settings and skills are removed from the room.
     * </p>
     * 
     * @param disassociateDeviceFromRoomRequest
     * @return Result of the DisassociateDeviceFromRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.DisassociateDeviceFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateDeviceFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDeviceFromRoomResult disassociateDeviceFromRoom(DisassociateDeviceFromRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDeviceFromRoom(request);
    }

    @SdkInternalApi
    final DisassociateDeviceFromRoomResult executeDisassociateDeviceFromRoom(DisassociateDeviceFromRoomRequest disassociateDeviceFromRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDeviceFromRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDeviceFromRoomRequest> request = null;
        Response<DisassociateDeviceFromRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDeviceFromRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDeviceFromRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDeviceFromRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDeviceFromRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDeviceFromRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a skill from a skill group.
     * </p>
     * 
     * @param disassociateSkillFromSkillGroupRequest
     * @return Result of the DisassociateSkillFromSkillGroup operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.DisassociateSkillFromSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillFromSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSkillFromSkillGroupResult disassociateSkillFromSkillGroup(DisassociateSkillFromSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSkillFromSkillGroup(request);
    }

    @SdkInternalApi
    final DisassociateSkillFromSkillGroupResult executeDisassociateSkillFromSkillGroup(
            DisassociateSkillFromSkillGroupRequest disassociateSkillFromSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSkillFromSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillFromSkillGroupRequest> request = null;
        Response<DisassociateSkillFromSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillFromSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSkillFromSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSkillFromSkillGroup");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSkillFromSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSkillFromSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in
     * the room.
     * </p>
     * 
     * @param disassociateSkillGroupFromRoomRequest
     * @return Result of the DisassociateSkillGroupFromRoom operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.DisassociateSkillGroupFromRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/DisassociateSkillGroupFromRoom"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateSkillGroupFromRoomResult disassociateSkillGroupFromRoom(DisassociateSkillGroupFromRoomRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateSkillGroupFromRoom(request);
    }

    @SdkInternalApi
    final DisassociateSkillGroupFromRoomResult executeDisassociateSkillGroupFromRoom(DisassociateSkillGroupFromRoomRequest disassociateSkillGroupFromRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateSkillGroupFromRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateSkillGroupFromRoomRequest> request = null;
        Response<DisassociateSkillGroupFromRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateSkillGroupFromRoomRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateSkillGroupFromRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateSkillGroupFromRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateSkillGroupFromRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateSkillGroupFromRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Forgets smart home appliances associated to a room.
     * </p>
     * 
     * @param forgetSmartHomeAppliancesRequest
     * @return Result of the ForgetSmartHomeAppliances operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ForgetSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ForgetSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ForgetSmartHomeAppliancesResult forgetSmartHomeAppliances(ForgetSmartHomeAppliancesRequest request) {
        request = beforeClientExecution(request);
        return executeForgetSmartHomeAppliances(request);
    }

    @SdkInternalApi
    final ForgetSmartHomeAppliancesResult executeForgetSmartHomeAppliances(ForgetSmartHomeAppliancesRequest forgetSmartHomeAppliancesRequest) {

        ExecutionContext executionContext = createExecutionContext(forgetSmartHomeAppliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ForgetSmartHomeAppliancesRequest> request = null;
        Response<ForgetSmartHomeAppliancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ForgetSmartHomeAppliancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(forgetSmartHomeAppliancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ForgetSmartHomeAppliances");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ForgetSmartHomeAppliancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ForgetSmartHomeAppliancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets address the book details by the address book ARN.
     * </p>
     * 
     * @param getAddressBookRequest
     * @return Result of the GetAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetAddressBookResult getAddressBook(GetAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeGetAddressBook(request);
    }

    @SdkInternalApi
    final GetAddressBookResult executeGetAddressBook(GetAddressBookRequest getAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(getAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAddressBookRequest> request = null;
        Response<GetAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAddressBook");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the existing conference preferences.
     * </p>
     * 
     * @param getConferencePreferenceRequest
     * @return Result of the GetConferencePreference operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConferencePreferenceResult getConferencePreference(GetConferencePreferenceRequest request) {
        request = beforeClientExecution(request);
        return executeGetConferencePreference(request);
    }

    @SdkInternalApi
    final GetConferencePreferenceResult executeGetConferencePreference(GetConferencePreferenceRequest getConferencePreferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(getConferencePreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConferencePreferenceRequest> request = null;
        Response<GetConferencePreferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConferencePreferenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getConferencePreferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConferencePreference");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetConferencePreferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetConferencePreferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets details about a specific conference provider.
     * </p>
     * 
     * @param getConferenceProviderRequest
     * @return Result of the GetConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetConferenceProviderResult getConferenceProvider(GetConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeGetConferenceProvider(request);
    }

    @SdkInternalApi
    final GetConferenceProviderResult executeGetConferenceProvider(GetConferenceProviderRequest getConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(getConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetConferenceProviderRequest> request = null;
        Response<GetConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetConferenceProvider");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetConferenceProviderResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the contact details by the contact ARN.
     * </p>
     * 
     * @param getContactRequest
     * @return Result of the GetContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetContactResult getContact(GetContactRequest request) {
        request = beforeClientExecution(request);
        return executeGetContact(request);
    }

    @SdkInternalApi
    final GetContactResult executeGetContact(GetContactRequest getContactRequest) {

        ExecutionContext executionContext = createExecutionContext(getContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetContactRequest> request = null;
        Response<GetContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetContact");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetContactResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a device by device ARN.
     * </p>
     * 
     * @param getDeviceRequest
     * @return Result of the GetDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetDevice" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDeviceResult getDevice(GetDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeGetDevice(request);
    }

    @SdkInternalApi
    final GetDeviceResult executeGetDevice(GetDeviceRequest getDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(getDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDeviceRequest> request = null;
        Response<GetDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetDevice");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetDeviceResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the details of a room profile by profile ARN.
     * </p>
     * 
     * @param getProfileRequest
     * @return Result of the GetProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetProfileResult getProfile(GetProfileRequest request) {
        request = beforeClientExecution(request);
        return executeGetProfile(request);
    }

    @SdkInternalApi
    final GetProfileResult executeGetProfile(GetProfileRequest getProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(getProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetProfileRequest> request = null;
        Response<GetProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetProfile");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetProfileResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets room details by room ARN.
     * </p>
     * 
     * @param getRoomRequest
     * @return Result of the GetRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRoomResult getRoom(GetRoomRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoom(request);
    }

    @SdkInternalApi
    final GetRoomResult executeGetRoom(GetRoomRequest getRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomRequest> request = null;
        Response<GetRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     * </p>
     * 
     * @param getRoomSkillParameterRequest
     * @return Result of the GetRoomSkillParameter operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetRoomSkillParameterResult getRoomSkillParameter(GetRoomSkillParameterRequest request) {
        request = beforeClientExecution(request);
        return executeGetRoomSkillParameter(request);
    }

    @SdkInternalApi
    final GetRoomSkillParameterResult executeGetRoomSkillParameter(GetRoomSkillParameterRequest getRoomSkillParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(getRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRoomSkillParameterRequest> request = null;
        Response<GetRoomSkillParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRoomSkillParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRoomSkillParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetRoomSkillParameter");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetRoomSkillParameterResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetRoomSkillParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets skill group details by skill group ARN.
     * </p>
     * 
     * @param getSkillGroupRequest
     * @return Result of the GetSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.GetSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSkillGroupResult getSkillGroup(GetSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeGetSkillGroup(request);
    }

    @SdkInternalApi
    final GetSkillGroupResult executeGetSkillGroup(GetSkillGroupRequest getSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(getSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSkillGroupRequest> request = null;
        Response<GetSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSkillGroup");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<GetSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists conference providers under a specific AWS account.
     * </p>
     * 
     * @param listConferenceProvidersRequest
     * @return Result of the ListConferenceProviders operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListConferenceProviders
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListConferenceProviders"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListConferenceProvidersResult listConferenceProviders(ListConferenceProvidersRequest request) {
        request = beforeClientExecution(request);
        return executeListConferenceProviders(request);
    }

    @SdkInternalApi
    final ListConferenceProvidersResult executeListConferenceProviders(ListConferenceProvidersRequest listConferenceProvidersRequest) {

        ExecutionContext executionContext = createExecutionContext(listConferenceProvidersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListConferenceProvidersRequest> request = null;
        Response<ListConferenceProvidersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListConferenceProvidersRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listConferenceProvidersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListConferenceProviders");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListConferenceProvidersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListConferenceProvidersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the device event history, including device connection status, for up to 30 days.
     * </p>
     * 
     * @param listDeviceEventsRequest
     * @return Result of the ListDeviceEvents operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListDeviceEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListDeviceEvents"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDeviceEventsResult listDeviceEvents(ListDeviceEventsRequest request) {
        request = beforeClientExecution(request);
        return executeListDeviceEvents(request);
    }

    @SdkInternalApi
    final ListDeviceEventsResult executeListDeviceEvents(ListDeviceEventsRequest listDeviceEventsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDeviceEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDeviceEventsRequest> request = null;
        Response<ListDeviceEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDeviceEventsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDeviceEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDeviceEvents");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListDeviceEventsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDeviceEventsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all enabled skills in a specific skill group.
     * </p>
     * 
     * @param listSkillsRequest
     * @return Result of the ListSkills operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkills
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkills" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListSkillsResult listSkills(ListSkillsRequest request) {
        request = beforeClientExecution(request);
        return executeListSkills(request);
    }

    @SdkInternalApi
    final ListSkillsResult executeListSkills(ListSkillsRequest listSkillsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSkillsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsRequest> request = null;
        Response<ListSkillsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSkillsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSkills");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListSkillsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSkillsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all categories in the Alexa skill store.
     * </p>
     * 
     * @param listSkillsStoreCategoriesRequest
     * @return Result of the ListSkillsStoreCategories operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkillsStoreCategories
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreCategories"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSkillsStoreCategoriesResult listSkillsStoreCategories(ListSkillsStoreCategoriesRequest request) {
        request = beforeClientExecution(request);
        return executeListSkillsStoreCategories(request);
    }

    @SdkInternalApi
    final ListSkillsStoreCategoriesResult executeListSkillsStoreCategories(ListSkillsStoreCategoriesRequest listSkillsStoreCategoriesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSkillsStoreCategoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsStoreCategoriesRequest> request = null;
        Response<ListSkillsStoreCategoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsStoreCategoriesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSkillsStoreCategoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSkillsStoreCategories");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListSkillsStoreCategoriesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSkillsStoreCategoriesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all skills in the Alexa skill store by category.
     * </p>
     * 
     * @param listSkillsStoreSkillsByCategoryRequest
     * @return Result of the ListSkillsStoreSkillsByCategory operation returned by the service.
     * @sample AmazonAlexaForBusiness.ListSkillsStoreSkillsByCategory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSkillsStoreSkillsByCategory"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSkillsStoreSkillsByCategoryResult listSkillsStoreSkillsByCategory(ListSkillsStoreSkillsByCategoryRequest request) {
        request = beforeClientExecution(request);
        return executeListSkillsStoreSkillsByCategory(request);
    }

    @SdkInternalApi
    final ListSkillsStoreSkillsByCategoryResult executeListSkillsStoreSkillsByCategory(
            ListSkillsStoreSkillsByCategoryRequest listSkillsStoreSkillsByCategoryRequest) {

        ExecutionContext executionContext = createExecutionContext(listSkillsStoreSkillsByCategoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSkillsStoreSkillsByCategoryRequest> request = null;
        Response<ListSkillsStoreSkillsByCategoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSkillsStoreSkillsByCategoryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSkillsStoreSkillsByCategoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSkillsStoreSkillsByCategory");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListSkillsStoreSkillsByCategoryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSkillsStoreSkillsByCategoryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all of the smart home appliances associated with a room.
     * </p>
     * 
     * @param listSmartHomeAppliancesRequest
     * @return Result of the ListSmartHomeAppliances operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListSmartHomeAppliances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListSmartHomeAppliances"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSmartHomeAppliancesResult listSmartHomeAppliances(ListSmartHomeAppliancesRequest request) {
        request = beforeClientExecution(request);
        return executeListSmartHomeAppliances(request);
    }

    @SdkInternalApi
    final ListSmartHomeAppliancesResult executeListSmartHomeAppliances(ListSmartHomeAppliancesRequest listSmartHomeAppliancesRequest) {

        ExecutionContext executionContext = createExecutionContext(listSmartHomeAppliancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSmartHomeAppliancesRequest> request = null;
        Response<ListSmartHomeAppliancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSmartHomeAppliancesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listSmartHomeAppliancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSmartHomeAppliances");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListSmartHomeAppliancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListSmartHomeAppliancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags for the specified resource.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest request) {
        request = beforeClientExecution(request);
        return executeListTags(request);
    }

    @SdkInternalApi
    final ListTagsResult executeListTags(ListTagsRequest listTagsRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTags");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the conference preferences on a specific conference provider at the account level.
     * </p>
     * 
     * @param putConferencePreferenceRequest
     * @return Result of the PutConferencePreference operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.PutConferencePreference
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutConferencePreference"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutConferencePreferenceResult putConferencePreference(PutConferencePreferenceRequest request) {
        request = beforeClientExecution(request);
        return executePutConferencePreference(request);
    }

    @SdkInternalApi
    final PutConferencePreferenceResult executePutConferencePreference(PutConferencePreferenceRequest putConferencePreferenceRequest) {

        ExecutionContext executionContext = createExecutionContext(putConferencePreferenceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutConferencePreferenceRequest> request = null;
        Response<PutConferencePreferenceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutConferencePreferenceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(putConferencePreferenceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutConferencePreference");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<PutConferencePreferenceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new PutConferencePreferenceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill
     * parameter.
     * </p>
     * 
     * @param putRoomSkillParameterRequest
     * @return Result of the PutRoomSkillParameter operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.PutRoomSkillParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutRoomSkillParameter"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutRoomSkillParameterResult putRoomSkillParameter(PutRoomSkillParameterRequest request) {
        request = beforeClientExecution(request);
        return executePutRoomSkillParameter(request);
    }

    @SdkInternalApi
    final PutRoomSkillParameterResult executePutRoomSkillParameter(PutRoomSkillParameterRequest putRoomSkillParameterRequest) {

        ExecutionContext executionContext = createExecutionContext(putRoomSkillParameterRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutRoomSkillParameterRequest> request = null;
        Response<PutRoomSkillParameterResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutRoomSkillParameterRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putRoomSkillParameterRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutRoomSkillParameter");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<PutRoomSkillParameterResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutRoomSkillParameterResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role,
     * the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the
     * IAM role.
     * </p>
     * 
     * @param putSkillAuthorizationRequest
     * @return Result of the PutSkillAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The caller has no permissions to operate on the resource involved in the API call.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.PutSkillAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/PutSkillAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutSkillAuthorizationResult putSkillAuthorization(PutSkillAuthorizationRequest request) {
        request = beforeClientExecution(request);
        return executePutSkillAuthorization(request);
    }

    @SdkInternalApi
    final PutSkillAuthorizationResult executePutSkillAuthorization(PutSkillAuthorizationRequest putSkillAuthorizationRequest) {

        ExecutionContext executionContext = createExecutionContext(putSkillAuthorizationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutSkillAuthorizationRequest> request = null;
        Response<PutSkillAuthorizationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutSkillAuthorizationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putSkillAuthorizationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutSkillAuthorization");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<PutSkillAuthorizationResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutSkillAuthorizationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service
     * (AVS).
     * </p>
     * 
     * @param registerAVSDeviceRequest
     * @return Result of the RegisterAVSDevice operation returned by the service.
     * @throws LimitExceededException
     *         You are performing an action that would put you beyond your account's limits.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws InvalidDeviceException
     *         The device is in an invalid state.
     * @sample AmazonAlexaForBusiness.RegisterAVSDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RegisterAVSDevice"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RegisterAVSDeviceResult registerAVSDevice(RegisterAVSDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeRegisterAVSDevice(request);
    }

    @SdkInternalApi
    final RegisterAVSDeviceResult executeRegisterAVSDevice(RegisterAVSDeviceRequest registerAVSDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(registerAVSDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterAVSDeviceRequest> request = null;
        Response<RegisterAVSDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterAVSDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(registerAVSDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RegisterAVSDevice");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<RegisterAVSDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RegisterAVSDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves
     * to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the
     * ApproveSkill API.
     * </p>
     * 
     * @param rejectSkillRequest
     * @return Result of the RejectSkill operation returned by the service.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.RejectSkill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RejectSkill" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RejectSkillResult rejectSkill(RejectSkillRequest request) {
        request = beforeClientExecution(request);
        return executeRejectSkill(request);
    }

    @SdkInternalApi
    final RejectSkillResult executeRejectSkill(RejectSkillRequest rejectSkillRequest) {

        ExecutionContext executionContext = createExecutionContext(rejectSkillRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RejectSkillRequest> request = null;
        Response<RejectSkillResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RejectSkillRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rejectSkillRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RejectSkill");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<RejectSkillResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RejectSkillResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill
     * developers.
     * </p>
     * 
     * @param resolveRoomRequest
     * @return Result of the ResolveRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.ResolveRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ResolveRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ResolveRoomResult resolveRoom(ResolveRoomRequest request) {
        request = beforeClientExecution(request);
        return executeResolveRoom(request);
    }

    @SdkInternalApi
    final ResolveRoomResult executeResolveRoom(ResolveRoomRequest resolveRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(resolveRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResolveRoomRequest> request = null;
        Response<ResolveRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResolveRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resolveRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResolveRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<ResolveRoomResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResolveRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Revokes an invitation and invalidates the enrollment URL.
     * </p>
     * 
     * @param revokeInvitationRequest
     * @return Result of the RevokeInvitation operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.RevokeInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/RevokeInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public RevokeInvitationResult revokeInvitation(RevokeInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeRevokeInvitation(request);
    }

    @SdkInternalApi
    final RevokeInvitationResult executeRevokeInvitation(RevokeInvitationRequest revokeInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(revokeInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RevokeInvitationRequest> request = null;
        Response<RevokeInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RevokeInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(revokeInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RevokeInvitation");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<RevokeInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RevokeInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchAddressBooksRequest
     * @return Result of the SearchAddressBooks operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchAddressBooks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchAddressBooksResult searchAddressBooks(SearchAddressBooksRequest request) {
        request = beforeClientExecution(request);
        return executeSearchAddressBooks(request);
    }

    @SdkInternalApi
    final SearchAddressBooksResult executeSearchAddressBooks(SearchAddressBooksRequest searchAddressBooksRequest) {

        ExecutionContext executionContext = createExecutionContext(searchAddressBooksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchAddressBooksRequest> request = null;
        Response<SearchAddressBooksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchAddressBooksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchAddressBooksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchAddressBooks");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchAddressBooksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchAddressBooksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchContactsRequest
     * @return Result of the SearchContacts operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchContacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchContacts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchContactsResult searchContacts(SearchContactsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchContacts(request);
    }

    @SdkInternalApi
    final SearchContactsResult executeSearchContacts(SearchContactsRequest searchContactsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchContactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchContactsRequest> request = null;
        Response<SearchContactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchContactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchContactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchContacts");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchContactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchContactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches devices and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchDevicesRequest
     * @return Result of the SearchDevices operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchDevices" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchDevicesResult searchDevices(SearchDevicesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchDevices(request);
    }

    @SdkInternalApi
    final SearchDevicesResult executeSearchDevices(SearchDevicesRequest searchDevicesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchDevicesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchDevicesRequest> request = null;
        Response<SearchDevicesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchDevicesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchDevicesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchDevices");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchDevicesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchDevicesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     * </p>
     * 
     * @param searchProfilesRequest
     * @return Result of the SearchProfiles operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchProfilesResult searchProfiles(SearchProfilesRequest request) {
        request = beforeClientExecution(request);
        return executeSearchProfiles(request);
    }

    @SdkInternalApi
    final SearchProfilesResult executeSearchProfiles(SearchProfilesRequest searchProfilesRequest) {

        ExecutionContext executionContext = createExecutionContext(searchProfilesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchProfilesRequest> request = null;
        Response<SearchProfilesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchProfilesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchProfilesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchProfiles");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchProfilesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchProfilesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchRoomsRequest
     * @return Result of the SearchRooms operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchRooms" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchRoomsResult searchRooms(SearchRoomsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchRooms(request);
    }

    @SdkInternalApi
    final SearchRoomsResult executeSearchRooms(SearchRoomsRequest searchRoomsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchRoomsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchRoomsRequest> request = null;
        Response<SearchRoomsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchRoomsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchRoomsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchRooms");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchRoomsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchRoomsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchSkillGroupsRequest
     * @return Result of the SearchSkillGroups operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchSkillGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchSkillGroups"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SearchSkillGroupsResult searchSkillGroups(SearchSkillGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeSearchSkillGroups(request);
    }

    @SdkInternalApi
    final SearchSkillGroupsResult executeSearchSkillGroups(SearchSkillGroupsRequest searchSkillGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(searchSkillGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchSkillGroupsRequest> request = null;
        Response<SearchSkillGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchSkillGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchSkillGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchSkillGroups");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchSkillGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchSkillGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     * </p>
     * 
     * @param searchUsersRequest
     * @return Result of the SearchUsers operation returned by the service.
     * @sample AmazonAlexaForBusiness.SearchUsers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchUsers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public SearchUsersResult searchUsers(SearchUsersRequest request) {
        request = beforeClientExecution(request);
        return executeSearchUsers(request);
    }

    @SdkInternalApi
    final SearchUsersResult executeSearchUsers(SearchUsersRequest searchUsersRequest) {

        ExecutionContext executionContext = createExecutionContext(searchUsersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SearchUsersRequest> request = null;
        Response<SearchUsersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SearchUsersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(searchUsersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SearchUsers");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SearchUsersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SearchUsersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this
     * operation again, whichever comes first.
     * </p>
     * 
     * @param sendInvitationRequest
     * @return Result of the SendInvitation operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws InvalidUserStatusException
     *         The attempt to update a user is invalid due to the user's current status.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.SendInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SendInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public SendInvitationResult sendInvitation(SendInvitationRequest request) {
        request = beforeClientExecution(request);
        return executeSendInvitation(request);
    }

    @SdkInternalApi
    final SendInvitationResult executeSendInvitation(SendInvitationRequest sendInvitationRequest) {

        ExecutionContext executionContext = createExecutionContext(sendInvitationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SendInvitationRequest> request = null;
        Response<SendInvitationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SendInvitationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(sendInvitationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "SendInvitation");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<SendInvitationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SendInvitationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resets a device and its account to the known default settings, by clearing all information and settings set by
     * previous users.
     * </p>
     * 
     * @param startDeviceSyncRequest
     * @return Result of the StartDeviceSync operation returned by the service.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.StartDeviceSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartDeviceSync"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartDeviceSyncResult startDeviceSync(StartDeviceSyncRequest request) {
        request = beforeClientExecution(request);
        return executeStartDeviceSync(request);
    }

    @SdkInternalApi
    final StartDeviceSyncResult executeStartDeviceSync(StartDeviceSyncRequest startDeviceSyncRequest) {

        ExecutionContext executionContext = createExecutionContext(startDeviceSyncRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDeviceSyncRequest> request = null;
        Response<StartDeviceSyncResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDeviceSyncRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startDeviceSyncRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartDeviceSync");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<StartDeviceSyncResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartDeviceSyncResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Initiates the discovery of any smart home appliances associated with the room.
     * </p>
     * 
     * @param startSmartHomeApplianceDiscoveryRequest
     * @return Result of the StartSmartHomeApplianceDiscovery operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.StartSmartHomeApplianceDiscovery
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartSmartHomeApplianceDiscovery"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public StartSmartHomeApplianceDiscoveryResult startSmartHomeApplianceDiscovery(StartSmartHomeApplianceDiscoveryRequest request) {
        request = beforeClientExecution(request);
        return executeStartSmartHomeApplianceDiscovery(request);
    }

    @SdkInternalApi
    final StartSmartHomeApplianceDiscoveryResult executeStartSmartHomeApplianceDiscovery(
            StartSmartHomeApplianceDiscoveryRequest startSmartHomeApplianceDiscoveryRequest) {

        ExecutionContext executionContext = createExecutionContext(startSmartHomeApplianceDiscoveryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartSmartHomeApplianceDiscoveryRequest> request = null;
        Response<StartSmartHomeApplianceDiscoveryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartSmartHomeApplianceDiscoveryRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(startSmartHomeApplianceDiscoveryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StartSmartHomeApplianceDiscovery");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<StartSmartHomeApplianceDiscoveryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new StartSmartHomeApplianceDiscoveryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds metadata tags to a specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes metadata tags from a specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates address book details by the address book ARN.
     * </p>
     * 
     * @param updateAddressBookRequest
     * @return Result of the UpdateAddressBook operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.UpdateAddressBook
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateAddressBook"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateAddressBookResult updateAddressBook(UpdateAddressBookRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateAddressBook(request);
    }

    @SdkInternalApi
    final UpdateAddressBookResult executeUpdateAddressBook(UpdateAddressBookRequest updateAddressBookRequest) {

        ExecutionContext executionContext = createExecutionContext(updateAddressBookRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAddressBookRequest> request = null;
        Response<UpdateAddressBookResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAddressBookRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAddressBookRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateAddressBook");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAddressBookResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateAddressBookResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing conference provider's settings.
     * </p>
     * 
     * @param updateConferenceProviderRequest
     * @return Result of the UpdateConferenceProvider operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @sample AmazonAlexaForBusiness.UpdateConferenceProvider
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateConferenceProvider"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateConferenceProviderResult updateConferenceProvider(UpdateConferenceProviderRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateConferenceProvider(request);
    }

    @SdkInternalApi
    final UpdateConferenceProviderResult executeUpdateConferenceProvider(UpdateConferenceProviderRequest updateConferenceProviderRequest) {

        ExecutionContext executionContext = createExecutionContext(updateConferenceProviderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConferenceProviderRequest> request = null;
        Response<UpdateConferenceProviderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConferenceProviderRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateConferenceProviderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateConferenceProvider");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateConferenceProviderResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateConferenceProviderResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the contact details by the contact ARN.
     * </p>
     * 
     * @param updateContactRequest
     * @return Result of the UpdateContact operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.UpdateContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateContact" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateContactResult updateContact(UpdateContactRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateContact(request);
    }

    @SdkInternalApi
    final UpdateContactResult executeUpdateContact(UpdateContactRequest updateContactRequest) {

        ExecutionContext executionContext = createExecutionContext(updateContactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateContactRequest> request = null;
        Response<UpdateContactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateContactRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateContactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateContact");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateContactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateContactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the device name by device ARN.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @throws DeviceNotRegisteredException
     *         The request failed because this device is no longer registered and therefore no longer managed by this
     *         account.
     * @sample AmazonAlexaForBusiness.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateDevice" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDeviceResult updateDevice(UpdateDeviceRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDevice(request);
    }

    @SdkInternalApi
    final UpdateDeviceResult executeUpdateDevice(UpdateDeviceRequest updateDeviceRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDeviceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDeviceRequest> request = null;
        Response<UpdateDeviceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDeviceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDeviceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDevice");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDeviceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDeviceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an existing room profile by room profile ARN.
     * </p>
     * 
     * @param updateProfileRequest
     * @return Result of the UpdateProfile operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.UpdateProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateProfile" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateProfileResult updateProfile(UpdateProfileRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateProfile(request);
    }

    @SdkInternalApi
    final UpdateProfileResult executeUpdateProfile(UpdateProfileRequest updateProfileRequest) {

        ExecutionContext executionContext = createExecutionContext(updateProfileRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateProfileRequest> request = null;
        Response<UpdateProfileResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateProfileRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateProfileRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateProfile");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateProfileResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateProfileResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates room details by room ARN.
     * </p>
     * 
     * @param updateRoomRequest
     * @return Result of the UpdateRoom operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @sample AmazonAlexaForBusiness.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateRoom" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateRoomResult updateRoom(UpdateRoomRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateRoom(request);
    }

    @SdkInternalApi
    final UpdateRoomResult executeUpdateRoom(UpdateRoomRequest updateRoomRequest) {

        ExecutionContext executionContext = createExecutionContext(updateRoomRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRoomRequest> request = null;
        Response<UpdateRoomResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRoomRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateRoomRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateRoom");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateRoomResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateRoomResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates skill group details by skill group ARN.
     * </p>
     * 
     * @param updateSkillGroupRequest
     * @return Result of the UpdateSkillGroup operation returned by the service.
     * @throws NotFoundException
     *         The resource is not found.
     * @throws NameInUseException
     *         The name sent in the request is already in use.
     * @throws ConcurrentModificationException
     *         Concurrent modification of resources. HTTP Status Code: 400.
     * @sample AmazonAlexaForBusiness.UpdateSkillGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateSkillGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateSkillGroupResult updateSkillGroup(UpdateSkillGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSkillGroup(request);
    }

    @SdkInternalApi
    final UpdateSkillGroupResult executeUpdateSkillGroup(UpdateSkillGroupRequest updateSkillGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSkillGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSkillGroupRequest> request = null;
        Response<UpdateSkillGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSkillGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSkillGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Alexa For Business");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSkillGroup");
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            URI cachedEndpoint = null;

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSkillGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSkillGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
