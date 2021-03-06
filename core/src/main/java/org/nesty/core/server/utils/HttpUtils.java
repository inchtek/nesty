package org.nesty.core.server.utils;

import io.netty.handler.codec.http.FullHttpRequest;
import org.nesty.commons.constant.http.RequestMethod;

/**
 * nesty
 *
 * Author Michael on 03/03/2016.
 */
public class HttpUtils {

    public static RequestMethod convertHttpMethodFromNetty(FullHttpRequest request) {
        try {
            return RequestMethod.valueOf(request.getMethod().name().toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            return RequestMethod.UNKOWN;
        }
    }

    public static String truncateUrl(String url) {
        if (url.contains("?"))
            url = url.substring(0, url.indexOf("?"));
        return url;
    }
}
