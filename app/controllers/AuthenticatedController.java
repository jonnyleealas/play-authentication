package controllers;

import play.mvc.Result;

/**
 * A controller that only has authenticated requests
 */
public class AuthenticatedController extends SecuredController {

    public static Result authenticatedAction() {
        return ok("Hi, " + request().username());
    }

}
