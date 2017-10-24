package com.xiaomi.infra.galaxy.vision.client;

import java.io.IOException;
import java.net.URI;

import com.xiaomi.infra.galaxy.vision.model.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

import com.xiaomi.infra.galaxy.ai.common.BaseClient;
import com.xiaomi.infra.galaxy.ai.common.Credential;
import com.xiaomi.infra.galaxy.client.authentication.HttpMethod;
import com.xiaomi.infra.galaxy.client.authentication.signature.SubResource;

/**
 * Copyright 2017, Xiaomi.
 * All rights reserved.
 */
public class GalaxyVisionClient extends BaseClient implements VisionClientInterface {
  public static final String IMAGE_DETECT_RESOURCE = "v1/image:detect";
  public static final String FACE_MATCH_RESOURCE = "v1/image:match";

  public GalaxyVisionClient(Credential credential,
      VisionConfig fdsConfig) {
    super(credential, fdsConfig);
  }

  @Override
  public DetectFacesResult detectFaces(DetectFacesRequest request) throws IOException {
    URI uri = formatUri(config.getBaseUri(), IMAGE_DETECT_RESOURCE, (SubResource[]) null);
    ImageDetectRequest imageDetectRequest = new ImageDetectRequest();
    imageDetectRequest.setDetectFacesRequest(request);

    HttpUriRequest httpRequest = makeJsonEntityRequest(imageDetectRequest, uri, HttpMethod.POST);
    HttpResponse response = executeHttpRequest(httpRequest);
    ImageDetectResult result = (ImageDetectResult) processResponse(response,
      ImageDetectResult.class, IMAGE_DETECT_RESOURCE);

    return result.getDetectFacesResult();
  }

  @Override
  public DetectLabelsResult detectLabels(DetectLabelsRequest request) throws IOException {
    URI uri = formatUri(config.getBaseUri(), IMAGE_DETECT_RESOURCE, (SubResource[]) null);
    ImageDetectRequest imageDetectRequest = new ImageDetectRequest();
    imageDetectRequest.setDetectLabelsRequest(request);

    HttpUriRequest httpRequest = makeJsonEntityRequest(imageDetectRequest, uri, HttpMethod.POST);
    HttpResponse response = executeHttpRequest(httpRequest);
    ImageDetectResult result = (ImageDetectResult) processResponse(response,
      ImageDetectResult.class, IMAGE_DETECT_RESOURCE);

    return result.getDetectLabelsResult();
  }

  @Override
  public FaceMatchResult matchFaces(FaceMatchRequest request) throws  IOException {
    URI uri = formatUri(config.getBaseUri(), FACE_MATCH_RESOURCE, (SubResource[]) null);
    ImageDetectRequest imageDetectRequest = new ImageDetectRequest();
    imageDetectRequest.setFaceMatchRequest(request);

    HttpUriRequest httpRequest = makeJsonEntityRequest(imageDetectRequest, uri, HttpMethod.POST);
    HttpResponse response = executeHttpRequest(httpRequest);
    ImageDetectResult result = (ImageDetectResult) processResponse(response,
            FaceMatchResult.class, FACE_MATCH_RESOURCE);

    return result.getFaceMatchResult();
  }
}
