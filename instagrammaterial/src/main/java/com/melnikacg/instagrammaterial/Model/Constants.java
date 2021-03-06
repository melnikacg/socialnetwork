package com.melnikacg.instagrammaterial.Model;

public class Constants {

    public static final String CLIENT_ID = "c8e2cde3f35d402687512d9004ee7b12";

    // InstagramAPI

    //public static final String AUTH_REDIRECT_URL = "http://localhost/auth/success";
    //public static final String TOKEN_REDIRECT_URL = "http://localhost/token/success";
    public static final String MEDIA_URL = "https://api.instagram.com/v1/media/";
    public static final String POPULAR_URL = MEDIA_URL + "popular?client_id=";
    public static final String COMMENTS_CLIENT_URL = "/comments?client_id=";
    // LogCat
    public static final String ROBO_SPICE_LOG_TAG = "SampleSpiceService";

    //private static final String AUTH_BASE_URL = "https://github.com/login/oauth";
    //private static final String AUTH_URL = AUTH_BASE_URL + "/authorize";
    //public static final String TOKEN_URL = AUTH_BASE_URL + "/access_token";

    private Constants() {
        // No instance
    }

}
