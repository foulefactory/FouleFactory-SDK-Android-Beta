/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.foulefactory.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.foulefactory.api.*;
import com.foulefactory.api.models.*;
import com.foulefactory.api.exceptions.*;
import com.foulefactory.api.http.client.HttpClient;
import com.foulefactory.api.http.client.HttpContext;
import com.foulefactory.api.http.request.HttpRequest;
import com.foulefactory.api.http.response.HttpResponse;
import com.foulefactory.api.http.response.HttpStringResponse;
import com.foulefactory.api.http.client.APICallBack;

public class TaskAnswerTextsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TaskAnswerTextsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TaskAnswerTextsController class 
     */
    public static TaskAnswerTextsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TaskAnswerTextsController();
            }
        }
        return instance;
    }

    /**
     * Get task answer text by id
     * @param    id    Required parameter: Example: 
     * @param    acceptLanguage    Optional parameter: Example: fr
     * @return    Returns the void response from the API call 
     */
    public void getTaskAnswerTextsGetAsync(
                final int id,
                final String acceptLanguage,
                final APICallBack<DynamicResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/v1.1/taskAnswerTexts/{id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5050814858290876541L;
            {
                    put( "id", id );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5347953315695797977L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "Accept-Language", (null != acceptLanguage) ? acceptLanguage : "fr" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            DynamicResponse _result = new DynamicResponse(_response);

                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}